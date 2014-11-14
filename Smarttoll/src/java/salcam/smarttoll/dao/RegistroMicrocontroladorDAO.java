/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.dao;

import java.sql.ResultSet;
import salcam.smarttoll.beans.RegistroMicroncontrolador;

/**
 *
 * @author Administrador
 */
public interface RegistroMicrocontroladorDAO {
    
    public final String CADASTRO_REGISTRO_MICROCONTROLADOR="INSERT INTO Registros_Microcontroladores(TIPO, RECIBO,"
            + "EIXOS_SENSOR, LANCAMENTO, CAIXA_CODIGO, TRANSMITIDO, EIXOS_COMERCIAL_SENSOR, IMAGEM_FRONTAL)"
            + "VALUES(?,?,?,?,?,?,?,?)";
    public String CONSULTA_REGISTRO_MICROCONTROLADOR="SELECT * FROM Registros_Microcontroladores";

    boolean cadastroRegistroMicroncontrolador(RegistroMicroncontrolador r);

    ResultSet consultaRegistroMicroncontrolador(String condicao);

    ResultSet consultaRegistroMicroncontroladorTotal();
    
}
