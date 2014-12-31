/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.CaixaMovimentoDAO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import salcam.smarttoll.beans.CaixaMovimento;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Administrador
 */
public class CaixaMovimentoDAOImp implements CaixaMovimentoDAO {
    @Override
    public boolean cadastroCaixaMovimento(CaixaMovimento c){
        try{
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRO_CAIXA_MOVIMENTO); 
            stmt.setInt(1, c.getMovimentacao());
            stmt.setDate(2, (Date) c.getDataAbertura());
            stmt.setByte(3, c.getCaixaCodigo());
            stmt.setInt(4, c.getFuncionarioCodigo());
            stmt.setFloat(5, c.getValorAbertura());
            stmt.setFloat(6, c.getValorFechamento());            
            stmt.setFloat(7, c.getValorMovimentoTotal());
            stmt.setBoolean(8, c.isTransmitido());
            stmt.setDate(9, (Date) c.getDataFechamento());
            stmt.setFloat(10, c.getValorFechamentoOperador());
            stmt.setInt(11, c.getTrnSeqReg());
            stmt.setDate(12, (Date) c.getDataCriacaoTrn());
            stmt.setInt(13, c.getMotivoTrt());
            stmt.executeUpdate();
            return true;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }    
    
    @Override
    public ResultSet consultaCaixaMovimento(String condicao) {
        String sql = CONSULTA_CAIXA_MOVIMENTO + condicao;
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(sql);
            return psmt.executeQuery();            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    } 
    
    @Override
    public ResultSet consultaCaixaMovimentoEspecial(String sql) {
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,
                   ResultSet.CONCUR_UPDATABLE);
            return psmt.executeQuery();            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    @Override
    public ResultSet consultaCaixaMovimentoTotal(){
        ResultSet rs = null;
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CONSULTA_CAIXA_MOVIMENTO);
            rs = stmt.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return rs;
    } 
}
