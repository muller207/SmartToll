/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.daoImp;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import salcam.smarttoll.beans.LogReimpressao;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Administrador
 */
public class LogReimpressaoDAOImp implements LogReimpressaoDAO {
    @Override
    public boolean cadastroLog(LogReimpressao l) {
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(CADASTRO_LOG_REIMPRESSAO);
            psmt.setDate(1, (Date) l.getData());
            psmt.setInt(2, l.getCaixaCod());
            psmt.setInt(3, l.getFuncionarioCod());
            psmt.setString(4, l.getIp());
            psmt.setString(5, l.getCabine());
            psmt.setInt(6, l.getTipo());
            psmt.setString(7, l.getDescricao());
            psmt.setInt(8, l.getJustificativaCod());
            psmt.setString(9, l.getDescricaoUsuario());
            psmt.setString(10, l.getPlacaVeiculo());
            psmt.setBoolean(11, l.isTransmitido());
            psmt.setInt(12, l.getClassificacaoCod());
            psmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    @Override
    public ResultSet consultaCaixa(String condicao) {
        String sql = CONSULTA_LOG_REIMPRESSAO + condicao;
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(sql);
            return psmt.executeQuery();            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }     
}
