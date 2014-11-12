<%-- 
    Document   : consultaLogAcesso
    Created on : 11/11/2014, 08:39:01
    Author     : Administrador
--%>
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
        <title>Log de Acesso</title>
    </head>
    <body>
        <div id="wrap">	
            <jsp:include page="/Estrutura/menu.jsp" />
            <div id="content" >
                <h1>Log de Acesso</h1><br><br>
                <form id="form" method="POST" action="ConsultaLogLogin">

                    <label for="funcionario">Funcionário</label>
                    <select name="funcionario" id="funcionario">
                          <option value="">Todos os funcionários</option> 
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

                    <label for="status">Status</label>
                    <select name="status" id="status">
                          <option value="">Login/Logout</option>
                          <option value="1">Login</option>
                          <option value="2">Logout</option> 
                    </select>
                    <br><br>

                    <label for="sistema">Sistema</label>
                    <select name="sistema" id="sistema">
                          <option value="">Administrativo/Caixa</option>
                          <option value="1">Administrativo</option> 
                          <option value="2">Caixa</option>  
                    </select>
                    <br><br>

                    <fieldset>	
                         <legend>Período</legend>

                         <label for="inicio">De</label>
                         <input type="date" name="inicio" id="inicio"> 
                         <br><br>

                         <label for="fim">Até</label>
                         <input type="date" name="fim" id="fim"> 
                         <br><br>
                    </fieldset>	
                    <br><br>

                    <input type="submit" value="Consultar">
                 </form>
            </div>
        </div>
    </body>
    <jsp:include page="/Estrutura/footer.jsp" />
</html>
