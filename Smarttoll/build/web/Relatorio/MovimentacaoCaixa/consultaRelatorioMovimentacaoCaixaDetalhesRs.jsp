<%-- 
    Document   : consultaRelatorioMovimentacaoCaixaDadosRs
    Created on : 19/11/2014, 10:11:22
    Author     : Administrador
--%>


<%@page import="salcam.smarttoll.daoImp.CaixaMovimentoDAOImp"%>
<%@page import="salcam.smarttoll.dao.CaixaMovimentoDAO"%>
<%@page import="salcam.smarttoll.daoImp.CaixaMovimentoDetalheDAOImp"%>
<%@page import="salcam.smarttoll.dao.CaixaMovimentoDetalheDAO"%>
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
                <br>
                <br>
                <%
                    CaixaMovimentoDAO cadao = new CaixaMovimentoDAOImp();
                    ResultSet rs1 = cadao.consultaCaixaMovimento(" WHERE c.CAIXAS_MOVIMENTOS_CODIGO="+request.getParameter("codigo"));
                    if(rs1.next()){
                %>
                <label>Código Movimentação</label>
                <input disabled type="text" value="<%=rs1.getInt("CAIXAS_MOVIMENTOS_CODIGO")%>">
                &nbsp; &nbsp;
                <label>Lançamento</label>
                <input disabled type="text" value="<%=rs1.getDate("DATA_ABERTURA")%>">
                <br><br>
                <label>Funcionário</label>
                <input disabled type="text" value="<%=rs1.getString("FUNCIONARIO")%>">
                &nbsp; &nbsp;
                <label>Caixa</label>
                <input disabled type="text" value="<%=rs1.getInt("CAIXA_CODIGO")%>">
                <br><br>
                <label>Valor Abertura</label>
                <c:set var="valor" value="<%= rs1.getFloat("VALOR_ABERTURA")%>"/>
                <input disabled type="text" value="R$ <fmt:formatNumber value="${valor}" pattern="###,##0.00" type="number"/>">
                &nbsp; &nbsp;
                <label>Valor Fechamento</label>
                <c:set var="valor" value="<%= rs1.getFloat("VALOR_FECHAMENTO")%>"/>
                <input disabled type="text" value="R$ <fmt:formatNumber value="${valor}" pattern="###,##0.00" type="number"/>">
                <br><br><br><br>
                <%}%>
                <table border="1" cellspacing="0">
                    <tr >
                        <th>Lançamento</th>
                        <th>Class.</th>
                        <th>Descrição da Classificação</th>
                        <th>Tarifa</th>
                        <th>Recebido</th>
                        <th>Troco</th>
                        <th>Eixos Simples</th>
                        <th>Eixos Comerciais</th>
                        <th>Recibo</th>
                        <th>Placa</th>
                    </tr>                    
                    <%
                        CaixaMovimentoDetalheDAO cdao = new CaixaMovimentoDetalheDAOImp();
                        ResultSet rs = cdao.consultaCaixaMovimentoDetalhe(" WHERE CAIXAS_MOVIMENTOS_CODIGO="+request.getParameter("codigo"));
                        if (rs != null) {
                            while (rs.next()) {                                
                    %>
                    <tr>
                        <td><%= rs.getDate("LANCAMENTO")%></td>
                        <td><%= rs.getString("CLASSIFICACAO")%></td>                        
                        <td><%= rs.getString("DESCRICAO")%></td>
                        <td>R$ <c:set var="valor" value="<%= rs.getFloat("TARIFA")%>"/>
                               <fmt:formatNumber value="${valor}" pattern="###,##0.00" type="number"/>
                        </td>
                        <td>R$ <c:set var="valor" value="<%= rs.getFloat("VALOR_PAGO")%>"/>
                               <fmt:formatNumber value="${valor}" pattern="###,##0.00" type="number"/>
                        </td>
                        <td>R$ <c:set var="valor" value="<%= rs.getFloat("TROCO")%>"/>
                               <fmt:formatNumber value="${valor}" pattern="###,##0.00" type="number"/>
                        </td>
                        <td><%= rs.getInt("EIXOS_CLASSIFICACAO")%>/<%= rs.getInt("EIXOS_SENSOR")%></td>
                        <td><%= rs.getInt("EIXOS_COMERCIAL_CLASSIFICACAO")%>/<%= rs.getInt("EIXOS_COMERCIAL_SENSOR")%></td>
                        <td><%= rs.getString("RECIBO")%></td>
                        <td><%= rs.getString("PLACA")%></td>
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