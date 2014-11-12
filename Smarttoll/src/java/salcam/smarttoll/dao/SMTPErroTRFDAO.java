/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.dao;

import salcam.smarttoll.beans.SMTPErroTRF;

/**
 *
 * @author Samuel
 */
public interface SMTPErroTRFDAO {
    final String CADASTRO_SMTP_ERRO_TRF = "INSERT INTO SMTP_Erros_TRF("
            + "CAIXAS_MOVIMENTOS_CODIGO, "
            + "CAIXA_CODIGO, "
            + "TRN_SEQ_REG_ERRO, "
            + "CAIXAS_MOVIMENTOS_DETALHES_CODIGO, "
            + "ERRO, "
            + "TRN_GERADO, "
            + "TRN_SEQ_REG) "
            + "VALUES(?,?,?,?,?,?,?);";
    

    boolean cadastroSMTPErroTRF(SMTPErroTRF se);
    
}
