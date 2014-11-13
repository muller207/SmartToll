/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.dao;

import java.sql.ResultSet;
import salcam.smarttoll.beans.Estado;

/**
 *
 * @author Administrador
 */
public interface EstadoDAO {
    
    public final String CADASTRO_ESTADO="INSERT INTO Estados(ESTADO_CODIGO, ESTADO) VALUES(?,?)";
    public String CONSULTA_ESTADO="SELECT * FROM Estados";

    boolean cadastroEstado(Estado e);

    ResultSet consultaEstado(String condicao);

    ResultSet consultaEstadoTotal();
    
}
