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
    
    public String CONSULTA_LOG_REIMPRESSAO = "SELECT * FROM Log_Reimpressao";

    boolean cadastroLog(LogReimpressao l);

    ResultSet consultaCaixa(String condicao);
    
}
