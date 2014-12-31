/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.dao;

import java.sql.ResultSet;

/**
 *
 * @author Administrador
 */
public interface TipoRelatorioDAO {
    
    public String CONSULTA_TIPO_RELATORIO = "SELECT * FROM TIPO_RELATORIOS ";

    ResultSet consultaTipoRelatorioTotal();
    
}
