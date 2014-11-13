/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.CategoriaDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import salcam.smarttoll.beans.Categoria;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Administrador
 */
public class CategoriaDAOImp implements CategoriaDAO {
   @Override
    public boolean cadastroCategoria(Categoria c){
        try{
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRO_CATEGORIA); 
            stmt.setString(1, c.getDescricao());
            stmt.setByte(2, c.getQtdEixo());
            stmt.setInt(3, c.getCategoriaCgmp());
            stmt.setInt(4, c.getClassificacaoCodigo());            
            stmt.executeUpdate();
            return true;
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }    
    
    @Override
    public ResultSet consultaCategoria(String condicao) {
        String sql = CONSULTA_CATEGORIA + condicao;
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(sql);
            return psmt.executeQuery();            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    } 
    
    @Override
    public ResultSet consultaCategoriaTotal(){
        ResultSet rs = null;
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CONSULTA_CATEGORIA);
            rs = stmt.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return rs;
    }  
}
