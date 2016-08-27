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
     * Inserta nuevos registros en la tabla Vendedor de la base de datos.
     *
     * @param documento Es el documento del vendedor.
     * @param nombre_completo Nombre con apellidos incluidos.
     * @param telefono Puede ser telefono fijo, se recomienda móvil.
     * @param correo
     */
    public void insertarVendedor(String documento, String nombre_completo,
            String telefono, String correo) {
        int cant = Vendedores.insertarVendedor(con, documento, nombre_completo, telefono, correo);
        System.out.println("Cantidad de registros insertados: " + cant);
    }

   public void insertarCliente(String documento, String nombre_completo,
            String telefono, String correo) {
        int cant = Clientes.insertarCliente(con, documento, nombre_completo, telefono, correo);
        System.out.println("Cantidad de registros insertados: " + cant);
    }

    public boolean validarSiexisteUsuarioVendedor(String usuario) {
        boolean b = false;
        ResultSet rs = Vendedores.validarSiExisteUsuarioVendedor(con, usuario);
        try {
            if (rs.next()) {
                b = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }
        return b;
    }

    public boolean validarSiExisteCliente(String documento) {
        boolean b = false;
        ResultSet rs = Clientes.validarSiExisteCliente(con, documento);
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
