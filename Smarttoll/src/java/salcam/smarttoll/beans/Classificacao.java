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
public class Classificacao {
    private int codigo;
    private String classificacao;
    private String descricao;
    private float tarifa;
    private byte eixos;
    private boolean situacao;
    private int eixosComercial;
    private boolean semParar;

    public Classificacao() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getTarifa() {
        return tarifa;
    }

    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }

    public byte getEixos() {
        return eixos;
    }

    public void setEixos(byte eixos) {
        this.eixos = eixos;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public int getEixosComercial() {
        return eixosComercial;
    }

    public void setEixosComercial(int eixosComercial) {
        this.eixosComercial = eixosComercial;
    }

    public boolean isSemParar() {
        return semParar;
    }

    public void setSemParar(boolean semParar) {
        this.semParar = semParar;
    }
    
    
}
