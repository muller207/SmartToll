/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.dao;

import salcam.smarttoll.beans.RelacionamentoTelefone;

/**
 *
 * @author Samuel
 */
public interface RelacionamentoTelefoneDAO {

    final String CADASTRO_RELACIONAMENTO_TELEFONE = "INSERT INTO Relacionamentos_Telefones("
            + "RELACIONAMENTO_CODIGO,"
            + "SEQUENCIA,"
            + "AREA,"
            + "DDD,"
            + "NUMERO,"
            + "TIPO) VALUES(?,?,?,?,?,?);";

    final String getMaxRelacionamentoTelefoneCodigo = "SELECT MAX(RELACIONAMENTO_CODIGO) AS MAX FROM Relacionamentos_Telefones";

    boolean cadastroRelacionamentoTelefone(RelacionamentoTelefone rt);

    int getMaxRelaciomentoTelefoneCodigo();

}
