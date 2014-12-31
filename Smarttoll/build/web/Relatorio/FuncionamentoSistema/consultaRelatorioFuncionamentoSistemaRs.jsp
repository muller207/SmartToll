<%-- 
    Document   : consultaRelatorioFuncionamentoSistemaRs
    Created on : 10/12/2014, 09:46:47
    Author     : Administrador
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="salcam.smarttoll.daoImp.UptimeDAOImp"%>
<%@page import="salcam.smarttoll.dao.UptimeDAO"%>
<%@page import="java.util.Date"%>
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
        <title>Consulta de Funcionamento do Sistema</title>
    </head>
    <body>
        <div id="wrap">	
            <jsp:include page="/Estrutura/menu.jsp" />
            <div id="content">
                <h1>Consulta de Funcionamento do Sistema</h1>
                <br><br>
                <br><br>
                <%  
                    String condicao = (String) request.getAttribute("condicao");
                    String comeco = (String) request.getAttribute("inicio");
                    String fina = (String) request.getAttribute("fim");
                    
                    UptimeDAO udao = new UptimeDAOImp();
                    ResultSet ligado = udao.consultaUptime(condicao);
                    
                    SimpleDateFormat format = new SimpleDateFormat("dd/M/yyyy");
                    Date inicio  = new Date();
                    Date fim = new Date();
                    long diff = 0;
                    long diffSeconds = 0;
                    long diffMinutes = 0;
                    long diffHours = 0;
                    int diffInDays = 0;
                    if (ligado != null) {
                        while (ligado.next()) {
                            if(ligado.isFirst())
                                System.out.println("");
                            inicio = ligado.getTimestamp("DATA_INICIO");                               
                            fim = ligado.getTimestamp("ULTIMO_REGISTRO");
                            diff += fim.getTime() - inicio.getTime();
                        }
                    }
                    diffSeconds = diff / 1000 % 60;
                    diffMinutes = diff / (60 * 1000) % 60;
                    diffHours = diff / (60 * 60 * 1000);
                    diffInDays = (int) (diff / (1000 * 60 * 60 * 24));
                    diffHours -= (diffInDays*24);
                %>
                <c:set value="<%=diffInDays%>" var="num"/>                                
                Total do Sistema Ligado: 
                <input disabled type="text" value="<c:out value="${num eq 0 ? '': num}"/><c:out value="${num eq 0 ? '': 'd'}"/> <%=String.format("%02d",diffHours)%>h <%= String.format("%02d",diffMinutes)%>m <%= String.format("%02d",diffSeconds)%>s">
                &nbsp; &nbsp;
                <%
                    /*if(comeco != null && fina != null){
                        inicio = format.parse(comeco);
                        fim = format.parse(fina);
                    }else{
                        inicio = format.parse(comeco);
                        fim = format.parse(fina);
                    }
                    long diff2 = fim.getTime() - inicio.getTime();
                    long diff3 = diff2 - diff;
                    
                    diffSeconds = diff3 / 1000 % 60;
                    diffMinutes = diff3 / (60 * 1000) % 60;
                    diffInDays = (int) (diff3 / (1000 * 60 * 60 * 24));
                    diffHours = (diff3 / (60 * 60 * 1000))-(diffInDays*24);  */                
                %>
                Total do Sistema Desligado:
                <c:set value="<%=diffInDays%>" var="num"/>
                <input disabled type="text" value="<c:out value="${num eq 0 ? '': num}"/><c:out value="${num eq 0 ? '': 'd'}"/> <%=String.format("%02d",diffHours)%>h <%= String.format("%02d",diffMinutes)%>m <%= String.format("%02d",diffSeconds)%>s">
                <br><br>
                <br><br>
                <table border="1" cellspacing="0">
                    <tr>
                        <th> </th>
                        <th>Código</th>
                        <th>Caixa</th>
                        <th>Funcionário</th>
                        <th>Início do Turno</th>
                        <th>Último Registro</th>
                        <th>Tempo Total</th>
                    </tr>                    
                    <%
                        ResultSet rs = (ResultSet) request.getAttribute("rs"); 
                        int i = 1;
                        if (rs != null) {
                            while (rs.next()) {
                                inicio = rs.getTimestamp("DATA_INICIO");
                                fim = rs.getTimestamp("ULTIMO_REGISTRO");
                                
                                diff = fim.getTime() - inicio.getTime();
                                diffSeconds = diff / 1000 % 60;
                                diffMinutes = diff / (60 * 1000) % 60;
                                diffHours = diff / (60 * 60 * 1000);
                    %>
                    <tr onmouseover="this.className='trOver'" onmouseleave="this.className='trLeave'"> 
                        <td><%=i++%></td>
                        <td><%= rs.getByte("CAIXA_CODIGO")%></td>
                        <td><%= rs.getString("SERIAL")%></td>
                        <td><%= rs.getString("FUNCIONARIO")%></td>
                        <td><c:set var="valor" value="<%= rs.getTimestamp("DATA_INICIO")%>"/>
                               <fmt:formatDate value="${valor}" pattern="dd/MM/yyyy HH:mm:ss"/>h
                        </td>
                        <td><c:set var="valor" value="<%= rs.getTimestamp("ULTIMO_REGISTRO")%>"/>
                               <fmt:formatDate value="${valor}" pattern="dd/MM/yyyy HH:mm:ss"/>h
                        </td>
                        <td><%= String.format("%02d",diffHours)%>:<%= String.format("%02d",diffMinutes)%>:<%= String.format("%02d",diffSeconds)%>h</td>                       
                    </tr>
                    <%
                            }
                        }
//                        session.setAttribute("inicio", request.getAttribute("inicio"));
//                        session.setAttribute("fim", request.getAttribute("fim"));
//                        session.setAttribute("condicao", condicao);
                    %>

                </table>
                    <br><br>
                    <a href="ImprimirRelatorioMovimentacaoCaixa?tipo=res">Imprimir Res</a>&nbsp|&nbsp;<a href="ImprimirRelatorioMovimentacaoCaixa?tipo=det">Imprimir Det</a>&nbsp;
            </div>
        </div>		
    </body>
    <jsp:include page="/Estrutura/footer.jsp" />
</html>