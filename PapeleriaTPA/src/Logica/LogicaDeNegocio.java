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
     * @param correo Correo electrónico.
     */
    public void insertarVendedor(String documento, String nombre_completo,
            String telefono, String correo) {
        int cant = Vendedores.insertarRegistros(con, documento, nombre_completo, telefono, correo);
        System.out.println("Cantidad de registros insertados: " + cant);
    }

    /**
     *
     * @param usuario Usuario a registrar.
     * @param clave Constraseña para inciar sesión.
     */
    public void insertarLoginVendedor(String usuario, String clave) {
        int cant = Vendedores.insertarLoginVendedor(con, usuario, clave);
        System.out.println("Vendedor insertado: " + cant);
    }

    /**
     *
     * @param usuario Usuario del vendedor.
     * @return Retorna True si el usuario existe. False de lo contrario.
     */
    public boolean validarSiexisteUsuarioVendedor(String usuario) {
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

    /**
     *
     * @param usuario
     * @param clave
     * @return Retorna True si el vendedor existe. False de lo contrario.
     */
    public boolean validarLoginVendedor(String usuario, String clave) {
        boolean b = false;
        ResultSet rs = Vendedores.validarLoginVendedor(con, usuario, clave);
        try {
            if (rs.next()) {
                b = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }
        return b;
    }

    public boolean validarLoginAdmin(String usuario) {
        boolean b = false;
        ResultSet rs = Vendedores.validarLoginAdmin(con, usuario);
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
     * Registra un nuevo cliente en la BD, se requieren los mismos datos que un
     * vendedor.
     *
     * @param documento
     * @param nombre_completo
     * @param telefono
     * @param correo
     */
    public void insertarCliente(String documento, String nombre_completo,
            String telefono, String correo) {
        int cant = Clientes.insertarCliente(con, documento, nombre_completo, telefono, correo);
        System.out.println("Cantidad de registros insertados: " + cant);
    }

    /**
     * Valida que el cliente no se encuentre ya registrado en la base de datos.
     *
     * @param documento
     * @return Retorna True si el cliente existe. False de lo contrario.
     */
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

    public ResultSet datosCliente(String documento) {
        ResultSet rs = Clientes.datosCliente(con, documento);
        return rs;
    }

    public ResultSet nombreCliente(String documento) {
        ResultSet rs = Clientes.nombreCliente(con, documento);
        return rs;
    }

    public ResultSet listarProductos() {
        ResultSet rs = Producto.listarProductos(con);
        return rs;
    }
}
