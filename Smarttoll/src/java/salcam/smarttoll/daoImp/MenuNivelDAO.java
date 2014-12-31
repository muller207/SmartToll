/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.daoImp;

import java.sql.ResultSet;

/**
 *
 * @author Administrador
 */
public interface MenuNivelDAO {

    public String CONSULTA_MENU_NIVEL = "SELECT * FROM MENUS_NIVEIS";
    
    ResultSet consultaMenuNivelTotal();
    
}
