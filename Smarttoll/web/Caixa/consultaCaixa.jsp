<%-- 
    Document   : consultaCaixa
    Created on : 07/11/2014, 11:21:56
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
        <form action="ConsultaCaixa" method="post">
            Serial: <input type="text" name="serial"><br>
            Situacao: <select name="situacao">
                <option value=""> </option>
                <option value="1">Ativo</option>
                <option value="0">Inativo</option>
            </select><br>
            Sem parar praca: <input type="number" name="sempararPraca"><br>
            <input type="submit" style="width: 100%">
        </form>
        <br>
        <br>
        <button name="logout" onclick="window.location.href='../Logout.jsp'">Logout</button>
    </body>
</html>
