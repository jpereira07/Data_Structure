
package com.mycompany.data_structure;

/**
 *
 * @author jose
 */

public class list {
    
    private nodeLista cabeza;

    public list() {
    }
    
    public nodeLista getcabeza() {
        return cabeza;
    }

    public void setcabeza(nodeLista cabeza) {
        this.cabeza = cabeza;
    }
    public void insertar(persona p){
        if (cabeza==null){
            /*nodeLista nuevoNode = new nodeLista(p);
            cabeza = nuevoNode;*/
            cabeza = new nodeLista(p);
        }
        else if(p.getId() < cabeza.getPersona().getId()){
            nodeLista aux = new nodeLista(p);
            aux.setNext(cabeza);
            cabeza = aux;
        }
        else if(p.getId() > cabeza.getPersona().getId() && cabeza.getNext()==null){
            nodeLista aux = new nodeLista(p);
            cabeza.setNext(aux); //cabeza.setNext(new nodeLista(aux)); 
        }
        else{
            nodeLista aux = cabeza;
            while(aux.getNext()!=null && aux.getNext().getPersona().getId()<p.getId()){
                aux=aux.getNext();
            }
            nodeLista Temp = new nodeLista(p);
            Temp.setNext(aux.getNext());
            aux.setNext(Temp);
        }
        
    }
    
    public void imprimirLista(){
        nodeLista aux=cabeza;
        while(aux != null){
            System.out.println(aux.getPersona().toString());
            aux = aux.getNext();
        }
    }
    
    public boolean existe(int id){
        nodeLista aux = cabeza;
        boolean found = false;
        while(aux != null){
            if(id == aux.getPersona().getId()){
                return true;
            }
            aux = aux.getNext();
        }
        return found;
    }
    
    public void modificar(int id, String nombre){
        nodeLista aux = cabeza;
        while (aux != null){
            if(id == aux.getPersona().getId()){
                aux.getPersona().setNombre(nombre);
            }
            aux = aux.getNext();
        }
    }
    
    
    //Practica #1, buscar un string en una lista
    //imprimir el valor antes de la posicion indicada
    public void practica1(String nombre){
        nodeLista aux = cabeza;
        while(aux != null){
            if(nombre == aux.getPersona().getNombre()){
                System.out.println("La posicion anterior es:"+aux);
                System.out.println("existe");
            }
            else{
                System.out.println("No existe");
            }
            aux = aux.getNext();
        }
        
    }
    
}
