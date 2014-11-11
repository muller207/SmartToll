/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.beans;

import java.sql.Blob;

/**
 *
 * @author Administrador
 */
public class Empresa {

    public Empresa() {
    }
        
    private int empresaCod;
    private String razao;
    private String fantasia;
    private String cnpj;
    private String ie;
    private String observacao;
    private String homepage;
    private Blob logo;   
    private String email;
    private String senhaEmail;
    private String loginEmail;
    private String smtp;
    private boolean autenticado;
    private String inscricaoMunicipal;

    public int getEmpresaCod() {
        return empresaCod;
    }

    public void setEmpresaCod(int empresaCod) {
        this.empresaCod = empresaCod;
    }

    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public Blob getLogo() {
        return logo;
    }

    public void setLogo(Blob logo) {
        this.logo = logo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenhaEmail() {
        return senhaEmail;
    }

    public void setSenhaEmail(String senhaEmail) {
        this.senhaEmail = senhaEmail;
    }

    public String getLoginEmail() {
        return loginEmail;
    }

    public void setLoginEmail(String loginEmail) {
        this.loginEmail = loginEmail;
    }

    public String getSmtp() {
        return smtp;
    }

    public void setSmtp(String smtp) {
        this.smtp = smtp;
    }

    public boolean isAutenticado() {
        return autenticado;
    }

    public void setAutenticado(boolean autenticado) {
        this.autenticado = autenticado;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }
    
}
