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
        <script src="/Smarttoll/js/jquery-1.7.2.min.js" type="text/javascript" language="javascript"></script>
        <title>Titulo da Pagina</title>
    </head>
    <body>
        <div id="wrap">	
            <jsp:include page="/Estrutura/menu.jsp" />
            <div id="content" >
                <h1>Titulo da Label</h1><br><br>               
                    <form action="servlet" method="post" enctype="multipart/form-data">                        
                        <label>Label</label>
                        <input type="text" name="serial"><br><br>
                        <br><br>
                        <img src="../paginateste.jsp" height="300" width="200"/><br><br><br>
                        <input type="file" id="arquivo" name="arquivo"><br><br>
                        <br><br>
                        <input type="submit" value="Enviar">
                    </form>
            </div>
        </div> 
        <jsp:include page="/Estrutura/footer.jsp" />
    </body>
</html>
