<%-- 
    Document   : home
    Created on : 10/11/2014, 11:38:03
    Author     : Samuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    session = request.getSession(false);
    try {
        if (session.getAttribute("usuario").equals("")) {
            response.sendRedirect("");
        }
    } catch (Exception e) {
        response.sendRedirect("");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>HOME</title>
    </head>
    <body>
        <jsp:include page="Estrutura/menu.jsp" />        
    </body>
</html>
