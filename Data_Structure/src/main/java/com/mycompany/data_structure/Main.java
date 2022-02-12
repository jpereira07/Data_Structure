
package com.mycompany.data_structure;

/**
 *
 * @author jose
 */
public class Main {
    static int arr[]={12, 24, 5, 7, 9};
    
    public static void main(String[] args){
        
                                /*Recursividad
        //System.out.println(recursion.factorial(3));
        System.out.println(recursion.buscarElemento(arr, 0, 5, arr.length-1));
        */
                
                                    /*Pilas
                                    
        stack Pila= new stack();

        System.out.println("El largo de la pila es de: "+Pila.getLenght());
        Pila.push(24);
        System.out.println("El largo de la pila es de: "+Pila.getLenght());
        Pila.push(7);
        Pila.push(13);
        System.out.println("El largo de la pila es de: "+Pila.getLenght());
        Pila.pop();
        System.out.println("El largo de la pila es de: "+Pila.getLenght());
        */
                                    //Queue
        queue cola1=new queue();
        cola1.insertar(46);
        cola1.insertar(85);
        cola1.insertar(47);
        cola1.insertar(96);
        cola1.insertar(12);
                
        System.out.println("La cantidad de elementos en la fila es de: "+cola1.cuenta());
                                
    }
}
