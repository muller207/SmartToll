/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.servlet;

import java.io.IOException;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import salcam.smarttoll.dao.GrupoControleAcessoDAO;
import salcam.smarttoll.daoImp.GrupoControleAcessoDAOImp;

/**
 *
 * @author Administrador
 */
public class ConsultaGrupoControleAcesso extends HttpServlet {

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
        HttpSession session = request.getSession(false);
        String condicao = " WHERE ";                
                
        condicao += (request.getParameter("descricao") != null && !request.getParameter("descricao").isEmpty())
                ? " gca.DESCRICAO LIKE '%" + request.getParameter("descricao") + "%' AND" : "";        
                
        if (condicao.equals(" WHERE ")) {
            condicao = "";
        } else {
            condicao = condicao.substring(0, condicao.length() - 3);
        }

//        GrupoControleAcessoDAO gdao = new GrupoControleAcessoDAOImp();
//        ResultSet rs = gdao.consultaGrupoControleAcessoGenerica("SELECT gca.GRUPO_CONTROLE_ACESSO_CODIGO as CODIGO, gca.DESCRICAO as GRUPO, m.DESCRICAO as MENU, m.NIVEL_CODIGO, gcam.DIREITO " +
//            " FROM GRUPOS_CONTROLE_ACESSO gca " +
//            " LEFT JOIN GRUPOS_CONTROLE_ACESSO_MENUS gcam ON (gca.GRUPO_CONTROLE_ACESSO_CODIGO = gcam.GRUPO_CONTROLE_ACESSO_CODIGO) " +
//            " LEFT JOIN MENUS m ON (m.MENU_CODIGO = gcam.MENU_CODIGO)"+condicao);
//        request.setAttribute("rs", rs);
//        request.setAttribute("condicao", condicao);
        session.setAttribute("condicao", condicao);
        RequestDispatcher rd = request.getRequestDispatcher("/Ferramentas/GrupoControleAcesso/consultaGrupoControleAcessoRs.jsp");
        rd.forward(request, response);
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
