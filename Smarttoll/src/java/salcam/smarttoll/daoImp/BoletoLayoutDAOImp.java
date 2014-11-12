/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.BoletoLayoutDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import salcam.smarttoll.beans.BoletoLayout;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Administrador
 */
public class BoletoLayoutDAOImp implements BoletoLayoutDAO {
    @Override
    public boolean cadastroBoletoLayout(BoletoLayout b){
        try{
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRO_BOLETO_LAYOUT); 
            stmt.setByte(1, b.getLinha());
            stmt.setByte(2, b.getColuna());
            stmt.setByte(3, b.getTamanho());
            stmt.setString(4, b.getCampo());
            stmt.setByte(5, b.getAlinhamento());
            stmt.setByte(6, b.getTipo());
            if(maxCodigo()==-1)
                throw new Exception();
            stmt.setInt(7, maxCodigo()+1);
            stmt.setByte(8, b.getContaBancaria());
            stmt.setInt(9, b.getEmpresaCodigo());
            stmt.setByte(10, b.getCarteira());
            stmt.executeUpdate();
            return true;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    @Override
    public int maxCodigo(){
        try{
            PreparedStatement stmt = Conn.getConn().prepareStatement(MAX_CODIGO_BOLETO_LAYOUT);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                return rs.getInt("MAX");                
            }
            return -1;
        }catch(Exception e){
            return -1;
        }
    }
    
    @Override
    public ResultSet consultaBoletoLayout(String condicao) {
        String sql = CONSULTA_BOLETO_LAYOUT + condicao;
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(sql);
            return psmt.executeQuery();            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    } 
    
    @Override
    public ResultSet consultaBoletoLayoutTotal(){
        ResultSet rs = null;
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CONSULTA_BOLETO_LAYOUT);
            rs = stmt.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return rs;
    }     
}
