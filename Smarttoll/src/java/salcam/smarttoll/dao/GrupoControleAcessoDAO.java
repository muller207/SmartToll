/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.dao;

import java.sql.ResultSet;
import salcam.smarttoll.beans.GrupoControleAcesso;

/**
 *
 * @author Administrador
 */
public interface GrupoControleAcessoDAO {
    
    public final String CADASTRA_GRUPO_CONTROLE_ACESSO = "INSERT INTO GRUPOS_CONTROLE_ACESSO(DESCRICAO) VALUES (?)";
    
    public String CONSULTA_GRUPO_CONTROLE_ACESSO = "SELECT * FROM GRUPOS_CONTROLE_ACESSO";
    
    public final String EXCLUIR_GRUPO_CONTROLE_ACESSO = "DELETE FROM GRUPOS_CONTROLE_ACESSO WHERE "
            + " GRUPO_CONTROLE_ACESSO_CODIGO = ? ";

    ResultSet consultaGrupoControleAcesso(String condicao);
    ResultSet consultaGrupoControleAcessoGenerica(String sql);
    boolean excluirGrupoControleAcesso(byte grupoCod);
    boolean cadastraGrupoControleAcesso(GrupoControleAcesso g);
    
}
