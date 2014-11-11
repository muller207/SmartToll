/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Samuel
 */
public class Conn {
    public static Connection conn;
    private static final String URL = "jdbc:jtds:sqlserver://soft01/SmartToll";
    private static final String DRIVER = "net.sourceforge.jtds.jdbc.Driver";
    private static final String USUARIO = "sa";
    private static final String SENHA = "a75s125";
    
    public static Connection getConn() throws SQLException{
        try{  
            Class.forName(DRIVER);  
            conn = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("Conectado ao banco de dados");
            return conn;
        }catch (ClassNotFoundException e) {
            System.out.println("Não foi possivel conectar ao banco de dados");
            throw new SQLException (e.getMessage());
        }
    }
}
