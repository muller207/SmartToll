/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.daoImp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import salcam.smarttoll.beans.TipoLog;
import salcam.smarttoll.conn.Conn;
import salcam.smarttoll.dao.TipoLogDAO;

/*
 *
 * @author Samuel
 */
public class TipoLogDAOImp implements TipoLogDAO {
    @Override
    public boolean cadastroTipoLog(TipoLog tl){
        try{
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRO_TIPO_LOG);
            stmt.setString(1, tl.getDescricao());
            stmt.setByte(2, tl.getModulo());
            stmt.executeUpdate();
            return true;
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    @Override
    public ResultSet consultaTipoLogTotal(){
        ResultSet rs = null;
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CONSULTA_TIPO_LOG);
            rs = stmt.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return rs;
    } 
}
