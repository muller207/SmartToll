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
import salcam.smarttoll.beans.GrupoControleAcessoMenu;
import salcam.smarttoll.dao.GrupoControleAcessoMenuDAO;
import salcam.smarttoll.daoImp.GrupoControleAcessoMenuDAOImp;
import salcam.smarttoll.utils.Alert;

/**
 *
 * @author Administrador
 */
public class AdicionaItem extends HttpServlet {

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
                GrupoControleAcessoMenu g = new GrupoControleAcessoMenu();
                g.setGrupoControleAcessoCod(Byte.parseByte(request.getParameter("cod")));
                g.setMenuCod(Byte.parseByte(request.getParameter("menu")));
                g.setDireito((byte) 1);
                GrupoControleAcessoMenuDAO gdao = new GrupoControleAcessoMenuDAOImp();
                if(!gdao.cadastroGrupoControleAcessoMenu(g))
                    Alert.Message(response, "Erro ao adicionar item!");
                out.println("<script>");
                out.println("window.close();");
                out.println("</script>");
            }catch(Exception e){
                Alert.Message(response, "Erro ao adicionar item!");
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
