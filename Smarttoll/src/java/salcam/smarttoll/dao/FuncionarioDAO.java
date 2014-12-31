/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.dao;

import java.sql.ResultSet;
import salcam.smarttoll.beans.Funcionario;

/**
 *
 * @author Administrador
 */
public interface FuncionarioDAO {
    
    public final String CADASTRO_FUNCIONARIO = "INSERT INTO FUNCIONARIOS(FUNCIONARIO_CODIGO, EMPRESA_CODIGO, FUNCIONARIO, APELIDO, CPF, RG, ADMISSAO, DEMISSAO, SITUACAO, USUARIO, SENHA, SENHA_ADMINISTRATIVA, FUNCAO_CODIGO, HORA_ENTRADA_1, HORA_ENTRADA_2, HORA_SAIDA_1, HORA_SAIDA_2, HABILITACAO, CATEGORIA, EMISSAO, VALIDADE, COR_FONTE, COR_FUNDO, COR_HINT_FONTE, COR_HINT_FUNDO, IMAGEM) " +
        " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
    public final String MAX_CODIGO_FUNCIONARIO = "SELECT MAX(FUNCIONARIO_CODIGO) as MAX FROM FUNCIONARIOS ";
    
    public String CONSULTA_FUNCIONARIO = "SELECT * FROM FUNCIONARIOS ";

    boolean cadastroFuncionario(Funcionario f);

    int consultaFuncionarioLogin(String usuario, String senha);

    ResultSet consultaFuncionarioTotal();

    int maxCodigo();
    
}
