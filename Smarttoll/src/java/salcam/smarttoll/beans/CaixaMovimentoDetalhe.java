/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.beans;

import java.sql.Blob;
import java.util.Date;

/**
 *
 * @author Administrador
 */
public class CaixaMovimentoDetalhe {
    private int caixasMovimentosDetalhesCod;
    private int caixasMovimentosCod;
    private String recibo;
    private int classificacaoCod;
    private int tipoPagamentoCod;
    private float tarifa;
    private float valorPago;
    private float troco;
    private int eixosClassicacao;
    private int eixosSensor;
    private int sequencial;
    private Date lancamento;
    private int caixaCodigo;
    private int eixosComercialClassificacao;
    private int eixosComercialSensor;
    private Blob imagemLateral;
    private String placa;
    private int trnSeqReg;
    private String trnIdPaisEmissor;
    private String trnIdEmissorTag;
    private String trnNumTag;
    private Date trnDataHora;
    private String trnPraca;
    private String trnPista;
    private String trnCatTag;
    private String trnCatDac;
    private String trnCatCobrada;
    private float trnValorPass;
    private String  trnStatusCobranca;
    private String trnStatusPass;
    private String trnFlagBateria;
    private String trnFlagViolacao;
    private int trnSeqTransacao;
    private String trnPlacaTag;
    private String trnCodPaisAnt;
    private String trnCodConcAnt;
    private String trnPracaAnt;
    private String trnPistaAnt;
    private Date trnDataHoraAnt;
    private String trnMotivoImagem;
    private String trnImgLat1;
    private String trnImgLat2;
    private String trnImgFrontal;
    private boolean trnCorrigido;
    private int trnCorrigidoGeral;
    private Blob imagemFrontal;
    private Blob imagemLateral2;
    private Blob imagemTraseira;

    public CaixaMovimentoDetalhe() {
    }

    public int getCaixasMovimentosDetalhesCod() {
        return caixasMovimentosDetalhesCod;
    }

    public void setCaixasMovimentosDetalhesCod(int caixasMovimentosDetalhesCod) {
        this.caixasMovimentosDetalhesCod = caixasMovimentosDetalhesCod;
    }

    public int getCaixasMovimentosCod() {
        return caixasMovimentosCod;
    }

    public void setCaixasMovimentosCod(int caixasMovimentosCod) {
        this.caixasMovimentosCod = caixasMovimentosCod;
    }

    public String getRecibo() {
        return recibo;
    }

    public void setRecibo(String recibo) {
        this.recibo = recibo;
    }

    public int getClassificacaoCod() {
        return classificacaoCod;
    }

    public void setClassificacaoCod(int classificacaoCod) {
        this.classificacaoCod = classificacaoCod;
    }

    public int getTipoPagamentoCod() {
        return tipoPagamentoCod;
    }

