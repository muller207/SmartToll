/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.beans;

import java.util.Date;

/**
 *
 * @author Samuel
 */
public class CaixaMovimento {
    private int codigo;
    private int movimentacao;
    private Date dataAbertura;
    private byte caixaCodigo;
    private int funcionarioCodigo;
    private float valorAbertura;
    private float valorFechamento;
    private float valorMovimentoTotal;
    private boolean transmitido;
    private Date dataFechamento;
    private float valorFechamentoOperador;
    private int trnSeqReg;
    private Date dataCriacaoTrn;
    private int motivoTrt;

    public CaixaMovimento() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getMovimentacao() {
        return movimentacao;
    }

    public void setMovimentacao(int movimentacao) {
        this.movimentacao = movimentacao;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public byte getCaixaCodigo() {
        return caixaCodigo;
    }

    public void setCaixaCodigo(byte caixaCodigo) {
        this.caixaCodigo = caixaCodigo;
    }

    public int getFuncionarioCodigo() {
        return funcionarioCodigo;
    }

    public void setFuncionarioCodigo(int funcionarioCodigo) {
        this.funcionarioCodigo = funcionarioCodigo;
    }

    public float getValorAbertura() {
        return valorAbertura;
    }

    public void setValorAbertura(float valorAbertura) {
        this.valorAbertura = valorAbertura;
    }

    public float getValorFechamento() {
        return valorFechamento;
    }

    public void setValorFechamento(float valorFechamento) {
        this.valorFechamento = valorFechamento;
    }

    public float getValorMovimentoTotal() {
        return valorMovimentoTotal;
    }

    public void setValorMovimentoTotal(float valorMovimentoTotal) {
        this.valorMovimentoTotal = valorMovimentoTotal;
    }

    public boolean isTransmitido() {
        return transmitido;
    }

    public void setTransmitido(boolean transmitido) {
        this.transmitido = transmitido;
    }

    public Date getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(Date dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public float getValorFechamentoOperador() {
        return valorFechamentoOperador;
    }

    public void setValorFechamentoOperador(float valorFechamentoOperador) {
        this.valorFechamentoOperador = valorFechamentoOperador;
    }

    public int getTrnSeqReg() {
        return trnSeqReg;
    }

    public void setTrnSeqReg(int trnSeqReg) {
        this.trnSeqReg = trnSeqReg;
    }

    public Date getDataCriacaoTrn() {
        return dataCriacaoTrn;
    }

    public void setDataCriacaoTrn(Date dataCriacaoTrn) {
        this.dataCriacaoTrn = dataCriacaoTrn;
    }

    public int getMotivoTrt() {
        return motivoTrt;
    }

    public void setMotivoTrt(int motivoTrt) {
        this.motivoTrt = motivoTrt;
    }
    
    
}
