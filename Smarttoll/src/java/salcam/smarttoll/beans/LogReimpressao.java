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
public class LogReimpressao {
    
    private Date data;
    private int caixaCod;
    private int funcionarioCod;
    private String ip;
    private String cabine;
    private int tipo;
    private String descricao;
    private int justificativaCod;
    private String descricaoUsuario;
    private String placaVeiculo;
    private boolean transmitido;
    private int classificacaoCod;

    public LogReimpressao() {
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
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

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCabine() {
        return cabine;
    }

    public void setCabine(String cabine) {
        this.cabine = cabine;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getJustificativaCod() {
        return justificativaCod;
    }

    public void setJustificativaCod(int justificativaCod) {
        this.justificativaCod = justificativaCod;
    }

    public String getDescricaoUsuario() {
        return descricaoUsuario;
    }

    public void setDescricaoUsuario(String descricaoUsuario) {
        this.descricaoUsuario = descricaoUsuario;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public boolean isTransmitido() {
        return transmitido;
    }

    public void setTransmitido(boolean transmitido) {
        this.transmitido = transmitido;
    }

    public int getClassificacaoCod() {
        return classificacaoCod;
    }

    public void setClassificacaoCod(int classificacaoCod) {
        this.classificacaoCod = classificacaoCod;
    }
    
    
    
}
