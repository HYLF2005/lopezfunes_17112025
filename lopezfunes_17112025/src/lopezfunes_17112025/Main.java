/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lopezfunes_17112025;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArbolTernarioRecursivo arbol = new ArbolTernarioRecursivo(13);
        
        arbol.insertar('A');
        arbol.insertar('A');
        arbol.insertar('A');
        arbol.insertar('A');
        arbol.asignarHijos(0, 1, 2, 3);
        arbol.insertar('A');
        arbol.insertar('A');
        arbol.insertar('A');
        arbol.asignarHijos(1, 4, 5, 6);
        arbol.insertar('A');
        arbol.insertar('A');
        arbol.insertar('A');
        arbol.asignarHijos(2, 7, 8, 9);
        arbol.insertar('A');
        arbol.insertar('A');
        arbol.insertar('A');
        arbol.asignarHijos(3, 10, 11, 12);
        
        System.out.println("Recorrido pre orden ");
        System.out.println("----------------------");
        arbol.recorrerPreOrden(arbol.raiz);
        System.out.println();
        System.out.println();
        
        System.out.println("Recorrido in Orden ");
        System.out.println("--------------------");
        arbol.recorrerInOrden(arbol.raiz);
        System.out.println();
        System.out.println();
        
        System.out.println("Recorrido post Orden ");
        System.out.println("--------------------");
        arbol.recorrerPostOrden(arbol.raiz);
        System.out.println();
        System.out.println();
        
    }
    
}
