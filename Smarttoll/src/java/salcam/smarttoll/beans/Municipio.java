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
public class Municipio {
    private int municipioCod;
    private String municipio;
    private String estadoCod;    

    public Municipio() {
    }

    public int getMunicipioCod() {
        return municipioCod;
    }

    public void setMunicipioCod(int municipioCod) {
        this.municipioCod = municipioCod;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstadoCod() {
        return estadoCod;
    }

    public void setEstadoCod(String estadoCod) {
        this.estadoCod = estadoCod;
    }    
     
}
