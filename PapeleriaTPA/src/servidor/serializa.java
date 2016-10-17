package servidor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge L Granda.
 */
import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import Logica.Vendedores;
import Datos.ConexionMySQL;
public class serializa {

    public static byte[] accion(String usuario) throws FileNotFoundException, IOException, ClassNotFoundException {
        String cl = claveV(usuario);
        Vendedores v = new Vendedores(usuario, cl);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(v);
        oos.flush();
        byte[] arr = baos.toByteArray();
        return arr;

    }//cargar

    public static String claveV(String clave) {
        Connection con;
        ResultSet rs = null;
        con = ConexionMySQL.establecerConexionSQL();
        rs = Vendedores.recuperarClave(con, clave);
        String contra = "null";
        try {
            while (rs.next()) {
                contra = rs.getString(1);
            }
        } catch (Exception e) {
        }
        return contra;
    }

}
