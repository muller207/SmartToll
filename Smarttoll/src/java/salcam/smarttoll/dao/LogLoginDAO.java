/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.dao;

import java.sql.ResultSet;
import salcam.smarttoll.beans.LogLogin;

/**
 *
 * @author Administrador
 */
public interface LogLoginDAO {
    
    public final String CADASTRO_LOG_LOGIN="INSERT INTO "
            + "Logs_Login (FUNCIONARIO_CODIGO, CONDOMINIO_CODIGO, DATA, SUCESSO, SISTEMA, IP, ESTACAO) "
            + "VALUES (?,?,?,?,?,?,?)";
    public String CONSULTA_LOG_LOGIN="SELECT * FROM Logs_Login";
    public String CONSULTA = "SELECT l.FUNCIONARIO_CODIGO, f.FUNCIONARIO, l.DATA, l.SUCESSO, l.SISTEMA, l.ESTACAO, l.IP FROM Logs_Login l LEFT JOIN Funcionarios f ON(f.FUNCIONARIO_CODIGO = L.FUNCIONARIO_CODIGO)";
            
    boolean cadastroLogLogin(LogLogin l);

    ResultSet consultaLogLogin(String condicao);
    ResultSet consulta(String condicao);
    
}
