/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.daoImp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import salcam.smarttoll.beans.Caixa;
import salcam.smarttoll.conn.Conn;
import salcam.smarttoll.dao.CaixaDAO;

/**
 *
 * @author Administrador
 */
public class CaixaDAOImp implements CaixaDAO {

    @Override
    public boolean cadastroCaixa(Caixa c) {
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(CADASTRO_CAIXA);
            psmt.setString(1, c.getSerial());
            psmt.setBoolean(2, c.isSituacao());
            psmt.setInt(3, c.getSemPararPraca());
            psmt.setInt(4, c.getSequencialArquivoNela());
            psmt.setInt(5, c.getSequencialArquivoTag());
            psmt.setString(6, c.getIp());
            psmt.setInt(7, c.getTipo());
            psmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    @Override
    public ResultSet consultaCaixa(String condicao) {
        String sql = CONSULTA_CAIXA + condicao;
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(sql);
            return psmt.executeQuery();            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
}
