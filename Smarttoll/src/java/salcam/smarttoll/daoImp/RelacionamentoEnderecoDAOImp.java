/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.RelacionamentoEnderecoDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import salcam.smarttoll.beans.RelacionamentoEndereco;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Samuel
 */
public class RelacionamentoEnderecoDAOImp implements RelacionamentoEnderecoDAO {

    final String CADASTRO_RELACIONAMENTO_ENDERECO = "INSERT INTO Relacionamentos_Enderecos("
            + "RELACIONAMENTO_CODIGO, "
            + "SEQUENCIA, LOGRADOURO, "
            + "NUMERO, "
            + "CEP, "
            + "BAIRRO, "
            + "MUNICIPIO_CODIGO, "
            + "REGIAO_CODIGO, "
            + "COMERCIAL, "
            + "COBRANCA, "
            + "ENTREGA, "
            + "REFERENCIA, "
            + "COMPLEMENTO, "
            + "TITULO, "
            + "SITUACAO, "
            + "ORDENACAO, "
            + "CONTATO_CODIGO)"
            + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
    
    final String getMaxRelacionamentoEnderecoCodigo = "SELECT MAX(RELACIONAMENTO_CODIGO) AS MAX FROM Relacionamentos_Enderecos";

    @Override
    public boolean cadastroRelacionamentoEndereco(RelacionamentoEndereco re) {
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRO_RELACIONAMENTO_ENDERECO);
            if(!(this.getMaxRelacionamentoEnderecoCodigo()<0)){
                stmt.setInt(1, (this.getMaxRelacionamentoEnderecoCodigo()+1));
                stmt.setByte(2, (byte) re.getSequencia());
                stmt.setString(3, re.getLogradouro());
                stmt.setInt(4, re.getNumero());
                stmt.setString(5, re.getCep());
                stmt.setString(6, re.getBairro());
                stmt.setInt(7, re.getMunicipioCod());
                stmt.setInt(8, re.getRegiaoCod());
                stmt.setBoolean(9, re.isComercial());
                stmt.setBoolean(10, re.isCobranca());
                stmt.setBoolean(11, re.isEntrega());
                stmt.setString(12, re.getReferencia());
                stmt.setString(13, re.getComplemento());
                stmt.setByte(14, re.getTitulo());
                stmt.setByte(15, re.getSituacao());
                stmt.setByte(16, re.getOrdenacao());
                stmt.setByte(17, re.getContatoCod());
                stmt.executeUpdate();
                return true;
            }
            else
                return false;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    @Override
    public int getMaxRelacionamentoEnderecoCodigo(){
        int size=-1;
        try{
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(getMaxRelacionamentoEnderecoCodigo);
            ResultSet rs = stmt.executeQuery();
            try{
                while(rs.next()){
                    size = rs.getInt("MAX");
                }
            }
            catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return size;
    }
}
