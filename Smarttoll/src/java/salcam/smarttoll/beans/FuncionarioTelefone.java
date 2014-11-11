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
public class FuncionarioTelefone {
    private int funcionarioCodigo;
    private byte sequencia;
    private byte ddd;
    private String numero;
    private byte tipo;

    public FuncionarioTelefone() {
    }

    public int getFuncionarioCodigo() {
        return funcionarioCodigo;
    }

    public void setFuncionarioCodigo(int funcionarioCodigo) {
        this.funcionarioCodigo = funcionarioCodigo;
    }

    public byte getSequencia() {
        return sequencia;
    }

    public void setSequencia(byte sequencia) {
        this.sequencia = sequencia;
    }

    public byte getDdd() {
        return ddd;
    }

    public void setDdd(byte ddd) {
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
