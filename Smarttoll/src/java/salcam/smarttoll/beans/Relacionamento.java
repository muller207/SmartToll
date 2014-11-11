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
public class Relacionamento {
    private int relacionamentoCod;
    private int empresaCod;
    private char pessoa;
    private byte situacao;
    private String nome;
    private String apelido;
    private String cnpjCpf;
    private String ieRg;
    private Date dataCadastro;
    private float custo;
    private String observacao;
    private String homepage;
    private int funcionarioCod;
    private int midiaCod;
    private int seguimentoCod;
    private int categoriaCod;
    private int tipoCreditoCod;
    private boolean cliente;
    private boolean fornecedor;
    private boolean transportadora;
    private boolean insumo;
    private boolean representante;
    private boolean prestadorServico;
    private Blob imagem;
    private float porcentagemComissao;
    private float limite;
    private String inscricaoMunicipal;
    private int cnaeCod;
    private Date dataDesligamento;
    private int motivoCod;
    private boolean mostraPassagem;
    private boolean gravaPassagem;
    private boolean carta;
    private int tipoMensalidadeCod;
    private int diaMensalidade;
    private boolean cobranca;
    private boolean recebeDescritivoConvenios;
    private float comissaoVenda;
    private boolean entregouFicha;
    private boolean imprimeDescritivo;
    private String jucesp;
    private Date dataAbertura;
    private int qtdFuncionarios;
    private boolean matrizFilial;
    private int qtdFiliais;
    private int representanteCod;
    private byte prioridade;
    private int planoContaCod;
    private int paisCod;
    private boolean restricaoAdmissao;
    private boolean faturamento;
    private Date ultimaVenda;
    private Date ultimaCompra;
    private boolean mostraAutomaticoHistorico;
    private boolean contribuinteIcms;
    private byte departamentoCod;
    private String usuario;
    private String senha;
    private String senhaAdministrativa;
    private int funcaoCod;
    private Date horaEntrada1;
    private Date horaEntrada2;
    private Date horaSaida1;
    private Date horaSaida2;
    private String habilitacao;
    private String categoria;
    private Date emissaoHabilitacao;
    private Date validade;    
    private float descontoMaxPorVenda;
    private String senhaScpc;
    private String carteiraTrabalho;
    private int funcionario;
    private float reducaoBaseCalculo;    

    public Relacionamento() {
    }

    public int getRelacionamentoCod() {
        return relacionamentoCod;
    }

    public void setRelacionamentoCod(int relacionamentoCod) {
        this.relacionamentoCod = relacionamentoCod;
    }

    public int getEmpresaCod() {
        return empresaCod;
    }

    public void setEmpresaCod(int empresaCod) {
        this.empresaCod = empresaCod;
    }

    public char getPessoa() {
        return pessoa;
    }

    public void setPessoa(char pessoa) {
        this.pessoa = pessoa;
    }

    public byte getSituacao() {
        return situacao;
    }

