/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.EmpresaTelefoneDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import salcam.smarttoll.beans.EmpresaTelefone;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Administrador
 */
public class EmpresaTelefoneDAOImp implements EmpresaTelefoneDAO {
@Override
    public boolean cadastroEmpresaTelefone(EmpresaTelefone e){
        try{
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRO_EMPRESA_TELEFONE);             
            stmt.setInt(1, e.getEmpresaCod());
            int seq = maxCodigo(e.getEmpresaCod());
            if(seq==-1)
                throw new Exception();
            stmt.setInt(2, seq+1);
            stmt.setByte(3, e.getDdd());
            stmt.setString(4, e.getNumero());
            stmt.setByte(5, e.getTipo());            
            stmt.executeUpdate();
            return true;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }    
    
    @Override
    public int maxCodigo(int cod){
        try{
            PreparedStatement stmt = Conn.getConn().prepareStatement(MAX_CODIGO_EMPRESA_TELEFONE+" WHERE EMPRESA_CODIGO="+cod);
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
    public ResultSet consultaEmpresaTelefone(String condicao) {
        String sql = CONSULTA_EMPRESA_TELEFONE + condicao;
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(sql);
            return psmt.executeQuery();            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    } 
    
    @Override
    public ResultSet consultaEmpresaTelefoneTotal(){
        ResultSet rs = null;
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CONSULTA_EMPRESA_TELEFONE);
            rs = stmt.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return rs;
    }     
}
