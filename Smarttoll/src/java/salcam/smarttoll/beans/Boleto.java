/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.beans;

import java.util.Date;

/**
 *
 * @author Samuel
 */
public class Boleto {
    private int codigo;
    private int empresaCodigo;
    private String origemCodigo;
    private byte parcela;
    private byte contaBancaria;
    private byte carteira;
    private byte parcelas;
    private String rejeicao;
    private byte ocorrencia;
    private String documento;
    private String nossoNumero;
    private Date emissao;
    private Date vencimento;
    private Date protestar;
    private Date abatimento;
    private Date desconto;
    private Date multa;
    private Date pagamento;
    private int valorNominal;
    private int valorAbatimento;
    private int valorDesconto;
    private int valorDespesa;
    private int valorJuros;
    private int valorMulta;
    private int valorPago;
    private byte origem;
    private boolean boletoImpresso;
    private boolean remessaGerada;
    private Date alteracao;
    private byte tipoAlteracao;
    private String dupl;
    private boolean cancelado;
    private String nome;
    private String pessoa;
    private String cnpjCpf;
    private String ieRg;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;
    private String email;

    public Boleto() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getEmpresaCodigo() {
        return empresaCodigo;
    }

    public void setEmpresaCodigo(int empresaCodigo) {
        this.empresaCodigo = empresaCodigo;
    }

    public String getOrigemCodigo() {
        return origemCodigo;
    }

    public void setOrigemCodigo(String origemCodigo) {
        this.origemCodigo = origemCodigo;
    }

    public byte getParcela() {
        return parcela;
    }

    public void setParcela(byte parcela) {
        this.parcela = parcela;
    }

    public byte getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(byte contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    public byte getCarteira() {
        return carteira;
    }

    public void setCarteira(byte carteira) {
        this.carteira = carteira;
    }

    public byte getParcelas() {
        return parcelas;
    }

    public void setParcelas(byte parcelas) {
        this.parcelas = parcelas;
    }

    public String getRejeicao() {
        return rejeicao;
    }

    public void setRejeicao(String rejeicao) {
        this.rejeicao = rejeicao;
    }

    public byte getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(byte ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNossoNumero() {
        return nossoNumero;
    }

    public void setNossoNumero(String nossoNumero) {
        this.nossoNumero = nossoNumero;
    }

    public Date getEmissao() {
        return emissao;
    }

    public void setEmissao(Date emissao) {
        this.emissao = emissao;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public Date getProtestar() {
        return protestar;
    }

    public void setProtestar(Date protestar) {
        this.protestar = protestar;
    }

    public Date getAbatimento() {
        return abatimento;
    }

    public void setAbatimento(Date abatimento) {
        this.abatimento = abatimento;
    }

    public Date getDesconto() {
        return desconto;
    }

    public void setDesconto(Date desconto) {
        this.desconto = desconto;
    }

    public Date getMulta() {
        return multa;
    }

    public void setMulta(Date multa) {
        this.multa = multa;
    }

    public Date getPagamento() {
        return pagamento;
    }

    public void setPagamento(Date pagamento) {
        this.pagamento = pagamento;
    }

    public int getValorNominal() {
        return valorNominal;
    }

    public void setValorNominal(int valorNominal) {
        this.valorNominal = valorNominal;
    }

    public int getValorAbatimento() {
        return valorAbatimento;
    }

    public void setValorAbatimento(int valorAbatimento) {
        this.valorAbatimento = valorAbatimento;
    }

    public int getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(int valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public int getValorDespesa() {
        return valorDespesa;
    }

    public void setValorDespesa(int valorDespesa) {
        this.valorDespesa = valorDespesa;
    }

    public int getValorJuros() {
        return valorJuros;
    }

    public void setValorJuros(int valorJuros) {
        this.valorJuros = valorJuros;
    }

    public int getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(int valorMulta) {
        this.valorMulta = valorMulta;
    }

    public int getValorPago() {
        return valorPago;
    }

    public void setValorPago(int valorPago) {
        this.valorPago = valorPago;
    }

    public byte getOrigem() {
        return origem;
    }

    public void setOrigem(byte origem) {
        this.origem = origem;
    }

    public boolean isBoletoImpresso() {
        return boletoImpresso;
    }

    public void setBoletoImpresso(boolean boletoImpresso) {
        this.boletoImpresso = boletoImpresso;
    }

    public boolean isRemessaGerada() {
        return remessaGerada;
    }

    public void setRemessaGerada(boolean remessaGerada) {
        this.remessaGerada = remessaGerada;
    }

    public Date getAlteracao() {
        return alteracao;
    }

    public void setAlteracao(Date alteracao) {
        this.alteracao = alteracao;
    }

    public byte getTipoAlteracao() {
        return tipoAlteracao;
    }

    public void setTipoAlteracao(byte tipoAlteracao) {
        this.tipoAlteracao = tipoAlteracao;
    }

    public String getDupl() {
        return dupl;
    }

    public void setDupl(String dupl) {
        this.dupl = dupl;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
