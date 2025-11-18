/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lopezfunes_17112025;

/**
 *
 * @author UFG
 */
public class Nodo {
    
    char valor;
    
    int izquierda;
    
    int centro;
    
    int derecha;
    
    public Nodo(char valor){
        this.valor = valor;
        this.izquierda = -1;
        this.centro = -1;
        this.derecha = -1;
    }
    
}
