/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.dao;

import salcam.smarttoll.beans.TipoEndereco;

/**
 *
 * @author Samuel
 */
public interface TipoEnderecoDAO {

    final String CADASTRO_TIPO_ENDERECO = "INSERT INTO Tipos_Enderecos(TITULO_CODIGO, DESCRICAO) VALUES(?,?);";
    final String GET_LAST_TIPO_LANCAMENTO_CODIGO = "SELECT MAX(TITULO_CODIGO) AS MAX FROM Tipos_Enderecos";

    boolean cadastroTipoEndereco(TipoEndereco te);

    int getLastTipoLancamentoCodigo();

}
