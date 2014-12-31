<%@page import="salcam.smarttoll.daoImp.LogLoginDAOImp"%>
<%@page import="salcam.smarttoll.dao.LogLoginDAO"%>
<%@page import="java.util.Date"%>
<%@page import="java.net.InetAddress"%>
<%@page import="salcam.smarttoll.beans.LogLogin"%>
<%
    
    LogLogin l = new LogLogin();
    l.setFuncionarioCod(Integer.parseInt(session.getAttribute("usuario_cod").toString()));
    l.setCondominioCod(1);
    InetAddress conf = InetAddress.getLocalHost();
    l.setIp(conf.getHostAddress());
    l.setEstacao(conf.getHostName().toUpperCase());
    l.setSistema((byte)1);
    l.setData(new Date());          
    l.setSucesso((byte)2);
    LogLoginDAO ldao = new LogLoginDAOImp();
    ldao.cadastroLogLogin(l);
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