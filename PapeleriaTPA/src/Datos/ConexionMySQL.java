package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jorge L Granda.
 */
public class ConexionMySQL {

    private Connection con;
    static String db = "Papeleria";
    static String user = "master";
    static String password = "12345678";
    static String server = "jdbc:mysql://mydbinstance.c765otpnmdfd.us-west-2.rds.amazonaws.com:3306/" + db;

    /**
     * Se puede utilizar para realizar la conexión una vez instanciado el objeto.
     */
    public ConexionMySQL() {
    }

    /**
     * Establece la conexión con la base remota MySQL.
     * @return Retorna una conexión o sesión con la base de datos actual.
     */
    public static Connection establecerConexionSQL() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(server, user, password);
            System.out.println("Database connection established.");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("#### No se puede conectar con la base de datos ###");
            Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
