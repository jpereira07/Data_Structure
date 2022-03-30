
package com.mycompany.data_structure;

/**
 *
 * @author jose
 */

public class nodeLista {
    
    persona persona;
    nodeLista next;
    private persona dato;

    public nodeLista(persona persona) {
        this.persona = persona;
    }

    public persona getPersona() {
        return persona;
    }

    public void setPersona(persona persona) {
        this.persona = persona;
    }

    public nodeLista getNext() {
        return next;
    }

    public void setNext(nodeLista next) {
        this.next = next;
    }

    public persona getDato() {
        return dato;
    }

    public void setDato(persona dato) {
        this.dato = dato;
    }
    
        @Override
    public String toString() {
        return "nodeLista{" + "dato=" + dato + '}';
    }
    
    
}
