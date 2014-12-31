/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.dao;

import java.sql.ResultSet;
import salcam.smarttoll.beans.LogReimpressao;

/**
 *
 * @author Administrador
 */
public interface LogReimpressaoDAO {
    
    public final String CADASTRO_LOG_REIMPRESSAO = "INSERT INTO "
            + "Log_Reimpressao (DATA, CAIXA_CODIGO, FUNCIONARIO_CODIGO, IP, CABINE, TIPO, DESCRICAO, "
            + "JUSTIFICATIVA_CODIGO, DESCRICAO_USUARIO, PLACA_VEICULO, TRANSMITIDO, CLASSIFICACAO_CODIGO)"
            + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
    
    public String CONSULTA_LOG_REIMPRESSAO = "SELECT f.FUNCIONARIO, l.CABINE, l.DATA, r.DESCRICAO as JUSTIFICATIVA, l.DESCRICAO, l.PLACA_VEICULO, c.DESCRICAO as CLASSIFICACAO, l.IP " +
        " FROM LOG_REIMPRESSAO l LEFT JOIN FUNCIONARIOS f on (f.FUNCIONARIO_CODIGO = l.FUNCIONARIO_CODIGO) " +
        " LEFT JOIN REIMPRESSAO_JUSTIFICATIVA r ON (r.JUSTIFICATIVA_CODIGO = l.JUSTIFICATIVA_CODIGO) " +
        " LEFT JOIN CLASSIFICACOES c ON (c.CLASSIFICACAO_CODIGO = l.CLASSIFICACAO_CODIGO) ";

    boolean cadastroLogReimpressao(LogReimpressao l);

    ResultSet consultaLogReimpressao(String condicao);
    
}
