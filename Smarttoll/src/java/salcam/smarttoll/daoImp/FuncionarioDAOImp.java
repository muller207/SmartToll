/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.daoImp;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Blob;
import salcam.smarttoll.dao.FuncionarioDAO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import salcam.smarttoll.beans.Funcionario;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Samuel
 */
public class FuncionarioDAOImp implements FuncionarioDAO {
    
    @Override
    public boolean cadastroFuncionario(Funcionario f) {
        try {
            PreparedStatement psmt = Conn.getConn().prepareStatement(CADASTRO_FUNCIONARIO);
            if(maxCodigo()==-1)
                throw new Exception();
            psmt.setInt(1, maxCodigo()+1);
            psmt.setInt(2, f.getEmpresaCod());
            psmt.setString(3, f.getFuncionario());
            psmt.setString(4, f.getApelido());
            psmt.setString(5, f.getCpf());
            psmt.setString(6, f.getRg());
            if(f.getAdmissao()!=null)
                psmt.setDate(7, new Date(f.getAdmissao().getTime()));
            else
                psmt.setDate(7, null);
            psmt.setDate(8, null);
            psmt.setByte(9, f.getSituacao());
            psmt.setString(10, f.getUsuario());
            psmt.setString(11, f.getSenha());
            psmt.setString(12, f.getSenhaAdministrativa());
            psmt.setByte(13, f.getFuncaoCodigo());
            psmt.setString(14, f.getHoraEntrada1());
            psmt.setString(15, f.getHoraEntrada2());
            psmt.setString(16, f.getHoraSaida1());
            psmt.setString(17, f.getHoraSaida2());
            psmt.setString(18, f.getHabilitacao());
            psmt.setString(19, f.getCategoria());
            if(f.getEmissao()!=null)                
                psmt.setDate(20, new Date(f.getEmissao().getTime()));
            else
                psmt.setDate(20, null);
            if(f.getValidade()!=null)
                psmt.setDate(21, new Date(f.getValidade().getTime()));
            else
                psmt.setDate(21, null);
            psmt.setString(22, "");
            psmt.setString(23, "");
            psmt.setString(24, "");
            psmt.setString(25, "");
            if(!f.getImagem().isEmpty()){
                File arquivo = new File(f.getImagem());
                FileInputStream inputStream = new FileInputStream(arquivo);
                psmt.setBinaryStream(26, inputStream, arquivo.length());
            }else{
                psmt.setBlob(26, (Blob) null);
            }
            
            
            psmt.executeUpdate();
            return true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    @Override
    public int maxCodigo(){
        try{
            PreparedStatement stmt = Conn.getConn().prepareStatement(MAX_CODIGO_FUNCIONARIO);
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
    public int consultaFuncionarioLogin(String usuario, String senha){
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CONSULTA_FUNCIONARIO+" WHERE USUARIO='"+usuario+"' AND SENHA='"+senha+"'");
            ResultSet rs = stmt.executeQuery();
            if(rs.next())
                return rs.getInt("FUNCIONARIO_CODIGO");
            else
                return -1;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return -1;
        }        
    }
    
    @Override
    public ResultSet consultaFuncionarioTotal(){
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CONSULTA_FUNCIONARIO+" ORDER BY FUNCIONARIO");
            ResultSet rs = stmt.executeQuery();
            return rs;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }        
    }
    
}
