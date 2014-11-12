/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.BancoTipoCobrancaDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import salcam.smarttoll.beans.BancoTipoCobranca;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Administrador
 */
public class BancoTipoCobrancaDAOImp implements BancoTipoCobrancaDAO {
    @Override
    public boolean cadastroBancoTipoCobranca(BancoTipoCobranca b) {
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(CADASTRO_BANCO_TIPO_COBRANCA);
            psmt.setByte(1, b.getCodigo());
            psmt.setByte(2, b.getBancoCodigo());
            psmt.setString(3, b.getPadrao());            
            psmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    @Override
    public ResultSet consultaBancoTipoCobranca(String condicao) {
        String sql = CONSULTA_BANCO_TIPO_COBRANCA + condicao;
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(sql);
            return psmt.executeQuery();            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
