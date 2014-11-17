/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.daoImp;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import salcam.smarttoll.beans.Impressora;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Samuel
 */
public class ImpressoraDAOImp {
    final String CADASTRO_IMPRESSORA = "INSERT INTO Impressoras(EMPRESA_CODIGO, SERIAL, TIPO, IMPRESSORA, CAMINHO, SITUACAO, FUNCAO, COMUNICACAO_SERIAL, PORTA, VELOCIDADE, PARIDADE, DATABITS, STOPBITS, CONTROLE_FLUXO, POOLING) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
    
    public boolean cadastroImpressora(Impressora i){
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRO_IMPRESSORA);
            stmt.setInt(1,i.getEmpresaCod());
            stmt.setString(2,i.getSerial());
            stmt.setByte(3,i.getTipo());
            stmt.setString(4,i.getImpressora());
            stmt.setString(5,i.getCaminho());
            stmt.setByte(6,i.getSituacao());
            stmt.setByte(7,i.getFuncao());
            stmt.setBoolean(8,i.isComunicacaoSerial());
            stmt.setByte(9,i.getPorta());
            stmt.setByte(10,i.getVelocidade());
            stmt.setByte(11,i.getParidade());
            stmt.setByte(12,i.getDatabits());
            stmt.setByte(13,i.getStopbits());
            stmt.setByte(14,i.getControleFluxo());
            stmt.setByte(15,i.getPooling());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
