/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.daoImp;

import java.sql.ResultSet;
import salcam.smarttoll.beans.Parametros;

/**
 *
 * @author Administrador
 */
public interface AlteraParametrosDAO {
    
    public String CONSULTA_PARAMETROS = "SELECT * FROM PARAMETROS";
    public String ALTERA_PARAMETROS = "";

    boolean alteraParametros(Parametros p);

    ResultSet consultaParametros(String condicao);
    
}
