/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.dao;

import salcam.smarttoll.beans.LogMenu;

/**
 *
 * @author Samuel
 */
public interface LogMenuDAO {
    final String CADASTRO_LOG_MENU = "INSERT INTO Logs_Menu(FUNCIONARIO_ADMINISTRATIVO, FUNCIONARIO_CODIGO, DATA, MENU_CODIGO, DIREITO, ACAO, IP, ESTACAO) VALUES(?,?,?,?,?,?,?,?);";
    
    boolean cadastroLogMenu(LogMenu lm);
    
}
