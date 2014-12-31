<%-- 
    Document   : consultaGrupoControleAcessoRs
    Created on : 18/12/2014, 14:26:22
    Author     : Administrador
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="salcam.smarttoll.daoImp.GrupoControleAcessoDAOImp"%>
<%@page import="salcam.smarttoll.dao.GrupoControleAcessoDAO"%>
<%@page import="salcam.smarttoll.aleatorios.Codifica"%>
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

<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="/Smarttoll/css/style.css">
        <script type="text/javascript">
            function popup(codigo){
                popupWindow = window.open("/Smarttoll/Ferramentas/GrupoControleAcesso/adicionarItem.jsp?cod="+codigo, "_blank", "scrollbars=no,resizable=no,height=600,width=450");
            }
            
            function parent_disable(){
                if(popupWindow && !popupWindow.closed){
                    popupWindow.focus();
                }else{
                    window.location.reload();
                }
            }
            
            function alterado(direito, grupo, menu){
                //alert(direito.value+" "+grupo+" "+menu);
                window.location.href="/Smarttoll/Ferramentas/GrupoControleAcesso/AlterarItem?direito="+direito.value+"&grupo="+grupo+"&menu="+menu;
            }
        </script>
        <title>Consulta de Grupo de Controle de Acesso</title>
    </head>
    <body onfocus="parent_disable();" onclick="parent_disable();">        
        <div id="wrap">	
            <jsp:include page="/Estrutura/menu.jsp" />
            <div id="content">
                <h1>Consulta de Grupo de Controle de Acesso</h1>
                <br>
                <br>
                <%
                        String grupoOld = "";
                        String condicao = (String) session.getAttribute("condicao");
                        GrupoControleAcessoDAO gdao = new GrupoControleAcessoDAOImp();
                        ResultSet rs = gdao.consultaGrupoControleAcessoGenerica("SELECT gca.GRUPO_CONTROLE_ACESSO_CODIGO as CODIGO, gcam.MENU_CODIGO, gca.DESCRICAO as GRUPO, m.DESCRICAO as MENU, m.NIVEL_CODIGO, gcam.DIREITO " +
                            " FROM GRUPOS_CONTROLE_ACESSO gca " +
                            " LEFT JOIN GRUPOS_CONTROLE_ACESSO_MENUS gcam ON (gca.GRUPO_CONTROLE_ACESSO_CODIGO = gcam.GRUPO_CONTROLE_ACESSO_CODIGO) " +
                            " LEFT JOIN MENUS m ON (m.MENU_CODIGO = gcam.MENU_CODIGO)"+condicao);
                        if (rs != null) {
                            while (rs.next()) {                                
                                String grupo = rs.getString("GRUPO");
                                int codigo = rs.getInt("CODIGO");
                                if(!grupo.equals(grupoOld)){
                                    %>
                                    <br><br>
                                    <h1><%=grupo%></h1> &nbsp; &nbsp; 
                                    <a href="#" onclick="popup(<%=codigo%>);">Adicionar</a> &nbsp;&nbsp;
                                    <a href="/Smarttoll/Ferramentas/GrupoControleAcesso/RemoverItem?grupo=<%=codigo%>">Remover</a><br><br>
                                    <%
                                    grupoOld = grupo;
                                }
                                int menuCodigo = rs.getInt("MENU_CODIGO");
                                String menu = rs.getString("MENU");
                                if(menu!=null){
                                    menu= Codifica.codifica(menu);
                                %>
                                    <%=menu%>
                                <%
                                    int direito = rs.getInt("DIREITO");
                                    gdao = new GrupoControleAcessoDAOImp();
                                    ResultSet niveis = gdao.consultaGrupoControleAcessoGenerica("SELECT NIVEL, DESCRICAO FROM MENUS_NIVEIS WHERE"
                                            + " NIVEL_CODIGO = "+String.valueOf(rs.getInt("NIVEL_CODIGO")));
                                    if(niveis!=null){
                                        %>
                                        <select onchange="alterado(this,<%=codigo%>,<%=menuCodigo%>);" name="" id="">
                                    <%
                                        while(niveis.next()){
                                            String nivel = niveis.getString("DESCRICAO");
                                            nivel= Codifica.codifica(nivel);
                                            int level = niveis.getInt("NIVEL");
                                            boolean selected = false;                                            
                                            if(direito == level)
                                                selected=true;
                                        %>  
                                            <c:set var="sel" value="<%=selected%>"/>
                                            <option value="<%=level%>" <c:out value="${sel ? 'selected': ''}"/>><%=nivel%></option>
                                        <%
                                        }
                                        %>
                                        </select> &nbsp; &nbsp;
                                        <a href="/Smarttoll/Ferramentas/GrupoControleAcesso/RemoverItem?grupo=<%=codigo%>&menu=<%=menuCodigo%>">X</a><br><br>
                                        <%
                                    }
                                }
                            }
                            
                        }
                %>                
            </div>
        </div>		
    </body>
    <jsp:include page="/Estrutura/footer.jsp" />
</html>
