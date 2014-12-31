/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.dao;

import java.sql.ResultSet;

/**
 *
 * @author Administrador
 */
public interface MenuDAO {
    
    public String CONSULTA_MENU = "SELECT * FROM MENUS";

    ResultSet consultaMenuTotal();
    ResultSet consultaMenuGenerica(String sql);
    
}
