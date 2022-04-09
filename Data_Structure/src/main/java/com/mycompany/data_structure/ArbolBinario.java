package com.mycompany.data_structure;

/**
 *
 * @author jose
 */

public class ArbolBinario {
    
    private NodoArbol raiz;
    private int altura;
    
    public void inserta(int value){
        if(raiz==null){
            raiz = new NodoArbol(value);
        }
        else{
            insertar(raiz, value);
        }
    }
    public void insertar(NodoArbol nodo, int value){
          
        if(value < nodo.getId()){ //nodo iria a la izquierda
            if(nodo.getHijoIzq()==null){
                nodo.setHijoIzq(new NodoArbol(value));
            }
        
            else{
            insertar(nodo.getHijoIzq(), value);
            }
        }
        else{ //nodo iria a la derecha
            if(nodo.getHijoDer()==null){
                nodo.setHijoDer(new NodoArbol(value));
            }
            else{
                insertar(nodo.getHijoDer(), value);
            }
        }
    }
    //imprimier arbol
    public void inOrden(){
        if(raiz!=null){
            inOrdenRecorrer(raiz);
        }
        else{
            System.out.println("Arbol esta vacio");
        }

    }
    private void inOrdenRecorrer(NodoArbol nodo){
        
        if(nodo!=null){
            //System.out.println("Nodo recursivo es: "+ nodo.getId());
            inOrdenRecorrer(nodo.getHijoIzq());
            System.out.println(nodo.getId());
            //System.out.println("ACa empieza lado derecho: ");
            inOrdenRecorrer(nodo.getHijoDer());
        }
    }
    
    //imprimir menor del arbol, el mas izquierdo 
    public void imprimirMenor(){
        if(raiz!=null){
            inOrdenRecorrerMenor(raiz);
        }
        else{
            System.out.println("Arbol esta vacio");
        }
    }
    public void inOrdenRecorrerMenor(NodoArbol nodo){
        
        while(nodo.getHijoIzq()!=null){
            nodo=nodo.getHijoIzq();
        }
        System.out.println(nodo.getId());
    }
        
    //imprimir los que no tienen hijos
    public void imprimeHojas(){
        if(raiz!=null){
            inOrdenRecorrerHojas(raiz);
        }
        else{
            System.out.println("Arbol esta vacio");
        }
    }
    public void inOrdenRecorrerHojas(NodoArbol nodo){
        if(nodo!=null){
            if(nodo.getHijoIzq()==null && nodo.getHijoDer()==null){
                System.out.println("Es hoja: "+nodo.getId());
            }
            inOrdenRecorrerHojas(nodo.getHijoIzq());
            inOrdenRecorrerHojas(nodo.getHijoDer());
        }    
    }
    
    //imprimir la altura del arbol
    private void retornarAltura(NodoArbol nodo, int nivel){
        if(nodo!=null){
            retornarAltura(nodo.getHijoIzq(), nivel+1);
            if(nivel>altura)
                altura=nivel;
            retornarAltura (nodo.getHijoDer(), nivel+1);
        }

    }
    public int retornarAltura(){
        altura=0;
        retornarAltura(raiz, 1);
        System.out.println(altura);
        return altura;
        
    }
}
