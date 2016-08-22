package papeleriatpa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

//    Constructor para cargar el driver MySQL
    public ConexionMySQL() {
    }

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

    public static ResultSet validarAdmin(Connection con) {
        ResultSet rs = null;
        Statement st;
        try {
            st = con.createStatement();
            String strSql = "SELECT Id, Nombre, Apellidos, Edad, Direccion, Telefono, perfil\n"
                    + "FROM Estudiantes\n"
                    + "WHERE perfil = 'Admin'";
            rs = st.executeQuery(strSql);
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
            //Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public static ResultSet validarUsuario(Connection con, String usuario, String clave) {
        ResultSet rs = null;
        Statement st;
        try {
            st = con.createStatement();
            String strSql = "SELECT 1 FROM LOGIN WHERE usuario = '"
                    + usuario + "' AND password = '" + clave + "'";
            rs = st.executeQuery(strSql);
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }
        return rs;
    }
}
