/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.dao;

import salcam.smarttoll.beans.SMTPFinanceiro;

/**
 *
 * @author Samuel
 */
public interface SMTPFinanceiroDAO {

    final String CADASTRO_SMTP_FINANCEIRO = "INSERT INTO SMTP_Financeiro(CAIXAS_MOVIMENTOS_CODIGO, CAIXA_CODIGO, TRN_SEQ_REG, DATA_PAGAMENTO, VALOR, DATA_ABERTURA) VALUES(?,?,?,?,?,?);";

    boolean cadastroSMTPFinanceiro(SMTPFinanceiro s);
}
