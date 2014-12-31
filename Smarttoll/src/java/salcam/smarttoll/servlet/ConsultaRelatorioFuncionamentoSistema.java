/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.servlet;

import java.io.IOException;
import java.net.InetAddress;
import java.sql.ResultSet;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import salcam.smarttoll.beans.LogRelatorio;
import salcam.smarttoll.dao.LogRelatorioDAO;
import salcam.smarttoll.dao.UptimeDAO;
import salcam.smarttoll.daoImp.LogRelatorioDAOImp;
import salcam.smarttoll.daoImp.UptimeDAOImp;

/**
 *
 * @author Administrador
 */
public class ConsultaRelatorioFuncionamentoSistema extends HttpServlet {

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
        
        if(request.getParameter("dataInicio")!=null && !request.getParameter("dataInicio").isEmpty()){            
            String[] inicio = request.getParameter("dataInicio").split("-");
            request.setAttribute("inicio", inicio[2]+"/"+inicio[1]+"/"+inicio[0]);
            condicao += " DATA_INICIO >= '"+inicio[0]+inicio[1]+inicio[2]+"' AND";
        }
        
        if(request.getParameter("dataFim")!=null && !request.getParameter("dataFim").isEmpty()){            
            String[] fim = request.getParameter("dataFim").split("-");
            request.setAttribute("fim", fim[2]+"/"+fim[1]+"/"+fim[0]);
            condicao += " ULTIMO_REGISTRO <= '"+fim[0]+fim[1]+fim[2]+" 23:59:59' AND";
        }
        
        condicao += (request.getParameter("caixa") != null && !request.getParameter("caixa").isEmpty())
                ? " CAIXA_CODIGO  = " + request.getParameter("caixa") + " AND" : "";         
                
        if (condicao.equals(" WHERE ")) {
            condicao = "";
        } else {
            condicao = condicao.substring(0, condicao.length() - 3);
        }        
        
        UptimeDAO udao = new UptimeDAOImp();
        ResultSet rs = udao.consultaUptime(condicao);
        request.setAttribute("rs", rs);
        request.setAttribute("condicao", condicao);
//        session.setAttribute("condicao", condicao);
        LogRelatorio l = new LogRelatorio();
        l.setData(new Date());
        l.setFuncionarioCod(Integer.parseInt(session.getAttribute("usuario_cod").toString()));
        l.setInstrucaoSql(condicao.toUpperCase());
        InetAddress conf = InetAddress.getLocalHost();        
        l.setIpAdministrativo(conf.getHostAddress());
        l.setTipoRelatorioCod((byte)4);
        LogRelatorioDAO ldao = new LogRelatorioDAOImp();
        ldao.cadastroLogRelatorio(l);
        RequestDispatcher rd = request.getRequestDispatcher("/Relatorio/FuncionamentoSistema/consultaRelatorioFuncionamentoSistemaRs.jsp");
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
