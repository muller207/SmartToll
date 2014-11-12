/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.dao;

import salcam.smarttoll.beans.Sensor;

/**
 *
 * @author Samuel
 */
public interface SensorDAO {

    final String CADASTRO_SENSOR = "INSERT INTO "
            + "Sensores(SENSOR, ATIVADO, DESCRICAO, SITUACAO, MICRO_CONTROLADOR, BIT)"
            + " VALUES(?,?,?,?,?,?);";
    final String getLastSensorCodigo = "SELECT MAX(SENSOR_CODIGO) AS MAX FROM Sensores";
    boolean cadastroSensor(Sensor s);

}
