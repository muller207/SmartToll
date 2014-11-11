/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.daoImp;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import salcam.smarttoll.beans.TipoEndereco;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Samuel
 */
public class TipoEnderecoDAOImp {
    final String CADASTRO_TIPO_ENDERECO = "INSERT INTO Tipos_Enderecos(TITULO_CODIGO, DESCRICAO) VALUES(((SELECT MAX(TITULO_CODIGO) FROM Tipos_Enderecos)+1),?);";
    
    public boolean cadastroTipoEndereco(TipoEndereco te){
        try{
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRO_TIPO_ENDERECO);
            stmt.setString(1, te.getDescricao());
            stmt.executeUpdate();
            return true;
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
