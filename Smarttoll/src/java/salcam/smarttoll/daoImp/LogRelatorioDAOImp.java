/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.LogRelatorioDAO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import salcam.smarttoll.beans.LogRelatorio;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Samuel
 */
public class LogRelatorioDAOImp implements LogRelatorioDAO {

    @Override
    public boolean cadastroLogRelatorio(LogRelatorio lr) {
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRO_LOG_RELATORIO);
            stmt.setInt(1, lr.getFuncionarioCod());
            stmt.setByte(2, lr.getTipoRelatorioCod());
            stmt.setDate(3, (Date) lr.getData());
            stmt.setString(4, lr.getIpAdministrativo());
            stmt.setString(5, lr.getInstrucaoSql());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
