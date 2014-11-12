<%-- 
    Document   : home
    Created on : 10/11/2014, 11:38:03
    Author     : Samuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="/Smarttoll/css/style.css">
        <title>SmartToll</title>
    </head>
    <body>
        <div id="wrap">            
            <jsp:include page="/Estrutura/menu.jsp" />
            <div id="content">
            </div>
        </div>        
    </body>
    <jsp:include page="/Estrutura/footer.jsp" />
</html>
