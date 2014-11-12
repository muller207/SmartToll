/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.WhiteDAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import salcam.smarttoll.beans.White;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Samuel
 */
public class WhiteDAOImp implements WhiteDAO {
    @Override
    public boolean cadastroWhite(White w){
        try{
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRO_WHITE);
            stmt.setString(1, w.getNumTag());
            stmt.setString(2, w.getDescricao());
            stmt.setBoolean(3, w.isAtivo());
            stmt.executeUpdate();
            return true;
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
