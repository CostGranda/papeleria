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

    /*
    Métodos para los productos
     */
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

    /*
    Métodos para los productos
     */
    public void insertarProducto(String nombre, String descripcion, String precio, String dispo_venta) {
        int cant = Producto.insertarProducto(con, nombre, descripcion, precio, dispo_venta);
        System.out.println("Cantidad de registros insertados: " + cant);
    }

    public void actualizarProducto(String nombre, String descripcion, String precio, String dispo_venta) {
        int cant = Producto.actualizarProducto(con, nombre, descripcion, precio, dispo_venta);
        System.out.println("Cantidad de registros actualizados: " + cant);
    }

    public boolean validarSiExisteProductoNombre(String nombre) {
        boolean b = false;
        ResultSet rs = Producto.validarSiExisteProductoNombre(con, nombre);
        try {
            if (rs.next()) {
                b = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }
        return b;
    }
    
    public boolean validarSiExisteProductoCodigo(String codigo) {
        boolean b = false;
        ResultSet rs = Producto.validarSiExisteProductoCodigo(con, codigo);
        try {
            if (rs.next()) {
                b = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }
        return b;
    }

    public ResultSet listarProductos() {
        ResultSet rs = Producto.listarProductos(con);
        return rs;
    }

    public ResultSet listarProductosCodigo(int cod) {
        ResultSet rs = Producto.listarProductosCodigo(con, cod);
        return rs;
    }

    public ResultSet listarProductosNombre(String nombre) {
        ResultSet rs = Producto.listarProductosNombre(con, nombre);
        return rs;
    }
}
