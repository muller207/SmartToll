/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.dao;

import java.sql.ResultSet;
import salcam.smarttoll.beans.Boleto;

/**
 *
 * @author Administrador
 */
public interface BoletoDAO {

    public final String CADASTRO_BOLETO="INSERT INTO Boletos(BOLETO_CODIGO, EMPRESA_CODIGO,"
            + "ORIGEM_CODIGO, PARCELA, CONTA_BANCARIA_CODIGO, CARTEIRA, PARCELAS, REJEICAO,"
            + "OCORRENCIA, DOCUMENTO, NOSSO_NUMERO, EMISSAO, VENCIMENTO, PROTESTAR, ABATIMENTO,"
            + "DESCONTO, MULTA, PAGAMENTO, VALOR_NOMINAL, VALOR_ABATIMENTO, VALOR_DESCONTO,"
            + "VALOR_DESPESA, VALOR_JUROS, VALOR_MULTA, VALOR_PAGO, ORIGEM, BOLETO_IMPRESSO,"
            + "REMESSA_GERADA, ALTERACAO, TIPO_ALTERACAO, DUPL, CANCELADO, NOME, PESSOA, CNPJ_CPF,"
            + "IE_RG, ENDERECO, NUMERO, COMPLEMENTO, BAIRRO, CEP, CIDADE, ESTADO, EMAIL)"
            + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    public final String MAX_CODIGO_BOLETO="SELECT MAX(BOLETO_CODIGO) as MAX FROM Boletos";
    public String CONSULTA_BOLETO="SELECT * FROM Boletos";
    
    boolean cadastroBoleto(Boleto b);

    ResultSet consultaBoleto(String condicao);
    
    int maxCodigo();
    
}
