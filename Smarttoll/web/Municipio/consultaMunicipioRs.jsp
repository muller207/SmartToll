<%-- 
    Document   : consultaMunicipioRs
    Created on : 14/11/2014, 16:09:54
    Author     : Administrador
--%>

<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="/Smarttoll/css/style.css">
        <title>Consulta de Municípios</title>
    </head>
    <body>
        <div id="wrap">	
            <jsp:include page="/Estrutura/menu.jsp" />
            <div id="content">
                <h1>Consulta de Municípios</h1>
                <br>
                <br>
                <table border="1" cellspacing="0">
                    <tr >
                        <th>Município</th>
                        <th>Estado</th>                                               
                    </tr>                    
                    <%
                        ResultSet rs = (ResultSet) request.getAttribute("rs");
                        if (rs != null) {
                            while (rs.next()) { 
                    %>
                    <tr>
                        <td><%= rs.getString("MUNICIPIO")%></td>
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
