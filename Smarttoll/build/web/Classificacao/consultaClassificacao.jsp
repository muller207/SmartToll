<%-- 
    Document   : consultaClassificacao
    Created on : 13/11/2014, 15:58:36
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

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="/Smarttoll/css/style.css">
        <title>Consulta de Classificações</title>
    </head>
    <body>
        <div id="wrap">	
            <jsp:include page="/Estrutura/menu.jsp" />
            <div id="content" >
                <h1>Consulta de Classificações</h1><br><br>               
                    <form action="ConsultaClassificacao" method="post">                        
                        <label>Classificação</label>
                        <input type="text" name="classificacao"><br><br>
                        
                        <label>Descrição</label>
                        <input type="text" name="descricao"><br><br>
                        
                        <label>Tarifa</label>
                        <input type="text" name="tarifa"><br><br>
                        
                        <label>Eixos</label>
                        <input type="number" name="eixos"><br><br>
                        
                        <label>Eixos Comerciais</label>
                        <input type="number" name="eixosComerciais"><br><br>
                        
                        <label>Situacao</label>
                        <select name="situacao">
                            <option value=""></option>
                            <option value="1">Ativo</option>
                            <option value="0">Inativo</option>
                        </select><br><br>
                        
                        <label>Sistema SemParar</label>
                        <select name="semParar">
                            <option value=""></option>
                            <option value="1">Sim</option>
                            <option value="0">Não</option>
                        </select><br><br>
                        
                        <br><br>
                        <input type="submit" value="Enviar">
                    </form>
            </div>
        </div> 
        <jsp:include page="/Estrutura/footer.jsp" />
    </body>
</html>
