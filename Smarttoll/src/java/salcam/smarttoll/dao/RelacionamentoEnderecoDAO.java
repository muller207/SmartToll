/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.dao;

import salcam.smarttoll.beans.RelacionamentoEndereco;

/**
 *
 * @author Samuel
 */
public interface RelacionamentoEnderecoDAO {

    boolean cadastroRelacionamentoEndereco(RelacionamentoEndereco re);

    int getMaxRelacionamentoEnderecoCodigo();
    
}
