/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.ParametroDAO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import salcam.smarttoll.beans.Parametro;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Samuel
 */
public class ParametroDAOImp implements ParametroDAO {
    @Override
    public boolean cadatroParametro(Parametro p){
        try{
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRO_PARAMETRO);
            stmt.setInt(1,p.getEmpresaCod());
            stmt.setBlob(2,p.getImagemPadrao());
            stmt.setByte(3,p.getVersao());
            stmt.setDate(4, (Date) p.getHoje());
            stmt.setBoolean(5,p.isGradesPersonalizadas());
            stmt.setString(6,p.getChave());
            stmt.setString(7,p.getCabecalho());
            stmt.setString(8,p.getRodape());
            stmt.setString(9,p.getTelefone());
            stmt.setString(10,p.getCnpj());
            stmt.setString(11,p.getPraca());
            stmt.setDate(12,(Date)p.getVersaoAtualizacao());
            stmt.setString(13,p.getSempararCaminhoTaf());
            stmt.setInt(14,p.getSempararSequencialTaf());
            stmt.setString(15,p.getCaminhoImagensBotoes());
            stmt.setString(16,p.getCampoEspecieBoleto());
            stmt.setInt(16,p.getTipoLetra());
            stmt.executeUpdate();
            return true;
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
