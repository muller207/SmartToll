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
public class Tag {
    private String idPaisEmissor;
    private String idEmissorTag;
    private String numTag;
    private String placa;
    private String cat;
    private String diaPgto;
    private String meioPgto;
    private String formaPgto;    

    public Tag() {
    }

    public String getIdPaisEmissor() {
        return idPaisEmissor;
    }

    public void setIdPaisEmissor(String idPaisEmissor) {
        this.idPaisEmissor = idPaisEmissor;
    }

    public String getIdEmissorTag() {
        return idEmissorTag;
    }

    public void setIdEmissorTag(String idEmissorTag) {
        this.idEmissorTag = idEmissorTag;
    }

    public String getNumTag() {
        return numTag;
    }

    public void setNumTag(String numTag) {
        this.numTag = numTag;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getDiaPgto() {
        return diaPgto;
    }

    public void setDiaPgto(String diaPgto) {
        this.diaPgto = diaPgto;
    }

    public String getMeioPgto() {
        return meioPgto;
    }

    public void setMeioPgto(String meioPgto) {
        this.meioPgto = meioPgto;
    }

    public String getFormaPgto() {
        return formaPgto;
    }

    public void setFormaPgto(String formaPgto) {
        this.formaPgto = formaPgto;
    }
    
    
}
