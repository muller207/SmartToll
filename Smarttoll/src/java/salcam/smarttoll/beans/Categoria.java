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
public class Categoria {
    private int codigo;
    private String descricao;
    private byte qtdEixo;
    private int categoriaCgmp;
    private int classificacaoCodigo;

    public Categoria() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public byte getQtdEixo() {
        return qtdEixo;
    }

    public void setQtdEixo(byte qtdEixo) {
        this.qtdEixo = qtdEixo;
    }

    public int getCategoriaCgmp() {
        return categoriaCgmp;
    }

    public void setCategoriaCgmp(int categoriaCgmp) {
        this.categoriaCgmp = categoriaCgmp;
    }

    public int getClassificacaoCodigo() {
        return classificacaoCodigo;
    }

    public void setClassificacaoCodigo(int classificacaoCodigo) {
        this.classificacaoCodigo = classificacaoCodigo;
    }
    
    
}
