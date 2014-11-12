/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.EmpresaDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import salcam.smarttoll.beans.Empresa;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Samuel
 */
public class EmpresaDAOImp implements EmpresaDAO {
    @Override
    public boolean cadastroEmpresa(Empresa e){
        try{
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRA_EMPRESA);            
            if(maxCodigo()==-1)
                throw new Exception();
            stmt.setInt(1, maxCodigo()+1);
            stmt.setString(2, e.getRazao());
            stmt.setString(3, e.getFantasia());
            stmt.setString(4, e.getCnpj());
            stmt.setString(5, e.getIe());
            stmt.setString(6, e.getObservacao());
            stmt.setString(7, e.getHomepage());
            stmt.setString(8, e.getEmail());
            stmt.setString(9, e.getSenhaEmail());
            stmt.setString(10, e.getLoginEmail());
            stmt.setString(11, e.getSmtp());
            stmt.setBoolean(12, e.isAutenticado());
            stmt.setString(13, e.getInscricaoMunicipal());
            stmt.executeUpdate();
            return true;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    @Override
    public int maxCodigo(){
        try{
            PreparedStatement stmt = Conn.getConn().prepareStatement(MAX_CODIGO_EMPRESA);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                return rs.getInt("MAX");                
            }
            return -1;
        }catch(Exception e){
            return -1;
        }
    }
    
    @Override
    public ResultSet consultaEmpresaTotal(){
        ResultSet rs = null;
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CONSULTA_EMPRESA);
            rs = stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(EmpresaDAOImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }  
}
