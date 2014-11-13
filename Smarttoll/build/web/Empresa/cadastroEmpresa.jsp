<%-- 
    Document   : cadastroEmpresa
    Created on : 07/11/2014, 13:22:07
    Author     : Samuel
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
        <title>Cadastro de Empresa</title>
    </head>
    <body>
        <div id="wrap">	
            <jsp:include page="/Estrutura/menu.jsp" />
            <div id="content" >
                <h1>Cadastro de Empresa</h1><br>                
                <form id="form" onsubmit="return false;">
                    <label for="razao">Razão social</label>
                    <input type="text" name="razao" id="razao" placeholder="Razão social" required> 
                    <br><br>

                    <label for="nomeFantasia">Nome fantasia</label>
                    <input type="" name="nomeFantasia" id="nomeFantasia" placeholder="Nome fantasia" required> 
                    <br><br>

                    <label for="cnpj">CNPJ</label>
                    <input type="text" name="cnpj" id="cnpj" placeholder="CNPJ" required> 
                    <br><br>

                    <label for="ie">IE</label>
                    <input type="text" name="ie" id="ie" placeholder="Inscrição Estadual" required> 
                    <br><br>

                    <label for="inscricaoMunicipal">IM</label>
                    <input type="text" name="inscricaoMunicipal" id="inscricaoMunicipal" placeholder="Inscrição Municipal" required> 
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
                            <input type="checkbox" name="autenticado" id="autenticado" placeholder="Autenticado" value="1" checked> 
                            <br><br>
                    </fieldset>
                    <br><br>

                    <label for="obs">Observação</label><br>
                    <textarea cols="30" rows="10" id="obs" name="obs"></textarea>
                    <br><br>

                    <br><br>
                    <input type="submit" value="Registrar" onclick="submitForm();">
                </form>
            </div>
        </div>
    </body>
    <jsp:include page="/Estrutura/footer.jsp" />
</html>
