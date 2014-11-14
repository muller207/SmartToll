<%-- 
    Document   : consultaIsento
    Created on : 13/11/2014, 13:44:35
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
        <title>Consulta de Isentos</title>
    </head>
    <body>
        <div id="wrap">	
            <jsp:include page="/Estrutura/menu.jsp" />
            <div id="content" >
                <h1>Consulta de Isentos</h1><br><br>               
                    <form action="ConsultaIsento" method="post">                        
                        <label>Nome</label>
                        <input type="text" name="nome"><br><br>
                        
                        <label>Situação</label>
                        <select name="situacao">
                            <option value="">Não Preenchido</option>
                            <option value="1">Ativo</option>
                            <option value="0">Inativo</option>
                        </select><br><br>
                        
                        <label>Vencimento</label>
                        <input type="date" name="vencimento"><br><br>
                        
                        <label>Cartão</label>
                        <input type="text" name="cartao"><br><br>
                        
                        <br><br>
                        <input type="submit" value="Enviar">
                    </form>
            </div>
        </div> 
        <jsp:include page="/Estrutura/footer.jsp" />
    </body>
</html>
