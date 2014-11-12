/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.dao;

import java.sql.ResultSet;
import salcam.smarttoll.beans.CaixaHistorico;

/**
 *
 * @author Administrador
 */
public interface CaixaHistoricoDAO {

    public final String CADASTRO_CAIXA_HISTORICO="INSERT INTO Caixas_Historicos(MOVIMENTACAO, SEQUENCIAL,"
            + "LANCAMENTO, CLASSIFICACAO_CODIGO, TARIFA, VALOR_PAGO, TROCO, TIPO_PAGAMENTO, CAIXA_CODIGO,"
            + "FUNCIONARIO_CODIGO, TIPO_REGISTRO) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
    public final String MAX_CODIGO_CAIXA_HISTORICO="SELECT MAX(SEQUENCIAL) as MAX FROM Caixas_Historicos";
    public String CONSULTA_CAIXA_HISTORICO="SELECT * FROM Caixas_Historicos";
    boolean cadastroCaixaHistorico(CaixaHistorico c);

    ResultSet consultaCaixaHistorico(String condicao);

    ResultSet consultaCaixaHistoricoTotal();

    int maxCodigo();
    
}
