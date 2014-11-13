/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.dao;

import java.sql.ResultSet;
import salcam.smarttoll.beans.NELA;

/**
 *
 * @author Administrador
 */
public interface NELADAO {
    
    public final String CADASTRO_NELA="INSERT INTO NELA(ID_PAIS_EMISSOR, ID_EMISSOR_TAG,"
            + "NUM_TAG, MODELO_VEICULO, PLACA_VEICULO, CAT_DO_VEICULO, OPERACAO, STATUS, ACAO)"
            + "VALUES(?,?,?,?,?,?,?,?,?)";    
    public String CONSULTA_NELA="SELECT * FROM NELA";

    boolean cadastroNELA(NELA n);

    ResultSet consultaNELA(String condicao);

    ResultSet consultaNELATotal();
    
}
