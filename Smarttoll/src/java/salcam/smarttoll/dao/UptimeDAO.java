/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.dao;

import java.sql.ResultSet;
import salcam.smarttoll.beans.Uptime;

/**
 *
 * @author Administrador
 */
public interface UptimeDAO {
    
    public String CONSULTA_UPTIME = "SELECT u.CAIXA_CODIGO, c.SERIAL, f.FUNCIONARIO, u.DATA_INICIO, u.ULTIMO_REGISTRO " +
       " FROM UPTIME u LEFT JOIN CAIXAS c ON (c.CAIXA_CODIGO = u.CAIXA_CODIGO) " +
       " LEFT JOIN FUNCIONARIOS f ON (f.FUNCIONARIO_CODIGO = u.FUNCIONARIO_CODIGO) ";

    boolean cadastroUptime(Uptime u);

    ResultSet consultaUptimeEspecial(String sql);
    
    ResultSet consultaUptime(String condicao);
    
}
