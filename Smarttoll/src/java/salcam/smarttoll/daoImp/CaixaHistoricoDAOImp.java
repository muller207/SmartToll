/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.CaixaHistoricoDAO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import salcam.smarttoll.beans.CaixaHistorico;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Administrador
 */
public class CaixaHistoricoDAOImp implements CaixaHistoricoDAO {
    @Override
    public boolean cadastroCaixaHistorico(CaixaHistorico c){
        try{
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRO_CAIXA_HISTORICO); 
            stmt.setInt(1, c.getMovimentacao());
            if(maxCodigo()==-1)
                throw new Exception();
            stmt.setFloat(2, maxCodigo()+1);
            stmt.setDate(3, (Date) c.getLancamento());
            stmt.setInt(4, c.getClassificacaoCodigo());
            stmt.setFloat(5, c.getTarifa());
            stmt.setFloat(6, c.getValorPago());
            stmt.setFloat(7, c.getTroco());
            stmt.setInt(8, c.getTipoPagamento());
            stmt.setByte(9, c.getCaixaCodigo());
            stmt.setInt(10, c.getFuncionarioCodigo());
            stmt.setByte(11, c.getTipoRegistro());
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
            PreparedStatement stmt = Conn.getConn().prepareStatement(MAX_CODIGO_CAIXA_HISTORICO);
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
    public ResultSet consultaCaixaHistorico(String condicao) {
        String sql = CONSULTA_CAIXA_HISTORICO + condicao;
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(sql);
            return psmt.executeQuery();            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    } 
    
    @Override
    public ResultSet consultaCaixaHistoricoTotal(){
        ResultSet rs = null;
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CONSULTA_CAIXA_HISTORICO);
            rs = stmt.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return rs;
    } 
}
