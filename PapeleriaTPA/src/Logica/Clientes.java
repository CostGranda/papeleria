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
public class Clientes {
    
    /**
     * Valida por medio del documento si el cliente ya se encuentra en la base de datos 
     * @param con La conexión o sesión con la base de datos actual.
     * @param documento Es el documento del cliente que se va a registrar.
     * @return Resultset con la consulta.
     */
    public static ResultSet validarSiExisteCliente(Connection con, String documento) {
        ResultSet rs = null;
        Statement st;
        try {
            st = con.createStatement();
            String strSql = "SELECT 1 FROM CLIENTE WHERE documento_cliente = '"
                    + documento + "';";
            rs = st.executeQuery(strSql);
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }
        return rs;
    }
    
    /**
     * Registra un nuevo cliente en la base de datos.
     * @param con La conexión o sesión con la base de datos actual.
     * @param documento Documento o identifiación del cliente.
     * @param nombre_completo Nombre con apellidos.
     * @param telefono Puede ser telefono fijo, se recomienda móvil.
     * @param correo Correo electrónico.
     * @return Un entero con la cantidad de filas insertadas.
     */
    public static int insertarCliente(Connection con, String documento, String nombre_completo,
            String telefono, String correo) {
        Statement st;
        int cantfilias = 0;
        try {
            st = con.createStatement();
            String strSql;
            strSql = "INSERT INTO `Papeleria`.`CLIENTE` VALUES ( '" + documento + "', '" + nombre_completo + "',"
                    + "'" + telefono + "', '" + correo + "');";
            cantfilias = st.executeUpdate(strSql);
        } catch (SQLException ex) {
            System.out.println("\nError al INSERTAR: " + ex);
        }
        return cantfilias;
    }
    
    public static ResultSet nombreCliente(Connection con, String documento){
        ResultSet rs= null;
        Statement st;
        try {
            st = con.createStatement();
            String strSql = "SELECT nombre_completo FROM CLIENTE WHERE documento_cliente = '"+documento+"';";
            rs = st.executeQuery(strSql);
        } catch (Exception e) {
        }
        return rs;
    }
}
