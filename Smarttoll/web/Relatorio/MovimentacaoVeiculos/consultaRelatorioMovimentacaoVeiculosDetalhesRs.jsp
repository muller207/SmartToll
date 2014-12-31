<%-- 
    Document   : consultaRelatorioMovimentacaoVeiculosDetalhesRs
    Created on : 28/11/2014, 11:05:57
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
        <title>Consulta de Movimentações de Veículos</title>
    </head>
    <body>
        <div id="wrap">	
            <jsp:include page="/Estrutura/menu.jsp" />
            <div id="content">
                <h1>Consulta de Movimentações de Veículos</h1>
                <br>
                <br>  
                <h2>Classificação <%= request.getParameter("class")%></h2>
                <br>
                <br>
                <table border="1" cellspacing="0">
                    <tr >
                        <th>   </th>
                        <th>Cod. Movimentação</th>
                        <th>Funcionário</th>
                        <th>Lançamento</th>
                        <th>Caixa</th>                        
                    </tr>                    
                    <%
                        String condicao = (String) session.getAttribute("condicao");
                        CaixaMovimentoDetalheDAO cdao = new CaixaMovimentoDetalheDAOImp();
                        ResultSet rs = cdao.consultaCaixaMovimentoDetalheGenerica("SELECT c.CAIXAS_MOVIMENTOS_CODIGO, c.LANCAMENTO, c.CAIXA_CODIGO, f.FUNCIONARIO"
                                + " FROM Caixas_Movimentos_Detalhes c LEFT JOIN Classificacoes cl ON(cl.CLASSIFICACAO_CODIGO = c.CLASSIFICACAO_CODIGO) "
                                + " LEFT JOIN Caixas_Movimentos cm ON (cm.CAIXAS_MOVIMENTOS_CODIGO = c.CAIXAS_MOVIMENTOS_CODIGO)"
                                + " LEFT JOIN Funcionarios f ON(f.FUNCIONARIO_CODIGO = cm.FUNCIONARIO_CODIGO) "+ condicao
                                + " AND cl.CLASSIFICACAO = '"+request.getParameter("class")+"'");
                        if (rs != null) {
                            int i = 0;
                            while (rs.next()) {                                
                    %>
                    <tr>
                        <td><%= ++i%></td>
                        <td><%= rs.getInt("CAIXAS_MOVIMENTOS_CODIGO")%></td>
                        <td><%= rs.getString("FUNCIONARIO")%></td>                        
                        <td><%= rs.getDate("LANCAMENTO")%></td>
                        <td><%= rs.getInt("CAIXA_CODIGO")%></td>
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
