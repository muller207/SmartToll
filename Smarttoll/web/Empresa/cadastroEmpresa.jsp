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
                    <form action="CadastroEmpresa" method="post">
                        <br><br>
                        <label>Razão</label>
                        <input type="text" name="razao" required><br><br>
                        <label>Nome Fantasia</label>
                        <input type="text" name="fantasia" required><br><br>
                        <label>CNPJ</label>
                        <input type="text" name="cnpj" required><br><br>
                        <label>IE</label>
                        <input type="text" name="ie" required><br><br>
                        <label>Observação</label>
                        <input type="text" name="obs"><br><br>
                        <label>Homepage</label>
                        <input type="text" name="homepage"><br><br>
                        <label>Email</label>                        
                        <input type="text" name="email"><br><br>
                        <label>SMTP</label>
                        <input type="text" name="smtp"><br><br>
                        <label>Login SMTP</label>
                        <input type="text" name="loginSmtp"><br><br>
                        <label>Senha SMTP</label>
                        <input type="password" name="senhaSmtp"><br><br>                    
                        <label>Autenticado</label>
                        <input type="checkbox" name="autenticado" value=true><br><br>
                        <label>Inscrição Municipal</label>
                        <input type="text" name="inscricaoMunicipal"><br><br>
                        <br><br>
                        <input type="submit" value="Cadastrar">
                    </form>
            </div>
        </div>
    </body>
    <jsp:include page="/Estrutura/footer.jsp" />
</html>
