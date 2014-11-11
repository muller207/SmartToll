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
public class MenuNivel {
    private byte nivelCodigo;
    private byte nivel;
    private String descricao;    

    public MenuNivel() {
    }

    public byte getNivelCodigo() {
        return nivelCodigo;
    }

    public void setNivelCodigo(byte nivelCodigo) {
        this.nivelCodigo = nivelCodigo;
    }

    public byte getNivel() {
        return nivel;
    }

    public void setNivel(byte nivel) {
        this.nivel = nivel;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
