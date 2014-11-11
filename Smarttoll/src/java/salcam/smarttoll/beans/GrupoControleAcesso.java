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
public class GrupoControleAcesso {
    private byte grupoControleAcessoCod;
    private String descricao;

    public GrupoControleAcesso() {
    }

    public byte getGrupoControleAcessoCod() {
        return grupoControleAcessoCod;
    }

    public void setGrupoControleAcessoCod(byte grupoControleAcessoCod) {
        this.grupoControleAcessoCod = grupoControleAcessoCod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
