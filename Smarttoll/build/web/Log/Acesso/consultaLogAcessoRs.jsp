<%-- 
    Document   : consultaCaixaRs
    Created on : 07/11/2014, 13:25:36
    Author     : Administrador
--%>
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

<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="/Smarttoll/css/style.css">
        <title>Consulta de Logs de Acesso</title>
    </head>
    <body>
        <div id="wrap">	
            <jsp:include page="/Estrutura/menu.jsp" />
            <div id="content" >
                <h1>Consulta de Logs de Acesso</h1>
                <br><br>
                <table border="1" cellspacing="0">
                    <tr ondblclick="">
                        <th>Codigo</th>
                        <th>Funcionario</th>
                        <th>Data</th>
                        <th>Sucesso</th>
                        <th>Sistema</th>
                        <th>Estacao</th>
                        <th>IP</th>
                    </tr>                   
                    <%
                        ResultSet rs = (ResultSet) request.getAttribute("rs");
                        PrintWriter writer = response.getWriter();
                        if (rs != null) {
                            while (rs.next()) {                                                                
                                String sistema;
                                if(rs.getByte("SISTEMA") == 1){
                                    sistema = "Administrativo";
                                }else{
                                    sistema = "Caixa";
                                }
                                String sucesso;
                                if(rs.getByte("SUCESSO") == 1){
                                    sucesso = "Login";
                                }else{
                                    sucesso = "Logout";
                                }
                                String nome = (rs.getString("FUNCIONARIO")==null)?"":rs.getString("FUNCIONARIO");
                    %>
                    <tr>
                        <td><%= rs.getInt("FUNCIONARIO_CODIGO")%></td>
                        <td><%= nome%></td>
                        <td><%= rs.getDate("DATA")%></td>
                        <td><%= sucesso%></td>
                        <td><%= sistema%></td>
                        <td><%= rs.getString("ESTACAO")%></td>
                        <td><%= rs.getString("IP")%></td>
                    </tr>
                    <%
                            }
                        }
                    %>

                </table>
            </div>
        </div>		
    </body>
    <jsp:include page="/Estrutura/footer.jsp" />
</html>