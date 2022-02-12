
package com.mycompany.data_structure;

/**
 *
 * @author jose
 */

public class queue {
    
    //Declaracion de atributos
    private node head;
    private node tail;
    
    //Constructor sin parametros;
    public queue(){
        head=null;
        tail=null;
    }
    

        
    //Metodo insertar o queue
    public void insertar(int dato){
        
        node newNode= new node();
        newNode.setValue(dato);
        newNode.setNext(null);
        
        //xq es nuestro primer elemento en la cola
        if (head==null & tail==null){
            head = newNode;
            tail = newNode;
        }
        System.out.println("El valor anterior del tail es: "+tail.getValue());
        tail.setNext(newNode);
        tail = tail.getNext(); 
        
        System.out.println("El valor actual del tail es: "+tail.getValue());
    }
    
    //Metodo extraer dato
    public void extraer(){
        System.out.println("El valor actual del head es: "+head.getValue());
        
        head = head.getNext();
        
        System.out.println("El valor actual del nuevo head es: "+head.getValue());
    }
    
    //Metodo para comprobar que la cola no esta vacia
    public boolean isEmpty(){
        boolean cola = false;
        if (head == null & tail == null){
            cola = true;
            System.out.println("La cola esta vacia");
        }
        else {
            System.out.println("La cola no esta vacia");
            cola = false;
        }
        return cola;
    }
    
    //Metodo para contar elementos en la cola
    public int cuenta(){
        int resultado=0;
        node c=this.head;
        if(isEmpty()){
            return resultado;
        }
        while (c!=null){
            resultado++;
            c=c.getNext();
        }
        //System.out.println("La cantidad de elementos en la fila es: "+resultado);
        return resultado;
    }
    
}
