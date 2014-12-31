/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.dao;

import java.sql.ResultSet;
import salcam.smarttoll.beans.LogRelatorio;

/**
 *
 * @author Administrador
 */
public interface LogRelatorioDAO {

    public final String CADASTRO_LOG_RELATORIO = "INSERT INTO LOGS_RELATORIOS(FUNCIONARIO_CODIGO, TIPO_RELATORIO_CODIGO, "
            + " DATA, IP_ADMINISTRATIVO, INSTRUCAO_SQL) "
            + " VALUES(?,?,?,?,?) ";
    
    public String CONSULTA_LOG_RELATORIO = "SELECT l.DATA, l.IP_ADMINISTRATIVO, f.FUNCIONARIO, t.TIPO_RELATORIO as RELATORIO " +
        " FROM LOGS_RELATORIOS l LEFT JOIN FUNCIONARIOS f on (f.FUNCIONARIO_CODIGO = l.FUNCIONARIO_CODIGO) " +
        " LEFT JOIN TIPO_RELATORIOS t ON (t.TIPO_RELATORIO_CODIGO = l.TIPO_RELATORIO_CODIGO) ";
    
    ResultSet consultaLogRelatorio(String condicao);
    
    boolean cadastroLogRelatorio(LogRelatorio l);
    
}
