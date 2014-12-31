/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.dao;

import salcam.smarttoll.beans.GrupoControleAcessoMenu;

/**
 *
 * @author Administrador
 */
public interface GrupoControleAcessoMenuDAO {
    
    public final String CADASTRO_GRUPO_CONTROLE_ACESSO_MENU = "INSERT INTO GRUPOS_CONTROLE_ACESSO_MENUS "
            + " (GRUPO_CONTROLE_ACESSO_CODIGO, MENU_CODIGO, DIREITO) VALUES (?,?,?)";
    
    public final String EXCLUIR_MENU = "DELETE FROM GRUPOS_CONTROLE_ACESSO_MENUS WHERE "
            + " GRUPO_CONTROLE_ACESSO_CODIGO = ? AND MENU_CODIGO = ? ";
    
    public final String EXCLUIR_GRUPO_CONTROLE_ACESSO = "DELETE FROM GRUPOS_CONTROLE_ACESSO_MENUS WHERE "
            + " GRUPO_CONTROLE_ACESSO_CODIGO = ?";
    
    public final String ALTERA_GRUPO_CONTROLE_ACESSO_MENU = "UPDATE GRUPOS_CONTROLE_ACESSO_MENUS SET DIREITO = ? "
            + " WHERE GRUPO_CONTROLE_ACESSO_CODIGO = ? AND MENU_CODIGO = ?";

    boolean cadastroGrupoControleAcessoMenu(GrupoControleAcessoMenu g);
    
    boolean excluirMenu(byte grupoCod, byte menuCod);
    
    boolean excluirGrupoControleAcesso(byte grupoCod);
    
    boolean alteraGrupoControleAcessoMenu(byte direito, byte grupoCod, byte menuCod);
    
}
