/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.CaixaMovimentoDetalheDAO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import salcam.smarttoll.beans.CaixaMovimentoDetalhe;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Administrador
 */
public class CaixaMovimentoDetalheDAOImp implements CaixaMovimentoDetalheDAO {
    @Override
    public boolean cadastroCaixaMovimentoDetalhe(CaixaMovimentoDetalhe c) {
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(CADASTRO_CAIXA_MOVIMENTO_DETALHE);
            if(maxCodigo()==-1)
                throw new Exception();
            psmt.setInt(1, maxCodigo()+1);
//            psmt.setInt(2, c.getEmpresaCodigo());
//            psmt.setString(3, c.getOrigemCodigo());
//            psmt.setByte(4, c.getParcela());
//            psmt.setByte(5, c.getContaBancaria());
//            psmt.setByte(6, c.getCarteira());
//            psmt.setByte(7, c.getParcelas());
//            psmt.setString(8, c.getRejeicao());
//            psmt.setByte(9, c.getOcorrencia());
//            psmt.setString(10, c.getDocumento());
//            psmt.setString(11, c.getNossoNumero());
//            psmt.setDate(12,(Date) c.getEmissao());
//            psmt.setDate(13,(Date) c.getVencimento());
//            psmt.setDate(14,(Date) c.getProtestar());
//            psmt.setDate(15, (Date) c.getAbatimento());
//            psmt.setDate(16,(Date) c.getDesconto());
//            psmt.setDate(17,(Date) c.getMulta());
//            psmt.setDate(18,(Date) c.getPagamento());
//            psmt.setFloat(19, c.getValorNominal());
//            psmt.setFloat(20, c.getValorAbatimento());
//            psmt.setFloat(21, c.getValorDesconto());
//            psmt.setFloat(22, c.getValorDespesa());
//            psmt.setFloat(23, c.getValorJuros());
//            psmt.setFloat(24, c.getValorMulta());
//            psmt.setFloat(25, c.getValorPago());
//            psmt.setByte(26, c.getOrigem());
//            psmt.setBoolean(27, c.isBoletoImpresso());
//            psmt.setBoolean(28, c.isRemessaGerada());
//            psmt.setDate(29, (Date) c.getAlteracao());
//            psmt.setByte(30, c.getTipoAlteracao());
//            psmt.setString(31, c.getDupl());
//            psmt.setBoolean(32, c.isCancelado());
//            psmt.setString(33, c.getNome());
//            psmt.setString(34, c.getPessoa());
//            psmt.setString(35, c.getCnpjCpf());
//            psmt.setString(36, c.getIeRg());
//            psmt.setString(37, c.getEndereco());
//            psmt.setString(38, c.getNumero());
//            psmt.setString(39, c.getComplemento());
//            psmt.setString(40, c.getBairro());
//            psmt.setString(41, c.getCep());
//            psmt.setString(42, c.getCidade());
//            psmt.setString(43, c.getEstado());
//            psmt.setString(44, c.getEmail());
            psmt.executeUpdate();
            return true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    @Override
    public int maxCodigo(){
        try{
            PreparedStatement stmt = Conn.getConn().prepareStatement(MAX_CODIGO_CAIXA_MOVIMENTO_DETALHE);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                return rs.getInt("MAX");                
            }
            return -1;
        }catch(Exception e){
            return -1;
        }
    }
    
    @Override
    public ResultSet consultaCaixaMovimentoDetalhe(String condicao) {
        String sql = CONSULTA_CAIXA_MOVIMENTO_DETALHE + condicao;
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(sql);
            return psmt.executeQuery();            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    } 
    
    @Override
    public ResultSet consultaCaixaMovimentoDetalheGenerica(String sql) {
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(sql);
            return psmt.executeQuery();            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    @Override
    public ResultSet consultaRelatorioMovimentacaoVeiculosCaixaMovimentoDetalhe(String condicao) {
        String sql = CONSULTA_RELATORIO_MOVIMENTACAO_VEICULOS + condicao + " ORDER BY c.CLASSIFICACAO_CODIGO";
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(sql);
            return psmt.executeQuery();            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
