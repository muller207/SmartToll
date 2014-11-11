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
public class CaixaHistorico {
    private int movimentacao;
    private int sequencial;
    private Date lancamento;
    private int classificacaoCodigo;
    private float tarifa;
    private float valorPago;
    private float troco;
    private int tipoPagamento;
    private byte caixaCodigo;
    private int funcionarioCodigo;
    private byte tipoRegistro;

    public CaixaHistorico() {
    }

    public int getMovimentacao() {
        return movimentacao;
    }

    public void setMovimentacao(int movimentacao) {
        this.movimentacao = movimentacao;
    }

    public int getSequencial() {
        return sequencial;
    }

    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }

    public Date getLancamento() {
        return lancamento;
    }

    public void setLancamento(Date lancamento) {
        this.lancamento = lancamento;
    }

    public int getClassificacaoCodigo() {
        return classificacaoCodigo;
    }

    public void setClassificacaoCodigo(int classificacaoCodigo) {
        this.classificacaoCodigo = classificacaoCodigo;
    }

    public float getTarifa() {
        return tarifa;
    }

    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }

    public float getValorPago() {
        return valorPago;
    }

    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }

    public float getTroco() {
        return troco;
    }

    public void setTroco(float troco) {
        this.troco = troco;
    }

    public int getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(int tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
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

    public byte getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(byte tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }
}
