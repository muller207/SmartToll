/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.beans;

import java.util.Date;

/**
 *
 * @author Administrador
 */
public class Uptime {
    private int caixaCod;
    private int funcionarioCod;
    private Date dataInicio;
    private Date ultimoRegistro;
    private boolean situacao;
    private boolean transmitido;    

    public Uptime() {
    }

    public int getCaixaCod() {
        return caixaCod;
    }

    public void setCaixaCod(int caixaCod) {
        this.caixaCod = caixaCod;
    }

    public int getFuncionarioCod() {
        return funcionarioCod;
    }

    public void setFuncionarioCod(int funcionarioCod) {
        this.funcionarioCod = funcionarioCod;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getUltimoRegistro() {
        return ultimoRegistro;
    }

    public void setUltimoRegistro(Date ultimoRegistro) {
        this.ultimoRegistro = ultimoRegistro;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public boolean isTransmitido() {
        return transmitido;
    }

    public void setTransmitido(boolean transmitido) {
        this.transmitido = transmitido;
    }
    
    
    
}
