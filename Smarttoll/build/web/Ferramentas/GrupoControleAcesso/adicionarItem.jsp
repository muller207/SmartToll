<%-- 
    Document   : adicionarItem
    Created on : 19/12/2014, 08:35:19
    Author     : Administrador
--%>

<%@page import="salcam.smarttoll.daoImp.GrupoControleAcessoMenuDAOImp"%>
<%@page import="salcam.smarttoll.dao.GrupoControleAcessoMenuDAO"%>
<%@page import="salcam.smarttoll.beans.GrupoControleAcessoMenu"%>
<%@page import="salcam.smarttoll.beans.GrupoControleAcesso"%>
<%@page import="salcam.smarttoll.daoImp.GrupoControleAcessoDAOImp"%>
<%@page import="salcam.smarttoll.dao.GrupoControleAcessoDAO"%>
<%@page import="salcam.smarttoll.aleatorios.Codifica"%>
<%@page import="salcam.smarttoll.dao.MenuDAO"%>
<%@page import="salcam.smarttoll.daoImp.MenuDAOImp"%>
<%@page import="java.sql.ResultSet"%>
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
        <title>Adicionar Item</title>
    </head>
    <body>
        <div id="wrap">	
            <jsp:include page="/Estrutura/menu2.jsp" />
            <div id="content" >
                <h1>Itens Permitidos</h1><br><br>                                                        
                    <table border="1" cellspacing="0">
                        <%                               
                            MenuDAO mdao = new MenuDAOImp();
                            ResultSet rs = mdao.consultaMenuGenerica("SELECT MENU_CODIGO, DESCRICAO FROM MENUS "
                                    + "WHERE MENU_CODIGO NOT IN "
                                    + "(SELECT MENU_CODIGO FROM GRUPOS_CONTROLE_ACESSO_MENUS "
                                    + "WHERE GRUPO_CONTROLE_ACESSO_CODIGO = "+request.getParameter("cod")+")");
                            if(rs!=null){
                                while(rs.next()){                                    
                                    String menu = Codifica.codifica(rs.getString("DESCRICAO"));
                        %>
                        <tr onmouseover="this.style.cursor = 'pointer'; this.className='trOver'" onmouseleave="this.className='trLeave'" ondblclick="window.location.href='./AdicionaItem?cod=<%=request.getParameter("cod")%>&menu=<%=rs.getInt("MENU_CODIGO")%>'">
                            <td><%=menu%></td>
                        </tr>
                        <%
                                }
                            }
                        %>
                    </table>
            </div>
        </div> 
        <jsp:include page="/Estrutura/footer.jsp" />
    </body>
</html>
