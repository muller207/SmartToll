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
public class FuncionarioGrade {
    private int funcionarioCodigo;
    private String formulario;
    private String tabela;
    private String campo;
    private String titulo;
    private boolean visivel;
    private byte posicao;
    private byte tamanho;

    public FuncionarioGrade() {
    }

    public int getFuncionarioCodigo() {
        return funcionarioCodigo;
    }

    public void setFuncionarioCodigo(int funcionarioCodigo) {
        this.funcionarioCodigo = funcionarioCodigo;
    }

    public String getFormulario() {
        return formulario;
    }

    public void setFormulario(String formulario) {
        this.formulario = formulario;
    }

    public String getTabela() {
        return tabela;
    }

    public void setTabela(String tabela) {
        this.tabela = tabela;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isVisivel() {
        return visivel;
    }

    public void setVisivel(boolean visivel) {
        this.visivel = visivel;
    }

    public byte getPosicao() {
        return posicao;
    }

    public void setPosicao(byte posicao) {
        this.posicao = posicao;
    }

    public byte getTamanho() {
        return tamanho;
    }

    public void setTamanho(byte tamanho) {
        this.tamanho = tamanho;
    }
    
    
}
