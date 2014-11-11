/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.dao;

import salcam.smarttoll.beans.Banco;

/**
 *
 * @author Samuel
 */
public interface BancoDAO {
    public final String CADASTRO_BANCO="INSERT INTO Bancos(BANCO_CODIGO, RAZAO, FANTASIA) VALUES(?,?,?)";
    public boolean cadastroBanco(Banco b);
}
