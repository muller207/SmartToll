/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.ClassificacaoDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import salcam.smarttoll.beans.Classificacao;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Administrador
 */
public class ClassificacaoDAOImp implements ClassificacaoDAO {
    @Override
    public ResultSet consultaClassificacaoTotal(){
        ResultSet rs = null;
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CONSULTA_CLASSIFICACAO);
            rs = stmt.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return rs;
    }
    
    @Override
    public ResultSet consultaClassificacao(String condicao){
        ResultSet rs = null;
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CONSULTA_CLASSIFICACAO+condicao);
            rs = stmt.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return rs;
    }
    
    @Override
    public boolean cadastroClassificacao(Classificacao c){
        try{
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRA_CLASSIFICACAO);
            stmt.setString(1, c.getClassificacao());
            stmt.setString(2, c.getDescricao());
            stmt.setFloat(3, c.getTarifa());
            stmt.setByte(4, c.getEixos());
            stmt.setBoolean(5, c.isSituacao());
            stmt.setInt(6, c.getEixosComercial());
            stmt.setBoolean(7, c.isSemParar());            
            stmt.executeUpdate();
            return true;
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
