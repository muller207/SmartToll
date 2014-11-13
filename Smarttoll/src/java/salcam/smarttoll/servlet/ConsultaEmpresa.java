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
import salcam.smarttoll.dao.EmpresaDAO;
import salcam.smarttoll.daoImp.EmpresaDAOImp;

/**
 *
 * @author Administrador
 */
public class ConsultaEmpresa extends HttpServlet {

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
        condicao += (request.getParameter("razao") != null && !request.getParameter("razao").isEmpty())
                ? " RAZAO LIKE '%" + request.getParameter("razao") + "%' AND" : "";

        condicao += (request.getParameter("nomeFantasia") != null && !request.getParameter("nomeFantasia").isEmpty())
                ? " FANTASIA  LIKE '%" + request.getParameter("nomeFantasia") + "%' AND" : "";

        condicao += (request.getParameter("cnpj") != null && !request.getParameter("cnpj").isEmpty())
                ? " CNPJ LIKE '%" + request.getParameter("cnpj") + "%' AND" : "";
        
        condicao += (request.getParameter("ie") != null && !request.getParameter("ie").isEmpty())
                ? " IE LIKE '%" + request.getParameter("ie") + "%' AND" : "";
        
        condicao += (request.getParameter("inscricaoMunicipal") != null && !request.getParameter("inscricaoMunicipal").isEmpty())
                ? " INSCRICAO_MUNICIPAL LIKE '%" + request.getParameter("inscricaoMunicipal") + "%' AND" : "";
        
        condicao += (request.getParameter("email") != null && !request.getParameter("email").isEmpty())
                ? " EMAIL LIKE '%" + request.getParameter("email") + "%' AND" : "";
        
        condicao += (request.getParameter("homepage") != null && !request.getParameter("homepage").isEmpty())
                ? " HOMEPAGE LIKE '%" + request.getParameter("homepage") + "%' AND" : "";
        
        condicao += (request.getParameter("smtp") != null && !request.getParameter("smtp").isEmpty())
                ? " SMTP LIKE '%" + request.getParameter("smtp") + "%' AND" : "";
        
        condicao += (request.getParameter("login") != null && !request.getParameter("login").isEmpty())
                ? " LOGIN_EMAIL LIKE '%" + request.getParameter("login") + "%' AND" : "";
        
        condicao += (request.getParameter("senha") != null && !request.getParameter("senha").isEmpty())
                ? " SENHA_EMAIL LIKE '%" + request.getParameter("senha") + "%' AND" : "";
        
        condicao += (request.getParameter("obs") != null && !request.getParameter("obs").isEmpty())
                ? " OBSERVACAO LIKE '%" + request.getParameter("obs") + "%' AND" : "";
        
        condicao += (request.getParameter("autenticado") != null && !request.getParameter("autenticado").isEmpty())
                ? " AUTENTICADO = " + request.getParameter("autenticado") + " AND" : "";
                
        if (condicao.equals(" WHERE ")) {
            condicao = "";
        } else {
            condicao = condicao.substring(0, condicao.length() - 3);
        }

        EmpresaDAO edao = new EmpresaDAOImp();
        ResultSet rs = edao.consultaEmpresa(condicao);
        request.setAttribute("rs", rs);
        RequestDispatcher rd = request.getRequestDispatcher("/Empresa/consultaEmpresaRs.jsp");
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
