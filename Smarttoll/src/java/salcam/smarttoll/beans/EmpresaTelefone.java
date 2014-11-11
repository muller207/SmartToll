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
public class EmpresaTelefone {
    private int empresaCod;
    private byte sequencia;
    private byte ddd;
    private String numero;
    private byte tipo;    

    public EmpresaTelefone() {
    }

    public int getEmpresaCod() {
        return empresaCod;
    }

    public void setEmpresaCod(int empresaCod) {
        this.empresaCod = empresaCod;
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
