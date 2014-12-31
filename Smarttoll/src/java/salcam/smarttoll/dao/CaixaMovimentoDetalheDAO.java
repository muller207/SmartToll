/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.dao;

import java.sql.ResultSet;
import salcam.smarttoll.beans.CaixaMovimentoDetalhe;

/**
 *
 * @author Administrador
 */
public interface CaixaMovimentoDetalheDAO {
    
    public final String CADASTRO_CAIXA_MOVIMENTO_DETALHE = "";
    public final String MAX_CODIGO_CAIXA_MOVIMENTO_DETALHE = "SELECT MAX(CAIXAS_MOVIMENTOS_DETALHES_CODIGO) as MAX FROM CAIXAS_MOVIMENTOS_DETALHES";
    public String CONSULTA_CAIXA_MOVIMENTO_DETALHE = "SELECT c.CAIXAS_MOVIMENTOS_CODIGO, c.LANCAMENTO, cl.CLASSIFICACAO, cl.DESCRICAO, c.TARIFA, c.VALOR_PAGO, c.TROCO, tp.TIPO_PAGAMENTO, c.EIXOS_CLASSIFICACAO, c.EIXOS_SENSOR, c.EIXOS_COMERCIAL_CLASSIFICACAO, c.EIXOS_COMERCIAL_SENSOR, c.RECIBO, c.PLACA, c.CAIXA_CODIGO "
            + "FROM Caixas_Movimentos_Detalhes c LEFT JOIN Classificacoes cl ON(cl.CLASSIFICACAO_CODIGO = c.CLASSIFICACAO_CODIGO) "
            + "LEFT JOIN Tipos_Pagamentos tp ON(tp.TIPO_PAGAMENTO_CODIGO = c.TIPO_PAGAMENTO_CODIGO)";
    public String CONSULTA_RELATORIO_MOVIMENTACAO_VEICULOS = "SELECT DISTINCT (cl.CLASSIFICACAO), c.CLASSIFICACAO_CODIGO, cl.DESCRICAO "
            + "FROM Caixas_Movimentos_Detalhes c LEFT JOIN Classificacoes cl ON(cl.CLASSIFICACAO_CODIGO = c.CLASSIFICACAO_CODIGO)";

    boolean cadastroCaixaMovimentoDetalhe(CaixaMovimentoDetalhe c);

    ResultSet consultaCaixaMovimentoDetalhe(String condicao);

    int maxCodigo();
    
    ResultSet consultaRelatorioMovimentacaoVeiculosCaixaMovimentoDetalhe(String condicao);
    
    ResultSet consultaCaixaMovimentoDetalheGenerica(String sql);
}
