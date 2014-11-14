/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.LogSenhaDAO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import salcam.smarttoll.beans.LogSenha;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Samuel
 */
public class LogSenhaDAOImp implements LogSenhaDAO {
    @Override
    public boolean cadastroLogSenha(LogSenha ls){
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRO_LOG_SENHA);
            stmt.setInt(1, ls.getFuncionarioAdministrativo());
            stmt.setInt(2, ls.getFuncionarioCod());
            stmt.setDate(3, (Date) ls.getData());
            stmt.setByte(4, ls.getTipoSenha());
            stmt.setString(5, ls.getIp());
            stmt.setString(6, ls.getEstacao());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
