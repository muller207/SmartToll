/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import salcam.smarttoll.dao.GrupoControleAcessoDAO;
import salcam.smarttoll.dao.GrupoControleAcessoMenuDAO;
import salcam.smarttoll.daoImp.GrupoControleAcessoDAOImp;
import salcam.smarttoll.daoImp.GrupoControleAcessoMenuDAOImp;
import salcam.smarttoll.utils.Alert;

/**
 *
 * @author Administrador
 */
public class RemoverItem extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            try {
                PrintWriter out = response.getWriter();                                
                boolean sucesso;
                GrupoControleAcessoMenuDAO gmdao = new GrupoControleAcessoMenuDAOImp();
                if(request.getParameter("menu")!=null)
                    sucesso = gmdao.excluirMenu(Byte.parseByte(request.getParameter("grupo")), Byte.parseByte(request.getParameter("menu")));
                else{
                    boolean aux;
                    GrupoControleAcessoDAO gdao = new GrupoControleAcessoDAOImp();
                    aux = gdao.excluirGrupoControleAcesso(Byte.parseByte(request.getParameter("grupo")));
                    sucesso = gmdao.excluirGrupoControleAcesso(Byte.parseByte(request.getParameter("grupo")));
                    sucesso = sucesso && aux;
                }
                if(sucesso){
                    out.println("<script>");
                    out.println("alert(\"Item removido com sucesso!\");");
                    out.println("</script>");
                }else{
                    out.println("<script>");
                    out.println("alert(\"Erro ao remover o item!\");");
                    out.println("</script>");
                }
                out.println("<script>");
                out.println("window.location.href = \"/Smarttoll/Ferramentas/GrupoControleAcesso/consultaGrupoControleAcessoRs.jsp\";");
                out.println("</script>");
            }catch(Exception e){
                Alert.Message(response, "Erro ao remover o item!", "/Smarttoll/Ferramentas/GrupoControleAcesso/consultaGrupoControleAcessoRs.jsp");
            }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
