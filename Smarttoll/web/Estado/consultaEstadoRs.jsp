<%-- 
    Document   : consultaEstadoRs
    Created on : 13/11/2014, 13:20:13
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
                <h1>Consulta de Estados</h1>
                <br>
                <br>
                <table border="1" cellspacing="0">
                    <tr >
                        <th>Estado</th>
                        <th>Sigla</th>                        
                    </tr>                    
                    <%
                        ResultSet rs = (ResultSet) request.getAttribute("rs");
                        if (rs != null) {
                            while (rs.next()) {                                
                    %>
                    <tr>
                        <td><%= rs.getString("ESTADO")%></td>
                        <td><%= rs.getString("ESTADO_CODIGO")%></td>
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
