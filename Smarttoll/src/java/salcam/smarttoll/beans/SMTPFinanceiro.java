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
public class SMTPFinanceiro {
    private int caixasMovimentoCod;
    private int caixaCod;
    private int trnSeqReg;
    private Date dataPagamento;
    private float valor;
    private Date dataAbertura;    

    public SMTPFinanceiro() {
    }

    public int getCaixasMovimentoCod() {
        return caixasMovimentoCod;
    }

    public void setCaixasMovimentoCod(int caixasMovimentoCod) {
        this.caixasMovimentoCod = caixasMovimentoCod;
    }

    public int getCaixaCod() {
        return caixaCod;
    }

    public void setCaixaCod(int caixaCod) {
        this.caixaCod = caixaCod;
    }

    public int getTrnSeqReg() {
        return trnSeqReg;
    }

    public void setTrnSeqReg(int trnSeqReg) {
        this.trnSeqReg = trnSeqReg;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    
    
}
