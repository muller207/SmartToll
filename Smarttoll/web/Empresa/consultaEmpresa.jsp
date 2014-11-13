<%-- 
    Document   : template.jsp
    Created on : 12/11/2014, 09:16:33
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
        <title>Consulta de Empresas</title>
    </head>
    <body>
        <div id="wrap">	
            <jsp:include page="/Estrutura/menu.jsp" />
            <div id="content" >
                <h1>Consulta de Empresas</h1><br><br>               
                <form id="form" method="POST" action="ConsultaEmpresa">
                    <label for="razao">Razão social</label>
                    <input type="text" name="razao" id="razao" placeholder="Razão social"> 
                    <br><br>

                    <label for="nomeFantasia">Nome fantasia</label>
                    <input type="" name="nomeFantasia" id="nomeFantasia" placeholder="Nome fantasia"> 
                    <br><br>

                    <label for="cnpj">CNPJ</label>
                    <input type="text" name="cnpj" id="cnpj" placeholder="CNPJ"> 
                    <br><br>

                    <label for="ie">IE</label>
                    <input type="text" name="ie" id="ie" placeholder="Inscrição Estadual"> 
                    <br><br>

                    <label for="inscricaoMunicipal">IM</label>
                    <input type="text" name="inscricaoMunicipal" id="inscricaoMunicipal" placeholder="Inscrição Municipal"> 
                    <br><br>

                    <label for="email">E-mail</label>
                    <input type="text" name="email" id="email" placeholder="E-mail"> 
                    <br><br>

                    <label for="homepage">Homepage</label>
                    <input type="text" name="homepage" id="homepage" placeholder="Homepage"> 
                    <br><br>

                    <fieldset>
                            <legend>Servidor de E-mail</legend>
                            <label for="smtp">SMTP</label>
                            <input type="text" name="smtp" id="smtp" placeholder="SMTP" > 
                            <br><br>

                            <label for="login">Login</label>
                            <input type="text" name="login" id="login" placeholder="Login" > 
                            <br><br>

                            <label for="senha">Senha</label>
                            <input type="password" name="senha" id="senha" placeholder="Senha" > 
                            <br><br>

                            <label for="autenticado">Autenticado</label>
                            <select name="autenticado" id="autenticado">
                                    <option value="">Não preenchido</option>
                                    <option value="0">Não</option>
                                    <option value="1">Sim</option>
                            </select>
                            <!--<input type="checkbox" name="autenticado" id="autenticado" placeholder="Autenticado" value="1" checked>--> 
                            <br><br>
                    </fieldset>
                    <br><br>

                    <label for="obs">Observação</label><br>
                    <textarea cols="30" rows="10" id="obs" name="obs"></textarea>
                    <br><br>

                    <br><br>
                    <input type="submit" value="Consultar">
            </form>
            </div>
        </div> 
        <jsp:include page="/Estrutura/footer.jsp" />
    </body>
</html>