<%-- 
    Document   : consultaCaixaRs
    Created on : 07/11/2014, 13:25:36
    Author     : Administrador
--%>

<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Consulta de caixas</title>
    </head>
    <body>
        <div id="wrap">			
            <div id="content">
                <h2>Consulta de caixas</h2>
                <table>
                    <tr >
                        <th>Caixa Código</th>
                        <th>Nome da estação de trabalho</th>
                        <th>Situacao</th>
                    </tr>                    
                    <%
                        ResultSet rs = (ResultSet) request.getAttribute("rs");
                        PrintWriter writer = response.getWriter();
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
</html>
