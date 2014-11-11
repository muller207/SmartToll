<%-- 
    Document   : cadastroCaixa
    Created on : 07/11/2014, 09:29:10
    Author     : Samuel
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="CadastroCaixa" method="post">
            Serial: <input type="text" name="serial"><br>
            Situacao: <input type="checkbox" name="situacao" value="1"><br>
            Sem parar praca: <input type="number" name="sempararPraca"><br>
            Sequencial nela: <input type="number" name="sequencialArquivoNela"><br>
            Sequencial tag: <input type="number" name="sequencialArquivoTag"><br>
            Ip: <input type="text" name="ip"><br>
            Tipo: <input type="number" name="tipo"><br>
            
            <input type="submit" value="cadastrar">
        </form>
    </body>
</html>
