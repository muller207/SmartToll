/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.daoImp;

import java.sql.Date;
import salcam.smarttoll.dao.ContaBancariaDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import salcam.smarttoll.beans.ContaBancaria;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Administrador
 */
public class ContaBancariaDAOImp implements ContaBancariaDAO {
   @Override
    public boolean cadastroContaBancaria(ContaBancaria c){
        try{
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRO_CONTA_BANCARIA); 
            if(maxCodigo()==-1)
                throw new Exception();
            stmt.setInt(1, maxCodigo()+1);
            stmt.setInt(2, c.getEmpresaCod());
            stmt.setInt(3, c.getBancoCod());
            stmt.setString(4, c.getDescricao());
            stmt.setString(5, c.getAgencia());
            stmt.setString(6, c.getDigAg());
            stmt.setString(7, c.getCc());
            stmt.setString(8, c.getDigCc());
            stmt.setByte(9, c.getSituacao());
            stmt.setDate(10, (Date) c.getDataAbertura());
            stmt.setDate(11, (Date) c.getDataEncerramento());
            stmt.setInt(12, c.getRelacionamentoCod());
            stmt.setInt(13, c.getPlanoContaCod());
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
            PreparedStatement stmt = Conn.getConn().prepareStatement(MAX_CODIGO_CONTA_BANCARIA);
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
    public ResultSet consultaContaBancaria(String condicao) {
        String sql = CONSULTA_CONTA_BANCARIA + condicao;
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(sql);
            return psmt.executeQuery();            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    } 
    
    @Override
    public ResultSet consultaContaBancariaTotal(){
        ResultSet rs = null;
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CONSULTA_CONTA_BANCARIA);
            rs = stmt.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return rs;
    }    
}
