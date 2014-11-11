/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.BancoDAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import salcam.smarttoll.beans.Banco;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Samuel
 */
public class BancoDAOImp implements BancoDAO {
    @Override
    public boolean cadastroBanco(Banco b){
        try {
            PreparedStatement psmt= Conn.getConn().prepareStatement(CADASTRO_BANCO);
            psmt.setInt(1, b.getCodigo());
            psmt.setString(2, b.getRazao());
            psmt.setString(3, b.getFantasia());
            psmt.executeUpdate();            
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