    public void setSituacao(byte situacao) {
        this.situacao = situacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getCnpjCpf() {
        return cnpjCpf;
    }

    public void setCnpjCpf(String cnpjCpf) {
        this.cnpjCpf = cnpjCpf;
    }

    public String getIeRg() {
        return ieRg;
    }

    public void setIeRg(String ieRg) {
        this.ieRg = ieRg;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
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

    public int getFuncionarioCod() {
        return funcionarioCod;
    }

    public void setFuncionarioCod(int funcionarioCod) {
        this.funcionarioCod = funcionarioCod;
    }

    public int getMidiaCod() {
        return midiaCod;
    }

    public void setMidiaCod(int midiaCod) {
        this.midiaCod = midiaCod;
    }

    public int getSeguimentoCod() {
        return seguimentoCod;
    }

    public void setSeguimentoCod(int seguimentoCod) {
        this.seguimentoCod = seguimentoCod;
    }

    public int getCategoriaCod() {
        return categoriaCod;
    }

    public void setCategoriaCod(int categoriaCod) {
        this.categoriaCod = categoriaCod;
    }

    public int getTipoCreditoCod() {
        return tipoCreditoCod;
    }

    public void setTipoCreditoCod(int tipoCreditoCod) {
        this.tipoCreditoCod = tipoCreditoCod;
    }

    public boolean isCliente() {
        return cliente;
    }

    public void setCliente(boolean cliente) {
        this.cliente = cliente;
    }

    public boolean isFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(boolean fornecedor) {
        this.fornecedor = fornecedor;
    }

    public boolean isTransportadora() {
        return transportadora;
    }

    public void setTransportadora(boolean transportadora) {
        this.transportadora = transportadora;
    }

    public boolean isInsumo() {
        return insumo;
    }

    public void setInsumo(boolean insumo) {
        this.insumo = insumo;
    }

    public boolean isRepresentante() {
        return representante;
    }

    public void setRepresentante(boolean representante) {
        this.representante = representante;
    }

    public boolean isPrestadorServico() {
        return prestadorServico;
    }

    public void setPrestadorServico(boolean prestadorServico) {
        this.prestadorServico = prestadorServico;
    }

    public Blob getImagem() {
        return imagem;
    }

    public void setImagem(Blob imagem) {
        this.imagem = imagem;
    }

    public float getPorcentagemComissao() {
        return porcentagemComissao;
    }

    public void setPorcentagemComissao(float porcentagemComissao) {
        this.porcentagemComissao = porcentagemComissao;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public int getCnaeCod() {
        return cnaeCod;
    }

    public void setCnaeCod(int cnaeCod) {
        this.cnaeCod = cnaeCod;
    }

    public Date getDataDesligamento() {
        return dataDesligamento;
    }

    public void setDataDesligamento(Date dataDesligamento) {
        this.dataDesligamento = dataDesligamento;
    }

    public int getMotivoCod() {
        return motivoCod;
    }

    public void setMotivoCod(int motivoCod) {
        this.motivoCod = motivoCod;
    }

    public boolean isMostraPassagem() {
        return mostraPassagem;
    }

    public void setMostraPassagem(boolean mostraPassagem) {
        this.mostraPassagem = mostraPassagem;
    }

    public boolean isGravaPassagem() {
        return gravaPassagem;
    }

    public void setGravaPassagem(boolean gravaPassagem) {
        this.gravaPassagem = gravaPassagem;
    }

    public boolean isCarta() {
        return carta;
    }

    public void setCarta(boolean carta) {
        this.carta = carta;
    }

    public int getTipoMensalidadeCod() {
        return tipoMensalidadeCod;
    }

    public void setTipoMensalidadeCod(int tipoMensalidadeCod) {
        this.tipoMensalidadeCod = tipoMensalidadeCod;
    }

    public int getDiaMensalidade() {
        return diaMensalidade;
    }

    public void setDiaMensalidade(int diaMensalidade) {
        this.diaMensalidade = diaMensalidade;
    }

    public boolean isCobranca() {
        return cobranca;
    }

    public void setCobranca(boolean cobranca) {
        this.cobranca = cobranca;
    }

    public boolean isRecebeDescritivoConvenios() {
        return recebeDescritivoConvenios;
    }

    public void setRecebeDescritivoConvenios(boolean recebeDescritivoConvenios) {
        this.recebeDescritivoConvenios = recebeDescritivoConvenios;
    }

    public float getComissaoVenda() {
        return comissaoVenda;
    }

    public void setComissaoVenda(float comissaoVenda) {
        this.comissaoVenda = comissaoVenda;
    }

    public boolean isEntregouFicha() {
        return entregouFicha;
    }

    public void setEntregouFicha(boolean entregouFicha) {
        this.entregouFicha = entregouFicha;
    }

    public boolean isImprimeDescritivo() {
        return imprimeDescritivo;
    }

    public void setImprimeDescritivo(boolean imprimeDescritivo) {
        this.imprimeDescritivo = imprimeDescritivo;
    }

    public String getJucesp() {
        return jucesp;
    }

    public void setJucesp(String jucesp) {
        this.jucesp = jucesp;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public int getQtdFuncionarios() {
        return qtdFuncionarios;
    }

    public void setQtdFuncionarios(int qtdFuncionarios) {
        this.qtdFuncionarios = qtdFuncionarios;
    }

    public boolean isMatrizFilial() {
        return matrizFilial;
    }

    public void setMatrizFilial(boolean matrizFilial) {
        this.matrizFilial = matrizFilial;
    }

    public int getQtdFiliais() {
        return qtdFiliais;
    }

    public void setQtdFiliais(int qtdFiliais) {
        this.qtdFiliais = qtdFiliais;
    }

    public int getRepresentanteCod() {
        return representanteCod;
    }

    public void setRepresentanteCod(int representanteCod) {
        this.representanteCod = representanteCod;
    }

    public byte getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(byte prioridade) {
        this.prioridade = prioridade;
    }

    public int getPlanoContaCod() {
        return planoContaCod;
    }

    public void setPlanoContaCod(int planoContaCod) {
        this.planoContaCod = planoContaCod;
    }

    public int getPaisCod() {
        return paisCod;
    }

    public void setPaisCod(int paisCod) {
        this.paisCod = paisCod;
    }

    public boolean isRestricaoAdmissao() {
        return restricaoAdmissao;
    }

    public void setRestricaoAdmissao(boolean restricaoAdmissao) {
        this.restricaoAdmissao = restricaoAdmissao;
    }

    public boolean isFaturamento() {
        return faturamento;
    }

    public void setFaturamento(boolean faturamento) {
        this.faturamento = faturamento;
    }

    public Date getUltimaVenda() {
        return ultimaVenda;
    }

    public void setUltimaVenda(Date ultimaVenda) {
        this.ultimaVenda = ultimaVenda;
    }

    public Date getUltimaCompra() {
        return ultimaCompra;
    }

    public void setUltimaCompra(Date ultimaCompra) {
        this.ultimaCompra = ultimaCompra;
    }

    public boolean isMostraAutomaticoHistorico() {
        return mostraAutomaticoHistorico;
    }

    public void setMostraAutomaticoHistorico(boolean mostraAutomaticoHistorico) {
        this.mostraAutomaticoHistorico = mostraAutomaticoHistorico;
    }

    public boolean isContribuinteIcms() {
        return contribuinteIcms;
    }

    public void setContribuinteIcms(boolean contribuinteIcms) {
        this.contribuinteIcms = contribuinteIcms;
    }

    public byte getDepartamentoCod() {
        return departamentoCod;
    }

    public void setDepartamentoCod(byte departamentoCod) {
        this.departamentoCod = departamentoCod;
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

    public int getFuncaoCod() {
        return funcaoCod;
    }

    public void setFuncaoCod(int funcaoCod) {
        this.funcaoCod = funcaoCod;
    }

    public Date getHoraEntrada1() {
        return horaEntrada1;
    }

    public void setHoraEntrada1(Date horaEntrada1) {
        this.horaEntrada1 = horaEntrada1;
    }

    public Date getHoraEntrada2() {
        return horaEntrada2;
    }

    public void setHoraEntrada2(Date horaEntrada2) {
        this.horaEntrada2 = horaEntrada2;
    }

    public Date getHoraSaida1() {
        return horaSaida1;
    }

    public void setHoraSaida1(Date horaSaida1) {
        this.horaSaida1 = horaSaida1;
    }

    public Date getHoraSaida2() {
        return horaSaida2;
    }

    public void setHoraSaida2(Date horaSaida2) {
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

    public Date getEmissaoHabilitacao() {
        return emissaoHabilitacao;
    }

    public void setEmissaoHabilitacao(Date emissaoHabilitacao) {
        this.emissaoHabilitacao = emissaoHabilitacao;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public float getDescontoMaxPorVenda() {
        return descontoMaxPorVenda;
    }

    public void setDescontoMaxPorVenda(float descontoMaxPorVenda) {
        this.descontoMaxPorVenda = descontoMaxPorVenda;
    }

    public String getSenhaScpc() {
        return senhaScpc;
    }

    public void setSenhaScpc(String senhaScpc) {
        this.senhaScpc = senhaScpc;
    }

    public String getCarteiraTrabalho() {
        return carteiraTrabalho;
    }

    public void setCarteiraTrabalho(String carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
    }

    public int getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(int funcionario) {
        this.funcionario = funcionario;
    }

    public float getReducaoBaseCalculo() {
        return reducaoBaseCalculo;
    }

    public void setReducaoBaseCalculo(float reducaoBaseCalculo) {
        this.reducaoBaseCalculo = reducaoBaseCalculo;
    }
    
    
}
