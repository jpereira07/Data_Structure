 
package com.mycompany.data_structure;


/**
 *
 * @author jose
 */

public class Main {
    static int arr[]={5, 2, 3, 8, 4};
    static int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
    public static void main(String[] args){
        
                                //Recursividad
        //System.out.println(recursion.factorial(3));
        //System.out.println(recursion.buscarElemento(arr, 0, 5, arr.length-1));
        
                
                                    //Pilas
                                    
        /*stack Pila= new stack();

        System.out.println("El largo de la pila es de: "+Pila.getLenght());
        Pila.push(24);
        System.out.println("El largo de la pila es de: "+Pila.getLenght());
        Pila.push(7);
        Pila.push(13);
        System.out.println("El largo de la pila es de: "+Pila.getLenght());
        Pila.pop();
        System.out.println("El largo de la pila es de: "+Pila.getLenght());
        */
        
        
                                    /*Queue
        queue cola1=new queue();
        cola1.insertar(46);
        cola1.insertar(85);
        cola1.insertar(47);
        cola1.insertar(96);
        cola1.insertar(12);
                
        System.out.println("La cantidad de elementos en la fila es de: "+cola1.cuenta());
         */
                                    
        //System.out.println(125/10);
        //System.out.println(125%10);
        
        //System.out.println(practica.invertirNumero(123,2));
        
        //String v="hola";
        //System.out.println(v.length());
        
        //System.out.println(v.charAt(3));
        //System.out.println(v.charAt(2));
        //System.out.println(v.charAt(1));
        //System.out.println(v.charAt(0));
        
        //Problema3
        //System.out.println(practica.problema3(arr, arr.length));
        
        //Problema4
        //System.out.println(practica.problema4(arr, arr.length));
        
        //Problema5
        //System.out.println(stack.problema5(matrix));
        
        
        /*list miLista = new list();
        miLista.insertar(new persona(5, "Juan"));
        miLista.insertar(new persona(10, "Pablo"));
        miLista.insertar(new persona(4, "Maria"));
        miLista.insertar(new persona(6, "Carlos"));
        miLista.insertar(new persona(11, "Pinwi"));
        miLista.imprimirLista();
        System.out.println("----------");
        miLista.existe(5);
        miLista.modificar(6, "Jose");
        miLista.imprimirLista();
        //miLista.practica1("Juan");
        */
        listaCircular miLista = new listaCircular();
        
        miLista.insertar(new persona(1, "Pedro1"));
        miLista.insertar(new persona(2, "Juan2"));
        miLista.insertar(new persona(3, "Luz3"));
        miLista.insertar(new persona(4, "Jose4"));
        
    }
}
