/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.GrupoControleAcessoMenuDAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import salcam.smarttoll.beans.GrupoControleAcessoMenu;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Administrador
 */
public class GrupoControleAcessoMenuDAOImp implements GrupoControleAcessoMenuDAO {
    
    @Override
    public boolean cadastroGrupoControleAcessoMenu(GrupoControleAcessoMenu g) {
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(CADASTRO_GRUPO_CONTROLE_ACESSO_MENU);
            psmt.setByte(1, g.getGrupoControleAcessoCod());
            psmt.setByte(2, g.getMenuCod());
            psmt.setByte(3, g.getDireito());
            psmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    @Override
    public boolean excluirMenu(byte grupoCod, byte menuCod) {
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(EXCLUIR_MENU);
            psmt.setByte(1, grupoCod);
            psmt.setByte(2, menuCod);
            psmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    @Override
    public boolean alteraGrupoControleAcessoMenu(byte direito, byte grupoCod, byte menuCod) {
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(ALTERA_GRUPO_CONTROLE_ACESSO_MENU);
            psmt.setByte(1, direito);
            psmt.setByte(2, grupoCod);
            psmt.setByte(3, menuCod);
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
