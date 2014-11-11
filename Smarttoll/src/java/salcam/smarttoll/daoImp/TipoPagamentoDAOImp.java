/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.TipoPagamentoDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import salcam.smarttoll.beans.TipoPagamento;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Samuel
 */
public class TipoPagamentoDAOImp implements TipoPagamentoDAO {

    @Override
    public boolean cadastroTipoPagamento(TipoPagamento tp) {
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRO_TIPO_PAGAMENTO);
            stmt.setString(1, tp.getTipoPagamento());
            stmt.setString(2, tp.getAvista());
            stmt.setString(3, tp.getAprazo());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
