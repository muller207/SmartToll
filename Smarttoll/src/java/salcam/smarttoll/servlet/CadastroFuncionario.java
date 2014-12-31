/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Blob;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.ImageIcon;
import salcam.smarttoll.beans.Funcionario;
import salcam.smarttoll.dao.FuncionarioDAO;
import salcam.smarttoll.daoImp.FuncionarioDAOImp;
import salcam.smarttoll.utils.Alert;

/**
 *
 * @author Administrador
 */
public class CadastroFuncionario extends HttpServlet {

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
            throws ServletException, IOException{
        try{
            Funcionario f = new Funcionario();

            f.setEmpresaCod(Integer.parseInt(request.getParameter("empresa")));
            f.setFuncionario(request.getParameter("nome"));
            f.setApelido(request.getParameter("apelido"));
            f.setCpf(request.getParameter("cpf"));
            f.setRg(request.getParameter("rg"));            
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
            String s = request.getParameter("admissao").replace("-", "");
            Date data = format.parse(s);
            f.setAdmissao(data);
            f.setSituacao(Byte.parseByte(request.getParameter("situacao")));
            f.setUsuario(request.getParameter("usuario"));
            f.setSenha(request.getParameter("senhaLogin"));
            f.setSenhaAdministrativa(request.getParameter("senhaLoginAdministrativa"));
            f.setFuncaoCodigo(Byte.parseByte(request.getParameter("funcao")));
            f.setHoraEntrada1(request.getParameter("entrada1"));
            f.setHoraEntrada2(request.getParameter("entrada2"));
            f.setHoraSaida1(request.getParameter("saida1"));
            f.setHoraSaida2(request.getParameter("saida2"));
            f.setHabilitacao(request.getParameter("numRegistro"));
            f.setCategoria(request.getParameter("categoria"));
            s = request.getParameter("emissao").replace("-", "");
            if(!s.isEmpty())
                data = format.parse(s);
            else
                data = null;
            f.setEmissao(data);
            s = request.getParameter("validade").replace("-", "");
            if(!s.isEmpty())
                data = format.parse(s);
            else
                data = null;
            f.setValidade(data);
            //if(!request.getParameter("foto").isEmpty()){
            //    f.setImagem(request.getParameter("foto"));
            //}else{
                f.setImagem("");
            //}

            FuncionarioDAO fdao = new FuncionarioDAOImp();

            if (fdao.cadastroFuncionario(f)) {
                Alert.Message(response, "Sucesso ao cadastrar funcionario", "/Smarttoll/home");
            } else {
                Alert.Message(response, "Falha ao cadastra funcionario", "/Smarttoll/home");
            }
        }catch(Exception e){
            Alert.Message(response, "Falha ao cadastra funcionario", "/Smarttoll/home");
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
