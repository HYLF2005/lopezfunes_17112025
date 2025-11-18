/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lopezfunes_17112025;

/**
 *
 * @author UFG
 */
public class ArbolTernarioRecursivo {
    
    Nodo[] nodos;
    int raiz;
    
    public ArbolTernarioRecursivo(int tamaño){
        
        nodos = new Nodo[tamaño];
        
        raiz = -1;
    }
    
    public void insertar(char valor){
        
        Nodo nuevo = new Nodo(valor);
        
        for(int i=0; i<nodos.length; i++){
            
            if(nodos[i] == null){
                nodos[i] = nuevo;
                
                if(raiz == -1){
                    raiz = i;
                }
                return;
            }
        }
        System.out.println("El arbol esta lleno");
    }
    
    public void asignarHijos(int padre, int hijoIzq, int hijoCentro, int hijoDer){
        
        nodos[padre].izquierda = hijoIzq;
        nodos[padre].centro = hijoCentro;
        nodos[padre].derecha = hijoDer;
    }
    
    public void recorrerPreOrden(int indices){
        
        if(indices == -1 || nodos [indices] == null){
            return;
           
        }else{
            System.out.print(nodos[indices].valor+" ");
            recorrerPreOrden(nodos[indices].izquierda);
             recorrerPreOrden(nodos[indices].centro);
              recorrerPreOrden(nodos[indices].derecha);
        }
    }
    
    public void recorrerInOrden(int indices){
        
         if(indices == -1 || nodos [indices] == null){
            return;
           
        }else{
            
            recorrerInOrden(nodos[indices].izquierda);
            System.out.print(nodos[indices].valor+" ");
             recorrerInOrden(nodos[indices].centro);
              recorrerInOrden(nodos[indices].derecha);
        }
    }
        
       public void recorrerPostOrden(int indices){
        
         if(indices == -1 || nodos [indices] == null){
            return;
           
        }else{
            
            recorrerPostOrden(nodos[indices].izquierda);
             recorrerPostOrden(nodos[indices].centro);
              recorrerPostOrden(nodos[indices].derecha);
              System.out.print(nodos[indices].valor+" ");
        }
    } 
        
}
    