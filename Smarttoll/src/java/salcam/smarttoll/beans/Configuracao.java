/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.beans;

import java.util.Date;

/**
 *
 * @author Administrador
 */
public class Configuracao {
    private int caixaCod;
    private String serial;
    private int movimentacao;
    private boolean aberto;
    private int sequencial;
    private Date dataAbertura;
    private int funcionarioCod;
    private int caixaNumero;
    private String portaImpressora;
    private boolean sincronizaComServidor;
    private boolean registraImagemLateral;
    private String caminhoImagemLateral;
    private byte cameraLateralDevice;
    private byte cameraLateralInput;
    private boolean registraImagemFrontal;
    private String caminhoImagemFrontal;
    private byte cameraFrontalDevice;
    private byte cameraFrontalInput;
    private int tipoImpressora;
    private boolean tirarFotosServidor;
    private String caminhoDigitalMorador;
    private String caminhoDigitalServidor;
    private boolean imprimeReciboMorador;
    private boolean cameraIp;
    private String cameraIpLateral;
    private String cameraIpFrontal;
    private boolean biometriaDigital;
    private boolean sistemaSemParar;
    private String portaSemParar;
    private int semPararStp;
    private int semPararPista;
    private boolean semPararReconhecimento;
    private int semPararPraca;
    private int semPararAntena;
    private int semPararTimeOut;
    private int semPararTipo;
    private int semPararPais;
    private String semPararCaminhoPrn;
    private int semPararSequencialTrn;
    private String semPararConcId;
    private String semPararConcPaisId;
    private String semPararCaminhoTag;
    private int semPararSequencialTag;
    private String semPararCaminhoNel;
    private int semPararSequencialNel;
    private int semPararOperacaoSistema;
    private String semPararCaminhoImagens;
    private String semPararCaminhoTgt;
    private int semPararSequencialTgt;
    private String semPararCaminhoLnt;
    private int semPararSequencialLnt;
    private boolean imprimirReciboIsento;
    private boolean mensagemImpressaoIsento;
    private boolean informaFechamento;
    private boolean imprimeFechamento;
    private String caminhoImagensBotoes;
    private String ipServidor;
    private int portaServidor;
    private boolean comunicaUdp;
    private String semPararCaminhoTrt;
    private int semPararSequencialTrt;
    private String semPararCaminhoTrf;
    private String semPararDestinoTrf;
    private boolean bloqueioManual;
    private String leitorCartao;
    private String caminhoImagemLateral2;
    private String caminhoImagemTraseira;
    private boolean registraImagemLateral2;
    private boolean registraImagemTraseira;
    private byte cameraLateral2Device;
    private byte cameraLateral2Input;
    private byte cameraTraseiraDevice;
    private byte cameraTraseiraInput;
    private String cameraIpLateral2;
    private String cameraIpTraseira;
    private boolean placa;
    private boolean nome;
    private boolean rg;
    private boolean cpf;
    private String outro;    
    private String enderecoLateral;
    private String usuarioLateral;
    private String senhaLateral;
    private String enderecoLatera2;
    private String usuarioLateral2;
    private String senhaLateral2;
    private String enderecoFrontal;
    private String usuarioFrontal;
    private String senhaFrontal;
    private String enderecoTraseira;
    private String usuarioTraseira;
    private String senhaTraseira;
    private boolean nroFotosLateral;
    private boolean nroFotosLateral2;
    private boolean nroFotosFrontal;
    private boolean nroFotosTraseira;

    public Configuracao() {
    }

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

    public int getMovimentacao() {
        return movimentacao;
    }

