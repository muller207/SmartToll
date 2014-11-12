/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.TipoLogDAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import salcam.smarttoll.beans.TipoLog;
import salcam.smarttoll.conn.Conn;

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
}
