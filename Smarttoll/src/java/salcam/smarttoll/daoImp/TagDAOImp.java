/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.daoImp;

import salcam.smarttoll.dao.TagDAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import salcam.smarttoll.beans.Tag;
import salcam.smarttoll.conn.Conn;

/**
 *
 * @author Samuel
 */
public class TagDAOImp implements TagDAO {

    @Override
    public boolean cadatroTag(Tag t) {
        try {
            PreparedStatement stmt = (PreparedStatement) Conn.getConn().prepareStatement(CADASTRO_TAG);
            stmt.setString(1, t.getIdPaisEmissor());
            stmt.setString(2, t.getIdEmissorTag());
            stmt.setString(3, t.getNumTag());
            stmt.setString(4, t.getPlaca());
            stmt.setString(5, t.getCat());
            stmt.setString(6, t.getDiaPgto());
            stmt.setString(7, t.getMeioPgto());
            stmt.setString(8, t.getFormaPgto());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
