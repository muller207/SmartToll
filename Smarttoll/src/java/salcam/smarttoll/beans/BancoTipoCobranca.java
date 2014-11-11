/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.beans;

/**
 *
 * @author Samuel
 */
public class BancoTipoCobranca {
    private byte codigo;
    private byte bancoCodigo;
    private String padrao;

    public BancoTipoCobranca() {
    }

    public byte getCodigo() {
        return codigo;
    }

    public void setCodigo(byte codigo) {
        this.codigo = codigo;
    }

    public byte getBancoCodigo() {
        return bancoCodigo;
    }

    public void setBancoCodigo(byte bancoCodigo) {
        this.bancoCodigo = bancoCodigo;
    }

    public String getPadrao() {
        return padrao;
    }

    public void setPadrao(String padrao) {
        this.padrao = padrao;
    }
    
    
}
