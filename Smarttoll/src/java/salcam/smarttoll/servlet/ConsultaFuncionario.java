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

/**
 *
 * @author Administrador
 */
public class ConsultaFuncionario extends HttpServlet {
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
         
        String condicao = " where ";
        condicao += (request.getParameter("nome")!= null && !request.getParameter("nome").isEmpty())?
                "NOME LIKE '%"
                + request.getParameter("nome")
                + "%' AND":"";
        
        condicao += (request.getParameter("apelido")!= null && !request.getParameter("apelido").isEmpty())?
                "APELIDO LIKE '%"
                + request.getParameter("apelido")
                + "'% AND ":"";
        
        condicao += (request.getParameter("situacao")!= null && !request.getParameter("situacao").isEmpty())?
                "SITUACAO ="
                + request.getParameter("situacao")
                + " AND ":"";
        
        condicao += (request.getParameter("funcao")!= null && !request.getParameter("funcao").isEmpty())?
                "FUNCAO ="
                + request.getParameter("funcao")
                + " AND ":"";
        
        condicao += (request.getParameter("usuario")!= null && !request.getParameter("usuario").isEmpty())?
                "USUARIO LIKE '%"
                + request.getParameter("usuario")
                + "'% AND ":"";
        
        condicao += (request.getParameter("cpf")!= null && !request.getParameter("cpf").isEmpty())?
                "CPF LIKE '%"
                + request.getParameter("cpf")
                + "'% AND ":"";
        
        condicao += (request.getParameter("rg")!= null && !request.getParameter("rg").isEmpty())?
                "RG LIKE '%"
                + request.getParameter("rg")
                + "'% AND ":"";
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
