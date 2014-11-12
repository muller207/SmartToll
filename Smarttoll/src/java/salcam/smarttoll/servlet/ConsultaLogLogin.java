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
import salcam.smarttoll.dao.LogLoginDAO;
import salcam.smarttoll.daoImp.LogLoginDAOImp;

/**
 *
 * @author Administrador
 */
public class ConsultaLogLogin extends HttpServlet {

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
        condicao += (request.getParameter("funcionario") != null && !request.getParameter("funcionario").isEmpty())
                ? " l.FUNCIONARIO_CODIGO = " + request.getParameter("funcionario") + " AND" : "";

        condicao += (request.getParameter("status") != null && !request.getParameter("status").isEmpty())
                ? " l.SUCESSO = " + request.getParameter("status") + " AND" : "";

        condicao += (request.getParameter("sistema") != null && !request.getParameter("sistema").isEmpty())
                ? " l.SISTEMA = " + request.getParameter("sistema") + " AND" : "";
        
        if(request.getParameter("inicio")!=null && !request.getParameter("inicio").isEmpty()){            
            String[] inicio = request.getParameter("inicio").split("-");
            condicao += " l.DATA >= '"+inicio[0]+inicio[1]+inicio[2]+"' AND";
        }
        
        if(request.getParameter("fim")!=null && !request.getParameter("fim").isEmpty()){            
            String[] fim = request.getParameter("fim").split("-");
            condicao += " l.DATA <= '"+fim[0]+fim[1]+fim[2]+" 23:59:59' AND";
        }        

        if (condicao.equals(" WHERE ")) {
            condicao = "";
        } else {
            condicao = condicao.substring(0, condicao.length() - 3);
            condicao += " ORDER BY l.DATA DESC";
        }

        LogLoginDAO ldao = new LogLoginDAOImp();
        ResultSet rs = ldao.consulta(condicao);
        request.setAttribute("rs", rs);
        RequestDispatcher rd = request.getRequestDispatcher("/Log/Acesso/consultaLogAcessoRs.jsp");
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
