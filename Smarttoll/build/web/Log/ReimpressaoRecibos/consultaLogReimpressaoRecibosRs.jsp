<%-- 
    Document   : consultaReimpressaoRecibosRs
    Created on : 15/12/2014, 16:40:16
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
        <title>Consulta de Logs de Reimpressão de Recibos</title>
    </head>
    <body>
        <div id="wrap">	
            <jsp:include page="/Estrutura/menu.jsp" />
            <div id="content" >
                <h1>Consulta de Logs de Reimpressão de Recibos</h1>
                <br><br>
                <table border="1" cellspacing="0">
                    <tr ondblclick="">
                        <th>Funcionario</th>
                        <th>Cabine</th>                        
                        <th>Data</th>
                        <th>Justificativa</th>
                        <th>Descrição</th>
                        <th>Placa do Veículo</th>
                        <th>Classificação</th>
                        <th>IP</th>
                    </tr>                   
                    <%
                        ResultSet rs = (ResultSet) request.getAttribute("rs");
                        PrintWriter writer = response.getWriter();
                        if (rs != null) {
                            while (rs.next()) {                                                                                                
                                String nome = (rs.getString("FUNCIONARIO")==null)?"":rs.getString("FUNCIONARIO");
                    %>
                    <tr>
                        <td><%= nome%></td>
                        <td><%= rs.getString("CABINE")%></td>                        
                        <td><%= rs.getDate("DATA")%></td>
                        <td><%= rs.getString("JUSTIFICATIVA")%></td>
                        <td><%= rs.getString("DESCRICAO")%></td>
                        <td><%= rs.getString("PLACA_VEICULO")%></td>
                        <td><%= rs.getString("CLASSIFICACAO")%></td>
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