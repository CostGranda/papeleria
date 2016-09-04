/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Console;
import java.util.Scanner;

/**
 *
 * @author sebgv
 */
public class MenusConsola {

    private Scanner teclado = new Scanner(System.in);

    public void Login() {
        String usuario;
        String password;
        Console terminal = System.console();

        System.out.println("******************\n"
                + "*    Bienvenido  *\n"
                + "******************\n"
                + "*   Usuario:     *\n"
                + "******************");
        usuario = teclado.nextLine();
        System.out.println("****************\n"
                           +"*  Contraseña: *\n"
                           +"****************");
        password = teclado.nextLine();

        LogicaDeNegocio ln = new LogicaDeNegocio();
        if ("admin".equals(usuario)) {
            if (ln.validarLoginAdmin(usuario, password)) {
                admin();
            } else {
                System.out.println("Usuario o contraseña invalidos,vuelve a ingresarlos");
                Login();
            }

        } else if (ln.validarLoginVendedor(usuario, password)) {
            vendedor();
        } else {
            System.out.println("Usuario o contraseña invalidos,vuelve a ingresarlos");
            Login();
        }
    }//cierre login

    public void vendedor() {
        int op;
        System.out.println(".........................\n"
                + ".  1. Registrar venta   .\n"
                + ".  2. Registrar cliente .\n"
                + ".  3. Salir             .\n"
                + ".........................");
        op = teclado.nextInt();
        do {
            switch (op) {
                case 1:
                    registrarVenta();
                    break;
                case 2:
                    registrarCliente();
                    break;
                case 3:
                    System.out.println("¡Adios!");
                    break;
                default:
                    System.out.println("No se reconoce la opcion insertada. Intente de nuevo.");
                    vendedor();
            }
        } while (op < 1 && op >= 3);

    }//Cierre vendedor

    public void admin() {
        int op = 0;
        System.out.println("............................\n"
                + ".  1. Registrar vendedor   .\n"
                + ".  2. Registrar cliente    .\n"
                + ".  3. Registrar productos  .\n"
                + ".  4. Registrar venta      .\n"
                + ".  5. Salir                .\n"
                + "...........................");
        op = teclado.nextInt();
        do {
            switch (op) {
                case 1:
                    registrarVendedor();
                    break;
                case 2:
                    registrarCliente();
                    break;
                case 3:
                    break;
                case 4:
                    registrarVenta();
                    break;
                case 5:
                    System.out.println("¡Adios!");
                    break;
                default:
                    System.out.println("No se reconoce la opcion insertada. Intente de nuevo.");
                    admin();
            }
        } while (op < 1 && op >= 5);
    }//Cierre vendedor

    public void registrarVendedor() {
        String nombre;
        String documento;
        String correo;
        String telefono;
        String usuario;
        String password;
        String password2;

        System.out.println("Nombre completo: ");
        nombre = teclado.nextLine();
        System.out.println("Documento: ");
        documento = teclado.nextLine();
        System.out.println("Correo: ");
        correo = teclado.nextLine();
        System.out.println("Telefono: ");
        telefono = teclado.nextLine();
        System.out.println("Usuario: ");
        usuario = teclado.nextLine();
        LogicaDeNegocio ln = new LogicaDeNegocio();

        while (ln.validarSiexisteUsuarioVendedor(usuario)) {
            System.out.println("El usuario" + usuario + " ya existe,elija uno diferente");
            System.out.println("Usuario: ");
            usuario = teclado.nextLine();
        }
        System.out.println("Contraseña: ");
        password = teclado.nextLine();
        System.out.println("Confirmar contraseña: ");
        password2 = teclado.nextLine();
        while (password == null ? password2 != null : !password.equals(password2)) {

            System.out.println("Las contaseñas no coinciden, intente de nuevo. ");
            System.out.println("Contraseña: ");
            password = teclado.nextLine();
            System.out.println("Confirmar contraseña: ");
            password2 = teclado.nextLine();
        }
        ln.insertarVendedor(documento, nombre, telefono, correo);
        ln.insertarLoginVendedor(usuario, password);
        System.out.println("¡Cuenta creada satisfactoriamente! ");
    }//Cierre registroVendedor

    public void registrarCliente() {
        String nombre;
        String documento;
        String correo;
        String telefono;

        System.out.println("Nombre completo: ");
        nombre = teclado.nextLine();
        System.out.println("Documento: ");
        documento = teclado.nextLine();
        System.out.println("Correo: ");
        correo = teclado.nextLine();
        System.out.println("Telefono: ");
        telefono = teclado.nextLine();

        LogicaDeNegocio ln = new LogicaDeNegocio();
        if (ln.validarSiExisteCliente(documento)) {
            System.out.println("El cliente " + documento + " ya esta registrado");
            registrarCliente();
        }
        ln.insertarCliente(documento, nombre, telefono, correo);
        System.out.println("¡Cliente registrado satisfactoriamente! ");
    }//Cierre registroCliente

    public void registrarVenta() {
        String documentoCliente;
        String producto;
        int precio = 0;
        int cantidad;
        int precioTotal;
        String opcionCliente;
        String opcionInsertar;
        String opcionEliminar;

        Producto pr = new Producto();
        LogicaDeNegocio ln = new LogicaDeNegocio();

        System.out.println("Documento cliente: ");
        documentoCliente = teclado.nextLine();
        if (ln.validarSiExisteCliente(documentoCliente)) {
            System.out.println("El cliente no existe" + documentoCliente + "¿Desea registrarlo?");
            opcionCliente = teclado.nextLine();
            if ("si".equals(opcionCliente)) {
                registrarCliente();
                System.out.println("Documento cliente: ");
                documentoCliente = teclado.nextLine();
            }
        }
        System.out.println("Producto: ");
        producto = teclado.nextLine();
        //precio = lo que sea;
        System.out.println(precio);
        System.out.println("Cantidad: ");
        cantidad = teclado.nextInt();
        precioTotal = precio * cantidad;
        pr.insertarFinal(producto, String.valueOf(precio), String.valueOf(cantidad));
        System.out.println("¿Desea eliminar el ultimo producto agregado?");
        opcionEliminar = teclado.nextLine();
        if ("si".equals(opcionEliminar)) {
            pr.eliminarFinal();
        }
        System.out.println("¿Desea comprar otro producto?");
        opcionInsertar = teclado.nextLine();
        while("si".equals(opcionInsertar)) {
            System.out.println("Producto: ");
            producto = teclado.nextLine();
            //precio = lo que sea;
            System.out.println(precio);
            System.out.println("Cantidad: ");
            cantidad = teclado.nextInt();
            precioTotal = precioTotal + (precio * cantidad);
            System.out.println("¿Desea comprar otro producto?");
            opcionInsertar = teclado.nextLine();
        }
        System.out.println("El precio total es: "+ precioTotal);
    }//cierre registrarVenta

}
