/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.dao;

import java.sql.ResultSet;
import salcam.smarttoll.beans.Municipio;

/**
 *
 * @author Administrador
 */
public interface MunicipioDAO {
    
    public final String CADASTRO_MUNICIPIO="INSERT INTO Municipios(MUNICIPIO, ESTADO_CODIGO) VALUES(?,?)";
    public String CONSULTA_MUNICIPIO="SELECT * FROM Municipios";

    boolean cadastroMunicipio(Municipio c);

    ResultSet consultaMunicipio(String condicao);

    ResultSet consultaMunicipioTotal();
    
}
