package servidor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Logica.Vendedores;
import java.net.*;
import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import Datos.ConexionMySQL;

public class servidorUDP {

    static DatagramPacket packet, packetEnviar;
    static DatagramSocket s;
    static byte[] msg, msgEnviar;
    static int tam, cua;
    static String dato, datoEnviar;

    public static void iniciar() throws IOException, FileNotFoundException, ClassNotFoundException {
        s = new DatagramSocket(12345);
        msg = new byte[1024];
        packet = new DatagramPacket(msg, 1024);

        //
        serializa.accion("");
        System.out.println("Serialización OK");

        while (true) {
            recibirDatagramas();
        }
    }//iniciar

    public static void recibirDatagramas() throws IOException, FileNotFoundException, ClassNotFoundException {
        s.receive(packet);
        tam = packet.getLength();
        dato = new String(packet.getData());
        dato = limpiar(dato, tam);
        System.out.println("S:Recibo -> " + dato);

        //se puede validar si existe en la db
        msgEnviar = serializa.accion(dato);
        enviar();
    }//recibir

    public String claveV(String clave) {
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

    public static void enviar() throws SocketException, IOException {
        ///Enviar
        packetEnviar = new DatagramPacket(msgEnviar, msgEnviar.length, new InetSocketAddress(packet.getAddress(), 12346));
        s.send(packetEnviar);
    }///

    public static String limpiar(String dato, int tam) {
        dato = dato.substring(0, tam);
        dato = dato.trim();
        return dato;
    }//limpiar

}//clase
