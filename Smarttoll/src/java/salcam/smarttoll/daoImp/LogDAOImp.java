/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.LogDAO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import salcam.smarttoll.beans.Log;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Administrador
 */
public class LogDAOImp implements LogDAO {
    @Override
    public boolean cadastroLog(Log l) {
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(CADASTRO_LOG);
            psmt.setDate(1, (Date) l.getData());
            psmt.setInt(2, l.getFuncionarioCod());
            psmt.setInt(3, l.getTipoLogCod());
            psmt.setString(4, l.getIp());
            psmt.setString(5, l.getEstacao());
            psmt.setString(6, l.getDescricao());
            psmt.setBoolean(7, l.isTransmitido());
            psmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    @Override
    public ResultSet consultaLog(String condicao) {
        String sql = CONSULTA_LOG + condicao;
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(sql);
            return psmt.executeQuery();            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
