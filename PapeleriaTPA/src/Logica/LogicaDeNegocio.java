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
    

}
