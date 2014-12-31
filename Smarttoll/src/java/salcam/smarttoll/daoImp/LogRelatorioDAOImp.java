/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.LogRelatorioDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import salcam.smarttoll.beans.LogRelatorio;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Administrador
 */
public class LogRelatorioDAOImp implements LogRelatorioDAO {
    
    @Override
    public boolean cadastroLogRelatorio(LogRelatorio l) {
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(CADASTRO_LOG_RELATORIO);
            psmt.setInt(1, l.getFuncionarioCod());
            psmt.setByte(2, l.getTipoRelatorioCod());
            psmt.setTimestamp(3, new Timestamp(l.getData().getTime()));
            psmt.setString(4, l.getIpAdministrativo());
            psmt.setString(5, l.getInstrucaoSql());
            psmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    @Override
    public ResultSet consultaLogRelatorio(String condicao){
        ResultSet rs = null;
        String sql = CONSULTA_LOG_RELATORIO + condicao + " ORDER BY l.DATA DESC";
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(sql);
            rs = stmt.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return rs;
    }   
}
