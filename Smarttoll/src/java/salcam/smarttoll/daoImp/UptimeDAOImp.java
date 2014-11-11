/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.daoImp;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import salcam.smarttoll.beans.Uptime;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Samuel
 */
public class UptimeDAOImp {
    public boolean cadastroUptime(Uptime u){
        final String CADASTRO_UPTIME = "INSERT INTO Uptime"
                + "(CAIXA_CODIGO, FUNCIONARIO_CODIGO, DATA_INICIO, ULTIMO_REGISTRO, SITUACAO, TRANSMITIDO)"
                + " VALUES(?,?,?,?,?,?)";
        try{
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRO_UPTIME);
            stmt.setInt(1, u.getCaixaCod());
            stmt.setInt(2, u.getFuncionarioCod());
            stmt.setDate(3, (Date) u.getDataInicio());
            stmt.setDate(4, (Date) u.getUltimoRegistro());
            stmt.setBoolean(5, u.isSituacao());
            stmt.setBoolean(6, u.isTransmitido());
            stmt.executeUpdate();
            return true;
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
