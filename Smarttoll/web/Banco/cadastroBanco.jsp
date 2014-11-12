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
        <title>Cadastro de Banco</title>
    </head>
    <body>
        <div id="wrap">	
            <jsp:include page="/Estrutura/menu.jsp" />
            <div id="content" >
                <h1>Cadastro de Banco</h1><br>                
                    <form action="CadastroBanco" method="post">
                        <br><br>
                        <label for="codigo">Código</label>
                        <input type="text" name="codigo"><br><br>
                        <label for="razao">Razão</label>
                        <input type="text" name="razao"><br><br>
                        <label for="fantasia">Fantasia</label>
                        <input type="text" name="fantasia"><br><br>
                        <br><br>
                        <input type="submit" value="Cadastrar">
                     </form>
            </div>
        </div>
    </body>
    <jsp:include page="/Estrutura/footer.jsp" />
</html>
