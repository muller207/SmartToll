/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.beans;

import java.sql.Blob;
import java.util.Date;

/**
 *
 * @author Administrador
 */
public class RegistroMicroncontrolador {
    
    private int registroCod;
    private String tipo;
    private String recibo;
    private int eixosSensor;
    private Date lancamento;
    private int caixaCod;
    private boolean transmitido;
    private int eixoComercialSensor;
    private Blob imagemFrontal;

    public RegistroMicroncontrolador() {
    }

    public int getRegistroCod() {
        return registroCod;
    }

    public void setRegistroCod(int registroCod) {
        this.registroCod = registroCod;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRecibo() {
        return recibo;
    }

    public void setRecibo(String recibo) {
        this.recibo = recibo;
    }

    public int getEixosSensor() {
        return eixosSensor;
    }

    public void setEixosSensor(int eixosSensor) {
        this.eixosSensor = eixosSensor;
    }

    public Date getLancamento() {
        return lancamento;
    }

    public void setLancamento(Date lancamento) {
        this.lancamento = lancamento;
    }

    public int getCaixaCod() {
        return caixaCod;
    }

    public void setCaixaCod(int caixaCod) {
        this.caixaCod = caixaCod;
    }

    public boolean isTransmitido() {
        return transmitido;
    }

    public void setTransmitido(boolean transmitido) {
        this.transmitido = transmitido;
    }

    public int getEixoComercialSensor() {
        return eixoComercialSensor;
    }

    public void setEixoComercialSensor(int eixoComercialSensor) {
        this.eixoComercialSensor = eixoComercialSensor;
    }

    public Blob getImagemFrontal() {
        return imagemFrontal;
    }

    public void setImagemFrontal(Blob imagemFrontal) {
        this.imagemFrontal = imagemFrontal;
    }
    
    
    
}
