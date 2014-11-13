/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.dao;

import salcam.smarttoll.beans.Parametro;

/**
 *
 * @author Samuel
 */
public interface ParametroDAO {
    final String CADASTRO_PARAMETRO = "INSERT INTO Parametros(EMPRESA_CODIGO, IMAGEM_PADRAO, VERSAO, HOJE, GRADES_PERSONALIZADAS, CHAVE, CABECALHO, RODAPE, TELEFONE, CNPJ, PRACA, VERSAO_ATUALIZACAO, SEMPARAR_CAMINHO_TAF, SEMPARAR_SEQUENCIAL_TAF, CAMINHO_IMAGENS_BOTOES, CAMPO_ESPECIE_BOLETO, TIPO_LETRA, CAMINHO_PADRAO) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
    boolean cadatroParametro(Parametro p);
    
}
