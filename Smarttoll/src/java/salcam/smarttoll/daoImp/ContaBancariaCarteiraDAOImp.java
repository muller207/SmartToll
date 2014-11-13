/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.ContaBancariaCarteiraDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import salcam.smarttoll.beans.ContaBancariaCarteira;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Administrador
 */
public class ContaBancariaCarteiraDAOImp implements ContaBancariaCarteiraDAO {
   @Override
    public boolean cadastroContaBancariaCarteira(ContaBancariaCarteira c){
        try{
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRO_CONTA_BANCARIA_CARTEIRA); 
            if(maxCodigo()==-1)
                throw new Exception();
            stmt.setInt(1, maxCodigo()+1);
            stmt.setInt(2, c.getEmpresaCod());
            stmt.setByte(3, c.getCarteira());
            stmt.setString(4, c.getVariacao());
            stmt.setString(5, c.getConvenio());
            stmt.setByte(6, c.getBancoCod());
            stmt.setByte(7, c.getBancoTipoCobrancaCod());
            stmt.setByte(8, c.getLayout());
            stmt.setString(9, c.getNossoNumero());
            stmt.setByte(10, c.getAcao());
            stmt.setFloat(11, c.getValorDesconto());
            stmt.setFloat(12, c.getValorJuros());
            stmt.setFloat(13, c.getValorMulta());
            stmt.setFloat(14, c.getValorIof());
            stmt.setFloat(15,  c.getValorAbatimento());
            stmt.setByte(16, c.getInstrucaoCod1());
            stmt.setByte(17, c.getInstrucaoCod2());
            stmt.setString(18, c.getInstrucaoTexto1());
            stmt.setString(19, c.getInstrucaoTexto2());
            stmt.setString(20, c.getInstrucaoAdicional());
            stmt.setByte(21, c.getTipoProtesto());
            stmt.setByte(22, c.getProtestoDias());
            stmt.setByte(23, c.getTipoDesconto());
            stmt.setByte(24, c.getDescontoDias());
            stmt.setString(25, c.getDiretorioRemessa());
            stmt.setString(26, c.getDiretorioRetorno());
            stmt.setInt(27, c.getSequencialRemessa());
            stmt.setInt(28, c.getSequencialRetorno());
            stmt.setInt(29, c.getSequencialArquivo());
            stmt.setByte(30, c.getTipoAbatimento());
            stmt.setByte(31, c.getTipoJuros());
            stmt.setByte(32, c.getTipoMulta());
            stmt.setByte(33, c.getMultaDias());
            stmt.setByte(34, c.getTipoBaixaDevolucao());
            stmt.setByte(35, c.getBaixaDevolucaoDias());
            stmt.executeUpdate();
            return true;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }    
    
    @Override
    public int maxCodigo(){
        try{
            PreparedStatement stmt = Conn.getConn().prepareStatement(MAX_CODIGO_CONTA_BANCARIA_CARTEIRA);
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
    public ResultSet consultaContaBancariaCarteira(String condicao) {
        String sql = CONSULTA_CONTA_BANCARIA_CARTEIRA + condicao;
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(sql);
            return psmt.executeQuery();            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    } 
    
    @Override
    public ResultSet consultaContaBancariaCarteiraTotal(){
        ResultSet rs = null;
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CONSULTA_CONTA_BANCARIA_CARTEIRA);
            rs = stmt.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return rs;
    }    
}
