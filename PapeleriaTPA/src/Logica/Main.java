/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Vista.Formularios.frmLogin;
import java.util.Scanner;

/**
 *
 * @author Jorge L Granda.
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String opcion;
        System.out.print("*********************************************\n"
                + "*                Bienvenido                 *\n"
                + "*********************************************\n"
                + "* ¿Desea ver el proyecto por consola o GUI? *\n"
                + "* 1 Para GUI                                *\n"
                + "* 2 para consola                            *\n"
                + "*********************************************\n"
                + "~");
        opcion = teclado.next();
            if ("1".equals(opcion)) {
                frmLogin inicio = new frmLogin();
                inicio.setVisible(true);
            } else if ("2".equals(opcion)) {
                MenusConsola consola = new MenusConsola();
                consola.Login();
            } else {
                System.out.println("Opcion incorrecta");
                main(args);
            }
    }
}
