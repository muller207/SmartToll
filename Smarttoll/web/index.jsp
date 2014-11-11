<%-- 
    Document   : index
    Created on : 06/11/2014, 12:30:09
    Author     : Samuel
--%>
<%
    session = request.getSession(false);
    try{
        if(!session.getAttribute("usuario").equals(""))
            response.sendRedirect("home.jsp");
    }
    catch(Exception e){}
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SmartToll</title>
    </head>
    <body>
        <form id="form" method="POST" action="Login">
            Usuario: <input type="text" name="usuario" id="usuario" required> <br>
            Senha: <input type="password" name="senha" id="senha" required> <br>
            
            <input type="submit" value="Login">
        </form>
    </body>
</html>
