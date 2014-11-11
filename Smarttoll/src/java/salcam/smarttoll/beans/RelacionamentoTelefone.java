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
public class RelacionamentoTelefone {
    private int relacionamentoCod;
    private byte sequencia;
    private String area;
    private String ddd;
    private String numero;
    private byte tipo;

    public RelacionamentoTelefone() {
    }

    public int getRelacionamentoCod() {
        return relacionamentoCod;
    }

    public void setRelacionamentoCod(int relacionamentoCod) {
        this.relacionamentoCod = relacionamentoCod;
    }

    public byte getSequencia() {
        return sequencia;
    }

    public void setSequencia(byte sequencia) {
        this.sequencia = sequencia;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public byte getTipo() {
        return tipo;
    }

    public void setTipo(byte tipo) {
        this.tipo = tipo;
    }
    
    
}
