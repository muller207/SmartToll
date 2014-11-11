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
public class RelacionamentoEndereco {
    private int relacionementoCod;
    private byte sequencia;
    private String logradouro;
    private int numero;
    private String cep;
    private String bairro;
    private int municipioCod;
    private int regiaoCod;
    private boolean comercial;
    private boolean cobranca;
    private boolean entrega;
    private String referencia;
    private String complemento;
    private byte titulo;
    private byte situacao;
    private byte ordenacao;
    private byte contatoCod;

    public RelacionamentoEndereco() {
    }

    public int getRelacionementoCod() {
        return relacionementoCod;
    }

    public void setRelacionementoCod(int relacionementoCod) {
        this.relacionementoCod = relacionementoCod;
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

    public int getMunicipioCod() {
        return municipioCod;
    }

    public void setMunicipioCod(int municipioCod) {
        this.municipioCod = municipioCod;
    }

    public int getRegiaoCod() {
        return regiaoCod;
    }

    public void setRegiaoCod(int regiaoCod) {
        this.regiaoCod = regiaoCod;
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

    public byte getSituacao() {
        return situacao;
    }

    public void setSituacao(byte situacao) {
        this.situacao = situacao;
    }

    public byte getOrdenacao() {
        return ordenacao;
    }

    public void setOrdenacao(byte ordenacao) {
        this.ordenacao = ordenacao;
    }

    public byte getContatoCod() {
        return contatoCod;
    }

    public void setContatoCod(byte contatoCod) {
        this.contatoCod = contatoCod;
    }
    
    
}
