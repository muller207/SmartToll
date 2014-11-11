/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import salcam.smarttoll.beans.Caixa;
import salcam.smarttoll.dao.CaixaDAO;
import salcam.smarttoll.daoImp.CaixaDAOImp;
import salcam.smarttoll.utils.Alert;

/**
 *
 * @author Samuel
 */
public class CadastroCaixa extends HttpServlet {

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

        Caixa c = new Caixa();
        c.setSerial(request.getParameter("serial"));
        boolean situacao = false;
        if (request.getParameterValues("situacao") != null) {
            situacao = true;
        }

        c.setSituacao(situacao);
        c.setSemPararPraca(Integer.parseInt(request.getParameter("sempararPraca")));
        c.setSequencialArquivoNela(Integer.parseInt(request.getParameter("sequencialArquivoNela")));
        c.setSequencialArquivoTag(Integer.parseInt(request.getParameter("sequencialArquivoTag")));
        c.setIp(request.getParameter("ip"));
        c.setTipo(Integer.parseInt(request.getParameter("tipo")));

        CaixaDAO cdao = new CaixaDAOImp();

        if (cdao.cadastroCaixa(c)) {
            Alert.Message(response, "Sucesso ao cadastrar caxa", "../home");
        } else {
            Alert.Message(response, "Falha ao cadastra caixa", "../home");
        }

        //response.sendRedirect("../index.jsp");
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
