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
public class LogSenha {
    private int funcionarioAdministrativo;
    private int funcionarioCod;
    private Date data;
    private byte tipoSenha;
    private String ip;
    private String estacao;

    public LogSenha() {
    }

    public int getFuncionarioAdministrativo() {
        return funcionarioAdministrativo;
    }

    public void setFuncionarioAdministrativo(int funcionarioAdministrativo) {
        this.funcionarioAdministrativo = funcionarioAdministrativo;
    }

    public int getFuncionarioCod() {
        return funcionarioCod;
    }

    public void setFuncionarioCod(int funcionarioCod) {
        this.funcionarioCod = funcionarioCod;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public byte getTipoSenha() {
        return tipoSenha;
    }

    public void setTipoSenha(byte tipoSenha) {
        this.tipoSenha = tipoSenha;
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
