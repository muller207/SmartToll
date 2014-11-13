/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.LayoutCupomDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import salcam.smarttoll.beans.LayoutCupom;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Administrador
 */
public class LayoutCupomDAOImp implements LayoutCupomDAO {
    @Override
    public boolean cadastroLayoutCupom(LayoutCupom l){
        try{
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRO_LAYOUT_CUPOM); 
            stmt.setString(1, l.getCabecalho());
            stmt.setString(2, l.getRodape());
            stmt.setString(3, l.getTelefone());
            stmt.setString(4, l.getCnpj());
            stmt.setString(5, l.getPraca());
            stmt.setString(6, l.getSite());
            stmt.executeUpdate();
            return true;
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    @Override
    public ResultSet consultaLayoutCupom(String condicao) {
        String sql = CONSULTA_LAYOUT_CUPOM + condicao;
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(sql);
            return psmt.executeQuery();            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    } 
    
    @Override
    public ResultSet consultaLayoutCupomTotal(){
        ResultSet rs = null;
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CONSULTA_LAYOUT_CUPOM);
            rs = stmt.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return rs;
    } 
}
