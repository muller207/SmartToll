/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.dao;

import java.sql.ResultSet;

/**
 *
 * @author Samuel
 */
public interface FuncaoDAO {
    final String CONSULTA_FUNCAO = "SELECT * FROM Funcoes";
    ResultSet consultaFuncaoTotal();  
}
