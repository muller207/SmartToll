/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.dao;

import java.sql.ResultSet;
import salcam.smarttoll.beans.BoletoLayout;

/**
 *
 * @author Administrador
 */
public interface BoletoLayoutDAO {
    
    public final String CADASTRO_BOLETO_LAYOUT="INSERT INTO Boletos(LINHA, COLUNA, TAMANHO, CAMPO"
            + "ALINHAMENTO, TIPO, SEQUENCIAL, CONTA_BANCARIA_CODIGO, EMPRESA_CODIGO, CARTEIRA)"
            + "VALUES(?,?,?,?,?,?,?,?,?,?)";
    public final String MAX_CODIGO_BOLETO_LAYOUT="SELECT MAX(SEQUENCIAL) as MAX FROM Boletos_Layouts";
    public String CONSULTA_BOLETO_LAYOUT="SELECT * FROM Boletos_Layouts";

    boolean cadastroBoletoLayout(BoletoLayout b);

    ResultSet consultaBoletoLayout(String condicao);

    ResultSet consultaBoletoLayoutTotal();

    int maxCodigo();
    
}
