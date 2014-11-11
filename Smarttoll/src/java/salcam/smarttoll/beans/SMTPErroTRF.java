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
public class SMTPErroTRF {
    private int caixasMovimentosCod;
    private int caixaCod;
    private int trnSeqRegErro;
    private int caixasMovimentosDetalhesCod;
    private int erro;
    private boolean trnGerado;
    private int trnSeqReg;    

    public SMTPErroTRF() {
    }

    public int getCaixasMovimentosCod() {
        return caixasMovimentosCod;
    }

    public void setCaixasMovimentosCod(int caixasMovimentosCod) {
        this.caixasMovimentosCod = caixasMovimentosCod;
    }

    public int getCaixaCod() {
        return caixaCod;
    }

    public void setCaixaCod(int caixaCod) {
        this.caixaCod = caixaCod;
    }

    public int getTrnSeqRegErro() {
        return trnSeqRegErro;
    }

    public void setTrnSeqRegErro(int trnSeqRegErro) {
        this.trnSeqRegErro = trnSeqRegErro;
    }

    public int getCaixasMovimentosDetalhesCod() {
        return caixasMovimentosDetalhesCod;
    }

    public void setCaixasMovimentosDetalhesCod(int caixasMovimentosDetalhesCod) {
        this.caixasMovimentosDetalhesCod = caixasMovimentosDetalhesCod;
    }

    public int getErro() {
        return erro;
    }

    public void setErro(int erro) {
        this.erro = erro;
    }

    public boolean isTrnGerado() {
        return trnGerado;
    }

    public void setTrnGerado(boolean trnGerado) {
        this.trnGerado = trnGerado;
    }

    public int getTrnSeqReg() {
        return trnSeqReg;
    }

    public void setTrnSeqReg(int trnSeqReg) {
        this.trnSeqReg = trnSeqReg;
    }
    
    
}
