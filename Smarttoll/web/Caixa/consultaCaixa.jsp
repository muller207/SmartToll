<%-- 
    Document   : consultaCaixa
    Created on : 07/11/2014, 11:21:56
    Author     : Samuel
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta de Caixas</title>
    </head>
    <body>
        <div id="wrap">	
            <jsp:include page="/Estrutura/menu.jsp" />
            <div id="content" >
                <h1>Consulta de Caixas</h1>
                <br>
                <br>
                <form action="ConsultaCaixa" method="post">
                    <br><br>
                    <label>Serial</label>
                    <input type="text" name="serial"><br><br>
                    <label>Situacao</label>
                    <select name="situacao">
                        <option value=""> </option>
                        <option value="1">Ativo</option>
                        <option value="0">Inativo</option>
                    </select><br><br>
                    <label>Sem parar praca</label>
                    <input type="number" name="sempararPraca"><br><br>
                    <br><br>
                    <input type="submit" value="Consultar">
                </form>
            </div>
        </div>
    </body>
    <jsp:include page="/Estrutura/footer.jsp" />
</html>
