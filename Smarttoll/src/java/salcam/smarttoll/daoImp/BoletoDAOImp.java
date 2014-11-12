/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.BoletoDAO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import salcam.smarttoll.beans.Boleto;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Administrador
 */
public class BoletoDAOImp implements BoletoDAO {
    @Override
    public boolean cadastroBoleto(Boleto b) {
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(CADASTRO_BOLETO);
            if(maxCodigo()==-1)
                throw new Exception();
            psmt.setInt(1, maxCodigo()+1);
            psmt.setInt(2, b.getEmpresaCodigo());
            psmt.setString(3, b.getOrigemCodigo());
            psmt.setByte(4, b.getParcela());
            psmt.setByte(5, b.getContaBancaria());
            psmt.setByte(6, b.getCarteira());
            psmt.setByte(7, b.getParcelas());
            psmt.setString(8, b.getRejeicao());
            psmt.setByte(9, b.getOcorrencia());
            psmt.setString(10, b.getDocumento());
            psmt.setString(11, b.getNossoNumero());
            psmt.setDate(12,(Date) b.getEmissao());
            psmt.setDate(13,(Date) b.getVencimento());
            psmt.setDate(14,(Date) b.getProtestar());
            psmt.setDate(15, (Date) b.getAbatimento());
            psmt.setDate(16,(Date) b.getDesconto());
            psmt.setDate(17,(Date) b.getMulta());
            psmt.setDate(18,(Date) b.getPagamento());
            psmt.setFloat(19, b.getValorNominal());
            psmt.setFloat(20, b.getValorAbatimento());
            psmt.setFloat(21, b.getValorDesconto());
            psmt.setFloat(22, b.getValorDespesa());
            psmt.setFloat(23, b.getValorJuros());
            psmt.setFloat(24, b.getValorMulta());
            psmt.setFloat(25, b.getValorPago());
            psmt.setByte(26, b.getOrigem());
            psmt.setBoolean(27, b.isBoletoImpresso());
            psmt.setBoolean(28, b.isRemessaGerada());
            psmt.setDate(29, (Date) b.getAlteracao());
            psmt.setByte(30, b.getTipoAlteracao());
            psmt.setString(31, b.getDupl());
            psmt.setBoolean(32, b.isCancelado());
            psmt.setString(33, b.getNome());
            psmt.setString(34, b.getPessoa());
            psmt.setString(35, b.getCnpjCpf());
            psmt.setString(36, b.getIeRg());
            psmt.setString(37, b.getEndereco());
            psmt.setString(38, b.getNumero());
            psmt.setString(39, b.getComplemento());
            psmt.setString(40, b.getBairro());
            psmt.setString(41, b.getCep());
            psmt.setString(42, b.getCidade());
            psmt.setString(43, b.getEstado());
            psmt.setString(44, b.getEmail());
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
            PreparedStatement stmt = Conn.getConn().prepareStatement(MAX_CODIGO_BOLETO);
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
    public ResultSet consultaBoleto(String condicao) {
        String sql = CONSULTA_BOLETO + condicao;
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(sql);
            return psmt.executeQuery();            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }    
}
