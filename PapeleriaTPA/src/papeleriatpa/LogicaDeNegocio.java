/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papeleriatpa;

import java.sql.Connection;

/**
 *  
 * @author Jorge L Granda.
 */
public class LogicaDeNegocio {

    private Connection con;

    public LogicaDeNegocio() {
        con = ConexionMySQL.establecerConexionSQL();
    }

}
