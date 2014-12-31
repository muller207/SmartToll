<%-- 
    Document   : consultaLogVisualizacaoRelatoriosRs
    Created on : 17/12/2014, 13:03:36
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
        <title>Visualização de Relatórios</title>
    </head>
    <body>
        <div id="wrap">	
            <jsp:include page="/Estrutura/menu.jsp" />
            <div id="content" >
                <h1>Consulta de Log de Visualização de Relatórios</h1>
                <br><br>
                <table border="1" cellspacing="0">
                    <tr ondblclick="">
                        <th>Data</th>
                        <th>IP do Local</th>
                        <th>Funcionário</th>
                        <th>Tipo de Relatório</th>
                    </tr>                   
                    <%
                        ResultSet rs = (ResultSet) request.getAttribute("rs");
                        PrintWriter writer = response.getWriter();
                        if (rs != null) {
                            while (rs.next()) {                                                                                                
                                String nome = (rs.getString("FUNCIONARIO")==null)?"":rs.getString("FUNCIONARIO");
                    %>
                    <tr>
                        <td><%= rs.getDate("DATA")%></td>
                        <td><%= rs.getString("IP_ADMINISTRATIVO")%></td>
                        <td><%= nome%></td>                        
                        <td><%= rs.getString("RELATORIO")%></td>
                        
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
