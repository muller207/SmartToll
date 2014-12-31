<%-- 
    Document   : fechamentoCaixasDetalhes
    Created on : 15/12/2014, 14:35:05
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
                <form method="post" action="AlteracaoFechamentoCaixa">                             
                    <%
                        CaixaMovimentoDAO cdao = new CaixaMovimentoDAOImp();
                        
                        ResultSet rs = cdao.consultaCaixaMovimentoEspecial("SELECT c.CAIXAS_MOVIMENTOS_CODIGO, cx.SERIAL, c.VALOR_ABERTURA, "
                            + "c.DATA_ABERTURA, COALESCE(c.DATA_FECHAMENTO,0) as DATA_FECHAMENTO, f.FUNCIONARIO "
                            + "FROM Caixas_Movimentos c LEFT JOIN Funcionarios f ON(f.FUNCIONARIO_CODIGO = c.FUNCIONARIO_CODIGO) "
                            + "LEFT JOIN Caixas cx ON(cx.CAIXA_CODIGO = c.CAIXA_CODIGO)"
                            + "WHERE VALOR_FECHAMENTO_OPERADOR IS NULL AND DATA_FECHAMENTO > '19001231' "
                            + "AND CAIXAS_MOVIMENTOS_CODIGO="+request.getParameter("codigo"));
                        if (rs != null) {
                            while (rs.next()) {
                    %>                    
                        <label>Movimentação:</label> 
                        <input name="movimentacao" type="number" value="<%= rs.getInt("CAIXAS_MOVIMENTOS_CODIGO")%>" readonly/>
                        <br><br>
                        <label>Caixa:</label>
                        <input type="text" value="<%= rs.getString("SERIAL")%>" readonly/>
                        <br><br>
                        <label>Data Abertura:</label>
                        <input  value="<%= rs.getDate("DATA_ABERTURA")%>" readonly/> 
                        <br><br>
                        <label>Data Fechamento:</label>
                        <input value="<%= rs.getDate("DATA_FECHAMENTO")%>" readonly/>
                        <br><br>
                        <label>Funcionário:</label>
                        <input type="text" value="<%= rs.getString("FUNCIONARIO")%>" readonly/>
                        <br><br>
                        <label>Valor Fechamento:</label> 
                        <input name="fechamento"/>
                        <br><br>
                        <input type="button" value="Cancelar" onclick="history.back()"> &nbsp; <input type="submit" value="Alterar" onclick="AlteracaoFechamentoCaixa">                    
                    <%
                            }
                        }
                    %>
                </form>
                <br><br>
            </div>
        </div>		
    </body>
    <jsp:include page="/Estrutura/footer.jsp" />
</html>
