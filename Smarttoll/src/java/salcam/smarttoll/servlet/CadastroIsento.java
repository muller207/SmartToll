/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import salcam.smarttoll.beans.Isento;
import salcam.smarttoll.dao.IsentoDAO;
import salcam.smarttoll.daoImp.IsentoDAOImp;
import salcam.smarttoll.utils.Alert;

/**
 *
 * @author Administrador
 */
public class CadastroIsento extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        
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
        if(session.getAttribute("usuario")==null || session.getAttribute("usuario").toString().isEmpty())
            response.sendRedirect("index.jsp");
        
        Isento i = new Isento();     

        i.setNome(request.getParameter("nome"));
        i.setAtivo(Boolean.parseBoolean(request.getParameter("situacao")));
        try {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            i.setVencimento((request.getParameter("vencimento") != null && !request.getParameter("vencimento").isEmpty())
                ? (Date) df.parse(request.getParameter("vencimento")): null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }       
        
        i.setCartao((request.getParameter("cartao") != null && !request.getParameter("cartao").isEmpty())
                ? request.getParameter("cartao") : "");
        
       
        IsentoDAO idao = new IsentoDAOImp();
        if(idao.cadastroIsento(i)){
            Alert.Message(response, "Sucesso ao cadastrar isento", "/Smarttoll/home");
        } else {
            Alert.Message(response, "Falha ao cadastrar isento", "/Smarttoll/home");
        }
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
