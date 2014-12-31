<%-- 
    Document   : consultaRelatorioRealizadoValePedagio
    Created on : 21/11/2014, 13:03:41
    Author     : Administrador
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
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

<%@page import="java.sql.ResultSet"%>
<%@page import="salcam.smarttoll.daoImp.FuncionarioDAOImp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="/Smarttoll/css/style.css">
        <script src="/Smarttoll/js/jquery-1.7.2.min.js" type="text/javascript" language="javascript"></script>
        <script src="/Smarttoll/js/mudaPeriodo.js" language="javascript" type="text/javascript"></script>
        
        <title>Movimentação dos Caixas</title>
    </head>
    <body>
        <div id="wrap">	
            <jsp:include page="/Estrutura/menu.jsp" />
            <div id="content" >
                <h1>Relatório de Movimentação dos Caixas</h1><br><br>
                <form id="form" method="POST" action="ConsultaRelatorioMovimentacaoCaixa">
                    <br><br>
                    <label>Movimentação</label>
                    <input type="number" name="movimentacao"> 
                    <br><br> 
                    <input type="checkbox" name="somatoria"> 
                    Mostrar somatória das movimentações selecionadas?                    
                    <br><br>
                    <br><br>
                   
                    <fieldset style="width: 60%">	
                         <legend>Período</legend>
                         
                         <input type="radio" name="periodo" id="periodoBimestral">Bimestral
                         &nbsp;					

                         <input type="radio" name="periodo" id="periodoTrimestral">Trimestral 
                         &nbsp;

                         <input type="radio" name="periodo" id="periodoSemestral">Semestral 
                         &nbsp;

                         <input type="radio" name="periodo" id="periodoAnual">Anual 
                         &nbsp; 

                         <input type="radio" name="periodo" id="periodoLimpar">Limpar 
                         <br><br><br>
                         
                         <label>Mês</label>
                         <select name="mes" id="mes">
                               <option value=""></option> 
                               <option value="1">Janeiro</option>
                               <option value="2">Fevereiro</option>
                               <option value="3">Março</option>
                               <option value="4">Abril</option>
                               <option value="5">Maio</option>
                               <option value="6">Junho</option>
                               <option value="7">Julho</option>
                               <option value="8">Agosto</option>
                               <option value="9">Setembro</option>
                               <option value="10">Outubro</option>
                               <option value="11">Novembro</option>
                               <option value="12">Dezembro</option>
                         </select>                         
                         <br><br><br>  
                         
                         <label for="dataInicio">De</label>
                         <input type="date" name="dataInicio" id="dataInicio"> 
                         
                         <label for="dataFim">Até</label>
                         <input type="date" name="dataFim" id="dataFim"> 
                         <br><br>                                                 
                    </fieldset>	
                    <br><br>
                    <br><br>

                    
                    <label for="funcionario">Funcionário</label>
                    <select name="funcionario" id="funcionario">
                          <option value=""></option> 
                          <%
                              FuncionarioDAOImp fdao = new FuncionarioDAOImp();
                              ResultSet rs = fdao.consultaFuncionarioTotal();
                              if(rs!=null){
                                  while(rs.next()){
                          %>
                          <option value="<%= rs.getString("FUNCIONARIO_CODIGO") %>"><%= rs.getString("FUNCIONARIO") %></option>                  
                          <%
                                  }
                              }
                          %>

                    </select>
                    <br><br>                                       
                    <br><br>
                    
                    <label>Valor de Abertura</label>
                    <input type="number" name="abertura"> 
                    
                    <label>Valor de Fechamento</label>
                    <input type="number" name="fechamento"> 
                    <br><br><br>
                    
                     <label>Caixa</label>
                    <input type="number" name="caixa"> 
                    
                    <label>Recibo</label>
                    <input type="number" name="recibo"> 
                    <br><br>                    
                    <br><br>
                    
                    <input type="submit" value="Consultar">
                 </form>
            </div>
        </div>
    </body>
    <jsp:include page="/Estrutura/footer.jsp" />
</html>