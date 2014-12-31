<%-- 
    Document   : cadastroFuncionario
    Created on : 07/11/2014, 11:45:15
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

<%@page import="salcam.smarttoll.daoImp.EmpresaDAOImp"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="salcam.smarttoll.daoImp.FuncaoDAOImp"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="/Smarttoll/css/style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Funcionário</title>
    </head>
    <body>
        <div id="wrap">	
            <jsp:include page="/Estrutura/menu.jsp" />
            <div id="content" >
                <h1>Cadastro de Funcionário</h1><br><br>  
                    <form action="CadastroFuncionario" method="post">
                        <label>Nome</label>
                        <input type="text" name="nome" required><br><br>
                        <label>Apelido</label> 
                        <input type="text" name="apelido" required><br><br>
                        <label>Situação</label>
                        <select name="situacao" required>
                            <option value="">Não preenchido</option>
                            <option value="1">Ativo</option>
                            <option value="2">Suspenso</option>
                        </select><br><br>
                        <label>Função</label>
                        <select name="funcao" required>
                            <option value="">Não preenchido</option>
                            <%
                                FuncaoDAOImp fdao = new FuncaoDAOImp();
                                ResultSet rsFuncao = fdao.consultaFuncaoTotal();

                                try {
                                    while (rsFuncao.next()) {
                                        out.print("<option value='" + rsFuncao.getString("FUNCAO_CODIGO") + "'>" + rsFuncao.getString("FUNCAO") + "</option>");
                                    }
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }
                            %>
                        </select><br><br>
                        <label>Usuário</label>
                        <input type="text" name="usuario" required><br><br>
                        <label>CPF</label> 
                        <input type="text" name="cpf" required><br><br>
                        <label>RG</label> 
                        <input type="text" name="rg" required><br><br>
                        <label>Empresa</label>
                        <select name="empresa" required>
                            <option value="">Não preenchido</option>
                            <%
                                EmpresaDAOImp edao = new EmpresaDAOImp();
                                ResultSet rsEmpresa = edao.consultaEmpresaTotal();
                                try {
                                    while (rsEmpresa.next()) {
                                        out.print("<option value='" + rsEmpresa.getString("EMPRESA_CODIGO") + "'>" + rsEmpresa.getString("RAZAO") + "</option>");
                                    }
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }
                            %>
                        </select><br><br>
                        <label>Admissao</label> 
                        <input type="date" name="admissao" required><br><br>
                        <fieldset>
                            <legend>Senha Login</legend>
                            <label>Senha</label> 
                            <input type="password" name="senhaLogin" placeholder="Senha" required><br><br>
                            <label>Confirmação senha</label> 
                            <input type="password" name="confirmacaoSenhaLogin" placeholder="confirmação" required>
                        </fieldset><br><br>
                        <fieldset>
                            <legend>Senha administrativa</legend>
                            <label>Senha</label> 
                            <input type="password" name="senhaLoginAdministrativa" placeholder="Senha" required><br><br>
                            <label>Confirmação senha</label> 
                            <input type="password" name="senhaLoginAdministrativa" placeholder="confirmação" required>
                        </fieldset><br><br>

                        <fieldset id="fieldHorarios">
                            <legend>Horários</legend>

                            <label for="entrada1">Entrada1</label>
                            <input type="time" id="entrada1" name="entrada1" placeholder="Entrada1"/>

                            <label for="saida1">Saida1</label>
                            <input type="time" id="saida1" name="saida1" placeholder="Saida1"/>
                            <br><br>

                            <label for="entrada2">Entrada2</label>
                            <input type="time" id="entrada2" name="entrada2" placeholder="Entrada2"/>

                            <label for="saida2">Saida2</label>
                            <input type="time" id="saida2" name="saida2" placeholder="Saida2"/>

                        </fieldset><br><br>
                        <fieldset id="fieldHabilitacao">

                            <legend>Habilitação</legend>

                            <label for="numRegistro">Nº Registro</label>
                            <input type="number" id="numRegistro" name="numRegistro" placeholder="Nº Registro"/>
                            <br><br>

                            <label for="categoria">Categoria</label>
                            <input type="text" id="categoria" name="categoria" placeholder="Categoria"/>
                            <br><br>

                            <label for="emissao">Emissao</label>
                            <input type="date" id="emissao" name="emissao" placeholder="Emissao"/>
                            <br><br>

                            <label for="validade">Validade</label>
                            <input type="date" id="validade" name="validade" placeholder="Validade"/>
                            <br><br>

                        </fieldset><br><br>
                        <input type="file" name="foto" id="foto"><br><br><br><br>
                        <input type="submit" value="Registrar">
                    </form>
            </div>
        </div>
    </body>
    <jsp:include page="/Estrutura/footer.jsp" />
</html>
