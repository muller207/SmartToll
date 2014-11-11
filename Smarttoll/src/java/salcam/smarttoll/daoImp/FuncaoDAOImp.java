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
import salcam.smarttoll.dao.FuncaoDAO;

/**
 *
 * @author Samuel
 */
public class FuncaoDAOImp implements FuncaoDAO {
    @Override
    public ResultSet consultaFuncaoTotal(){
        ResultSet rs = null;
        try{
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CONSULTA_FUNCAO);
            rs = stmt.executeQuery();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return rs;
    }
}
