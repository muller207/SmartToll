<%-- 
    Document   : parametrosSistema
    Created on : 18/12/2014, 10:08:01
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

<%@page import="salcam.smarttoll.daoImp.EmpresaDAOImp"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="salcam.smarttoll.daoImp.FuncaoDAOImp"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="/Smarttoll/css/style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="/Smarttoll/js/jquery-1.7.2.min.js" type="text/javascript" language="javascript"></script>
        <script type="text/javascript">
            function habilitaSalvar(){
                if(document.formu.salvar.disabled==true)
                    document.formu.salvar.disabled=false
            }
        </script>
        <title>Parâmetros do Sistema</title>
    </head>
    <body>
        <div id="wrap">	
            <jsp:include page="/Estrutura/menu.jsp" />
            <div id="content" >
                <h1>Parâmetros do Sistema</h1><br><br>
                <%
//                    ResultSet parametros = 
                
                %>
                    <form name="formu" action="AlteraParametrosSistema" method="post">                        
                        <fieldset>
                            <legend>Dados do Recibo</legend>
                            <div id="esquerda">
                                <label>Cabeçalho</label> <br>
                                <textarea onkeyup="habilitaSalvar();" cols="30" rows="10" name="rodape"id="rodape"></textarea>
                            </div>
                            <div id="direita">
                                <label>Rodapé</label>  <br>
                                <textarea onkeyup="habilitaSalvar();" cols="30" rows="10" name="rodapeRecibo" id="rodapeRecibo"></textarea>                                
                            </div>
                            <label></label><br>
                            Telefone <input onkeyup="habilitaSalvar();" type="text" name="telefone" id="telefone">
                            <br><br>
                            CNPJ <input onkeyup="habilitaSalvar();" type="text" name="cnpj" id="cnpj">
                            <br><br>
                            Praça <input onkeyup="habilitaSalvar();" type="text" name="praca" id="praca">
                        </fieldset>
                        <br><br>
                        <fieldset>
                            <legend>Arquivos TAF</legend>
                            <div id="esquerda">
                                <label>Caminho para salvar os arquivos TAF<br><br>
                                    <input onkeyup="habilitaSalvar();" type="text" name="caminhoTAF" id="caminhoTAF">   
                                </label>
                            </div>
                            
                            <div id="direita">
                                <label>Sequencial<br><br>
                                    <input onkeyup="habilitaSalvar();" type="text" name="sequencialTAF" id="sequencialTAF">
                                </label>
                            </div>
                        </fieldset><br><br>
                        
                        <fieldset>
                            <legend>Arquivos TRN</legend>
                            <div id="esquerda">
                                <label>Caminho para salvar os arquivos TRN<br><br>
                                    <input onkeyup="habilitaSalvar();" type="text" name="caminhoTRN" id="caminhoTRN">
                                </label>
                            </div>
                            
                            <div id="direita">
                                <label>Sequencial<br><br>
                                    <input onkeyup="habilitaSalvar();" type="text" name="sequencialTRN" id="sequencialTRN">
                                </label>
                            </div>
                        </fieldset><br><br>
                        
                        <fieldset>
                            <legend>Arquivos TRF</legend>
                            <div id="esquerda">
                                <label>Caminho de recebimento dos arquivos TRF<br><br>
                                    <input onkeyup="habilitaSalvar();" type="text" name="caminhoRecebimentoTRF" id="caminhoTRF">
                                </label>
                            </div>
                            
                            <div id="direita">
                                <label>Caminho para salvar os arquivos TRN<br><br>
                                    <input onkeyup="habilitaSalvar();" type="text" name="caminhoTRN" id="caminhoTRN">
                                </label>
                            </div>
                        </fieldset><br><br>
                        <br><br>
                        <input name="salvar" disabled type="submit" value="Salvar">
                    </form>
            </div>
        </div>
    </body>
    <jsp:include page="/Estrutura/footer.jsp" />
</html>