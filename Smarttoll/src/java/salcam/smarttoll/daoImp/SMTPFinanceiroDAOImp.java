/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.SMTPFinanceiroDAO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import salcam.smarttoll.beans.SMTPFinanceiro;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Samuel
 */
public class SMTPFinanceiroDAOImp implements SMTPFinanceiroDAO {
    @Override
    public boolean cadastroSMTPFinanceiro(SMTPFinanceiro s) {
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRO_SMTP_FINANCEIRO);
            stmt.setInt(1, s.getCaixasMovimentoCod());
            stmt.setInt(2, s.getCaixaCod());
            stmt.setInt(3, s.getTrnSeqReg());
            stmt.setDate(4, (Date) s.getDataPagamento());
            stmt.setFloat(5, s.getValor());
            stmt.setDate(6, (Date) s.getDataAbertura());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
