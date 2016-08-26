/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author sebgv_000
 */
public class Usuarios {

    public static ResultSet validarUsuario(Connection con, String usuario, String clave) {
        ResultSet rs = null;
        Statement st;
        try {
            st = con.createStatement();
            String strSql = "SELECT 1 FROM LOGIN WHERE usuario = '"
                    + usuario + "' AND password = '" + clave + "'";
            rs = st.executeQuery(strSql);
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }
        return rs;
    }

    public static int insertarLogin(Connection con, String usuario, String clave) {
        Statement st;
        int cantfilias = 0;
        try {
            st = con.createStatement();
            String strSql;
            strSql = "INSERT INTO `Papeleria`.`LOGIN` VALUES ('"+usuario+"','"+clave+"','vendedor');";
            cantfilias = st.executeUpdate(strSql);
        } catch (SQLException ex) {
            System.out.println("\nError al INSERTAR: " + ex);
        }
        return cantfilias;
    }
}
