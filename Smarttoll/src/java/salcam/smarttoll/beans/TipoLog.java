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
public class TipoLog {
    private int tipoLogCod;
    private String descricao;
    private byte modulo;    

    public TipoLog() {
    }

    public int getTipoLogCod() {
        return tipoLogCod;
    }

    public void setTipoLogCod(int tipoLogCod) {
        this.tipoLogCod = tipoLogCod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public byte getModulo() {
        return modulo;
    }

    public void setModulo(byte modulo) {
        this.modulo = modulo;
    }
    
    
}
