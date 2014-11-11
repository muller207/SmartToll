/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.dao;

import salcam.smarttoll.beans.TipoLancamento;

/**
 *
 * @author Samuel
 */
public interface TipoLancamentoDAO {

    final String CADASTRO_TIPO_LANCAMENTO = "INSERT INTO Tipos_Lancamentos("
            + "TIPO_LANCAMENTO_CODIGO, DESCRICAO, VALOR) "
            + "VALUES(?,?,?);";
    final String GET_LAST_TIPO_LANCAMENTO_CODIGO = "SELECT MAX(TIPO_LANCAMENTO_CODIGO) AS MAX FROM Tipos_Lancamentos";

    boolean cadastroTipoLancamento(TipoLancamento tl);

    int getLastTipoLancamentoCodigo();

}
