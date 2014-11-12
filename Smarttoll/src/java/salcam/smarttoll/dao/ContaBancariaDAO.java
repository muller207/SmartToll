/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.dao;

import java.sql.ResultSet;
import salcam.smarttoll.beans.ContaBancaria;

/**
 *
 * @author Administrador
 */
public interface ContaBancariaDAO {

    public final String CADASTRO_CONTA_BANCARIA="INSERT INTO Contas_Bancarias(CATEGORIA_DESCRICAO,"
            + "CATEGORIA_QTDE_EIXO, CATEGORIA_CGMP, CLASSIFICACAO_CODIGO)"
            + "VALUES(?,?,?,?)";
    public final String MAX_CODIGO_CONTA_BANCARIA="SELECT MAX(CONTA_BANCARIA_CODIGO) as MAX FROM Contas_Bancarias";
    public String CONSULTA_CONTA_BANCARIA="SELECT * FROM Contas_Bancarias";

    
    boolean cadastroContaBancaria(ContaBancaria c);
    
    int maxCodigo();

    ResultSet consultaContaBancaria(String condicao);

    ResultSet consultaContaBancariaTotal();
    
}
