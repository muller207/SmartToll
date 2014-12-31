/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import salcam.smarttoll.dao.CaixaMovimentoDAO;
import salcam.smarttoll.daoImp.CaixaMovimentoDAOImp;
import salcam.smarttoll.utils.Alert;

/**
 *
 * @author Administrador
 */
public class AlteracaoFechamentoCaixa extends HttpServlet {

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
        try {
            String sql = "SELECT VALOR_FECHAMENTO_OPERADOR FROM CAIXAS_MOVIMENTOS"
                + " WHERE CAIXAS_MOVIMENTOS_CODIGO = " + request.getParameter("movimentacao");            
            CaixaMovimentoDAO cdao = new CaixaMovimentoDAOImp();
            ResultSet rs = cdao.consultaCaixaMovimentoEspecial(sql);
            if(rs.next()){
                rs.updateFloat("VALOR_FECHAMENTO_OPERADOR", Float.parseFloat(request.getParameter("fechamento")));
                rs.updateRow();
            }
            Alert.Message(response, "Alteração feita co sucesso","fechamentoCaixas.jsp");
        }catch(Exception e){
            Alert.Message(response, "Erro ao alterar fechamento!","fechamentoCaixas.jsp");
        }
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
        processRequest(request, response);
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
