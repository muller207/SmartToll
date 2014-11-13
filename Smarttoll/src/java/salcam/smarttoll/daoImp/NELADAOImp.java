/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.NELADAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import salcam.smarttoll.beans.NELA;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Administrador
 */
public class NELADAOImp implements NELADAO {
    @Override
    public boolean cadastroNELA(NELA n){
        try{
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRO_NELA); 
            stmt.setString(1, n.getIdPaisEmissor());
            stmt.setString(2, n.getIdEmissorTag());
            stmt.setString(3, n.getNumTag());
            stmt.setString(4, n.getModeloVeiculo());
            stmt.setString(5, n.getPlacaVeiculo());
            stmt.setString(6, n.getCatDoVeiculo());
            stmt.setString(7, n.getOperacao());
            stmt.setString(8, n.getStatus());
            stmt.setString(9, n.getAcao());
            stmt.executeUpdate();
            return true;
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }    
    
    @Override
    public ResultSet consultaNELA(String condicao) {
        String sql = CONSULTA_NELA + condicao;
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(sql);
            return psmt.executeQuery();            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    } 
    
    @Override
    public ResultSet consultaNELATotal(){
        ResultSet rs = null;
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CONSULTA_NELA);
            rs = stmt.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return rs;
    }  
}
