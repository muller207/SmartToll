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
        <title>Consulta de Caixas</title>
    </head>
    <body>
        <div id="wrap">	
            <jsp:include page="/Estrutura/menu.jsp" />
            <div id="content">
                <h1>Consulta de Caixas</h1>
                <br>
                <br>
                <table border="1" cellspacing="0">
                    <tr >
                        <th>Caixa Código</th>
                        <th>Nome da estação de trabalho</th>
                        <th>Situacao</th>
                    </tr>                    
                    <%
                        ResultSet rs = (ResultSet) request.getAttribute("rs");
                        if (rs != null) {
                            while (rs.next()) {
                                String situacao = (rs.getBoolean("SITUACAO")) ? "ATIVO" : "INATIVO";
                    %>
                    <tr>
                        <td><%= rs.getInt("CAIXA_CODIGO")%></td>
                        <td><%= rs.getString("SERIAL")%></td>
                        <td><%= situacao%></td>
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
