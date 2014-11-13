/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.dao;

import java.sql.ResultSet;
import salcam.smarttoll.beans.Isento;

/**
 *
 * @author Administrador
 */
public interface IsentoDAO {

    public final String CADASTRO_ISENTO="INSERT INTO Isentos(ISENTO_CODIGO, ATIVO, NOME, VENCIMENTO, CARTAO) "
            + "VALUES(?,?,?,?,?)";
    public final String MAX_CODIGO_ISENTO="SELECT MAX(ISENTO_CODIGO) as MAX FROM Isentos";
    public String CONSULTA_ISENTO="SELECT * FROM Isentos";
    
    boolean cadastroIsento(Isento i);

    ResultSet consultaIsento(String condicao);

    ResultSet consultaIsentoTotal();

    int maxCodigo();
    
}
