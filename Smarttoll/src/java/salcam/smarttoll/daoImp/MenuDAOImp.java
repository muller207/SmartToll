/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.MenuDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Administrador
 */
public class MenuDAOImp implements MenuDAO {
           
    
    @Override
    public ResultSet consultaMenuTotal(){
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CONSULTA_MENU);
            ResultSet rs = stmt.executeQuery();
            return rs;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }        
    }
    
    @Override
    public ResultSet consultaMenuGenerica(String sql){
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            return rs;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }        
    }
    
}
