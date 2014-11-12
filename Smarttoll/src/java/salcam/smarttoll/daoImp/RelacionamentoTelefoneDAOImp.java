/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.RelacionamentoTelefoneDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import salcam.smarttoll.beans.RelacionamentoTelefone;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Samuel
 */
public class RelacionamentoTelefoneDAOImp implements RelacionamentoTelefoneDAO {

    @Override
    public boolean cadastroRelacionamentoTelefone(RelacionamentoTelefone rt) {
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRO_RELACIONAMENTO_TELEFONE);
            if (!(this.getMaxRelaciomentoTelefoneCodigo() < 0)) {
                stmt.setInt(1, (this.getMaxRelaciomentoTelefoneCodigo() + 1));
                stmt.setByte(2, rt.getSequencia());
                stmt.setString(3, rt.getArea());
                stmt.setString(4, rt.getDdd());
                stmt.setString(5, rt.getNumero());
                stmt.setByte(6, rt.getTipo());
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
    public int getMaxRelaciomentoTelefoneCodigo() {
        int size = -1;
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(getMaxRelacionamentoTelefoneCodigo);
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
