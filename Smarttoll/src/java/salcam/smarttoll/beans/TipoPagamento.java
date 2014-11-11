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
public class TipoPagamento {
    private int tipoPagamentoCod;
    private String tipoPagamento;
    private String avista;
    private String aprazo;    

    public TipoPagamento() {
    }

    public int getTipoPagamentoCod() {
        return tipoPagamentoCod;
    }

    public void setTipoPagamentoCod(int tipoPagamentoCod) {
        this.tipoPagamentoCod = tipoPagamentoCod;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getAvista() {
        return avista;
    }

    public void setAvista(String avista) {
        this.avista = avista;
    }

    public String getAprazo() {
        return aprazo;
    }

    public void setAprazo(String aprazo) {
        this.aprazo = aprazo;
    }
    
    
}
