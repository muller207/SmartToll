/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.dao;

import salcam.smarttoll.beans.LogRelatorio;

/**
 *
 * @author Samuel
 */
public interface LogRelatorioDAO {

    public final String CADASTRO_LOG_RELATORIO = "INSERT INTO Logs_Relatorios(FUNCIONARIO_CODIGO, TIPO_RELATORIO_CODIGO, DATA, IP_ADMINISTRATIVO, INSTRUCAO_SQL) VALUES(?,?,?,?,?);";

    boolean cadastroLogRelatorio(LogRelatorio lr);

}
