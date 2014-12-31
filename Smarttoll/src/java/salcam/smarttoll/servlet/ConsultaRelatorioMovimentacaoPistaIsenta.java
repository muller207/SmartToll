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
import javax.servlet.http.HttpSession;
import salcam.smarttoll.dao.CaixaMovimentoDAO;
import salcam.smarttoll.daoImp.CaixaMovimentoDAOImp;

/**
 *
 * @author Administrador
 */
public class ConsultaRelatorioMovimentacaoPistaIsenta extends HttpServlet {

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
        HttpSession session = request.getSession(false);
        String condicao = " WHERE ";
        condicao += (request.getParameter("movimentacao") != null && !request.getParameter("movimentacao").isEmpty())
                ? " c.CAIXAS_MOVIMENTOS_CODIGO = " + request.getParameter("movimentacao") + " AND" : "";                       
        
        if(request.getParameter("dataInicio")!=null && !request.getParameter("dataInicio").isEmpty()){            
            String[] inicio = request.getParameter("dataInicio").split("-");
            request.setAttribute("inicio", inicio[2]+"/"+inicio[1]+"/"+inicio[0]);
            condicao += " c.DATA_ABERTURA >= '"+inicio[0]+inicio[1]+inicio[2]+"' AND";
        }
        
        if(request.getParameter("dataFim")!=null && !request.getParameter("dataFim").isEmpty()){            
            String[] fim = request.getParameter("dataFim").split("-");
            request.setAttribute("fim", fim[2]+"/"+fim[1]+"/"+fim[0]);
            condicao += " c.DATA_FECHAMENTO <= '"+fim[0]+fim[1]+fim[2]+" 23:59:59' AND";
        }
        
        condicao += (request.getParameter("funcionario") != null && !request.getParameter("funcionario").isEmpty())
                ? " c.FUNCIONARIO_CODIGO = " + request.getParameter("funcionario") + " AND" : ""; 
        
        condicao += (request.getParameter("abertura") != null && !request.getParameter("abertura").isEmpty())
                ? " c.VALOR_ABERTURA  = " + request.getParameter("abertura") + " AND" : ""; 
        
        condicao += (request.getParameter("fechamento") != null && !request.getParameter("fechamento").isEmpty())
                ? " c.VALOR_FECHAMENTO  = " + request.getParameter("fechamento") + " AND" : ""; 
        
        condicao += (request.getParameter("caixa") != null && !request.getParameter("caixa").isEmpty())
                ? " c.CAIXA_CODIGO  = " + request.getParameter("caixa") + " AND" : ""; 
        
        condicao += (request.getParameter("recibo") != null && !request.getParameter("recibo").isEmpty())
                ? " c.RECIBO = " + request.getParameter("recibo") + " AND" : "";        
                
        if (condicao.equals(" WHERE ")) {
            condicao = "";
        } else {
            condicao = condicao.substring(0, condicao.length() - 3);
        }

        CaixaMovimentoDAO cdao = new CaixaMovimentoDAOImp();
        ResultSet rs = cdao.consultaCaixaMovimento(condicao);
        request.setAttribute("rs", rs);
        request.setAttribute("condicao", condicao);
        RequestDispatcher rd = request.getRequestDispatcher("/Relatorio/MovimentacaoPistaIsenta/consultaRelatorioMovimentacaoPistaIsentaRs.jsp");
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
