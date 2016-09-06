/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sebastián Giraldo, Jorge L Granda.
 */
public class Producto {

    class nodo {

        public String nombre;
        public String precio;
        public int cantidad;
        nodo sig;

        public nodo(String nombre, String precio, int cantidad) {
            this.nombre = nombre;
            this.precio = precio;
            this.cantidad = cantidad;
        }

    }//Fin clase nodo

    private nodo raiz, fondo;

    public Producto() {
        raiz = null;
        fondo = null;
    }

    public boolean vacia() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insertarFinal(String nombre, String precio, int cantidad) {
        nodo nuevo;
        nuevo = new nodo(nombre, precio, cantidad);
        nuevo.sig = null;
        if (vacia()) {
            raiz = nuevo;
            fondo = nuevo;
        } else {
            fondo.sig = nuevo;
            fondo = nuevo;
        }
    }

    public void eliminarFinal() {
        nodo aux,ant;
        if (!vacia()) {
            if (raiz == fondo) {
                raiz = null;
                fondo = null;
            } else {
                aux = raiz;
                ant = raiz;
                while (aux.sig != null) {
                    ant = aux;
                    aux = aux.sig;
                }
                ant.sig = null;
                fondo = ant;
            }
        }
    }
    
    public void buscarBorrar(String nombre){
        nodo aux;
        if(!vacia()){
            aux = raiz;
            while (aux != null) {
                if(aux.nombre.equals(nombre)){
                    //System.out.println("Encontrado!");
                    aux = null;
                    return;
                }
                aux = aux.sig;
            }
        }
    }
    
    public void eliminar(String nombre){
        
    }

    public void imprimir() {
        nodo reco = raiz;
        System.out.println("Listado de todos los elementos de la cola.");
        while (reco != null) {
            System.out.print(reco.nombre + "-");
            reco = reco.sig;
        }
        System.out.println();
    }

    public static ResultSet listarProductos(Connection con) {
        ResultSet rs = null;
        Statement st;
        try {
            st = con.createStatement();
            String strSql = "SELECT nombre_producto, precio FROM PRODUCTO;";
            rs = st.executeQuery(strSql);
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }
        return rs;
    }
}
