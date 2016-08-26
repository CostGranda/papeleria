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
public class Vendedores {

    public static int insertarRegistros(Connection con, String documento,
            String nombre_completo, String telefono, String correo) {
        Statement st;
        int cantfilias = 0;
        try {
            st = con.createStatement();
            String strSql;
            strSql = "INSERT INTO `Papeleria`.`VENDEDOR` VALUES ( '" + documento + "', '" + nombre_completo + "',"
                    + "'" + telefono + "', '" + correo + "');";
            cantfilias = st.executeUpdate(strSql);
        } catch (SQLException ex) {
            System.out.println("\nError al INSERTAR: " + ex);
        }
        return cantfilias;
    }
    
    
    public static ResultSet validarSiExiste(Connection con, String usuario) {
        ResultSet rs = null;
        Statement st;
        try {
            st = con.createStatement();
            String strSql = "SELECT 1 FROM LOGIN WHERE usuario = '" + usuario + "'";
            rs = st.executeQuery(strSql);
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }
        return rs;
    }
}
