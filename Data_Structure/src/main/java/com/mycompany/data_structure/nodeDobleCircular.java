/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.data_structure;

/**
 *
 * @author jose
 */
public class nodeDobleCircular {
    persona persona;
    nodeDobleCircular next;
    nodeDobleCircular back;

    public nodeDobleCircular(persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "nodeDobleCircular{" + "persona=" + persona + ", next=" + next + ", back=" + back + '}';
    }
    
    public persona getPersona() {
        return persona;
    }

    public void setPersona(persona persona) {
        this.persona = persona;
    }

    public nodeDobleCircular getNext() {
        return next;
    }

    public void setNext(nodeDobleCircular next) {
        this.next = next;
    }

    public nodeDobleCircular getBack() {
        return back;
    }

    public void setBack(nodeDobleCircular back) {
        this.back = back;
    }
    
    
}
