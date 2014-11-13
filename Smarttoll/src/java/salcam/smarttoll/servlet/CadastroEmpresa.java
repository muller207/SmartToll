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
import javax.servlet.http.HttpSession;
import salcam.smarttoll.beans.Empresa;
import salcam.smarttoll.dao.EmpresaDAO;
import salcam.smarttoll.daoImp.EmpresaDAOImp;
import salcam.smarttoll.utils.Alert;

/**
 *
 * @author Samuel
 */
public class CadastroEmpresa extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
        
        Empresa e = new Empresa();

        if (request.getParameter("razao").equals("")
                || request.getParameter("fantasia").equals("")
                || request.getParameter("cnpj").equals("")
                || request.getParameter("ie").equals("")) {
            PrintWriter out = response.getWriter();
            out.print("<script>window.history.back();</script>");
        }

        e.setRazao(request.getParameter("razao"));
        e.setFantasia(request.getParameter("nomeFantasia"));
        e.setCnpj(request.getParameter("cnpj"));
        e.setIe(request.getParameter("ie"));

        e.setObservacao((request.getParameter("obs") != null && !request.getParameter("obs").isEmpty())
                ? request.getParameter("obs") : "");
        
        e.setHomepage((request.getParameter("homepage") != null && !request.getParameter("homepage").isEmpty())
                ? request.getParameter("homepage") : "");
        
        e.setEmail((request.getParameter("email") != null && !request.getParameter("email").isEmpty())
                ? request.getParameter("email") : "");
        
        e.setSenhaEmail((request.getParameter("senhaSmtp") != null && !request.getParameter("senhaSmtp").isEmpty())
                ? request.getParameter("senhaSmtp") : "");
        
        e.setLoginEmail((request.getParameter("loginSmtp") != null && !request.getParameter("loginSmtp").isEmpty())
                ? request.getParameter("loginSmtp") : "");
        
        e.setSmtp((request.getParameter("smtp") != null && !request.getParameter("smtp").isEmpty())
                ? request.getParameter("smtp") : "");
        
        e.setAutenticado((request.getParameter("autenticado") != null)
                ? true : false);
        
        e.setInscricaoMunicipal((request.getParameter("inscricaoMunicipal") != null && !request.getParameter("inscricaoMunicipal").isEmpty())
                ? request.getParameter("inscricaoMunicipal") : "");
        
        EmpresaDAO edao = new EmpresaDAOImp();        
        if(edao.cadastroEmpresa(e)){
            Alert.Message(response, "Sucesso ao cadastrar empresa", "/Smarttoll/home");
        } else {
            Alert.Message(response, "Falha ao cadastra empresa", "/Smarttoll/home");
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
