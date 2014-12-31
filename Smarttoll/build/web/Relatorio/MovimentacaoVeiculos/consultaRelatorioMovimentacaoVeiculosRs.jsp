<%-- 
    Document   : consultaRelatorioMovimentacaoVeiculosRs
    Created on : 28/11/2014, 08:42:08
    Author     : Administrador
--%>

<%@page import="salcam.smarttoll.daoImp.CaixaMovimentoDetalheDAOImp"%>
<%@page import="salcam.smarttoll.dao.CaixaMovimentoDetalheDAO"%>
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
                <table border="1" cellspacing="0">
                    <tr>
                        <th>Classificação</th>
                        <th>Descrição</th>
                        <th>Total</th>
                    </tr>                    
                    <%
                        String condicao = (String) session.getAttribute("condicao");                        
                        String classi;                                                
                        int soma = 0;
                        ResultSet rs = (ResultSet) request.getAttribute("rs");
                        if (rs != null) {
                            while (rs.next()) {                                
                                if(!condicao.isEmpty()){
                                    classi=" AND CLASSIFICACAO_CODIGO="+rs.getInt("CLASSIFICACAO_CODIGO");
                                }else{
                                    classi=" WHERE CLASSIFICACAO_CODIGO="+rs.getInt("CLASSIFICACAO_CODIGO");
                                }
                                CaixaMovimentoDetalheDAO cdao = new CaixaMovimentoDetalheDAOImp();
                                ResultSet total = cdao.consultaCaixaMovimentoDetalheGenerica("SELECT COUNT(CAIXAS_MOVIMENTOS_DETALHES_CODIGO) as TOTAL"
                                        + " FROM Caixas_Movimentos_Detalhes c " + condicao + classi);
                        %>
                    <tr onmouseover="this.style.cursor = 'pointer'; this.className='trOver'" onmouseleave="this.className='trLeave'" ondblclick="window.location='consultaRelatorioMovimentacaoVeiculosDetalhesRs.jsp?class=<%= rs.getString("CLASSIFICACAO")%>'">
                        <td><%= rs.getString("CLASSIFICACAO")%></td>
                        <td><%= rs.getString("DESCRICAO")%></td>
                        <%
                            while(total.next()){
                                soma+=total.getInt("TOTAL");
                        %>
                        <td><%= total.getInt("TOTAL")%></td>
                        <%
                            }
                        %>
                    </tr>
                    <%
                            }
                        }
                        session.setAttribute("inicio", request.getAttribute("inicio"));
                        session.setAttribute("fim", request.getAttribute("fim"));
                    %>

                </table>
                    <br><br>
                    <a href="ImprimirRelatorioMovimentacaoVeiculos?tipo=res">Imprimir Res</a>&nbsp|&nbsp;<a href="ImprimirRelatorioMovimentacaoVeiculos?tipo=det">Imprimir Det</a>&nbsp;                    
            </div>
        </div>		
    </body>
    <jsp:include page="/Estrutura/footer.jsp" />
</html>
