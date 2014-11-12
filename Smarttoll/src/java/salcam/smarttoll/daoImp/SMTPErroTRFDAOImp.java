/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.SMTPErroTRFDAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import salcam.smarttoll.beans.SMTPErroTRF;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Samuel
 */
public class SMTPErroTRFDAOImp implements SMTPErroTRFDAO {
    
    @Override
    public boolean cadastroSMTPErroTRF(SMTPErroTRF se){
        try{
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRO_SMTP_ERRO_TRF);
            stmt.setInt(1, se.getCaixasMovimentosCod());
            stmt.setInt(2, se.getCaixaCod());
            stmt.setInt(3, se.getTrnSeqRegErro());
            stmt.setInt(4, se.getCaixasMovimentosDetalhesCod());
            stmt.setInt(5, se.getErro());
            stmt.setBoolean(6, se.isTrnGerado());
            stmt.setInt(7, se.getTrnSeqReg());
            stmt.executeUpdate();
            return true;
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
