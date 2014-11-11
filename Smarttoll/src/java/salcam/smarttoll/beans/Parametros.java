/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.beans;

import java.sql.Blob;
import java.util.Date;

/**
 *
 * @author Administrador
 */
public class Parametros {
    private int empresaCod;
    private Blob imagemPadrao;
    private byte versao;    
    private Date hoje;
    private boolean gradesPersonalizadas;
    private String chave;
    private String cabecalho;
    private String rodape;
    private String telefone;
    private String cnpj;
    private String praca;
    private Date versaoAtualizacao;
    private String sempararCaminhoTaf;
    private int sempararSequencialTaf;
    private String caminhoImagensBotoes;
    private String campoEspecieBoleto;
    private int tipoLetra;    

    public Parametros() {
    }

    public int getEmpresaCod() {
        return empresaCod;
    }

    public void setEmpresaCod(int empresaCod) {
        this.empresaCod = empresaCod;
    }

    public Blob getImagemPadrao() {
        return imagemPadrao;
    }

    public void setImagemPadrao(Blob imagemPadrao) {
        this.imagemPadrao = imagemPadrao;
    }

    public byte getVersao() {
        return versao;
    }

    public void setVersao(byte versao) {
        this.versao = versao;
    }

    public Date getHoje() {
        return hoje;
    }

    public void setHoje(Date hoje) {
        this.hoje = hoje;
    }

    public boolean isGradesPersonalizadas() {
        return gradesPersonalizadas;
    }

    public void setGradesPersonalizadas(boolean gradesPersonalizadas) {
        this.gradesPersonalizadas = gradesPersonalizadas;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getCabecalho() {
        return cabecalho;
    }

    public void setCabecalho(String cabecalho) {
        this.cabecalho = cabecalho;
    }

    public String getRodape() {
        return rodape;
    }

    public void setRodape(String rodape) {
        this.rodape = rodape;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getPraca() {
        return praca;
    }

    public void setPraca(String praca) {
        this.praca = praca;
    }

    public Date getVersaoAtualizacao() {
        return versaoAtualizacao;
    }

    public void setVersaoAtualizacao(Date versaoAtualizacao) {
        this.versaoAtualizacao = versaoAtualizacao;
    }

    public String getSempararCaminhoTaf() {
        return sempararCaminhoTaf;
    }

    public void setSempararCaminhoTaf(String sempararCaminhoTaf) {
        this.sempararCaminhoTaf = sempararCaminhoTaf;
    }

    public int getSempararSequencialTaf() {
        return sempararSequencialTaf;
    }

    public void setSempararSequencialTaf(int sempararSequencialTaf) {
        this.sempararSequencialTaf = sempararSequencialTaf;
    }

    public String getCaminhoImagensBotoes() {
        return caminhoImagensBotoes;
    }

    public void setCaminhoImagensBotoes(String caminhoImagensBotoes) {
        this.caminhoImagensBotoes = caminhoImagensBotoes;
    }

    public String getCampoEspecieBoleto() {
        return campoEspecieBoleto;
    }

    public void setCampoEspecieBoleto(String campoEspecieBoleto) {
        this.campoEspecieBoleto = campoEspecieBoleto;
    }

    public int getTipoLetra() {
        return tipoLetra;
    }

    public void setTipoLetra(int tipoLetra) {
        this.tipoLetra = tipoLetra;
    }
    
    
}
