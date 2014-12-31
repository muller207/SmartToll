<%-- 
    Document   : consultaRelatorioSemParar
    Created on : 21/11/2014, 13:04:05
    Author     : Administrador
--%>

<%@page import="salcam.smarttoll.daoImp.CaixaDAOImp"%>
<%@page import="salcam.smarttoll.dao.CaixaDAO"%>
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
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="/Smarttoll/css/style.css">
        <script src="/Smarttoll/js/jquery-1.7.2.min.js" type="text/javascript" language="javascript"></script>
        <script src="/Smarttoll/js/mudaPeriodo.js" language="javascript" type="text/javascript"></script>
        
        <title>SemParar</title>
    </head>
    <body>
        <div id="wrap">	
            <jsp:include page="/Estrutura/menu.jsp" />
            <div id="content" >
                <h1>Relatório do SemParar</h1><br><br>
                <form id="form" method="POST" action="ConsultaRelatorioMovimentacaoCaixa">
                    <br><br>
                    <label>Movimentação</label>
                    <input type="number" name="movimentacao"> 
                    &nbsp;
                    <label>TRN</label>
                    <input type="number" name="trn"> 
                    <br><br> 
                    <br><br>
                    <label for="caixa">Caixa</label>
                    <select name="caixa" id="caixa">
                          <option value=""></option> 
                          <%
                              CaixaDAO cdao = new CaixaDAOImp();
                              ResultSet rs = cdao.consultaCaixa("");
                              if(rs!=null){
                                  while(rs.next()){
                          %>
                          <option value="<%= rs.getString("CAIXA_CODIGO") %>"><%= rs.getString("SERIAL") %></option>                  
                          <%
                                  }
                              }
                          %>

                    </select>                    
                    <br><br>
                    <br><br>
                   
                    <fieldset style="width: 60%">	
                         <legend>Data de Abertura</legend>
                         
                         <input type="radio" name="periodoAbertura" id="periodoBimestralAbertura">Bimestral
                         &nbsp;					

                         <input type="radio" name="periodoAbertura" id="periodoTrimestralAbertura">Trimestral 
                         &nbsp;

                         <input type="radio" name="periodoAbertura" id="periodoSemestralAbertura">Semestral 
                         &nbsp;

                         <input type="radio" name="periodoAbertura" id="periodoAnuaAbertural">Anual 
                         &nbsp; 

                         <input type="radio" name="periodoAbertura" id="periodoLimparAbertura">Limpar 
                         <br><br><br>
                         
                         <label>Mês</label>
                         <select name="mesAbertura" id="mesAbertura">
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
                         
                         <label for="dataInicioAbertura">De</label>
                         <input type="date" name="dataInicioAbertura" id="dataInicioAbertura"> 
                         
                         <label for="dataFimAbertura">Até</label>
                         <input type="date" name="dataFimAbertura" id="dataFimAbertura"> 
                         <br><br>                                                 
                    </fieldset>	
                    <br><br>
                    <br><br>
                    
                    <fieldset style="width: 60%">	
                         <legend>Data de Pagamento</legend>
                         
                         <input type="radio" name="periodoFechamento" id="periodoBimestralFechamento">Bimestral
                         &nbsp;					

                         <input type="radio" name="periodoFechamento" id="periodoTrimestralFechamento">Trimestral 
                         &nbsp;

                         <input type="radio" name="periodoFechamento" id="periodoSemestralFechamento">Semestral 
                         &nbsp;

                         <input type="radio" name="periodoFechamento" id="periodoAnualFechamento">Anual 
                         &nbsp; 

                         <input type="radio" name="periodoFechamento" id="periodoLimparFechamento">Limpar 
                         <br><br><br>
                         
                         <label>Mês</label>
                         <select name="mesFechamento" id="mesFechamento">
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
                         
                         <label for="dataInicioFechamento">De</label>
                         <input type="date" name="dataInicioFechamento" id="dataInicioFechamento"> 
                         
                         <label for="dataFimFechamento">Até</label>
                         <input type="date" name="dataFimFechamento" id="dataFimFechamento"> 
                         <br><br>                                                 
                    </fieldset>	
                    <br><br>
                    <br><br>
                                         
                    <input type="submit" value="Consultar">
                 </form>
            </div>
        </div>
    </body>
    <jsp:include page="/Estrutura/footer.jsp" />
</html>