/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import salcam.smarttoll.dao.IsentoDAO;
import salcam.smarttoll.daoImp.IsentoDAOImp;

/**
 *
 * @author Administrador
 */
public class ConsultaIsento extends HttpServlet {

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
        condicao += (request.getParameter("nome") != null && !request.getParameter("nome").isEmpty())
                ? " NOME LIKE '%" + request.getParameter("nome") + "%' AND" : "";

        condicao += (request.getParameter("cartao") != null && !request.getParameter("cartao").isEmpty())
                ? " CARTAO  LIKE '%" + request.getParameter("cartao") + "%' AND" : "";

        condicao += (request.getParameter("situacao") != null && !request.getParameter("situacao").isEmpty())
                ? " ATIVO =" + request.getParameter("situacao") + " AND" : "";
                
        if(request.getParameter("vencimento") != null && !request.getParameter("vencimento").isEmpty()){
            String[] data = request.getParameter("vencimento").split("-");
            condicao += " VENCIMENTO = '"+data[0]+data[1]+data[2]+"' AND";
        }        
        
        if (condicao.equals(" WHERE ")) {
            condicao = "";
        } else {
            condicao = condicao.substring(0, condicao.length() - 3);
        }

        IsentoDAO idao = new IsentoDAOImp();
        ResultSet rs = idao.consultaIsento(condicao);
        request.setAttribute("rs", rs);
        RequestDispatcher rd = request.getRequestDispatcher("/Isento/consultaIsentoRs.jsp");
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
