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
 * @author Samuel
 */
public class Funcionario {

    private int funcionarioCod;
    private int empresaCod;
    private String funcionario;
    private String apelido;
    private String cpf;
    private String rg;
    private Date admissao;
    private Date demissao;
    private byte situacao;
    private String usuario;
    private String senha;
    private String senhaAdministrativa;
    private byte funcaoCodigo;
    private String horaEntrada1;
    private String horaSaida1;
    private String horaEntrada2;
    private String horaSaida2;
    private String habilitacao;
    private String categoria;
    private Date emissao;
    private Date validade;
    private String imagem;

    public Funcionario() {

    }

    public int getFuncionarioCod() {
        return funcionarioCod;
    }

    public void setFuncionarioCod(int funcionarioCod) {
        this.funcionarioCod = funcionarioCod;
    }

    public int getEmpresaCod() {
        return empresaCod;
    }

    public void setEmpresaCod(int empresaCod) {
        this.empresaCod = empresaCod;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getAdmissao() {
        return admissao;
    }

    public void setAdmissao(Date admissao) {
        this.admissao = admissao;
    }

    public Date getDemissao() {
        return demissao;
    }

    public void setDemissao(Date demissao) {
        this.demissao = demissao;
    }

    public byte getSituacao() {
        return situacao;
    }

    public void setSituacao(byte situacao) {
        this.situacao = situacao;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenhaAdministrativa() {
        return senhaAdministrativa;
    }

    public void setSenhaAdministrativa(String senhaAdministrativa) {
        this.senhaAdministrativa = senhaAdministrativa;
    }

    public byte getFuncaoCodigo() {
        return funcaoCodigo;
    }

    public void setFuncaoCodigo(byte funcaoCodigo) {
        this.funcaoCodigo = funcaoCodigo;
    }

    public String getHoraEntrada1() {
        return horaEntrada1;
    }

    public void setHoraEntrada1(String horaEntrada1) {
        this.horaEntrada1 = horaEntrada1;
    }

    public String getHoraSaida1() {
        return horaSaida1;
    }

    public void setHoraSaida1(String horaSaida1) {
        this.horaSaida1 = horaSaida1;
    }

    public String getHoraEntrada2() {
        return horaEntrada2;
    }

    public void setHoraEntrada2(String horaEntrada2) {
        this.horaEntrada2 = horaEntrada2;
    }

    public String getHoraSaida2() {
        return horaSaida2;
    }

    public void setHoraSaida2(String horaSaida2) {
        this.horaSaida2 = horaSaida2;
    }

    public String getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getEmissao() {
        return emissao;
    }

    public void setEmissao(Date emissao) {
        this.emissao = emissao;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    
}
