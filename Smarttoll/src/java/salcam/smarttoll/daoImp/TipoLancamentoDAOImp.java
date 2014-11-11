/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.TipoLancamentoDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import salcam.smarttoll.beans.TipoLancamento;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Samuel
 */
public class TipoLancamentoDAOImp implements TipoLancamentoDAO {

    @Override
    public boolean cadastroTipoLancamento(TipoLancamento tl) {
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRO_TIPO_LANCAMENTO);
            if (this.getLastTipoLancamentoCodigo() >= 0) {
                stmt.setInt(1, (this.getLastTipoLancamentoCodigo() + 1));
                stmt.setString(2, tl.getDescricao());
                stmt.setFloat(3, tl.getValor());
                stmt.executeUpdate();
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public int getLastTipoLancamentoCodigo() {
        int size = -1;
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(GET_LAST_TIPO_LANCAMENTO_CODIGO);
            ResultSet rs = stmt.executeQuery();
            try {
                while (rs.next()) {
                    size = rs.getInt("MAX");
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return size;
    }
}
