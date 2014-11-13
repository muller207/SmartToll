<%-- 
    Document   : consultaIsentoRs
    Created on : 13/11/2014, 13:52:10
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
        <title>Consulta de Isentos</title>
    </head>
    <body>
        <div id="wrap">	
            <jsp:include page="/Estrutura/menu.jsp" />
            <div id="content">
                <h1>Consulta de Isentos</h1>
                <br>
                <br>
                <table border="1" cellspacing="0">
                    <tr >
                        <th>Código</th>
                        <th>Nome</th>                        
                        <th>Situação</th>
                        <th>Vencimento</th>
                        <th>Cartão</th>
                    </tr>                    
                    <%
                        ResultSet rs = (ResultSet) request.getAttribute("rs");
                        if (rs != null) {
                            while (rs.next()) { 
                                String situacao = (rs.getBoolean("ATIVO"))?"Ativo":"Inativo";
                    %>
                    <tr>
                        <td><%= rs.getInt("ISENTO_CODIGO")%></td>
                        <td><%= rs.getString("NOME")%></td>
                        <td><%= situacao%></td>
                        <td><%= rs.getDate("VENCIMENTO")%></td>
                        <td><%= rs.getString("CARTAO")%></td>
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