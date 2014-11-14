/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.dao;

import java.sql.ResultSet;
import salcam.smarttoll.beans.EmpresaTelefone;

/**
 *
 * @author Administrador
 */
public interface EmpresaTelefoneDAO {

    public final String CADASTRO_EMPRESA_TELEFONE="INSERT INTO Empresas_Telefones(EMPRESA_CODIGO, SEQUENCIA,"
            + "DDD, NUMERO, TIPO) VALUES(?,?,?,?,?)";
    public String MAX_CODIGO_EMPRESA_TELEFONE="SELECT MAX(SEQUNCIA) as MAX FROM Empresas_Telefones";
    public String CONSULTA_EMPRESA_TELEFONE="SELECT * FROM Empresas_Telefones";
    
    boolean cadastroEmpresaTelefone(EmpresaTelefone e);

    ResultSet consultaEmpresaTelefone(String condicao);

    ResultSet consultaEmpresaTelefoneTotal();

    int maxCodigo(int cod);
    
}
