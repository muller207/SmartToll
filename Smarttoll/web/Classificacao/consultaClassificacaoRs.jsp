<%-- 
    Document   : consultaClassificacaoRs
    Created on : 14/11/2014, 08:07:41
    Author     : Administrador
--%>

<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="/Smarttoll/css/style.css">
        <title>Consulta de Classificacões</title>
    </head>
    <body>
        <div id="wrap">	
            <jsp:include page="/Estrutura/menu.jsp" />
            <div id="content">
                <h1>Consulta de Classificacões</h1>
                <br>
                <br>
                <table border="1" cellspacing="0">
                    <tr >
                        <th>Classificação</th>
                        <th>Descrição</th>                        
                        <th>Tarifa</th>
                        <th>Eixos Simples</th>
                        <th>Eixos Comerciais</th>                                              
                        <th>Situação</th>
                    </tr>                    
                    <%
                        ResultSet rs = (ResultSet) request.getAttribute("rs");
                        if (rs != null) {
                            while (rs.next()) { 
                                String situacao = (rs.getBoolean("SITUACAO"))?"Ativo":"Inativo";
                    %>
                    <tr>
                        <td><%= rs.getString("CLASSIFICACAO")%></td>
                        <td><%= rs.getString("DESCRICAO")%></td>
                        <td><%= rs.getFloat("TARIFA")%></td>
                        <td><%= rs.getInt("EIXOS")%></td>
                        <td><%= rs.getInt("EIXOS_COMERCIAL")%></td>
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
