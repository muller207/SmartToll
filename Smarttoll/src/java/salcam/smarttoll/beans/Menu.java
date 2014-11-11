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
public class Menu {
    private byte menuCod;
    private byte nivelCod;
    private String acao;
    private String descricao;
    private String descricaoControleAcesso;
    private String hint;
    private String tipo;    

    public Menu() {
    }

    public byte getMenuCod() {
        return menuCod;
    }

    public void setMenuCod(byte menuCod) {
        this.menuCod = menuCod;
    }

    public byte getNivelCod() {
        return nivelCod;
    }

    public void setNivelCod(byte nivelCod) {
        this.nivelCod = nivelCod;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricaoControleAcesso() {
        return descricaoControleAcesso;
    }

    public void setDescricaoControleAcesso(String descricaoControleAcesso) {
        this.descricaoControleAcesso = descricaoControleAcesso;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
