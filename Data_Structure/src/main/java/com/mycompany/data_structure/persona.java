
package com.mycompany.data_structure;

/**
 *
 * @author jose
 */

public class persona {
    
    private int id;
    private String nombre;

    public persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public persona() {
    }
    
    @Override
    public String toString() {
        return "persona{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    
    
    
}
