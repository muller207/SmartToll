/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.dao;

import salcam.smarttoll.beans.TipoLog;

/**
 *
 * @author Samuel
 */
public interface TipoLogDAO {
    final String CADASTRO_TIPO_LOG = "INSERT INTO Tipos_Logs(DESCRICAO, MODULO) VALUES(?,?);";
    boolean cadastroTipoLog(TipoLog tl);
    
}
