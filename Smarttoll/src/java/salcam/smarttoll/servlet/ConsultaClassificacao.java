/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import salcam.smarttoll.dao.ClassificacaoDAO;
import salcam.smarttoll.daoImp.ClassificacaoDAOImp;

/**
 *
 * @author Administrador
 */
public class ConsultaClassificacao extends HttpServlet {

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
        String condicao = " WHERE ";
        condicao += (request.getParameter("classificacao") != null && !request.getParameter("classificacao").isEmpty())
                ? " CLASSIFICACAO LIKE '%" + request.getParameter("classificacao") + "%' AND" : "";

        condicao += (request.getParameter("descricao") != null && !request.getParameter("descricao").isEmpty())
                ? " DESCRICAO  LIKE '%" + request.getParameter("descricao") + "%' AND" : ""; 
        
        condicao += (request.getParameter("tarifa") != null && !request.getParameter("tarifa").isEmpty())
                ? " TARIFA  = " + request.getParameter("tarifa") + " AND" : ""; 
        
        condicao += (request.getParameter("eixos") != null && !request.getParameter("eixos").isEmpty())
                ? " EIXOS  = " + request.getParameter("eixos") + " AND" : ""; 
        
        condicao += (request.getParameter("situacao") != null && !request.getParameter("situacao").isEmpty())
                ? " SITUACAO  = " + request.getParameter("situacao") + " AND" : ""; 
        
        condicao += (request.getParameter("eixosComerciais") != null && !request.getParameter("eixosComerciais").isEmpty())
                ? " EIXOS_COMERCIAL = " + request.getParameter("eixosComerciais") + " AND" : ""; 
        
        condicao += (request.getParameter("semParar") != null && !request.getParameter("semParar").isEmpty())
                ? " SEMPARAR = " + request.getParameter("semParar") + " AND" : ""; 
                
        if (condicao.equals(" WHERE ")) {
            condicao = "";
        } else {
            condicao = condicao.substring(0, condicao.length() - 3);
        }

        ClassificacaoDAO cdao = new ClassificacaoDAOImp();
        ResultSet rs = cdao.consultaClassificacao(condicao);
        request.setAttribute("rs", rs);
        RequestDispatcher rd = request.getRequestDispatcher("/Classificacao/consultaClassificacaoRs.jsp");
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
