<%
    try {
        session.invalidate();
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    response.sendRedirect("/Smarttoll");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
    </body>
</html>