/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.TipoEnderecoDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import salcam.smarttoll.beans.TipoEndereco;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Samuel
 */
public class TipoEnderecoDAOImp implements TipoEnderecoDAO {
    @Override
    public boolean cadastroTipoEndereco(TipoEndereco te) {
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRO_TIPO_ENDERECO);
            if (!(getLastTipoLancamentoCodigo() < 0)) {
                stmt.setInt(1, (getLastTipoLancamentoCodigo()+1));
                stmt.setString(2, te.getDescricao());
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
                    System.out.println(size);
                }
            } catch (SQLException e) {
                e.getMessage();
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return size;
    }
}
