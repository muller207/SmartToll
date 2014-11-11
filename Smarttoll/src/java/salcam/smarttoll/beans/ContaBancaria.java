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
public class ContaBancaria {
        private int contaBancariaCod;
        private int empresaCod;
        private int bancoCod;
        private String descricao;
        private String agencia;
        private String digAg;
        private String cc;
        private String digCc;
        private byte situacao;
        private Date dataAbertura;
        private Date dataEncerramento;
        private int relacionamentoCod;
        private int planoContaCod;    

    public ContaBancaria() {
    }

    public int getContaBancariaCod() {
        return contaBancariaCod;
    }

    public void setContaBancariaCod(int contaBancariaCod) {
        this.contaBancariaCod = contaBancariaCod;
    }

    public int getEmpresaCod() {
        return empresaCod;
    }

    public void setEmpresaCod(int empresaCod) {
        this.empresaCod = empresaCod;
    }

    public int getBancoCod() {
        return bancoCod;
    }

    public void setBancoCod(int bancoCod) {
        this.bancoCod = bancoCod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getDigAg() {
        return digAg;
    }

    public void setDigAg(String digAg) {
        this.digAg = digAg;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getDigCc() {
        return digCc;
    }

    public void setDigCc(String digCc) {
        this.digCc = digCc;
    }

    public byte getSituacao() {
        return situacao;
    }

    public void setSituacao(byte situacao) {
        this.situacao = situacao;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Date getDataEncerramento() {
        return dataEncerramento;
    }

    public void setDataEncerramento(Date dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
    }

    public int getRelacionamentoCod() {
        return relacionamentoCod;
    }

    public void setRelacionamentoCod(int relacionamentoCod) {
        this.relacionamentoCod = relacionamentoCod;
    }

    public int getPlanoContaCod() {
        return planoContaCod;
    }

    public void setPlanoContaCod(int planoContaCod) {
        this.planoContaCod = planoContaCod;
    }
        
        
}
