/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.daoImp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Samuel
 */
public class FuncionarioDAOImp {
    public boolean consultaFuncionarioLogin(String usuario, String senha){
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement("SELECT * FROM Funcionarios WHERE USUARIO='"+usuario+"' AND SENHA='"+senha+"'");
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }        
    }
    
    public ResultSet consultaFuncionarioTotal(){
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement("SELECT * FROM Funcionarios ORDER BY FUNCIONARIO");
            ResultSet rs = stmt.executeQuery();
            return rs;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }        
    }
    
}
