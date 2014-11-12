/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.dao;

import salcam.smarttoll.beans.White;

/**
 *
 * @author Samuel
 */
public interface WhiteDAO {
    final String CADASTRO_WHITE = "INSERT INTO WHITE(NUM_TAG, DESCRICAO, ATIVO) VALUES(?,?,?)";
    boolean cadastroWhite(White w);
}
