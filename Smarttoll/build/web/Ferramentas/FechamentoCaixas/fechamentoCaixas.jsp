<%-- 
    Document   : fechamentoCaixas
    Created on : 15/12/2014, 11:02:05
    Author     : Administrador
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="salcam.smarttoll.daoImp.CaixaMovimentoDAOImp"%>
<%@page import="salcam.smarttoll.dao.CaixaMovimentoDAO"%>
<%@page import="salcam.smarttoll.dao.CaixaMovimentoDAO"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>        
        <link rel="stylesheet" href="/Smarttoll/css/style.css">
        <title>Fechamento do Sistema</title>
    </head>
    <body>
        <div id="wrap">	
            <jsp:include page="/Estrutura/menu.jsp" />
            <div id="content">
                <h1>Fechamento do Sistema</h1>
                <br><br>
                <br><br>
                
                <table border="1" cellspacing="0">
                    <tr>
                        <th>Caixa</th>
                        <th>Movimentação</th>  
                        <th>Data Abertura</th>
                        <th>Valor Abertura</th>
                        <th>Data Fechamento</th>
                        <th>Funcionário</th>
                    </tr>                    
                    <%
                        CaixaMovimentoDAO cdao = new CaixaMovimentoDAOImp();
                        
                        ResultSet rs = cdao.consultaCaixaMovimentoEspecial("SELECT c.CAIXAS_MOVIMENTOS_CODIGO, cx.SERIAL, c.VALOR_ABERTURA, "
                            + "c.DATA_ABERTURA, COALESCE(c.DATA_FECHAMENTO,0) as DATA_FECHAMENTO, f.FUNCIONARIO "
                            + "FROM Caixas_Movimentos c LEFT JOIN Funcionarios f ON(f.FUNCIONARIO_CODIGO = c.FUNCIONARIO_CODIGO) "
                            + "LEFT JOIN Caixas cx ON(cx.CAIXA_CODIGO = c.CAIXA_CODIGO)"
                            + "WHERE VALOR_FECHAMENTO_OPERADOR IS NULL AND DATA_FECHAMENTO > '19001231' "
                            + "ORDER BY CAIXAS_MOVIMENTOS_CODIGO ASC");
                        if (rs != null) {
                            while (rs.next()) {
                    %>
                    <tr onmouseover="this.style.cursor = 'pointer'; this.className='trOver'" onmouseleave="this.className='trLeave'" ondblclick="window.location.href='fechamentoCaixasDetalhes.jsp?codigo=<%= rs.getString("CAIXAS_MOVIMENTOS_CODIGO")%>'">
                        <td><%= rs.getString("SERIAL")%></td>
                        <td><%= rs.getInt("CAIXAS_MOVIMENTOS_CODIGO")%></td>
                        <td><%= rs.getDate("DATA_ABERTURA")%></td>
                        <td>R$ <c:set var="valor" value="<%= rs.getFloat("VALOR_ABERTURA")%>"/>
                               <fmt:formatNumber value="${valor}" pattern="###,##0.00" type="number"/>
                        </td>                       
                        <td><%= rs.getDate("DATA_FECHAMENTO")%></td>
                        <td><%= rs.getString("FUNCIONARIO")%></td>
                    </tr>
                    <%
                            }
                        }
                    %>
                </table>
                <br><br>
            </div>
        </div>		
    </body>
    <jsp:include page="/Estrutura/footer.jsp" />
</html>