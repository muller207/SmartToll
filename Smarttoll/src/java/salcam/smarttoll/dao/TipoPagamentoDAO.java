/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.dao;

import salcam.smarttoll.beans.TipoPagamento;

/**
 *
 * @author Samuel
 */
public interface TipoPagamentoDAO {
    final String CADASTRO_TIPO_PAGAMENTO = "INSERT INTO Tipos_Pagamentos"
            + "(TIPO_PAGAMENTO_CODIGO,TIPO_PAGAMENTO, A_VISTA, A_PRAZO)"
            + " VALUES(((SELECT MAX(TIPO_PAGAMENTO_CODIGO) AS MAX FROM Tipos_Pagamentos)+1),?,?,?);";

    boolean cadastroTipoPagamento(TipoPagamento tp);
    
}
