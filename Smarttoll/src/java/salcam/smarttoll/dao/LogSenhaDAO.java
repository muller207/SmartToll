/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.dao;

import salcam.smarttoll.beans.LogSenha;

/**
 *
 * @author Samuel
 */
public interface LogSenhaDAO {

    final String CADASTRO_LOG_SENHA = "INSERT INTO Logs_Senha(FUNCIONARIO_ADMINISTRATIVO, FUNCIONARIO_CODIGO, DATA, TIPO_SENHA, IP, ESTACAO) VALUES(?,?,?,?,?,?)";

    boolean cadastroLogSenha(LogSenha ls);

}
