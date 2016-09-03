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
 * @author Sebastián Giraldo, Jorge L Granda.
 */
public class Vendedores {
    
    /**
     * Este metodo inserta un vendedor en la base de datos. 
     * 
     * @param con La conexión o sesión con la base de datos actual.
     * @param documento
     * @param nombre_completo
     * @param telefono Puede ser telefono fijo, se recomienda móvil.
     * @param correo 
     * @return La catidad de filas
     */
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
    
    /**
     * Se utiliza este método cuando se va a registrar un nuevo vendedor
     * se le asigna un usuario y una clave para su identificación
     * @param con La conexión o sesión con la base de datos actual.
     * @param usuario
     * @param clave
     * @return 
     */
    
    public static int insertarLoginVendedor(Connection con, String usuario, String clave){
        int cantfilas = 0;
        Statement st;
        try {
            st = con.createStatement();
            String strSql;
            strSql = "INSERT INTO `Papeleria`.`LOGIN` VALUES ('"+usuario+"','"+clave+"','vendedor');";
        } catch (Exception e) {
        }
        return cantfilas;
    }
    
    /**
     * Valida si el usuario del vendedor que se va a registrar ya se encuentra 
     * en la base de datos.
     * @param con La conexión o sesión con la base de datos actual.
     * @param usuario
     * @return Retorna True si el vendedor existe. False de lo contrario.
     */
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
        
        /**
         * Hace la validación para que se pueda iniciar sesión en el aplicativo.
         * @param con La conexión o sesión con la base de datos actual.
         * @param usuario
         * @param clave
         * @return Retorna True si el vendedor existe. False de lo contrario.
         */
        public static ResultSet validarLoginVendedor(Connection con, String usuario, String clave) {
        ResultSet rs = null;
        Statement st;
        try {
            st = con.createStatement();
            String strSql = "SELECT 1 FROM LOGIN WHERE usuario = '" + usuario + "' and password = '"+clave+"'";
            rs = st.executeQuery(strSql);
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }
        return rs;
    }
}
