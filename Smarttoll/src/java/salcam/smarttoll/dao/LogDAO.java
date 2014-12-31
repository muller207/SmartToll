/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.dao;

import java.sql.ResultSet;
import salcam.smarttoll.beans.Log;

/**
 *
 * @author Administrador
 */
public interface LogDAO {

    public final String CADASTRO_LOG = "INSERT INTO Logs (DATA, FUNCIONARIO_CODIGO, TIPO_LOG_CODIGO, IP, ESTACAO, DESCRICAO, TRANSMITIDO) "
            + "VALUES(?,?,?,?,?,?,?)";
    public String CONSULTA_LOG = "SELECT l.FUNCIONARIO_CODIGO, f.FUNCIONARIO, l.DATA, t.DESCRICAO as TIPO_LOG, l.DESCRICAO, l.ESTACAO, l.IP " +
        " FROM LOGS l LEFT JOIN FUNCIONARIOS f on (f.FUNCIONARIO_CODIGO = l.FUNCIONARIO_CODIGO) " +
        " LEFT JOIN TIPOS_LOGS t ON (t.TIPO_LOG_CODIGO = l.TIPO_LOG_CODIGO) ";
    
    boolean cadastroLog(Log l);
    ResultSet consultaLog(String condicao);
    
}
