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
public class LogMenu {
    
    private int funcionarioAdministrativo;
    private int funcionarioCod;
    private Date data;
    private byte menuCod;
    private byte direito;
    private String acao;
    private String ip; 
    private String estacao;

    public LogMenu() {
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

    public byte getMenuCod() {
        return menuCod;
    }

    public void setMenuCod(byte menuCod) {
        this.menuCod = menuCod;
    }

    public byte getDireito() {
        return direito;
    }

    public void setDireito(byte direito) {
        this.direito = direito;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
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
