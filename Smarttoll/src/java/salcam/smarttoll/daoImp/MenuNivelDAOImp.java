/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.daoImp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Administrador
 */
public class MenuNivelDAOImp implements MenuNivelDAO {
    
    @Override
    public ResultSet consultaMenuNivelTotal(){
        ResultSet rs = null;
        try{
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CONSULTA_MENU_NIVEL);
            rs = stmt.executeQuery();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
}
