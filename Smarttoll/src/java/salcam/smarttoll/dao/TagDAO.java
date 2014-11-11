/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.dao;

import salcam.smarttoll.beans.Tag;

/**
 *
 * @author Samuel
 */
public interface TagDAO {

    final String CADASTRO_TAG = "INSERT INTO TAGS"
            + "(ID_PAIS_EMISSOR, ID_EMISSOR_TAG, NUM_TAG, PLACA, CAT, DIA_PGTO, MEIO_PGTO, FORMA_PGTO)"
            + " VALUES(?,?,?,?,?,?,?,?);";

    boolean cadatroTag(Tag t);

}
