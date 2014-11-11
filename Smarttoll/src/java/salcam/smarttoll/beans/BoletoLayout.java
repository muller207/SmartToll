/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.beans;

/**
 *
 * @author Samuel
 */
public class BoletoLayout {
    private byte linha;
    private byte coluna;
    private byte tamanho;
    private String campo;
    private byte alinhamento;
    private byte tipo;
    private int sequencial;
    private byte contaBancaria;
    private int empresaCodigo;
    private byte carteira;

    public BoletoLayout() {
    }

    public byte getLinha() {
        return linha;
    }

    public void setLinha(byte linha) {
        this.linha = linha;
    }

    public byte getColuna() {
        return coluna;
    }

    public void setColuna(byte coluna) {
        this.coluna = coluna;
    }

    public byte getTamanho() {
        return tamanho;
    }

    public void setTamanho(byte tamanho) {
        this.tamanho = tamanho;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public byte getAlinhamento() {
        return alinhamento;
    }

    public void setAlinhamento(byte alinhamento) {
        this.alinhamento = alinhamento;
    }

    public byte getTipo() {
        return tipo;
    }

    public void setTipo(byte tipo) {
        this.tipo = tipo;
    }

    public int getSequencial() {
        return sequencial;
    }

    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }

    public byte getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(byte contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    public int getEmpresaCodigo() {
        return empresaCodigo;
    }

    public void setEmpresaCodigo(int empresaCodigo) {
        this.empresaCodigo = empresaCodigo;
    }

    public byte getCarteira() {
        return carteira;
    }

    public void setCarteira(byte carteira) {
        this.carteira = carteira;
    }
    
    
}
