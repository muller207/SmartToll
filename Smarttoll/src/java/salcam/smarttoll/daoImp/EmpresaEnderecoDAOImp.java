/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.EmpresaEnderecoDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import salcam.smarttoll.beans.EmpresaEndereco;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Administrador
 */
public class EmpresaEnderecoDAOImp implements EmpresaEnderecoDAO {
   @Override
    public boolean cadastroEmpresaEndereco(EmpresaEndereco e){
        try{
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRO_EMPRESA_ENDERECO);             
            stmt.setInt(1, e.getEmpresaCod());
            int seq = maxCodigo(e.getEmpresaCod());
            if(seq==-1)
                throw new Exception();
            stmt.setInt(2, seq+1);
            stmt.setString(3, e.getLogradouro());
            stmt.setInt(4, e.getNumero());
            stmt.setString(5, e.getCep());
            stmt.setString(6, e.getBairro());
            stmt.setInt(7, e.getMunicipioCod());
            stmt.setBoolean(8, e.isComercial());
            stmt.setBoolean(9, e.isCobranca());
            stmt.setBoolean(10, e.isEntrega());
            stmt.setString(11, e.getReferencia());
            stmt.setString(12, e.getComplemento());
            stmt.setByte(13, e.getTitulo());
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
            PreparedStatement stmt = Conn.getConn().prepareStatement(MAX_CODIGO_EMPRESA_ENDERECO+" WHERE EMPRESA_CODIGO="+cod);
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
    public ResultSet consultaEmpresaEndereco(String condicao) {
        String sql = CONSULTA_EMPRESA_ENDERECO + condicao;
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(sql);
            return psmt.executeQuery();            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    } 
    
    @Override
    public ResultSet consultaEmpresaEnderecoTotal(){
        ResultSet rs = null;
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CONSULTA_EMPRESA_ENDERECO);
            rs = stmt.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return rs;
    }     
}
