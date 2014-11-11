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
public class Sensor {
    private String sensor;
    private String ativado;
    private String descricao;
    private String situacao;
    private String microcontrolador;
    private String bit;
    private String sensorCod;    

    public Sensor() {
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    public String getAtivado() {
        return ativado;
    }

    public void setAtivado(String ativado) {
        this.ativado = ativado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getMicrocontrolador() {
        return microcontrolador;
    }

    public void setMicrocontrolador(String microcontrolador) {
        this.microcontrolador = microcontrolador;
    }

    public String getBit() {
        return bit;
    }

    public void setBit(String bit) {
        this.bit = bit;
    }

    public String getSensorCod() {
        return sensorCod;
    }

    public void setSensorCod(String sensorCod) {
        this.sensorCod = sensorCod;
    }
    
    
}
