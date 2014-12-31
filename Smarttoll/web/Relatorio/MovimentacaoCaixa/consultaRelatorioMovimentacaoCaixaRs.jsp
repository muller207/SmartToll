<%-- 
    Document   : consultaRelatorioMovimentacaoCaixaRs
    Created on : 19/11/2014, 09:25:40
    Author     : Administrador
--%>

<%@page import="salcam.smarttoll.daoImp.CaixaMovimentoDAOImp"%>
<%@page import="salcam.smarttoll.dao.CaixaMovimentoDAO"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <title>Consulta de Movimentações de Caixa</title>
    </head>
    <body>
        <div id="wrap">	
            <jsp:include page="/Estrutura/menu.jsp" />
            <div id="content">
                <h1>Consulta de Movimentações de Caixa</h1>
                <br><br>
                <br><br>
                <%  String condicao = (String) request.getAttribute("condicao");
                    CaixaMovimentoDAO cdao = new CaixaMovimentoDAOImp();                    
                    ResultSet soma= cdao.consultaCaixaMovimentoEspecial("SELECT SUM(VALOR_FECHAMENTO) as SOMA_FECHAMENTO, SUM(VALOR_MOVIMENTO_TOTAL) as SOMA_MOVIMENTACAO FROM Caixas_Movimentos c "+condicao);
                        if (soma.next()) {
                %>
                Valor Total do Fechamento: 
                <c:set var="valor" value="<%= soma.getFloat("SOMA_FECHAMENTO")%>"/>
                <input disabled type="text" value="R$ <fmt:formatNumber value="${valor}" pattern="###,##0.00" type="number"/>">
                &nbsp; &nbsp;
                Total da Movimentação: 
                <c:set var="valor" value="<%= soma.getFloat("SOMA_MOVIMENTACAO")%>"/>
                <input disabled type="text" value="R$ <fmt:formatNumber value="${valor}" pattern="###,##0.00" type="number"/>">
                <%}%>
                <br><br>
                <br><br>
                <table border="1" cellspacing="0">
                    <tr>
                        <th>Código</th>
                        <th>Movimentação</th>
                        <th>Caixa</th>
                        <th>Valor Abertura</th>
                        <th>Valor Fechamento</th>
                        <th>Valor Movimentação</th>
                        <th>Data Abertura</th>
                        <th>Data Fechamento</th>
                        <th>Funcionário</th>
                    </tr>                    
                    <%
                        ResultSet rs = (ResultSet) request.getAttribute("rs");
                        if (rs != null) {
                            while (rs.next()) {
                    %>
                    <tr onmouseover="this.style.cursor = 'pointer'; this.className='trOver'" onmouseleave="this.className='trLeave'" ondblclick="window.location.href='consultaRelatorioMovimentacaoCaixaDetalhesRs.jsp?codigo=<%= rs.getString("CAIXAS_MOVIMENTOS_CODIGO")%>'">
                        <td><%= rs.getInt("CAIXAS_MOVIMENTOS_CODIGO")%></td>
                        <td><%= rs.getInt("MOVIMENTACAO")%></td>                        
                        <td><%= rs.getByte("CAIXA_CODIGO")%></td>
                        <td>R$ <c:set var="valor" value="<%= rs.getFloat("VALOR_ABERTURA")%>"/>
                               <fmt:formatNumber value="${valor}" pattern="###,##0.00" type="number"/>
                        </td>
                        <td>R$ <c:set var="valor" value="<%= rs.getFloat("VALOR_FECHAMENTO")%>"/>
                               <fmt:formatNumber value="${valor}" pattern="###,##0.00" type="number"/>
                        </td>
                        <td>R$ <c:set var="valor" value="<%= rs.getFloat("VALOR_MOVIMENTO_TOTAL")%>"/>
                               <fmt:formatNumber value="${valor}" pattern="###,##0.00" type="number"/>
                        </td>
                        <td><%= rs.getDate("DATA_ABERTURA")%></td>
                        <td><%= rs.getDate("DATA_ABERTURA")%></td>
                        <td><%= rs.getString("FUNCIONARIO")%></td>
                    </tr>
                    <%
                            }
                        }
                        session.setAttribute("inicio", request.getAttribute("inicio"));
                        session.setAttribute("fim", request.getAttribute("fim"));
                        session.setAttribute("condicao", condicao);
                    %>

                </table>
                    <br><br>
                    <a href="ImprimirRelatorioMovimentacaoCaixa?tipo=res">Imprimir Res</a>&nbsp|&nbsp;<a href="ImprimirRelatorioMovimentacaoCaixa?tipo=det">Imprimir Det</a>&nbsp;
            </div>
        </div>		
    </body>
    <jsp:include page="/Estrutura/footer.jsp" />
</html>