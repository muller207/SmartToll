/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.dao;

import java.sql.ResultSet;
import salcam.smarttoll.beans.Caixa;

/**
 *
 * @author Administrador
 */
public interface CaixaDAO {
    public final String CADASTRO_CAIXA = "INSERT INTO CAIXAS (SERIAL, SITUACAO,SEMPARAR_PRACA, SEQUENCIAL_ARQUIVO_NELA, SEQUENCIAL_ARQUIVO_TAG,IP,TIPO) VALUES(?,?,?,?,?,?,?)";
    public String CONSULTA_CAIXA = "SELECT * FROM Caixas ";
    ResultSet consultaCaixa(String condicao);
    boolean cadastroCaixa(Caixa c);
    
}
