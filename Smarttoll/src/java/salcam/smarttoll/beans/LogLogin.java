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
public class LogLogin {
    private int funcionarioCod;
    private int condominioCod;
    private Date data;
    private byte sucesso;
    private byte sistema;
    private String ip;
    private String estacao;   

    public LogLogin() {
    }

    public int getFuncionarioCod() {
        return funcionarioCod;
    }

    public void setFuncionarioCod(int funcionarioCod) {
        this.funcionarioCod = funcionarioCod;
    }

    public int getCondominioCod() {
        return condominioCod;
    }

    public void setCondominioCod(int condominioCod) {
        this.condominioCod = condominioCod;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public byte getSucesso() {
        return sucesso;
    }

    public void setSucesso(byte sucesso) {
        this.sucesso = sucesso;
    }

    public byte getSistema() {
        return sistema;
    }

    public void setSistema(byte sistema) {
        this.sistema = sistema;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getEstacao() {
        return estacao;
    }

    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }
    
    
    
}
