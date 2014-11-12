<%-- 
    Document   : cadastroCaixa
    Created on : 07/11/2014, 09:29:10
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="/Smarttoll/css/style.css">
        <title>Cadastro de Caixa</title>
    </head>
    <body>
        <div id="wrap">	
            <jsp:include page="/Estrutura/menu.jsp" />
            <div id="content" >
                <h1>Cadastro de Caixa</h1><br>                
                    <form action="CadastroCaixa" method="post">
                        <label for="serial">Serial</label>
                        <input type="text" name="serial"><br><br>
                        <label for="situacao">Situação</label>
                        <select name="situacao" id="situacao">
                          <option value=""></option>
                          <option value="1">Ativo</option>
                          <option value="2">Inativo</option> 
                        </select><br><br>
                        <label for="sempararPraca">Sem Parar</label>
                        <input type="number" name="sempararPraca"><br><br>
                        <label for="sequencialArquivoNela">Sequencial NELA</label>
                        <input type="number" name="sequencialArquivoNela"><br><br>
                        <label for="sequencialArquivoTag">Sequencial TAG</label>
                        <input type="number" name="sequencialArquivoTag"><br><br>                        
                        <label for="tipo">Tipo</label>
                        <input type="number" name="tipo"><br><br>

                        <input type="submit" value="cadastrar">
                    </form>
            </div>
        </div>
    </body>
    <jsp:include page="/Estrutura/footer.jsp" />
</html>
