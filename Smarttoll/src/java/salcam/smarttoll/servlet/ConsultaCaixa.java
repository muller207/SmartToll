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
import salcam.smarttoll.dao.CaixaDAO;
import salcam.smarttoll.daoImp.CaixaDAOImp;

/**
 *
 * @author Samuel
 */
public class ConsultaCaixa extends HttpServlet {

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
        condicao += (request.getParameter("situacao") != null && !request.getParameter("situacao").isEmpty())
                ? " SITUACAO=" + request.getParameter("situacao") + " AND" : "";

        condicao += (request.getParameter("serial") != null && !request.getParameter("serial").isEmpty())
                ? " SERIAL  LIKE '%" + request.getParameter("serial") + "%' AND" : "";

        condicao += (request.getParameter("sempararPraca") != null && !request.getParameter("sempararPraca").isEmpty())
                ? " SEMPARAR_PRACA LIKE '%" + request.getParameter("sempararPraca") + "%' AND" : "";

        if (condicao.equals(" WHERE ")) {
            condicao = "";
        } else {
            condicao = condicao.substring(0, condicao.length() - 3);
        }

        CaixaDAO cdao = new CaixaDAOImp();
        ResultSet rs = cdao.consultaCaixa(condicao);
        request.setAttribute("rs", rs);
        RequestDispatcher rd = request.getRequestDispatcher("/Caixa/consultaCaixaRs.jsp");
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
