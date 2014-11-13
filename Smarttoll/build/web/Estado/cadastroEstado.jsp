<%-- 
    Document   : cadastroEstado
    Created on : 13/11/2014, 13:22:43
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
        <title>Cadastro de Estados</title>
    </head>
    <body>
        <div id="wrap">	
            <jsp:include page="/Estrutura/menu.jsp" />
            <div id="content" >
                <h1>Cadastro de Estados</h1><br><br>               
                    <form action="CadastroEstado" method="post">                        
                        <label>Estado</label>
                        <input type="text" name="estado" required><br><br>
                        <label>Sigla</label>
                        <input type="text" name="sigla" required><br><br>
                        <br><br>
                        <input type="submit" value="Enviar">
                    </form>
            </div>
        </div> 
        <jsp:include page="/Estrutura/footer.jsp" />
    </body>
</html>
