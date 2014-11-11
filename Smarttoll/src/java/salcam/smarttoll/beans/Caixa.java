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
public class Caixa {
    
    private int caixaCod;
    private String serial;
    private boolean situacao;
    private int semPararPraca;
    private int sequencialArquivoNela;
    private int sequencialArquivoTag;
    private String ip;
    private int tipo;

    public int getCaixaCod() {
        return caixaCod;
    }

    public void setCaixaCod(int caixaCod) {
        this.caixaCod = caixaCod;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public int getSemPararPraca() {
        return semPararPraca;
    }

    public void setSemPararPraca(int semPararPraca) {
        this.semPararPraca = semPararPraca;
    }

    public int getSequencialArquivoNela() {
        return sequencialArquivoNela;
    }

    public void setSequencialArquivoNela(int sequencialArquivoNela) {
        this.sequencialArquivoNela = sequencialArquivoNela;
    }

    public int getSequencialArquivoTag() {
        return sequencialArquivoTag;
    }

    public void setSequencialArquivoTag(int sequencialArquivoTag) {
        this.sequencialArquivoTag = sequencialArquivoTag;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
    
}
