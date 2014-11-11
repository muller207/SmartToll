<%-- 
    Document   : cadastroEmpresa
    Created on : 07/11/2014, 13:22:07
    Author     : Samuel
--%>
<%
    session = request.getSession(false);
    try {
        if (session.getAttribute("usuario") == null || session.getAttribute("usuario").toString().isEmpty()) {
            response.sendRedirect("../index.jsp");
        }
    } catch (Exception e) {
        response.sendRedirect("../index.jsp");
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de empresa</title>
    </head>
    <body>
        <form action="CadastroEmpresa" method="post">
            Razão: <input type="text" name="razao" required><br>
            Nome fantasia: <input type="text" name="fantasia" required><br>
            CNPJ: <input type="text" name="cnpj" required><br>
            IE: <input type="text" name="ie" required><br>
            OBS.: <input type="text" name="obs"><br>
            Homepage: <input type="text" name="homepage"><br>
            E-mail: <input type="text" name="email"><br>
            Senha SMTP: <input type="password" name="senhaSmtp"><br>
            Login SMTP: <input type="text" name="loginSmtp"><br>
            SMTP: <input type="text" name="smtp"><br>
            Autenticado: <input type="checkbox" name="autenticado" value=true><br>
            Inscrição municipal: <input type="text" name="inscricaoMunicipal"><br>
            <input type="submit" value="Cadastrar">
        </form>
    </body>
</html>
