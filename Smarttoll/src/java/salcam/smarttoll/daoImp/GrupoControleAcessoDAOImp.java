/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.GrupoControleAcessoDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import salcam.smarttoll.beans.GrupoControleAcesso;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Administrador
 */
public class GrupoControleAcessoDAOImp implements GrupoControleAcessoDAO {
    
    @Override
    public ResultSet consultaGrupoControleAcesso(String condicao){
        String sql = CONSULTA_GRUPO_CONTROLE_ACESSO+condicao;
        ResultSet rs = null;
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(sql);
            rs = stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(EmpresaDAOImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    } 
    
    @Override
    public ResultSet consultaGrupoControleAcessoGenerica(String sql){
        ResultSet rs = null;
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(sql);
            rs = stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(EmpresaDAOImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    @Override
    public boolean cadastraGrupoControleAcesso(GrupoControleAcesso g) {
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(CADASTRA_GRUPO_CONTROLE_ACESSO);           
            psmt.setString(1, g.getDescricao());
            psmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    @Override
    public boolean excluirGrupoControleAcesso(byte grupoCod) {
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(EXCLUIR_GRUPO_CONTROLE_ACESSO);
            psmt.setByte(1, grupoCod);
            psmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
}
