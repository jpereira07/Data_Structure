package com.mycompany.data_structure;

/**
 *
 * @author jose
 */

public class listaCircular {
    private nodeLista cabeza;
    private nodeLista ultimo;
    
    public void insertar(persona persona){
        //inserta cuando la lista esta vacia
        if(cabeza == null){
            cabeza = new nodeLista(persona);
            ultimo = cabeza;
            cabeza.setNext(cabeza);
        }
        //inserta segun el orden del id
        else if (persona.getId() < cabeza.getDato().getId() ){
            nodeLista aux = new nodeLista(persona);
            aux.setNext(cabeza);
            ultimo.setNext(aux);
        }
        //evalua si es mayor que el ultimo
        else if (ultimo.getDato().getId() <= persona.getId() ){
            nodeLista aux = new nodeLista(persona);
            ultimo.setNext(aux);
            aux.setNext(cabeza);
            ultimo = aux;
        }
        //insertar en el medio
        else{
            nodeLista aux = new nodeLista(persona);
            nodeLista temp = cabeza;
            //Evaluo un elemento hacia adelante, para ver 
            //si es mayor o igual debo insertar despues
            while(temp.getNext().getDato().getId() < persona.getId()){
                //moverse al siguiente nodo
                temp = temp.getNext();
            }
            aux.setNext(temp.getNext());
            temp.setNext(aux);
        }
        ultimo.setNext(cabeza);
    }
    
    @Override
    public String toString(){
        nodeLista aux = cabeza;
        String contenido = "lista: ";
        if(aux == null){
            contenido+="esta vacio";
        }
        else{
            //imprimir cabeza
            contenido+= aux +", ";
            //aux = aux.getNext();
            //imprime el resto
            while(aux != cabeza){
                contenido+= aux +", ";
                aux = aux.getNext();
                
            }
        }
        return contenido;
    }
    
    public void modifica(persona persona){
        nodeLista aux= cabeza;
        aux.setDato(persona);
        aux.getDato().setNombre(persona.getNombre());
    }
    
    public persona extrae(int id){
        if(cabeza == null){
            return null;
        }
        nodeLista temp = cabeza;
        //escenario si solo hay un elemento en la lista
        if(cabeza.getNext()==cabeza){
            if(cabeza.getDato().getId() == id){
                cabeza = null;
                ultimo = null;
                return temp.getDato();
            }
        }
        
        
        //Escenario id = cabeza
        if(cabeza.getDato().getId() == id){
            cabeza = cabeza.getNext();
            ultimo.setNext(cabeza);
            temp.setNext(null);
        }
        //recorre la lista comparando id
        //hasta llegar al ultimo elemento
        while(temp.getNext().getDato().getId() != id){
            temp = temp.getNext();
        }
        //si no encontro el id y llego a la cabeza de nuevo
        nodeLista aux = temp.getNext();
        temp.setNext(aux.getNext());
        aux.setNext(null);
        //si no lo encuentra
        if(temp.getNext()==cabeza){
            return null;
        }
        //si estoy eliminando al ultimo elemento
        //mantener la referencia del ultimo
        if(aux==ultimo){
            ultimo = temp;
        }
        return aux.getDato();
    }
}
