/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import salcam.smarttoll.conn.Conn;
import salcam.smarttoll.daoImp.FuncionarioDAOImp;
import salcam.smarttoll.utils.Alert;

/**
 *
 * @author Samuel
 */
public class Login extends HttpServlet {

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
        HttpSession session = request.getSession(true);
        String usuario = (request.getParameter("usuario") != null && !request.getParameter("usuario").isEmpty())
                ? request.getParameter("usuario") : "";

        String senha = (request.getParameter("senha") != null && !request.getParameter("senha").isEmpty())
                ? request.getParameter("senha") : "";

        System.out.println("entrou no post");

        PrintWriter out = response.getWriter();
        
        try{
            Conn.getConn();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            Alert.Message(response, "PROBLEMA AO CONECTAR AO BANCO DE DADOS");
            out.print("<script>window.history.back()</script>");
            //response.sendRedirect("index.jsp");
        }
        
        
        FuncionarioDAOImp fdao = new FuncionarioDAOImp();
        if (fdao.consultaFuncionarioLogin(usuario, codifica(senha))) {
            session.setAttribute("usuario", usuario);
            response.sendRedirect("home");
            //response.sendRedirect("Caixa/cadastroCaixa.jsp");

        } else {
            session.invalidate();
            Alert.Message(response, "LOGIN/SENHA INCORRETO(S)");
            out.print("<script>window.history.back()</script>");
            //response.sendRedirect("Empresa/cadastroEmpresa.jsp");
        }
    }

    private String codifica(String pass) {
        String mascara = "#$%^%*@" + (char) 13 + (char) 12;
        String cAux = "";
        int ponM = 0;
        pass = pass.replace("''", "'");
        for (int ponS = 0; ponS < pass.length(); ponS++) {
            cAux += (char) ((int) pass.charAt(ponS) ^ ((int) mascara.charAt(ponM)));
            ponM++;
            if (ponM > mascara.length()) {
                ponM = 0;
            }
        }
        cAux = cAux.replace("'", "''");
        return cAux;
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