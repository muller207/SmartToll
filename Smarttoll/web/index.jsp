<%-- 
    Document   : index
    Created on : 06/11/2014, 12:30:09
    Author     : Samuel
--%>
<%
    session = request.getSession(false);
    try{
        if(!session.getAttribute("usuario").equals(""))
            response.sendRedirect("/home");
    }
    catch(Exception e){}
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="/Smarttoll/css/style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SmartToll</title>
    </head>
    <body>
        <div id="wrap">
            <jsp:include page="/Estrutura/cabecalho.jsp" />
            <div id="content">
                <h1>Login</h1><br><br>
                <form id="form" method="POST" action="Login">
                    <label>Usuario</label>
                    <input type="text" name="usuario" id="usuario" required> <br><br>
                    <label>Senha</label>
                    <input type="password" name="senha" id="senha" required> <br><br>

                    <input type="submit" value="Login">
                </form>
            </div>
        </div>
        <jsp:include page="/Estrutura/footer.jsp" />
    </body>
</html>