    public void setTipoPagamentoCod(int tipoPagamentoCod) {
        this.tipoPagamentoCod = tipoPagamentoCod;
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

    public int getEixosClassicacao() {
        return eixosClassicacao;
    }

    public void setEixosClassicacao(int eixosClassicacao) {
        this.eixosClassicacao = eixosClassicacao;
    }

    public int getEixosSensor() {
        return eixosSensor;
    }

    public void setEixosSensor(int eixosSensor) {
        this.eixosSensor = eixosSensor;
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

    public int getCaixaCodigo() {
        return caixaCodigo;
    }

    public void setCaixaCodigo(int caixaCodigo) {
        this.caixaCodigo = caixaCodigo;
    }

    public int getEixosComercialClassificacao() {
        return eixosComercialClassificacao;
    }

    public void setEixosComercialClassificacao(int eixosComercialClassificacao) {
        this.eixosComercialClassificacao = eixosComercialClassificacao;
    }

    public int getEixosComercialSensor() {
        return eixosComercialSensor;
    }

    public void setEixosComercialSensor(int eixosComercialSensor) {
        this.eixosComercialSensor = eixosComercialSensor;
    }

    public Blob getImagemLateral() {
        return imagemLateral;
    }

    public void setImagemLateral(Blob imagemLateral) {
        this.imagemLateral = imagemLateral;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getTrnSeqReg() {
        return trnSeqReg;
    }

    public void setTrnSeqReg(int trnSeqReg) {
        this.trnSeqReg = trnSeqReg;
    }

    public String getTrnIdPaisEmissor() {
        return trnIdPaisEmissor;
    }

    public void setTrnIdPaisEmissor(String trnIdPaisEmissor) {
        this.trnIdPaisEmissor = trnIdPaisEmissor;
    }

    public String getTrnIdEmissorTag() {
        return trnIdEmissorTag;
    }

    public void setTrnIdEmissorTag(String trnIdEmissorTag) {
        this.trnIdEmissorTag = trnIdEmissorTag;
    }

    public String getTrnNumTag() {
        return trnNumTag;
    }

    public void setTrnNumTag(String trnNumTag) {
        this.trnNumTag = trnNumTag;
    }

    public Date getTrnDataHora() {
        return trnDataHora;
    }

    public void setTrnDataHora(Date trnDataHora) {
        this.trnDataHora = trnDataHora;
    }

    public String getTrnPraca() {
        return trnPraca;
    }

    public void setTrnPraca(String trnPraca) {
        this.trnPraca = trnPraca;
    }

    public String getTrnPista() {
        return trnPista;
    }

    public void setTrnPista(String trnPista) {
        this.trnPista = trnPista;
    }

    public String getTrnCatTag() {
        return trnCatTag;
    }

    public void setTrnCatTag(String trnCatTag) {
        this.trnCatTag = trnCatTag;
    }

    public String getTrnCatDac() {
        return trnCatDac;
    }

    public void setTrnCatDac(String trnCatDac) {
        this.trnCatDac = trnCatDac;
    }

    public String getTrnCatCobrada() {
        return trnCatCobrada;
    }

    public void setTrnCatCobrada(String trnCatCobrada) {
        this.trnCatCobrada = trnCatCobrada;
    }

    public float getTrnValorPass() {
        return trnValorPass;
    }

    public void setTrnValorPass(float trnValorPass) {
        this.trnValorPass = trnValorPass;
    }

    public String getTrnStatusCobranca() {
        return trnStatusCobranca;
    }

    public void setTrnStatusCobranca(String trnStatusCobranca) {
        this.trnStatusCobranca = trnStatusCobranca;
    }

    public String getTrnStatusPass() {
        return trnStatusPass;
    }

    public void setTrnStatusPass(String trnStatusPass) {
        this.trnStatusPass = trnStatusPass;
    }

    public String getTrnFlagBateria() {
        return trnFlagBateria;
    }

    public void setTrnFlagBateria(String trnFlagBateria) {
        this.trnFlagBateria = trnFlagBateria;
    }

    public String getTrnFlagViolacao() {
        return trnFlagViolacao;
    }

    public void setTrnFlagViolacao(String trnFlagViolacao) {
        this.trnFlagViolacao = trnFlagViolacao;
    }

    public int getTrnSeqTransacao() {
        return trnSeqTransacao;
    }

    public void setTrnSeqTransacao(int trnSeqTransacao) {
        this.trnSeqTransacao = trnSeqTransacao;
    }

    public String getTrnPlacaTag() {
        return trnPlacaTag;
    }

    public void setTrnPlacaTag(String trnPlacaTag) {
        this.trnPlacaTag = trnPlacaTag;
    }

    public String getTrnCodPaisAnt() {
        return trnCodPaisAnt;
    }

    public void setTrnCodPaisAnt(String trnCodPaisAnt) {
        this.trnCodPaisAnt = trnCodPaisAnt;
    }

    public String getTrnCodConcAnt() {
        return trnCodConcAnt;
    }

    public void setTrnCodConcAnt(String trnCodConcAnt) {
        this.trnCodConcAnt = trnCodConcAnt;
    }

    public String getTrnPracaAnt() {
        return trnPracaAnt;
    }

    public void setTrnPracaAnt(String trnPracaAnt) {
        this.trnPracaAnt = trnPracaAnt;
    }

    public String getTrnPistaAnt() {
        return trnPistaAnt;
    }

    public void setTrnPistaAnt(String trnPistaAnt) {
        this.trnPistaAnt = trnPistaAnt;
    }

    public Date getTrnDataHoraAnt() {
        return trnDataHoraAnt;
    }

    public void setTrnDataHoraAnt(Date trnDataHoraAnt) {
        this.trnDataHoraAnt = trnDataHoraAnt;
    }

    public String getTrnMotivoImagem() {
        return trnMotivoImagem;
    }

    public void setTrnMotivoImagem(String trnMotivoImagem) {
        this.trnMotivoImagem = trnMotivoImagem;
    }

    public String getTrnImgLat1() {
        return trnImgLat1;
    }

    public void setTrnImgLat1(String trnImgLat1) {
        this.trnImgLat1 = trnImgLat1;
    }

    public String getTrnImgLat2() {
        return trnImgLat2;
    }

    public void setTrnImgLat2(String trnImgLat2) {
        this.trnImgLat2 = trnImgLat2;
    }

    public String getTrnImgFrontal() {
        return trnImgFrontal;
    }

    public void setTrnImgFrontal(String trnImgFrontal) {
        this.trnImgFrontal = trnImgFrontal;
    }

    public boolean isTrnCorrigido() {
        return trnCorrigido;
    }

    public void setTrnCorrigido(boolean trnCorrigido) {
        this.trnCorrigido = trnCorrigido;
    }

    public int getTrnCorrigidoGeral() {
        return trnCorrigidoGeral;
    }

    public void setTrnCorrigidoGeral(int trnCorrigidoGeral) {
        this.trnCorrigidoGeral = trnCorrigidoGeral;
    }

    public Blob getImagemFrontal() {
        return imagemFrontal;
    }

    public void setImagemFrontal(Blob imagemFrontal) {
        this.imagemFrontal = imagemFrontal;
    }

    public Blob getImagemLateral2() {
        return imagemLateral2;
    }

    public void setImagemLateral2(Blob imagemLateral2) {
        this.imagemLateral2 = imagemLateral2;
    }

    public Blob getImagemTraseira() {
        return imagemTraseira;
    }

    public void setImagemTraseira(Blob imagemTraseira) {
        this.imagemTraseira = imagemTraseira;
    }
        
}
