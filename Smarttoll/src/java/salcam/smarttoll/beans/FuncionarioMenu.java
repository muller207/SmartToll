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
public class FuncionarioMenu {
    private int funcionarioCodigo;
    private byte menuCodigo;
    private byte direito;
    private byte posicaoBarra;

    public FuncionarioMenu() {
    }

    public int getFuncionarioCodigo() {
        return funcionarioCodigo;
    }

    public void setFuncionarioCodigo(int funcionarioCodigo) {
        this.funcionarioCodigo = funcionarioCodigo;
    }

    public byte getMenuCodigo() {
        return menuCodigo;
    }

    public void setMenuCodigo(byte menuCodigo) {
        this.menuCodigo = menuCodigo;
    }

    public byte getDireito() {
        return direito;
    }

    public void setDireito(byte direito) {
        this.direito = direito;
    }

    public byte getPosicaoBarra() {
        return posicaoBarra;
    }

    public void setPosicaoBarra(byte posicaoBarra) {
        this.posicaoBarra = posicaoBarra;
    }
    
    
}
