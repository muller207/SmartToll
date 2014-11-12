/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.dao;

import java.sql.ResultSet;
import salcam.smarttoll.beans.Empresa;

/**
 *
 * @author Samuel
 */
public interface EmpresaDAO {

    public final String CADASTRA_EMPRESA = "INSERT INTO Empresas(EMPRESA_CODIGO, RAZAO, FANTASIA, CNPJ, IE,"
                + " OBSERVACAO, HOMEPAGE, EMAIL, SENHA_EMAIL, LOGIN_EMAIL, SMTP,"
                + " AUTENTICADO, INSCRICAO_MUNICIPAL)"
                + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
    public final String CONSULTA_EMPRESA="SELECT * FROM Empresas";
    public final String MAX_CODIGO_EMPRESA = "SELECT MAX(EMPRESA_CODIGO) as MAX FROM Empresas";
    boolean cadastroEmpresa(Empresa e);
    ResultSet consultaEmpresaTotal();
    int maxCodigo();
    
    
}
