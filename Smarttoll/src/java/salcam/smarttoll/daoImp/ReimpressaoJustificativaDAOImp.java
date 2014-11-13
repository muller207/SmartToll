/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.ReimpressaoJustificativaDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import salcam.smarttoll.beans.ReimpressaoJustificativa;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Administrador
 */
public class ReimpressaoJustificativaDAOImp implements ReimpressaoJustificativaDAO {
    @Override
    public boolean cadastroReimpressaoJustificativa(ReimpressaoJustificativa r){
        try{
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRO_REIMPRESSAO_JUSTIFICATIVA); 
            if(maxCodigo()==-1)
                throw new Exception();
            stmt.setInt(1, maxCodigo()+1);
            stmt.setString(2, r.getDescricao());
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
            PreparedStatement stmt = Conn.getConn().prepareStatement(MAX_CODIGO_REIMPRESSAO_JUSTIFICATIVA);
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
    public ResultSet consultaReimpressaoJustificativa(String condicao) {
        String sql = CONSULTA_REIMPRESSAO_JUSTIFICATIVA + condicao;
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(sql);
            return psmt.executeQuery();            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    } 
    
    @Override
    public ResultSet consultaReimpressaoJustificativaTotal(){
        ResultSet rs = null;
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CONSULTA_REIMPRESSAO_JUSTIFICATIVA);
            rs = stmt.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return rs;
    }  
}
