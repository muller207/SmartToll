/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.SensorDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import salcam.smarttoll.beans.Sensor;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Samuel
 */
public class SensorDAOImp implements SensorDAO {

    @Override
    public boolean cadastroSensor(Sensor s) {
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRO_SENSOR);
                stmt.setString(1, s.getSensor());
                stmt.setString(2, s.getAtivado());
                stmt.setString(3, s.getDescricao());
                stmt.setString(4, s.getSituacao());
                stmt.setString(5, s.getMicrocontrolador());
                stmt.setString(6, s.getBit());
                stmt.executeUpdate();
                return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
