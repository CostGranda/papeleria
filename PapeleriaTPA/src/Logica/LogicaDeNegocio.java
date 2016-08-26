/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.ConexionMySQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jorge L Granda.
 */
public class LogicaDeNegocio {

    private Connection con;

    /**
     * Realiza la conexión inmediatamente se instancia la clase.
     */
    public LogicaDeNegocio() {
        con = ConexionMySQL.establecerConexionSQL();
    }

    /**
     * Valida el usuario o vendedor que inicia sesión para controlar las ventas.
     *
     * @param usuario
     * @param clave
     * @return boolean
     */
    public boolean validarLoginUsuario(String usuario, String clave) {
        boolean b = false;
        ResultSet rs = Usuarios.validarUsuario(con, usuario, clave);
        try {
            if (rs.next()) {
                b = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }
        return b;
    }

    /**
     * Inserta nuevos registros en la tabla Vendedor de la base de datos.
     *
     * @param documento Es el documento del vendedor.
     * @param nombre_completo Nombre con apellidos incluidos.
     * @param telefono Puede ser telefono fijo, se recomienda móvil.
     * @param correo
     * @param VENDEDOR_documento_jefe - Jefe inmediato del nuevo vendedor.
     */
    public void insertarVendedor(String documento, String nombre_completo,
            String telefono, String correo) {
        int cant = Vendedores.insertarRegistros(con, documento, nombre_completo, telefono, correo);
        System.out.println("Cantidad de registros insertados: " + cant);
    }

    public void insertarLogin(String usuario, String clave) {
        int cant = Usuarios.insertarLogin(con, usuario, clave);
        System.out.println("Cantidad de registros insertados: " + cant);
    }

    public boolean validarSiexiste(String usuario) {
        boolean b = false;
        ResultSet rs = Vendedores.validarSiExiste(con, usuario);
        try {
            if (rs.next()) {
                b = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }
        return b;
    }
}
