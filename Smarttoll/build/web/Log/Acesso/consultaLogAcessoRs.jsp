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
                <h2>Consulta de Log de Acesso</h2>
                <table>
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
                    %>
                    <tr>
                        <td><%= rs.getInt("FUNCIONARIO_CODIGO")%></td>
                        <td><%= rs.getString("FUNCIONARIO")%></td>
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
</html>