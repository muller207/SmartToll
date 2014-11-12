/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.dao;

import salcam.smarttoll.beans.RelacionamentoEmail;

/**
 *
 * @author Samuel
 */
public interface RelacionamentoEmailDAO {

    final String CADASTRO_RELACIONAMENTO_EMAIL = "INSERT INTO Relacionamentos_emails(RELACIONAMENTO_CODIGO, SEQUENCIA, EMAIL, SITUACAO, MAILING, NFE) VALUES(?,?,?,?,?,?);";
    final String getMaxRelacinamentoEmailCodigo = "SELECT MAX(RELACIONAMENTO_CODIGO) AS MAX FROM Relacionamentos_emails";

    boolean cadastroRelacionamentoEmail(RelacionamentoEmail re);

    int getMaxRelacionamentoEmailCodigo();

}
