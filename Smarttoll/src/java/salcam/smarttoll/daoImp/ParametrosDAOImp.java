/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.daoImp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import salcam.smarttoll.beans.Parametros;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Administrador
 */
public class ParametrosDAOImp implements AlteraParametrosDAO {
    
    @Override
    public boolean alteraParametros(Parametros p){
        try{
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(ALTERA_PARAMETROS); 
//            stmt.setInt(1, c.getMovimentacao());
//            stmt.setDate(2, (Date) c.getDataAbertura());
//            stmt.setByte(3, c.getCaixaCodigo());
//            stmt.setInt(4, c.getFuncionarioCodigo());
//            stmt.setFloat(5, c.getValorAbertura());
//            stmt.setFloat(6, c.getValorFechamento());            
//            stmt.setFloat(7, c.getValorMovimentoTotal());
//            stmt.setBoolean(8, c.isTransmitido());
//            stmt.setDate(9, (Date) c.getDataFechamento());
//            stmt.setFloat(10, c.getValorFechamentoOperador());
//            stmt.setInt(11, c.getTrnSeqReg());
//            stmt.setDate(12, (Date) c.getDataCriacaoTrn());
//            stmt.setInt(13, c.getMotivoTrt());
            stmt.executeUpdate();
            return true;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }    
    
    @Override
    public ResultSet consultaParametros(String condicao) {
        String sql = CONSULTA_PARAMETROS + condicao;
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(sql);
            return psmt.executeQuery();            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    } 
    
}
