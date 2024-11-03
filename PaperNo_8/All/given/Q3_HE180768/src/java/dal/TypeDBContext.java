/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.ArrayList;
import model.Type;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Type;

/**
 *
 * @author lam
 */
public class TypeDBContext extends DBContext {

    public ArrayList<Type> list() {
        ArrayList<Type> li = new ArrayList<>();
        String sql = "select TypeName, TypeID\n" +
"from Types";
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                String name = rs.getString("TypeName");
                int id = rs.getInt("TypeID");
                Type d = new Type(id, name);
                li.add(d);
            } 
        } catch (SQLException ex) {
            Logger.getLogger(TypeDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return li;
    }
}
