/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.dao;

import java.sql.ResultSet;
import salcam.smarttoll.beans.LayoutCupom;

/**
 *
 * @author Administrador
 */
public interface LayoutCupomDAO {
    
    public final String CADASTRO_LAYOUT_CUPOM="INSERT INTO Layout_Cupom(CABECALHO, RODAPE, TELEFONE,"
            + "CNPJ, PRACA, SITE VALUES(?,?,?,?,?,?)";
    public String CONSULTA_LAYOUT_CUPOM = "SELECT * FROM Layout_Cupom";

    boolean cadastroLayoutCupom(LayoutCupom l);

    ResultSet consultaLayoutCupom(String condicao);

    ResultSet consultaLayoutCupomTotal();
    
}
