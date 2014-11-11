/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.LogLoginDAO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import salcam.smarttoll.beans.LogLogin;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Administrador
 */
public class LogLoginDAOImp implements LogLoginDAO {
    @Override
    public boolean cadastroLogLogin(LogLogin l) {
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(CADASTRO_LOG_LOGIN);
            psmt.setInt(1, l.getFuncionarioCod());
            psmt.setInt(2, l.getCondominioCod());
            psmt.setDate(3, (Date) l.getData());
            psmt.setByte(4, l.getSucesso());
            psmt.setByte(5, l.getSistema());
            psmt.setString(6, l.getIp());
            psmt.setString(7, l.getEstacao());
            psmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    @Override
    public ResultSet consultaLogLogin(String condicao) {
        String sql = CONSULTA_LOG_LOGIN + condicao;
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(sql);
            return psmt.executeQuery();            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    @Override
    public ResultSet consulta(String condicao){
        String sql = CONSULTA + condicao;
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(sql);
            return psmt.executeQuery();            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }		
    }
}
