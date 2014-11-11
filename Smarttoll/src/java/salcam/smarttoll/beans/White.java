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
public class White {
    private int whiteCod;
    private String numTag;
    private String descricao;
    private boolean ativo;    

    public White() {
    }

    public int getWhiteCod() {
        return whiteCod;
    }

    public void setWhiteCod(int whiteCod) {
        this.whiteCod = whiteCod;
    }

    public String getNumTag() {
        return numTag;
    }

    public void setNumTag(String numTag) {
        this.numTag = numTag;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    
}
