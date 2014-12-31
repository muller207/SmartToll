<%-- 
    Document   : consultaReimpressaoRecibos
    Created on : 15/12/2014, 16:40:03
    Author     : Administrador
--%>

<%@page import="salcam.smarttoll.daoImp.ReimpressaoJustificativaDAOImp"%>
<%@page import="salcam.smarttoll.dao.ReimpressaoJustificativaDAO"%>
<%@page import="salcam.smarttoll.beans.ReimpressaoJustificativa"%>
<%@page import="salcam.smarttoll.daoImp.CaixaDAOImp"%>
<%@page import="salcam.smarttoll.dao.CaixaDAO"%>
<%@page import="salcam.smarttoll.daoImp.TipoLogDAOImp"%>
<%@page import="salcam.smarttoll.dao.TipoLogDAO"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="salcam.smarttoll.daoImp.FuncionarioDAOImp"%>
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

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="/Smarttoll/css/style.css">
        <script src="/Smarttoll/js/jquery-1.7.2.min.js" type="text/javascript" language="javascript"></script>
        <script src="/Smarttoll/js/mudaPeriodo.js" language="javascript" type="text/javascript"></script>
        <title>Logs de Reimpressão de Recibos</title>
    </head>
    <body>
        <div id="wrap">	
            <jsp:include page="/Estrutura/menu.jsp" />
            <div id="content" >
                <h1>Logs de Reimpressão de Recibos</h1><br><br>               
                    <form action="ConsultaLogReimpressaoRecibos" method="post"> 
                        
                        <label for="caixa">Caixa</label>
                        <select name="caixa" id="caixa">
                              <option value=""></option> 
                              <%
                                  CaixaDAO cdao = new CaixaDAOImp();
                                  ResultSet caixas = cdao.consultaCaixa("");
                                  if(caixas!=null){
                                      while(caixas.next()){
                              %>
                              <option value="<%= caixas.getInt("CAIXA_CODIGO") %>"><%= caixas.getString("SERIAL") %></option>                  
                              <%
                                      }
                                  }
                              %>

                        </select>
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
                        
                        <label for="justificativa">Justificativa</label>
                        <select name="justificativa" id="justificativa">
                              <option value=""></option> 
                              <%
                                  ReimpressaoJustificativaDAO rdao = new ReimpressaoJustificativaDAOImp();
                                  ResultSet just = rdao.consultaReimpressaoJustificativaTotal();
                                  if(just!=null){
                                      while(just.next()){
                              %>
                              <option value="<%= just.getString("JUSTIFICATIVA_CODIGO") %>"><%= just.getString("DESCRICAO") %></option>                  
                              <%
                                      }
                                  }
                              %>

                        </select>
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
                        <input type="submit" value="Enviar">
                    </form>
            </div>
        </div> 
        <jsp:include page="/Estrutura/footer.jsp" />
    </body>
</html>