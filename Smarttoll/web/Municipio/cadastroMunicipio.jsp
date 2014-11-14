<%-- 
    Document   : cadastroMunicipio
    Created on : 14/11/2014, 08:46:51
    Author     : Administrador
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="salcam.smarttoll.daoImp.EstadoDAOImp"%>
<%@page import="salcam.smarttoll.dao.EstadoDAO"%>
<%
    session = request.getSession(false);
    try {
        if (session.getAttribute("usuario") == null || session.getAttribute("usuario").toString().isEmpty()) {
            response.sendRedirect("/Smarttoll");
        }
    } catch (Exception e) {
        response.sendRedirect("/Smarttoll");
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="/Smarttoll/css/style.css">
        <title>Cadastro de Município</title>
    </head>
    <body>
        <div id="wrap">	
            <jsp:include page="/Estrutura/menu.jsp" />
            <div id="content" >
                <h1>Cadastro de Município</h1><br><br>               
                    <form action="CadastroMunicipio" method="post">                        
                        <label>Município</label>
                        <input type="text" name="municipio" required><br><br>
                        
                        <label>Estado</label>                        
                        <select name="estado" required>
                            <option value=""></option>
                            <% 
                                EstadoDAO edao = new EstadoDAOImp();
                                ResultSet rs = edao.consultaEstadoTotal();
                                while(rs.next()){
                            %>
                            <option value="<%= rs.getString("ESTADO_CODIGO") %>"><%= rs.getString("ESTADO_CODIGO") %></option>                            
                            <% 
                                }
                            %>
                        </select><br><br>
                        
                        <br><br>
                        <input type="submit" value="Enviar">
                    </form>
            </div>
        </div> 
        <jsp:include page="/Estrutura/footer.jsp" />
    </body>
</html>
