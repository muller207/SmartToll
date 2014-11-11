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
public class RelacionamentoEmail {
    private int relacionamentoCod;
    private int sequencia;
    private String email;
    private byte situacao;
    private boolean mailing;
    private boolean nfe;    

    public RelacionamentoEmail() {
    }

    public int getRelacionamentoCod() {
        return relacionamentoCod;
    }

    public void setRelacionamentoCod(int relacionamentoCod) {
        this.relacionamentoCod = relacionamentoCod;
    }

    public int getSequencia() {
        return sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte getSituacao() {
        return situacao;
    }

    public void setSituacao(byte situacao) {
        this.situacao = situacao;
    }

    public boolean isMailing() {
        return mailing;
    }

    public void setMailing(boolean mailing) {
        this.mailing = mailing;
    }

    public boolean isNfe() {
        return nfe;
    }

    public void setNfe(boolean nfe) {
        this.nfe = nfe;
    }
    
    
}
