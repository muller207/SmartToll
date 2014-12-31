/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import salcam.smarttoll.conn.Conn;
import static salcam.smarttoll.dao.FuncaoDAO.CONSULTA_FUNCAO;
import salcam.smarttoll.dao.MenuDAO;
import salcam.smarttoll.daoImp.MenuDAOImp;
import salcam.smarttoll.daoImp.MenuNivelDAO;
import salcam.smarttoll.daoImp.MenuNivelDAOImp;

/**
 *
 * @author Administrador
 */
public class servletTeste extends HttpServlet {

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
        String grupoOld = "";
        ResultSet rs = consultaGenerica("SELECT gca.DESCRICAO as GRUPO, m.DESCRICAO as MENU, m.NIVEL_CODIGO, gcam.DIREITO "
                + "FROM GRUPOS_CONTROLE_ACESSO_MENUS gcam "
                + "LEFT JOIN GRUPOS_CONTROLE_ACESSO gca ON (gca.GRUPO_CONTROLE_ACESSO_CODIGO = gcam.GRUPO_CONTROLE_ACESSO_CODIGO) "
                + "LEFT JOIN MENUS m ON (m.MENU_CODIGO = gcam.MENU_CODIGO)");
        try {
            PrintWriter out = response.getWriter();
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servletTeste</title>");            
            out.println("</head>");
            out.println("<body>");
            if(rs!=null){
                while(rs.next()){
                    String grupo = rs.getString("GRUPO");
                    if(!grupo.equals(grupoOld)){
                        out.println("<h1>"+grupo+"</h1>");
                        grupoOld = grupo;
                    }
                    String menu = rs.getString("MENU");
                    menu= codifica(menu);
                    out.println("<h3>MENU: "+menu);
                    ResultSet niveis = consultaGenerica("SELECT DESCRICAO FROM MENUS_NIVEIS WHERE"
                            + " NIVEL = "+String.valueOf(rs.getInt("DIREITO"))+" AND NIVEL_CODIGO = "+String.valueOf(rs.getInt("NIVEL_CODIGO")));
                    if(niveis!=null){
                        if(niveis.next()){
                            String nivel = niveis.getString("DESCRICAO");
                            nivel= codifica(nivel);
                            out.println(" || NIVEL: "+nivel+"</h3>");
                        }
                    }
                }
                out.println("<br>");
            }
            out.println("</body>");
            out.println("</html>");
        }catch(Exception e){
            
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

    public ResultSet consultaGenerica(String sql){
        ResultSet rs = null;        
        try{
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(sql);
            rs = stmt.executeQuery();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    private String codifica(String pass) {
        String mascara = "#$%$^%*@" + (char) 13 + (char) 12;
        int aux = 13;
        String cAux = "";
        int ponM = 0;
        pass = pass.replace("''", "'");
        for (int ponS = 0; ponS < pass.length(); ponS++) {
            if(ponM<=7)
                cAux += (char) ((int) pass.charAt(ponS) ^ ((int) mascara.charAt(ponM)));
            else{
                cAux += (char) ((int) pass.charAt(ponS) ^ (aux));
                aux--;
            }
            ponM++;
            if (ponM > mascara.length()-1) {
                ponM = 0;
                aux = 13;
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
