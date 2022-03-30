package com.mycompany.data_structure;

/**
 *
 * @author jose
 */

public class listaDobleCircular {
    private nodeDobleCircular cabeza;
    private nodeDobleCircular ultimo;
    
    public listaDobleCircular(){
        
    }
    
    public void insertar(persona persona){
        //no existe ningun otro elemento en la lista
        if(cabeza == null){
            cabeza = new nodeDobleCircular(persona);
            ultimo = cabeza;
            ultimo.setNext(cabeza);
            ultimo.setBack(ultimo);
        }
        //si existe un elemento al menos y se desea insertar al inicio
        else if(persona.getId() < cabeza.getPersona().getId()){
            nodeDobleCircular aux = new nodeDobleCircular(persona);
            aux.setNext(cabeza);
            cabeza.setBack(aux);
            cabeza = aux;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        }
        //insertar al final
        else if (persona.getId() >= persona.getId() ){
            nodeDobleCircular aux = new nodeDobleCircular(persona);
            aux.setBack(ultimo);
            ultimo.setNext(aux);
            ultimo = ultimo.getNext();
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        }
        //insertar en el medio
        else {
            nodeDobleCircular aux = cabeza;
            
            //encuentra la posicion
            while(aux.getNext().getPersona().getId() < persona.getId()){
                aux = aux.getNext();
            }
            nodeDobleCircular temp = new nodeDobleCircular(persona);
            temp.setNext(aux.getNext()); //enlazar temp al siguiente del aux
            temp.setBack(aux);
            temp.getNext().setBack(temp);
            aux.setNext(temp);
            
        }
    }
    
    public boolean existe(int id){
        boolean esta = false;
        if(cabeza == null){
            return false;
        }
        else if(cabeza.getNext()==cabeza){
            if(cabeza.getPersona().getId()==id){
                return true;
            }
            else{
                return false;
            }
        }
        else if(ultimo.getPersona().getId() == id){
            return true;
        }
    }
}
