/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.beans;

import java.sql.Blob;

/**
 *
 * @author Samuel
 */
public class Banco {
    private int codigo;
    private String razao;
    private String fantasia;
    private Blob logotipo;

    public Banco() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public Blob getLogotipo() {
        return logotipo;
    }

    public void setLogotipo(Blob logotipo) {
        this.logotipo = logotipo;
    }
    
    
}
