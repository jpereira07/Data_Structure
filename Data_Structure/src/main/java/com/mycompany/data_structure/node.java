
package com.mycompany.data_structure;

/**
 *
 * @author jose
 */
public class node {
    
    private node next;
    private int value;
    
    public void node(){
        this.value=0;
        this.next=null;
    }

    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}