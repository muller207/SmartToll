/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.RegistroMicrocontroladorDAO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import salcam.smarttoll.beans.RegistroMicroncontrolador;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Administrador
 */
public class RegistroMicrocontroladorDAOImp implements RegistroMicrocontroladorDAO {
@Override
    public boolean cadastroRegistroMicroncontrolador(RegistroMicroncontrolador r){
        try{
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRO_REGISTRO_MICROCONTROLADOR); 
            stmt.setString(1, r.getTipo());
            stmt.setString(2, r.getRecibo());
            stmt.setInt(3, r.getEixosSensor());
            stmt.setDate(4, (Date) r.getLancamento());
            stmt.setInt(5, r.getCaixaCod());
            stmt.setBoolean(6, r.isTransmitido());
            stmt.setInt(7, r.getEixoComercialSensor());
            stmt.setBlob(8, r.getImagemFrontal());
            stmt.executeUpdate();
            return true;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }        
    
    @Override
    public ResultSet consultaRegistroMicroncontrolador(String condicao) {
        String sql = CONSULTA_REGISTRO_MICROCONTROLADOR + condicao;
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(sql);
            return psmt.executeQuery();            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    } 
    
    @Override
    public ResultSet consultaRegistroMicroncontroladorTotal(){
        ResultSet rs = null;
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CONSULTA_REGISTRO_MICROCONTROLADOR);
            rs = stmt.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return rs;
    }      
    
    @Override
    public ResultSet consultaRegistroMicroncontroladorEspecial(String sql) {
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(sql);
            return psmt.executeQuery();            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
