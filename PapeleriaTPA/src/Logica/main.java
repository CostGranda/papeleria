/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Vista.Formularios.frmLogin;

/**
 *
 * @author Jorge L Granda.
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LogicaDeNegocio ln = new LogicaDeNegocio();
        frmLogin inicio = new frmLogin();
        inicio.setVisible(true);
    }
    
}
