<%-- 
    Document   : paginateste
    Created on : 18/12/2014, 12:53:08
    Author     : Administrador
--%>

<%@page import="java.io.OutputStream"%>
<%@page import="java.sql.Blob"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="salcam.smarttoll.daoImp.MenuDAOImp"%>
<%@page import="salcam.smarttoll.dao.MenuDAO"%>
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
                    <form action="servletTeste" method="post"> 
                        <%
                           MenuDAO mdao = new MenuDAOImp();
                           ResultSet rs = mdao.consultaMenuGenerica("SELECT IMAGEM_PADRAO FROM PARAMETROS");
                           Blob b;
                           if(rs.next()){
                               b = rs.getBlob("IMAGEM_PADRAO");
                               byte[] bts = b.getBytes(1,(int) b.length());
                               response.setContentType("image/gif");
                               OutputStream o = response.getOutputStream();
                               o.write(bts);
                               o.flush(); 
                               o.close();
                           }
                           
                        %>                    
                        <br><br>
                        <input type="submit" value="Enviar">
                    </form>
            </div>
        </div> 
        <jsp:include page="/Estrutura/footer.jsp" />
    </body>
</html>
