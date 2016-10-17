package Vista.Formularios;

/**
 *
 * @author Quintonorrea
 */
import Logica.Vendedores;
import java.io.*;
import java.net.*;

public class clienteUDP {
    static byte[] msg, msgRecibir;
    static DatagramPacket packet, packetRecibir; 
    static DatagramSocket socket;
    static int tam;
    static String dato;
        
  public static void iniciar() throws SocketException{
     socket = new DatagramSocket(12346);
     msg=new byte[1024];
//      inicioCliente.lblResultado.setText("Cliente Ok");
  }//iniciar
  
  public static void enviar(String data) throws IOException, ClassNotFoundException{
      msg = new byte[data.length()];
      msg = data.getBytes();
      packet = new DatagramPacket(msg, msg.length,new InetSocketAddress("127.0.0.1", 12345));
      socket.send(packet);
      System.out.println(data);
//      inicioCliente.lblResultado.setText("c:envío -> "+data);
      recibir();
      
     
  }//enviar
  
  public static void recibir() throws IOException, ClassNotFoundException{
  /////Recibir
      msgRecibir = new byte[1024];
      packetRecibir=new DatagramPacket(msgRecibir,1024);
      socket.receive(packetRecibir);
      
      
      ///
      
      ByteArrayInputStream baos = new ByteArrayInputStream(msgRecibir);
      ObjectInputStream oos = new ObjectInputStream(baos);
      Vendedores vv = (Vendedores)oos.readObject();
      //
      System.out.println(vv.getUsuario()+"-"+vv.getClave());
//      inicioCliente.lblResultado.setText(pp.getNombre()+"-"+pp.getCedula());
      
      /*tam=packetRecibir.getLength();
      dato = new String(packetRecibir.getData());
      dato=limpiar(dato,tam);*/
  }//recibir
  
  
  
  public static String limpiar(String dato, int tam){
    dato= dato.substring(0,tam);
    dato=dato.trim();
    return dato;
}//limpiar
}//class 