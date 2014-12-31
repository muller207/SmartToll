/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.dao;

import java.sql.ResultSet;
import salcam.smarttoll.beans.ReimpressaoJustificativa;

/**
 *
 * @author Administrador
 */
public interface ReimpressaoJustificativaDAO {
    
    public final String CADASTRO_REIMPRESSAO_JUSTIFICATIVA="INSERT INTO Reimpressao_Justificativa"
            + "(JUSTIFICATIVA_CODIGO,DESCRICAO) VALUES(?,?)";
    public final String MAX_CODIGO_REIMPRESSAO_JUSTIFICATIVA="SELECT MAX(JUSTIFICATIVA_CODIGO) as MAX FROM Reimpressao_Justificativa";
    public String CONSULTA_REIMPRESSAO_JUSTIFICATIVA="SELECT * FROM Reimpressao_Justificativa";

    boolean cadastroReimpressaoJustificativa(ReimpressaoJustificativa r);

    ResultSet consultaReimpressaoJustificativa(String condicao);

    ResultSet consultaReimpressaoJustificativaTotal();

    int maxCodigo();
    
}
