/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.LogMenuDAO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import salcam.smarttoll.beans.LogMenu;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Samuel
 */
public class LogMenuDAOImp implements LogMenuDAO {
    @Override
    public boolean cadastroLogMenu(LogMenu lm){
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRO_LOG_MENU);
            stmt.setInt(1, lm.getFuncionarioAdministrativo());
            stmt.setInt(2,lm.getFuncionarioCod());
            stmt.setDate(3,(Date) lm.getData());
            stmt.setByte(4,lm.getMenuCod());
            stmt.setByte(5,lm.getDireito());
            stmt.setString(6,lm.getAcao());
            stmt.setString(7,lm.getIp());
            stmt.setString(8,lm.getEstacao());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
