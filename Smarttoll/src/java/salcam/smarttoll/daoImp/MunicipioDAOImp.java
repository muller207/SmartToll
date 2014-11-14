/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.MunicipioDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import salcam.smarttoll.beans.Municipio;
import salcam.smarttoll.conn.Conn;
/**
 *
 * @author Administrador
 */
public class MunicipioDAOImp implements MunicipioDAO {
@Override
    public boolean cadastroMunicipio(Municipio c){
        try{
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRO_MUNICIPIO); 
            stmt.setString(1, c.getMunicipio());
            stmt.setString(2, c.getEstadoCod());
            stmt.executeUpdate();
            return true;
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }    
    
    @Override
    public ResultSet consultaMunicipio(String condicao) {
        String sql = CONSULTA_MUNICIPIO + condicao;
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(sql);
            return psmt.executeQuery();            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    } 
    
    @Override
    public ResultSet consultaMunicipioTotal(){
        ResultSet rs = null;
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CONSULTA_MUNICIPIO);
            rs = stmt.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return rs;
    }     
}
