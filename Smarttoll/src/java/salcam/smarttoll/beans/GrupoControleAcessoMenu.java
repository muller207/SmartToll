/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.beans;

/**
 *
 * @author Administrador
 */
public class GrupoControleAcessoMenu {
    private byte grupoControleAcessoCod;
    private byte menuCod;
    private byte direito;

    public GrupoControleAcessoMenu() {
    }

    public byte getGrupoControleAcessoCod() {
        return grupoControleAcessoCod;
    }

    public void setGrupoControleAcessoCod(byte grupoControleAcessoCod) {
        this.grupoControleAcessoCod = grupoControleAcessoCod;
    }

    public byte getMenuCod() {
        return menuCod;
    }

    public void setMenuCod(byte menuCod) {
        this.menuCod = menuCod;
    }

    public byte getDireito() {
        return direito;
    }

    public void setDireito(byte direito) {
        this.direito = direito;
    }
    
    
    
}
