/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papeleriatpa;

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
    public boolean validarUsuario(String usuario, String clave) {
        boolean b = false;
        ResultSet rs = ConexionMySQL.validarUsuario(con, usuario, clave);
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
