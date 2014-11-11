<%-- 
    Document   : cadastroFuncionario
    Created on : 07/11/2014, 11:45:15
    Author     : Samuel
--%>

<%@page import="salcam.smarttoll.daoImp.EmpresaDAOImp"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="salcam.smarttoll.daoImp.FuncaoDAOImp"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="CadastroFuncionario" method="post">
            Nome: <input type="text" name="nome"><br>
            Apelido: <input type="text" name="apelido"><br>
            Situação: <select name="situacao">
                <option value="">Não preenchido</option>
                <option value="1">Ativo</option>
                <option value="2">Suspenso</option>
            </select><br>
            Função: <select name="funcao">
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
            </select><br>
            Usuário: <input type="text" name="usuario"><br>
            CPF: <input type="text" name="cpf"><br>
            RG: <input type="text" name="rg"><br>
            Empresa <select name="empresa">
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
            </select>
            Admissao: <input type="date" name="admissao"><br>
            <fieldset>
                <legend>Senha login</legend>
                Senha: <input type="password" name="senhaLogin" placeholder="Senha">
                Confirmação senha: <input type="password" name="confirmacaoSenhaLogin" placeholder="confirmação">
            </fieldset>
            <fieldset>
                <legend>Senha administrativa</legend>
                Senha: <input type="password" name="senhaLoginAdministrativa" placeholder="Senha">
                Confirmação senha: <input type="password" name="senhaLoginAdministrativa" placeholder="confirmação">
            </fieldset>

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

            </fieldset>
            <fieldset id="fieldHabilitacao">

                <legend>Habilitação</legend>

                <label for="numRegistro">Nº Registro</label>
                <input type="number" id="numRegistro" name="numRegistro" placeholder="Nº Registro"/>
                <br><br>

                <label for="categoria">Categoria</label>
                <input type="number" id="categoria" name="categoria" placeholder="Categoria"/>
                <br><br>

                <label for="emissao">Emissao</label>
                <input type="date" id="emissao" name="emissao" placeholder="Emissao"/>
                <br><br>

                <label for="validade">Validade</label>
                <input type="date" id="validade" name="validade" placeholder="Validade"/>
                <br><br>

            </fieldset>
            <input type="submit" value="Registrar">
        </form>
    </body>
</html>
