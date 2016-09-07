/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Console;
import java.sql.ResultSet;
import java.sql.SQLException;
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

        System.out.print("**********************************\n"
                + "*    Bienvenido                  *\n"
                + "**********************************\n"
                + "*   Usuario: ");
        usuario = teclado.next();
        System.out.print("**********************************\n"
                + "*  Contraseña: ");
        password = teclado.next();
        System.out.print("*********************************\n");
        LogicaDeNegocio ln = new LogicaDeNegocio();

        if (ln.validarLoginVendedor(usuario, password)) {
            vendedor();
        } else if (!ln.validarLoginVendedor(usuario, password)) {
            admin();
        } else {
            System.out.println("Usuario o contraseña invalidos,vuelve a ingresarlos");
            Login();
        }
    }//cierre login

    public void vendedor() {
        int op;
        System.out.print(".........................\n"
                + ".  1. Registrar venta   .\n"
                + ".  2. Registrar cliente .\n"
                + ".  3. Salir             .\n"
                + ".........................\n"
                + "~ ");
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
        System.out.print("............................\n"
                + ".  1. Registrar vendedor   .\n"
                + ".  2. Registrar cliente    .\n"
                + ".  3. Registrar productos  .\n"
                + ".  4. Registrar venta      .\n"
                + ".  5. Salir                .\n"
                + "...........................\n"
                + "~ ");
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

        System.out.print("Nombre completo: ");
        nombre = teclado.next();
        System.out.print("Documento: ");
        documento = teclado.next();
        System.out.print("Correo: ");
        correo = teclado.next();
        System.out.print("Telefono: ");
        telefono = teclado.next();
        System.out.print("Usuario: ");
        usuario = teclado.next();
        LogicaDeNegocio ln = new LogicaDeNegocio();

        while (ln.validarSiexisteUsuarioVendedor(usuario)) {
            System.out.println("El usuario " + usuario + " ya existe,elija uno diferente");
            System.out.print("Usuario: ");
            usuario = teclado.next();
        }
        System.out.print("Contraseña: ");
        password = teclado.next();
        System.out.print("Confirmar contraseña: ");
        password2 = teclado.next();
        while (password == null ? password2 != null : !password.equals(password2)) {

            System.out.println("Las contraseñas no coinciden, intente de nuevo. ");
            System.out.print("Contraseña: ");
            password = teclado.next();
            System.out.print("Confirmar contraseña: ");
            password2 = teclado.next();
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

        System.out.println("Documento: ");
        documento = teclado.next();
        LogicaDeNegocio ln = new LogicaDeNegocio();
        if (ln.validarSiExisteCliente(documento)) {
            System.out.println("El cliente " + documento + " ya esta registrado");
            registrarCliente();
        }
        System.out.println("Nombre completo: ");
        nombre = teclado.next();
        System.out.println("Correo: ");
        correo = teclado.next();
        System.out.println("Telefono: ");
        telefono = teclado.next();
        ln.insertarCliente(documento, nombre, telefono, correo);
        System.out.println("¡Cliente registrado satisfactoriamente! ");
    }//Cierre registroCliente

    public void registrarVenta() {
        String documentoCliente;
        String producto = null;
        int precio = 0;
        int cantidad;
        int precioTotal;
        int cod;
        String opcionCliente;
        String opcionInsertar;
        String opcionEliminar;

        Producto pr = new Producto();
        LogicaDeNegocio ln = new LogicaDeNegocio();

        System.out.println("Documento cliente: ");
        documentoCliente = teclado.next();
        if (!ln.validarSiExisteCliente(documentoCliente)) {
            System.out.println("El cliente " + documentoCliente + " no existe ¿Desea registrarlo?");
            opcionCliente = teclado.next();
            if ("si".equals(opcionCliente)) {
                registrarCliente();
                System.out.println("Documento cliente: ");
                documentoCliente = teclado.nextLine();
            }
        }
        ResultSet rs = ln.nombreCliente(documentoCliente);
        try {
            rs.next();
            System.out.println("El cliente: " + rs.getString(1) + " a sido conectado");
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        System.out.println("Codigo producto: ");
        cod = teclado.nextInt();
        rs = ln.listarProductosConsola(cod);
        try {
            rs.next();
            System.out.println("Producto: " + rs.getString(1));
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        rs = ln.listarProductosConsola(cod);
        try {
            rs.next();
            System.out.println("Precio: " + rs.getString(2));
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        System.out.println("Cantidad: ");
        cantidad = teclado.nextInt();
        precioTotal = precio * cantidad;
        pr.insertarFinal(producto, String.valueOf(precio), cantidad);
        System.out.println("¿Desea eliminar el ultimo producto agregado?");
        opcionEliminar = teclado.next();
        if ("si".equals(opcionEliminar)) {
            pr.eliminarFinal();
        }
        System.out.println("¿Desea comprar otro producto?");
        opcionInsertar = teclado.nextLine();
        while ("si".equals(opcionInsertar)) {
            System.out.println("Producto: ");
            producto = teclado.next();
            System.out.println("Precio producto: ");
            precio = teclado.nextInt();
            System.out.println(precio);
            System.out.println("Cantidad: ");
            cantidad = teclado.nextInt();
            precioTotal = precioTotal + (precio * cantidad);
            System.out.println("¿Desea comprar otro producto?");
            opcionInsertar = teclado.next();
        }
        System.out.println("Los productos comprados son: ");
        pr.imprimir();
        System.out.println("El precio total es: " + precioTotal);
    }//cierre registrarVenta

}
