/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.dao;

import java.sql.ResultSet;
import salcam.smarttoll.beans.BancoTipoCobranca;

/**
 *
 * @author Administrador
 */
public interface BancoTipoCobrancaDAO {
    
   public final String CADASTRO_BANCO_TIPO_COBRANCA="INSERT INTO "
           + "Bancos_Tipos_Cobrancas(BANCO_TIPO_COBRANCA_CODIGO, BANCO_CODIGO, PADRAO)"
           + "VALUES(?,?,?)";
   public String CONSULTA_BANCO_TIPO_COBRANCA="SELECT * FROM Bancos_Tipos_Cobrancas";

    boolean cadastroBancoTipoCobranca(BancoTipoCobranca b);

    ResultSet consultaBancoTipoCobranca(String condicao);
    
}
