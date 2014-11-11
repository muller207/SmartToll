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
public class FuncionarioEndereco {
    private int funcionarioCodigo;
    private byte sequencia;
    private String logradouro;
    private int numero;
    private String cep;
    private String bairro;
    private int municipioCodigo;
    private int regiaoCodigo;
    private boolean comercial;
    private boolean cobranca;
    private boolean entrega;
    private String referencia;
    private String complemento;
    private byte titulo;

    public FuncionarioEndereco() {
    }

    public int getFuncionarioCodigo() {
        return funcionarioCodigo;
    }

    public void setFuncionarioCodigo(int funcionarioCodigo) {
        this.funcionarioCodigo = funcionarioCodigo;
    }

    public byte getSequencia() {
        return sequencia;
    }

    public void setSequencia(byte sequencia) {
        this.sequencia = sequencia;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getMunicipioCodigo() {
        return municipioCodigo;
    }

    public void setMunicipioCodigo(int municipioCodigo) {
        this.municipioCodigo = municipioCodigo;
    }

    public int getRegiaoCodigo() {
        return regiaoCodigo;
    }

    public void setRegiaoCodigo(int regiaoCodigo) {
        this.regiaoCodigo = regiaoCodigo;
    }

    public boolean isComercial() {
        return comercial;
    }

    public void setComercial(boolean comercial) {
        this.comercial = comercial;
    }

    public boolean isCobranca() {
        return cobranca;
    }

    public void setCobranca(boolean cobranca) {
        this.cobranca = cobranca;
    }

    public boolean isEntrega() {
        return entrega;
    }

    public void setEntrega(boolean entrega) {
        this.entrega = entrega;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public byte getTitulo() {
        return titulo;
    }

    public void setTitulo(byte titulo) {
        this.titulo = titulo;
    }
    
    
}