    public void setMovimentacao(int movimentacao) {
        this.movimentacao = movimentacao;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public int getSequencial() {
        return sequencial;
    }

    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public int getFuncionarioCod() {
        return funcionarioCod;
    }

    public void setFuncionarioCod(int funcionarioCod) {
        this.funcionarioCod = funcionarioCod;
    }

    public int getCaixaNumero() {
        return caixaNumero;
    }

    public void setCaixaNumero(int caixaNumero) {
        this.caixaNumero = caixaNumero;
    }

    public String getPortaImpressora() {
        return portaImpressora;
    }

    public void setPortaImpressora(String portaImpressora) {
        this.portaImpressora = portaImpressora;
    }

    public boolean isSincronizaComServidor() {
        return sincronizaComServidor;
    }

    public void setSincronizaComServidor(boolean sincronizaComServidor) {
        this.sincronizaComServidor = sincronizaComServidor;
    }

    public boolean isRegistraImagemLateral() {
        return registraImagemLateral;
    }

    public void setRegistraImagemLateral(boolean registraImagemLateral) {
        this.registraImagemLateral = registraImagemLateral;
    }

    public String getCaminhoImagemLateral() {
        return caminhoImagemLateral;
    }

    public void setCaminhoImagemLateral(String caminhoImagemLateral) {
        this.caminhoImagemLateral = caminhoImagemLateral;
    }

    public byte getCameraLateralDevice() {
        return cameraLateralDevice;
    }

    public void setCameraLateralDevice(byte cameraLateralDevice) {
        this.cameraLateralDevice = cameraLateralDevice;
    }

    public byte getCameraLateralInput() {
        return cameraLateralInput;
    }

    public void setCameraLateralInput(byte cameraLateralInput) {
        this.cameraLateralInput = cameraLateralInput;
    }

    public boolean isRegistraImagemFrontal() {
        return registraImagemFrontal;
    }

    public void setRegistraImagemFrontal(boolean registraImagemFrontal) {
        this.registraImagemFrontal = registraImagemFrontal;
    }

    public String getCaminhoImagemFrontal() {
        return caminhoImagemFrontal;
    }

    public void setCaminhoImagemFrontal(String caminhoImagemFrontal) {
        this.caminhoImagemFrontal = caminhoImagemFrontal;
    }

    public byte getCameraFrontalDevice() {
        return cameraFrontalDevice;
    }

    public void setCameraFrontalDevice(byte cameraFrontalDevice) {
        this.cameraFrontalDevice = cameraFrontalDevice;
    }

    public byte getCameraFrontalInput() {
        return cameraFrontalInput;
    }

    public void setCameraFrontalInput(byte cameraFrontalInput) {
        this.cameraFrontalInput = cameraFrontalInput;
    }

    public int getTipoImpressora() {
        return tipoImpressora;
    }

    public void setTipoImpressora(int tipoImpressora) {
        this.tipoImpressora = tipoImpressora;
    }

    public boolean isTirarFotosServidor() {
        return tirarFotosServidor;
    }

    public void setTirarFotosServidor(boolean tirarFotosServidor) {
        this.tirarFotosServidor = tirarFotosServidor;
    }

    public String getCaminhoDigitalMorador() {
        return caminhoDigitalMorador;
    }

    public void setCaminhoDigitalMorador(String caminhoDigitalMorador) {
        this.caminhoDigitalMorador = caminhoDigitalMorador;
    }

    public String getCaminhoDigitalServidor() {
        return caminhoDigitalServidor;
    }

    public void setCaminhoDigitalServidor(String caminhoDigitalServidor) {
        this.caminhoDigitalServidor = caminhoDigitalServidor;
    }

    public boolean isImprimeReciboMorador() {
        return imprimeReciboMorador;
    }

    public void setImprimeReciboMorador(boolean imprimeReciboMorador) {
        this.imprimeReciboMorador = imprimeReciboMorador;
    }

    public boolean isCameraIp() {
        return cameraIp;
    }

    public void setCameraIp(boolean cameraIp) {
        this.cameraIp = cameraIp;
    }

    public String getCameraIpLateral() {
        return cameraIpLateral;
    }

    public void setCameraIpLateral(String cameraIpLateral) {
        this.cameraIpLateral = cameraIpLateral;
    }

    public String getCameraIpFrontal() {
        return cameraIpFrontal;
    }

    public void setCameraIpFrontal(String cameraIpFrontal) {
        this.cameraIpFrontal = cameraIpFrontal;
    }

    public boolean isBiometriaDigital() {
        return biometriaDigital;
    }

    public void setBiometriaDigital(boolean biometriaDigital) {
        this.biometriaDigital = biometriaDigital;
    }

    public boolean isSistemaSemParar() {
        return sistemaSemParar;
    }

    public void setSistemaSemParar(boolean sistemaSemParar) {
        this.sistemaSemParar = sistemaSemParar;
    }

    public String getPortaSemParar() {
        return portaSemParar;
    }

    public void setPortaSemParar(String portaSemParar) {
        this.portaSemParar = portaSemParar;
    }

    public int getSemPararStp() {
        return semPararStp;
    }

    public void setSemPararStp(int semPararStp) {
        this.semPararStp = semPararStp;
    }

    public int getSemPararPista() {
        return semPararPista;
    }

    public void setSemPararPista(int semPararPista) {
        this.semPararPista = semPararPista;
    }

    public boolean isSemPararReconhecimento() {
        return semPararReconhecimento;
    }

    public void setSemPararReconhecimento(boolean semPararReconhecimento) {
        this.semPararReconhecimento = semPararReconhecimento;
    }

    public int getSemPararPraca() {
        return semPararPraca;
    }

    public void setSemPararPraca(int semPararPraca) {
        this.semPararPraca = semPararPraca;
    }

    public int getSemPararAntena() {
        return semPararAntena;
    }

    public void setSemPararAntena(int semPararAntena) {
        this.semPararAntena = semPararAntena;
    }

    public int getSemPararTimeOut() {
        return semPararTimeOut;
    }

    public void setSemPararTimeOut(int semPararTimeOut) {
        this.semPararTimeOut = semPararTimeOut;
    }

    public int getSemPararTipo() {
        return semPararTipo;
    }

    public void setSemPararTipo(int semPararTipo) {
        this.semPararTipo = semPararTipo;
    }

    public int getSemPararPais() {
        return semPararPais;
    }

    public void setSemPararPais(int semPararPais) {
        this.semPararPais = semPararPais;
    }

    public String getSemPararCaminhoPrn() {
        return semPararCaminhoPrn;
    }

    public void setSemPararCaminhoPrn(String semPararCaminhoPrn) {
        this.semPararCaminhoPrn = semPararCaminhoPrn;
    }

    public int getSemPararSequencialTrn() {
        return semPararSequencialTrn;
    }

    public void setSemPararSequencialTrn(int semPararSequencialTrn) {
        this.semPararSequencialTrn = semPararSequencialTrn;
    }

    public String getSemPararConcId() {
        return semPararConcId;
    }

    public void setSemPararConcId(String semPararConcId) {
        this.semPararConcId = semPararConcId;
    }

    public String getSemPararConcPaisId() {
        return semPararConcPaisId;
    }

    public void setSemPararConcPaisId(String semPararConcPaisId) {
        this.semPararConcPaisId = semPararConcPaisId;
    }

    public String getSemPararCaminhoTag() {
        return semPararCaminhoTag;
    }

    public void setSemPararCaminhoTag(String semPararCaminhoTag) {
        this.semPararCaminhoTag = semPararCaminhoTag;
    }

    public int getSemPararSequencialTag() {
        return semPararSequencialTag;
    }

    public void setSemPararSequencialTag(int semPararSequencialTag) {
        this.semPararSequencialTag = semPararSequencialTag;
    }

    public String getSemPararCaminhoNel() {
        return semPararCaminhoNel;
    }

    public void setSemPararCaminhoNel(String semPararCaminhoNel) {
        this.semPararCaminhoNel = semPararCaminhoNel;
    }

    public int getSemPararSequencialNel() {
        return semPararSequencialNel;
    }

    public void setSemPararSequencialNel(int semPararSequencialNel) {
        this.semPararSequencialNel = semPararSequencialNel;
    }

    public int getSemPararOperacaoSistema() {
        return semPararOperacaoSistema;
    }

    public void setSemPararOperacaoSistema(int semPararOperacaoSistema) {
        this.semPararOperacaoSistema = semPararOperacaoSistema;
    }

    public String getSemPararCaminhoImagens() {
        return semPararCaminhoImagens;
    }

    public void setSemPararCaminhoImagens(String semPararCaminhoImagens) {
        this.semPararCaminhoImagens = semPararCaminhoImagens;
    }

    public String getSemPararCaminhoTgt() {
        return semPararCaminhoTgt;
    }

    public void setSemPararCaminhoTgt(String semPararCaminhoTgt) {
        this.semPararCaminhoTgt = semPararCaminhoTgt;
    }

    public int getSemPararSequencialTgt() {
        return semPararSequencialTgt;
    }

    public void setSemPararSequencialTgt(int semPararSequencialTgt) {
        this.semPararSequencialTgt = semPararSequencialTgt;
    }

    public String getSemPararCaminhoLnt() {
        return semPararCaminhoLnt;
    }

    public void setSemPararCaminhoLnt(String semPararCaminhoLnt) {
        this.semPararCaminhoLnt = semPararCaminhoLnt;
    }

    public int getSemPararSequencialLnt() {
        return semPararSequencialLnt;
    }

    public void setSemPararSequencialLnt(int semPararSequencialLnt) {
        this.semPararSequencialLnt = semPararSequencialLnt;
    }

    public boolean isImprimirReciboIsento() {
        return imprimirReciboIsento;
    }

    public void setImprimirReciboIsento(boolean imprimirReciboIsento) {
        this.imprimirReciboIsento = imprimirReciboIsento;
    }

    public boolean isMensagemImpressaoIsento() {
        return mensagemImpressaoIsento;
    }

    public void setMensagemImpressaoIsento(boolean mensagemImpressaoIsento) {
        this.mensagemImpressaoIsento = mensagemImpressaoIsento;
    }

    public boolean isInformaFechamento() {
        return informaFechamento;
    }

    public void setInformaFechamento(boolean informaFechamento) {
        this.informaFechamento = informaFechamento;
    }

    public boolean isImprimeFechamento() {
        return imprimeFechamento;
    }

    public void setImprimeFechamento(boolean imprimeFechamento) {
        this.imprimeFechamento = imprimeFechamento;
    }

    public String getCaminhoImagensBotoes() {
        return caminhoImagensBotoes;
    }

    public void setCaminhoImagensBotoes(String caminhoImagensBotoes) {
        this.caminhoImagensBotoes = caminhoImagensBotoes;
    }

    public String getIpServidor() {
        return ipServidor;
    }

    public void setIpServidor(String ipServidor) {
        this.ipServidor = ipServidor;
    }

    public int getPortaServidor() {
        return portaServidor;
    }

    public void setPortaServidor(int portaServidor) {
        this.portaServidor = portaServidor;
    }

    public boolean isComunicaUdp() {
        return comunicaUdp;
    }

    public void setComunicaUdp(boolean comunicaUdp) {
        this.comunicaUdp = comunicaUdp;
    }

    public String getSemPararCaminhoTrt() {
        return semPararCaminhoTrt;
    }

    public void setSemPararCaminhoTrt(String semPararCaminhoTrt) {
        this.semPararCaminhoTrt = semPararCaminhoTrt;
    }

    public int getSemPararSequencialTrt() {
        return semPararSequencialTrt;
    }

    public void setSemPararSequencialTrt(int semPararSequencialTrt) {
        this.semPararSequencialTrt = semPararSequencialTrt;
    }

    public String getSemPararCaminhoTrf() {
        return semPararCaminhoTrf;
    }

    public void setSemPararCaminhoTrf(String semPararCaminhoTrf) {
        this.semPararCaminhoTrf = semPararCaminhoTrf;
    }

    public String getSemPararDestinoTrf() {
        return semPararDestinoTrf;
    }

    public void setSemPararDestinoTrf(String semPararDestinoTrf) {
        this.semPararDestinoTrf = semPararDestinoTrf;
    }

    public boolean isBloqueioManual() {
        return bloqueioManual;
    }

    public void setBloqueioManual(boolean bloqueioManual) {
        this.bloqueioManual = bloqueioManual;
    }

    public String getLeitorCartao() {
        return leitorCartao;
    }

    public void setLeitorCartao(String leitorCartao) {
        this.leitorCartao = leitorCartao;
    }

    public String getCaminhoImagemLateral2() {
        return caminhoImagemLateral2;
    }

    public void setCaminhoImagemLateral2(String caminhoImagemLateral2) {
        this.caminhoImagemLateral2 = caminhoImagemLateral2;
    }

    public String getCaminhoImagemTraseira() {
        return caminhoImagemTraseira;
    }

    public void setCaminhoImagemTraseira(String caminhoImagemTraseira) {
        this.caminhoImagemTraseira = caminhoImagemTraseira;
    }

    public boolean isRegistraImagemLateral2() {
        return registraImagemLateral2;
    }

    public void setRegistraImagemLateral2(boolean registraImagemLateral2) {
        this.registraImagemLateral2 = registraImagemLateral2;
    }

    public boolean isRegistraImagemTraseira() {
        return registraImagemTraseira;
    }

    public void setRegistraImagemTraseira(boolean registraImagemTraseira) {
        this.registraImagemTraseira = registraImagemTraseira;
    }

    public byte getCameraLateral2Device() {
        return cameraLateral2Device;
    }

    public void setCameraLateral2Device(byte cameraLateral2Device) {
        this.cameraLateral2Device = cameraLateral2Device;
    }

    public byte getCameraLateral2Input() {
        return cameraLateral2Input;
    }

    public void setCameraLateral2Input(byte cameraLateral2Input) {
        this.cameraLateral2Input = cameraLateral2Input;
    }

    public byte getCameraTraseiraDevice() {
        return cameraTraseiraDevice;
    }

    public void setCameraTraseiraDevice(byte cameraTraseiraDevice) {
        this.cameraTraseiraDevice = cameraTraseiraDevice;
    }

    public byte getCameraTraseiraInput() {
        return cameraTraseiraInput;
    }

    public void setCameraTraseiraInput(byte cameraTraseiraInput) {
        this.cameraTraseiraInput = cameraTraseiraInput;
    }

    public String getCameraIpLateral2() {
        return cameraIpLateral2;
    }

    public void setCameraIpLateral2(String cameraIpLateral2) {
        this.cameraIpLateral2 = cameraIpLateral2;
    }

    public String getCameraIpTraseira() {
        return cameraIpTraseira;
    }

    public void setCameraIpTraseira(String cameraIpTraseira) {
        this.cameraIpTraseira = cameraIpTraseira;
    }

    public boolean isPlaca() {
        return placa;
    }

    public void setPlaca(boolean placa) {
        this.placa = placa;
    }

    public boolean isNome() {
        return nome;
    }

    public void setNome(boolean nome) {
        this.nome = nome;
    }

    public boolean isRg() {
        return rg;
    }

    public void setRg(boolean rg) {
        this.rg = rg;
    }

    public boolean isCpf() {
        return cpf;
    }

    public void setCpf(boolean cpf) {
        this.cpf = cpf;
    }

    public String getOutro() {
        return outro;
    }

    public void setOutro(String outro) {
        this.outro = outro;
    }

    public String getEnderecoLateral() {
        return enderecoLateral;
    }

    public void setEnderecoLateral(String enderecoLateral) {
        this.enderecoLateral = enderecoLateral;
    }

    public String getUsuarioLateral() {
        return usuarioLateral;
    }

    public void setUsuarioLateral(String usuarioLateral) {
        this.usuarioLateral = usuarioLateral;
    }

    public String getSenhaLateral() {
        return senhaLateral;
    }

    public void setSenhaLateral(String senhaLateral) {
        this.senhaLateral = senhaLateral;
    }

    public String getEnderecoLatera2() {
        return enderecoLatera2;
    }

    public void setEnderecoLatera2(String enderecoLatera2) {
        this.enderecoLatera2 = enderecoLatera2;
    }

    public String getUsuarioLateral2() {
        return usuarioLateral2;
    }

    public void setUsuarioLateral2(String usuarioLateral2) {
        this.usuarioLateral2 = usuarioLateral2;
    }

    public String getSenhaLateral2() {
        return senhaLateral2;
    }

    public void setSenhaLateral2(String senhaLateral2) {
        this.senhaLateral2 = senhaLateral2;
    }

    public String getEnderecoFrontal() {
        return enderecoFrontal;
    }

    public void setEnderecoFrontal(String enderecoFrontal) {
        this.enderecoFrontal = enderecoFrontal;
    }

    public String getUsuarioFrontal() {
        return usuarioFrontal;
    }

    public void setUsuarioFrontal(String usuarioFrontal) {
        this.usuarioFrontal = usuarioFrontal;
    }

    public String getSenhaFrontal() {
        return senhaFrontal;
    }

    public void setSenhaFrontal(String senhaFrontal) {
        this.senhaFrontal = senhaFrontal;
    }

    public String getEnderecoTraseira() {
        return enderecoTraseira;
    }

    public void setEnderecoTraseira(String enderecoTraseira) {
        this.enderecoTraseira = enderecoTraseira;
    }

    public String getUsuarioTraseira() {
        return usuarioTraseira;
    }

    public void setUsuarioTraseira(String usuarioTraseira) {
        this.usuarioTraseira = usuarioTraseira;
    }

    public String getSenhaTraseira() {
        return senhaTraseira;
    }

    public void setSenhaTraseira(String senhaTraseira) {
        this.senhaTraseira = senhaTraseira;
    }

    public boolean isNroFotosLateral() {
        return nroFotosLateral;
    }

    public void setNroFotosLateral(boolean nroFotosLateral) {
        this.nroFotosLateral = nroFotosLateral;
    }

    public boolean isNroFotosLateral2() {
        return nroFotosLateral2;
    }

    public void setNroFotosLateral2(boolean nroFotosLateral2) {
        this.nroFotosLateral2 = nroFotosLateral2;
    }

    public boolean isNroFotosFrontal() {
        return nroFotosFrontal;
    }

    public void setNroFotosFrontal(boolean nroFotosFrontal) {
        this.nroFotosFrontal = nroFotosFrontal;
    }

    public boolean isNroFotosTraseira() {
        return nroFotosTraseira;
    }

    public void setNroFotosTraseira(boolean nroFotosTraseira) {
        this.nroFotosTraseira = nroFotosTraseira;
    }
    
    
}
