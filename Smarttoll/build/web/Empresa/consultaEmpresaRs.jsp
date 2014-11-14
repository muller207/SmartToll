<%-- 
    Document   : consultaEmpresaRs
    Created on : 13/11/2014, 11:16:40
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
        <title>Consulta de Empresas</title>
    </head>
    <body>
        <div id="wrap">	
            <jsp:include page="/Estrutura/menu.jsp" />
            <div id="content">
                <h1>Consulta de Empresas</h1>
                <br>
                <br>
                <table border="1" cellspacing="0">
                    <tr >
                        <th>Código</th>
                        <th>Razão social</th>
                        <th>Nome fantasia</th>
                        <th>CNPJ</th>
                        <th>Inscr. Estadual</th>
                        <th>Inscr. Municipal</th>
                        <th>E-mail</th>	
                        <th>Homepage</th>
                    </tr>                    
                    <%
                        ResultSet rs = (ResultSet) request.getAttribute("rs");
                        if (rs != null) {
                            while (rs.next()) {                                
                    %>
                    <tr>
                        <td><%= rs.getInt("EMPRESA_CODIGO")%></td>
                        <td><%= rs.getString("RAZAO")%></td>                        
                        <td><%= rs.getString("FANTASIA")%></td>
                        <td><%= rs.getString("CNPJ")%></td>
                        <td><%= rs.getString("IE")%></td>
                        <td><%= rs.getString("INSCRICAO_MUNICIPAL")%></td>
                        <td><%= rs.getString("EMAIL")%></td>
                        <td><%= rs.getString("HOMEPAGE")%></td>
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
