/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.RelacionamentoDAO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import salcam.smarttoll.beans.Relacionamento;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Samuel
 */
public class RelacionamentoDAOImp implements RelacionamentoDAO {

    @Override
    public boolean cadastroRelacionamento(Relacionamento r) {
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRO_RELACIONAMENTO);
            if (!(this.getMaxRelacionamentoCodigo() < 0)) {
                stmt.setInt(1, (this.getMaxRelacionamentoCodigo()) + 1);
                stmt.setInt(2, r.getEmpresaCod());
                stmt.setString(3,String.valueOf(r.getPessoa()));
                stmt.setByte(4,r.getSituacao());
                stmt.setString(5,r.getNome());
                stmt.setString(6,r.getApelido());
                stmt.setString(7,r.getCnpjCpf());
                stmt.setString(8,r.getIeRg());
                stmt.setDate(9,(Date) r.getDataCadastro());
                stmt.setFloat(10,r.getCusto());
                stmt.setString(11,r.getObservacao());
                stmt.setString(12,r.getHomepage());
                stmt.setInt(13,r.getFuncionarioCod());
                stmt.setInt(14,r.getMidiaCod());
                stmt.setInt(15,r.getSeguimentoCod());
                stmt.setInt(16,r.getCategoriaCod());
                stmt.setInt(17,r.getTipoCreditoCod());
                stmt.setBoolean(18,r.isCliente());
                stmt.setBoolean(19,r.isFornecedor());
                stmt.setBoolean(20,r.isTransportadora());
                stmt.setBoolean(21,r.isInsumo());
                stmt.setBoolean(22,r.isRepresentante());
                stmt.setBoolean(23,r.isPrestadorServico());
                stmt.setBlob(24,r.getImagem());
                stmt.setFloat(25,r.getPorcentagemComissao());
                stmt.setFloat(26,r.getLimite());
                stmt.setString(27,r.getInscricaoMunicipal());
                stmt.setInt(28,r.getCnaeCod());
                stmt.setDate(29,(Date) r.getDataDesligamento());
                stmt.setInt(30,r.getMotivoCod());
                stmt.setBoolean(31,r.isMostraPassagem());
                stmt.setBoolean(32,r.isGravaPassagem());
                stmt.setBoolean(33,r.isCarta());
                stmt.setInt(34,r.getTipoMensalidadeCod());
                stmt.setInt(35,r.getDiaMensalidade());
                stmt.setBoolean(36,r.isCobranca());
                stmt.setBoolean(37,r.isRecebeDescritivoConvenios());
                stmt.setFloat(38,r.getComissaoVenda());
                stmt.setBoolean(39,r.isEntregouFicha());
                stmt.setBoolean(40,r.isImprimeDescritivo());
                stmt.setString(41,r.getJucesp());
                stmt.setDate(42,(Date) r.getDataAbertura());
                stmt.setInt(43,r.getQtdFuncionarios());
                stmt.setBoolean(44,r.isMatrizFilial());
                stmt.setInt(45,r.getQtdFiliais());
                stmt.setInt(46,r.getRepresentanteCod());
                stmt.setByte(47,r.getPrioridade());
                stmt.setInt(48,r.getPlanoContaCod());
                stmt.setInt(49,r.getPaisCod());
                stmt.setBoolean(50,r.isRestricaoAdmissao());
                stmt.setBoolean(51,r.isFaturamento());
                stmt.setDate(52,(Date) r.getUltimaVenda());
                stmt.setDate(53,(Date) r.getUltimaCompra());
                stmt.setBoolean(54,r.isMostraAutomaticoHistorico());
                stmt.setBoolean(55,r.isContribuinteIcms());
                stmt.setByte(56,r.getDepartamentoCod());
                stmt.setString(57,r.getUsuario());
                stmt.setString(58,r.getSenha());
                stmt.setString(59,r.getSenhaAdministrativa());
                stmt.setInt(60,r.getFuncaoCod());
                stmt.setDate(61,(Date) r.getHoraEntrada1());
                stmt.setDate(62,(Date) r.getHoraEntrada2());
                stmt.setDate(63,(Date) r.getHoraSaida1());
                stmt.setDate(64,(Date) r.getHoraSaida2());
                stmt.setString(65,r.getHabilitacao());
                stmt.setString(66,r.getCategoria());
                stmt.setDate(67,(Date) r.getEmissaoHabilitacao());
                stmt.setDate(68,(Date) r.getValidade());
                stmt.setFloat(69,r.getDescontoMaxPorVenda());
                stmt.setString(70,r.getSenhaScpc());
                stmt.setString(71,r.getCarteiraTrabalho());
                stmt.setInt(72,r.getFuncionario());
                stmt.setFloat(73,r.getReducaoBaseCalculo());
                stmt.executeUpdate();
                return true;
            }
            else
                return false;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public int getMaxRelacionamentoCodigo() {
        int size = -1;
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(getMaxRelacionamentoCodigo);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                size = rs.getInt("MAX");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return size;
    }
}
