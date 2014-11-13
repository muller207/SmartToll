/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.dao;

import java.sql.ResultSet;
import salcam.smarttoll.beans.ContaBancariaCarteira;

/**
 *
 * @author Administrador
 */


public interface ContaBancariaCarteiraDAO {

    public final String CADASTRO_CONTA_BANCARIA_CARTEIRA="INSERT INTO Contas_Bancarias_Carteiras(CONTA_BANCARIA_CODIGO,"
            + "EMPRESA_CODIGO, CARTEIRA, VARIACAO, CONVENIO, BANCO_CODIGO, BANCO_TIPO_COBRANCA_CODIGO, LAYOUT, NOSSO_NUMERO,"
            + "ACAO, VALOR_DESCONTO, VALOR_JUROS, VALOR_MULTA, VALOR_IOF, VALOR_ABATIMENTO, INSTRUCAO_CODIGO_1, INSTRUCAO_CODIGO_2,"
            + "INSTRUCAO_TEXTO_1, INSTRUCAO_TEXTO_2, INSTRUCAO_ADICIONAL, TIPO_PROTESTO, PROTESTO_DIAS, TIPO_DESCONTO, DESCONTO_DIAS,"
            + "DIRETORIO_REMESSA, DIRETORIO_RETORNO, SEQUENCIAL_REMESSA, SEQUENCIAL_RETORNO, SEQUENCIAL_ARQUIVO, TIPO_ABATIMENTO,"
            + "TIPO_JUROS, TIPO_MULTA, MULTA_DIAS, TIPO_BAIXA_DEVOLUCAO, BAIXA_DEVOLUCAO_DIAS)"
            + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    public final String MAX_CODIGO_CONTA_BANCARIA_CARTEIRA="SELECT MAX(CONTA_BANCARIA_CODIGO) as MAX FROM Contas_Bancarias_Carteiras";
    public String CONSULTA_CONTA_BANCARIA_CARTEIRA="SELECT * FROM Contas_Bancarias_Carteiras";
    
    boolean cadastroContaBancariaCarteira(ContaBancariaCarteira c);

    ResultSet consultaContaBancariaCarteira(String condicao);

    ResultSet consultaContaBancariaCarteiraTotal();

    int maxCodigo();
    
}
