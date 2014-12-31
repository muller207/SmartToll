<%-- 
    Document   : consultaRelatorioDiscrepanciaEixosRs
    Created on : 08/12/2014, 17:25:59
    Author     : Administrador
--%>

<%@page import="salcam.smarttoll.daoImp.RegistroMicrocontroladorDAOImp"%>
<%@page import="salcam.smarttoll.dao.RegistroMicrocontroladorDAO"%>
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
        <title>Consulta de Discrepância dos Eixos</title>
    </head>
    <body>
        <div id="wrap">	
            <jsp:include page="/Estrutura/menu.jsp" />
            <div id="content">
                <h1>Consulta de Discrepância dos Eixos</h1>
                <br><br>
                <br><br>
                <%
                    String condicao = (String) request.getAttribute("condicao");
                    CaixaMovimentoDAO cdao = new CaixaMovimentoDAOImp();
                    RegistroMicrocontroladorDAO rdao = new RegistroMicrocontroladorDAOImp();
                    ResultSet classif = cdao.consultaCaixaMovimentoEspecial("SELECT SUM(EIXOS_CLASSIFICACAO + EIXOS_COMERCIAL_CLASSIFICACAO) as SOMA "+ 
                        "FROM Caixas_Movimentos_Detalhes "+condicao);
                    if(classif.next()){
                %>
                Classificação <input type="text" value="<%= classif.getInt("SOMA")%>" disabled> &nbsp;
                <%}%>
                <%
                    String sql = "SELECT SUM(EIXOS_SENSOR + EIXOS_COMERCIAL_SENSOR) as SOMA FROM Registros_Microcontroladores ";
                    if(condicao.contains("WHERE")){
                        sql += condicao + "AND EIXOS_SENSOR < 1000";
                    }else{
                        sql += "WHERE EIXOS_SENSOR < 1000";
                    }
                    
                    ResultSet contador = rdao.consultaRegistroMicroncontroladorEspecial(sql);
                    if(contador.next()){
                %>
                Contador <input type="text" value="<%= contador.getInt("SOMA")%>" disabled> &nbsp;
                <%}%>
                <%
                    int discrCmd = 0;
                    int discrRm = 0;
                    
                    sql = "SELECT SUM((EIXOS_CLASSIFICACAO - EIXOS_SENSOR) +  (EIXOS_COMERCIAL_CLASSIFICACAO - EIXOS_COMERCIAL_SENSOR)) as SOMA "
                        + " FROM CAIXAS_MOVIMENTOS_DETALHES ";
                    if(condicao.contains("WHERE")){
                        sql += condicao + "AND ((EIXOS_CLASSIFICACAO - EIXOS_SENSOR <> 0) OR (EIXOS_COMERCIAL_CLASSIFICACAO - EIXOS_COMERCIAL_SENSOR <> 0))";
                    }else{
                        sql += "WHERE ((EIXOS_CLASSIFICACAO - EIXOS_SENSOR <> 0) OR (EIXOS_COMERCIAL_CLASSIFICACAO - EIXOS_COMERCIAL_SENSOR <> 0))";
                    }
                    
                    ResultSet cmd = cdao.consultaCaixaMovimentoEspecial(sql);
                    if(cmd.next()){
                        discrCmd = cmd.getInt("SOMA");
                    }
                    
                    sql = "SELECT SUM((- EIXOS_SENSOR) + (- EIXOS_COMERCIAL_SENSOR)) as SOMA " 
                        + " FROM Registros_Microcontroladores ";
                    if(condicao.contains("WHERE")){
                        sql += condicao + "AND TIPO = 'ACM'";
                    }else{
                        sql += " WHERE TIPO = 'ACM'";
                    }
                    
                    ResultSet rm = rdao.consultaRegistroMicroncontroladorEspecial(sql);
                    if(rm.next()){
                        discrRm = rm.getInt("SOMA");
                    }
                %>
                Discrepância <input type="text" value="<%= discrCmd + discrRm %>" disabled> &nbsp;
                <br><br>
                <br><br>
                <table border="1" cellspacing="0">
                    <tr>
                        <th>Código do Caixa</th>
                        <th>Data de Lançamento</th>
                        <th>Descrição</th>
                        <th>Eixos Simples Class.</th>
                        <th>Eixos Simples Sensor</th>
                        <th>Eixos Comerciais Class.</th>
                        <th>Eixos Comerciais Sensor</th>
                        <th>Discrepância Eixos Simples</th>
                        <th>Discrepância Eixos Comerciais</th>
                        <th>Tarifa</th>
                    </tr>                    
                    <%
                        ResultSet rs = (ResultSet) request.getAttribute("rs");
                        if (rs != null) {
                            while (rs.next()) {
                    %>                  
                    <tr onmouseover="this.className='trOver'" onmouseleave="this.className='trLeave'">
                        <td><%= rs.getInt("CAIXA_CODIGO")%></td>
                        <td><%= rs.getDate("LANCAMENTO")%></td>                        
                        <td><%= rs.getString("DESCRICAO")%></td> 
                        <%
                            int eixosSensor = rs.getInt("EIXOS_SENSOR");
                            int eixosClassificacao = rs.getInt("EIXOS_CLASSIFICACAO");
                            int eixosComercialClassificacao = rs.getInt("EIXOS_COMERCIAL_CLASSIFICACAO");
                            int eixosComercialSensor = rs.getInt("EIXOS_COMERCIAL_SENSOR");
                            int discrepanciaSimples = eixosClassificacao - eixosSensor;
                            int discrepanciaComercial = eixosComercialClassificacao - eixosComercialSensor;
                        %>
                        <td><%= eixosClassificacao%></td>
                        <td><%= eixosSensor%></td>
                        <td><%= discrepanciaSimples%></td>                        
                        <td><%= eixosComercialClassificacao%></td>
                        <td><%= eixosComercialSensor%></td>
                        <td><%= discrepanciaComercial%></td>
                        <td>R$ <c:set var="valor" value="<%= rs.getFloat("TARIFA")%>"/>
                               <fmt:formatNumber value="${valor}" pattern="###,##0.00" type="number"/>
                        </td>
                    </tr>
                    <%
                            }
                        }
                       // session.setAttribute("inicio", request.getAttribute("inicio"));
                       // session.setAttribute("fim", request.getAttribute("fim"));
                        //session.setAttribute("condicao", condicao);
                    %>

                </table>
                    <br><br>
                    <a href="ImprimirRelatorioMovimentacaoCaixa?tipo=res">Imprimir Res</a>&nbsp|&nbsp;<a href="ImprimirRelatorioMovimentacaoCaixa?tipo=det">Imprimir Det</a>&nbsp;
            </div>
        </div>		
    </body>
    <jsp:include page="/Estrutura/footer.jsp" />
</html>
