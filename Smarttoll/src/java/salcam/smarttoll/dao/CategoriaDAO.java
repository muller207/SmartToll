/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.dao;

import java.sql.ResultSet;
import salcam.smarttoll.beans.Categoria;

/**
 *
 * @author Administrador
 */
public interface CategoriaDAO {
    public final String CADASTRO_CATEGORIA="INSERT INTO Categorias(CATEGORIA_DESCRICAO,"
            + "CATEGORIA_QTDE_EIXO, CATEGORIA_CGMP, CLASSIFICACAO_CODIGO)"
            + "VALUES(?,?,?,?)";
    public String CONSULTA_CATEGORIA="SELECT * FROM Categorias";

    boolean cadastroCategoria(Categoria c);

    ResultSet consultaCategoria(String condicao);

    ResultSet consultaCategoriaTotal();
    
}
