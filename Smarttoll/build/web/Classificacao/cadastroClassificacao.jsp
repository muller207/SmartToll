<%-- 
    Document   : cadastroClassificacao
    Created on : 13/11/2014, 15:58:19
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
        <title>Cadastro de Classificação</title>
    </head>
    <body>
        <div id="wrap">	
            <jsp:include page="/Estrutura/menu.jsp" />
            <div id="content" >
                <h1>Cadastro de Classificação</h1><br><br>               
                    <form action="CadastroClassificacao" method="post">                        
                        <label>Classificação</label>
                        <input type="text" name="classificacao" required><br><br>
                        
                        <label>Descrição</label>
                        <input type="text" name="descricao" required><br><br>
                        
                        <label>Tarifa</label>
                        <input type="text" name="tarifa" required><br><br>
                        
                        <label>Eixos</label>
                        <input type="number" name="eixos" required><br><br>
                        
                        <label>Eixos Comerciais</label>
                        <input type="number" name="eixosComerciais" required><br><br>
                        
                        <label>Situacao</label>
                        <select name="situacao" required>
                            <option value=""></option>
                            <option value="true">Ativo</option>
                            <option value="false">Inativo</option>
                        </select><br><br>
                        
                        <label>Sistema SemParar</label>
                        <input type="checkbox" name="semParar" value="1" checked>
                        <br><br>
                        
                        <br><br>
                        <input type="submit" value="Enviar">
                    </form>
            </div>
        </div> 
        <jsp:include page="/Estrutura/footer.jsp" />
    </body>
</html>
