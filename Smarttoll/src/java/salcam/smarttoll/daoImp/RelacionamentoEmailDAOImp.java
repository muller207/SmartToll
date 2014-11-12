/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.RelacionamentoEmailDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import salcam.smarttoll.beans.RelacionamentoEmail;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Samuel
 */
public class RelacionamentoEmailDAOImp implements RelacionamentoEmailDAO {
    
    @Override
    public boolean cadastroRelacionamentoEmail(RelacionamentoEmail re) {
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRO_RELACIONAMENTO_EMAIL);
            if (!(this.getMaxRelacionamentoEmailCodigo() < 0)) {
                stmt.setInt(1, (this.getMaxRelacionamentoEmailCodigo() + 1));
                stmt.setInt(2, re.getSequencia());
                stmt.setString(3, re.getEmail());
                stmt.setByte(4, (byte) re.getSituacao());
                stmt.setBoolean(5, re.isMailing());
                stmt.setBoolean(6, re.isNfe());
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
    public int getMaxRelacionamentoEmailCodigo() {
        int size = -1;
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(getMaxRelacinamentoEmailCodigo);
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
