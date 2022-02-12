
package com.mycompany.data_structure;

/**
 *
 * @author jose
 */
public class stack {
    private node top;
    private int lenght;
    
    public void stack(){
        top=null;
        lenght=0;
    }
    
    public boolean isEmpty(){
        if(top==null){
            System.out.println("La pila se encuentra vacia");
            return true;
        }
        else{
            return false;
        }
    }
    
    public int getLenght(){
        return lenght;
    }
    
    /**
     * Este metodo ingresa un nuevo valor al inicio/top de nuestra pila
     * @param value = valor a agregar a nuestra pila
     */
    public void push (int value){
        node newNode= new node();
        newNode.setValue(value);
        
        //verifica si la lista esta empty
        if (isEmpty()){
            // inicializa la pila con el newNode
            top=newNode;
            System.out.println("Se agrego nuestro nuevo nodo al top de la pila: ");
            System.out.println(top.getValue());
        }
        else{
            System.out.println("El top anterior es: ");
            System.out.println(top.getValue());
            newNode.setNext(top);
            
            //nuestro top ahora es el nuevo node
            top=newNode;
            System.out.println("Se agrego nuestro nuevo nodo al top de la pila: ");
            System.out.println(top.getValue());
        }
        lenght++;
    }
    /**
     * quita el top de la pila
     */
    public void pop (){
        if(isEmpty()){
            System.out.println("No existe elementos que tomar");
        }
        else{
            System.out.println("Se elimino el top de la pila que era: ");
            System.out.println(top.getValue());
            
            //Asigna como primer elemento, al siguiente de la pila
            top=top.getNext();
            System.out.println("El nuevo top es: ");
            System.out.println(top.getValue());
            lenght--;
        }
    }
    
}
