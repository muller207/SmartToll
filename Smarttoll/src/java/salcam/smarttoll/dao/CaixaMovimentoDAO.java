/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.dao;

import java.sql.ResultSet;
import salcam.smarttoll.beans.CaixaMovimento;

/**
 *
 * @author Administrador
 */
public interface CaixaMovimentoDAO {
    
    public final String CADASTRO_CAIXA_MOVIMENTO="INSERT INTO Caixas_Movimentos(MOVIMENTACAO, DATA_ABERTURA,"
            + "CAIXA_CODIGO, FUNCIONARIO_CODIGO, VALOR_ABERTURA, VALOR_FECHAMENTO, VALOR_MOVIMENTO_TOTAL, TRASMITIDO,"
            + "DATA_FECHAMENTO, VALOR_FECHAMENTO_OPERADOR, TRN_SEQ_REG, DATA_CRIACAO_TRN, MOTIVO_TRN)"
            + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
    public String CONSULTA_CAIXA_MOVIMENTO = "SELECT c.CAIXAS_MOVIMENTOS_CODIGO, cx.SERIAL, c.MOVIMENTACAO, c.CAIXA_CODIGO, c.VALOR_ABERTURA, "
            + "c.VALOR_FECHAMENTO, c.VALOR_MOVIMENTO_TOTAL, c.DATA_ABERTURA, c.DATA_FECHAMENTO, f.FUNCIONARIO "
            + "FROM Caixas_Movimentos c LEFT JOIN Funcionarios f ON(f.FUNCIONARIO_CODIGO = c.FUNCIONARIO_CODIGO) "
            + "LEFT JOIN Caixas cx ON(cx.CAIXA_CODIGO = c.CAIXA_CODIGO)";

    boolean cadastroCaixaMovimento(CaixaMovimento c);

    ResultSet consultaCaixaMovimento(String condicao);

    ResultSet consultaCaixaMovimentoTotal();
    
    ResultSet consultaCaixaMovimentoEspecial(String sql);
    
}
