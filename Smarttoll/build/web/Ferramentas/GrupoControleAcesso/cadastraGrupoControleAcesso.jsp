<%-- 
    Document   : cadastraGrupoControleAcesso
    Created on : 22/12/2014, 13:36:18
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
        <title>Cadastro de Grupos de Controle de Acesso</title>
    </head>
    <body>
        <div id="wrap">	
            <jsp:include page="/Estrutura/menu.jsp" />
            <div id="content" >
                <h1>Cadastro de Grupos de Controle de Acesso</h1><br><br>               
                <br><br>
                    <form action="CadastraGrupoControleAcesso" method="post">                        
                        <label>Descrição</label>
                        <input type="text" name="descricao" required><br><br>                        
                        <br><br>
                        <input type="submit" value="Enviar">
                    </form>
            </div>
        </div> 
        <jsp:include page="/Estrutura/footer.jsp" />
    </body>
</html>
