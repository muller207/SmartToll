/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.beans;

/**
 *
 * @author Administrador
 */
public class Impressora {
    private int empresaCod;
    private int impressoraCod;
    private String serial;
    private byte tipo;
    private String impressora;
    private String caminho;
    private byte situacao;
    private byte funcao;
    private boolean comunicacaoSerial;
    private byte porta;
    private byte velocidade;
    private byte paridade;
    private byte databits;
    private byte stopbits;
    private byte controleFluxo;
    private byte pooling;

    public Impressora() {
    }

    public int getEmpresaCod() {
        return empresaCod;
    }

    public void setEmpresaCod(int empresaCod) {
        this.empresaCod = empresaCod;
    }

    public int getImpressoraCod() {
        return impressoraCod;
    }

    public void setImpressoraCod(int impressoraCod) {
        this.impressoraCod = impressoraCod;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public byte getTipo() {
        return tipo;
    }

    public void setTipo(byte tipo) {
        this.tipo = tipo;
    }

    public String getImpressora() {
        return impressora;
    }

    public void setImpressora(String impressora) {
        this.impressora = impressora;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public byte getSituacao() {
        return situacao;
    }

    public void setSituacao(byte situacao) {
        this.situacao = situacao;
    }

    public byte getFuncao() {
        return funcao;
    }

    public void setFuncao(byte funcao) {
        this.funcao = funcao;
    }

    public boolean isComunicacaoSerial() {
        return comunicacaoSerial;
    }

    public void setComunicacaoSerial(boolean comunicacaoSerial) {
        this.comunicacaoSerial = comunicacaoSerial;
    }

    public byte getPorta() {
        return porta;
    }

    public void setPorta(byte porta) {
        this.porta = porta;
    }

    public byte getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(byte velocidade) {
        this.velocidade = velocidade;
    }

    public byte getParidade() {
        return paridade;
    }

    public void setParidade(byte paridade) {
        this.paridade = paridade;
    }

    public byte getDatabits() {
        return databits;
    }

    public void setDatabits(byte databits) {
        this.databits = databits;
    }

    public byte getStopbits() {
        return stopbits;
    }

    public void setStopbits(byte stopbits) {
        this.stopbits = stopbits;
    }

    public byte getControleFluxo() {
        return controleFluxo;
    }

    public void setControleFluxo(byte controleFluxo) {
        this.controleFluxo = controleFluxo;
    }

    public byte getPooling() {
        return pooling;
    }

    public void setPooling(byte pooling) {
        this.pooling = pooling;
    }
    
    
}
