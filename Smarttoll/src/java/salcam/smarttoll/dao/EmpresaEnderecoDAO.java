/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.dao;

import java.sql.ResultSet;
import salcam.smarttoll.beans.EmpresaEndereco;

/**
 *
 * @author Administrador
 */
public interface EmpresaEnderecoDAO {
    public final String CADASTRO_EMPRESA_ENDERECO="INSERT INTO Empresas_Enderecos(EMPRESA_CODIGO, SEQUENCIA,"
            + "LOGRADOURO, NUMERO, CEP, BAIRRO, MUNICIPIO_CODIGO, COMERCIAL, COBRANCA, ENTREGA,"
            + "REFERENCIA, COMPLEMENTO, TITULO) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
    public String MAX_CODIGO_EMPRESA_ENDERECO="SELECT MAX(SEQUNCIA) as MAX FROM Empresas_Enderecos";
    public String CONSULTA_EMPRESA_ENDERECO="SELECT * FROM Empresas_Enderecos";

    boolean cadastroEmpresaEndereco(EmpresaEndereco e);

    ResultSet consultaEmpresaEndereco(String condicao);

    ResultSet consultaEmpresaEnderecoTotal();

    int maxCodigo(int cod);
    
}
