/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.dao;

import salcam.smarttoll.beans.Relacionamento;

/**
 *
 * @author Samuel
 */
public interface RelacionamentoDAO {
    final String CADASTRO_RELACIONAMENTO = "INSERT INTO Relacionamentos("
            + "RELACIONAMENTO_CODIGO, EMPRESA_CODIGO,"
            + "PESSOA, SITUACAO, "
            + "NOME, APELIDO, "
            + "CNPJ_CPF, IE_RG, "
            + "DATA_CADASTRO, CUSTO, "
            + "OBSERVACAO, HOMEPAGE, "
            + "FUNCIONARIO_CODIGO, MIDIA_CODIGO, "
            + "SEGMENTO_CODIGO, CATEGORIA_CODIGO, "
            + "TIPO_CREDITO_CODIGO, CLIENTE, "
            + "FORNECEDOR, TRANSPORTADORA, "
            + "INSUMO, REPRESENTANTE, "
            + "PRESTADOR_SERVICO, IMAGEM, "
            + "PORCENTAGEM_COMISSAO, LIMITE, "
            + "INSCRICAO_MUNICIPAL, CNAE_CODIGO, "
            + "DATA_DESLIGAMENTO, MOTIVO_CODIGO, "
            + "MOSTRAPASSAGEM, GRAVAPASSAGEM, "
            + "CARTA, TIPO_MENSALIDADE_CODIGO, "
            + "DIA_MENSALIDADE, COBRANCA, "
            + "RECEBE_DESCRITIVO_CONVENIOS, COMISSAO_VENDA, "
            + "ENTREGOU_FICHA, IMPRIME_DESCRITIVO, "
            + "JUCESP, DATA_ABERTURA, "
            + "QTD_FUNCIONARIOS, MATRIZ_FILIAL, "
            + "QTD_FILIAIS, REPRESENTANTE_CODIGO, "
            + "PRIORIDADE, PLANO_CONTA_CODIGO, "
            + "PAIS_CODIGO, RESTRICAO_ADMISSAO, "
            + "FATURAMENTO, ULTIMA_VENDA, "
            + "ULTIMA_COMPRA, MOSTRA_AUTOMATICO_HISTORICO, "
            + "CONTRIBUINTE_ICMS, DEPARTAMENTO_CODIGO, "
            + "USUARIO, SENHA, "
            + "SENHA_ADMINISTRATIVA, FUNCAO_CODIGO, "
            + "HORA_ENTRADA_1, HORA_ENTRADA_2, "
            + "HORA_SAIDA_1, HORA_SAIDA_2, "
            + "HABILITACAO, CATEGORIA, "
            + "EMISSAO_HABILITACAO, VALIDADE, "
            + "DESCONTO_MAX_POR_VENDA, SENHA_SCPC, "
            + "CARTEIRA_TRABALHO, FUNCIONARIO, "
            + "REDUCAO_BASE_CALCULO)"
            + "VALUES("
            + "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
            + "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
            + "?,?,?,?,?,?,?,?,?);";

    final String getMaxRelacionamentoCodigo = "SELECT MAX(RELACIONAMENTO_CODIGO) AS MAX FROM Relacionamentos";
    
    boolean cadastroRelacionamento(Relacionamento r);

    int getMaxRelacionamentoCodigo();
    
}
