/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.dao;

import java.sql.ResultSet;
import salcam.smarttoll.beans.Classificacao;

/**
 *
 * @author Administrador
 */
public interface ClassificacaoDAO {
    
    public final String CADASTRA_CLASSIFICACAO = "INSERT INTO "
            + "Classificacoes(CLASSIFICACAO, DESCRICAO, TARIFA, EIXOS, SITUACAO, EIXOS_COMERCIAL, SEMPARAR)"
            + "VALUES(?,?,?,?,?,?,?)";
    public String CONSULTA_CLASSIFICACAO = "SELECT * FROM Classificacoes";

    boolean cadastroClassificacao(Classificacao c);

    ResultSet consultaClassificacaoTotal();

    ResultSet consultaClassificacao(String condicao);
    
}
