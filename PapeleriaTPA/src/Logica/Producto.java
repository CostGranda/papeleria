/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author sebgv
 */
public class Producto {
    
    public class nodo{
        public String nombre;
        public String precio;
        public String cantidad;
        public nodo sig;

        public nodo(String nombre, String precio, String cantidad) {
            this.nombre = nombre;
            this.precio = precio;
            this.cantidad = cantidad;
        }

       

        public nodo getSig() {
            return sig;
        }

        public void setSig(nodo sig) {
            this.sig = sig;
        }

        
    }//Fin clase nodo
    
    private nodo raiz;

    public Producto() {
        this.raiz = null;
    }
    
    public boolean estaVacia(){
        return raiz == null;
    }
    
    public void insertarFinal(String nombre,String precio, String cantidad){
        nodo r = new nodo(nombre,precio,cantidad);
        nodo v = this.raiz;
        
        while (r.getSig() != null) {
            r = r.getSig();
        }
        r.setSig(v);
        v.setSig(null);
    }
    
    public void eliminarFinal(){
        nodo aux;
        if (!estaVacia()) {
            aux = raiz;
            while (aux.getSig().getSig() != null) {
                aux = aux.getSig();
            }
            aux.setSig(null);
        }
    }
}
