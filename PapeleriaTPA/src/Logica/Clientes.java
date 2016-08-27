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
public class Clientes {

    public static ResultSet validarSiExisteCliente(Connection con, String documento) {
        ResultSet rs = null;
        Statement st;
        try {
            st = con.createStatement();
            String strSql = "SELECT 1 FROM CLIENTES WHERE documento = '"
                    + documento + "';";
            rs = st.executeQuery(strSql);
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }
        return rs;
    }

    public static int insertarCliente(Connection con, String documento, String nombre_completo,
            String telefono, String correo) {
        Statement st;
        int cantfilias = 0;
        try {
            st = con.createStatement();
            String strSql;
            strSql = "INSERT INTO `Papeleria`.`CLIENTES` VALUES ( '" + documento + "', '" + nombre_completo + "',"
                    + "'" + telefono + "', '" + correo + "');";
            cantfilias = st.executeUpdate(strSql);
        } catch (SQLException ex) {
            System.out.println("\nError al INSERTAR: " + ex);
        }
        return cantfilias;
    }
}
