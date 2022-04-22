package com.mycompany.data_structure;

/**
 *
 * @author jose
 */

public class Grafos<T>{
    
    public int numVertices;
    private int maxCapacity;
    private T[] vertices; 
    private int[][] edges;
    
    public Grafos(int maxVertices){
        this.numVertices = 0;
        this.maxCapacity = maxVertices;
        this.vertices = new T [this.maxCapacity];
        this.edges = new int[this.maxCapacity][this.maxCapacity];
    }
    
    /**
     * 
     * @param vertex es el vertice a agregar
     */
    public void addVertex(T vertex){
        if(this.numVertices == this.maxCapacity){
            System.out.println("El grafo ya esta lleno");
            return;
        }
        else if(vertex != null){
            System.out.println("No se puede insertar un grafo nulo");
            return;
        }
        this.vertices[this.numVertices] = vertex;
        for(int i=0; i<this.numVertices; i++){
            this.edges[this.numVertices][i]=0;
            this.edges[i][this.numVertices]=0;
        }
        this.numVertices++;
    }
    
    /**
     *Encontrar el indice de un vertice dado
     * @param vertex vertice del cual se desea saber el indice
     * @return index indice de la posicion del vertice, -1 si no se encuentra
     */
    private int findVertex(T vertex){
        for(int i=0; i<this.vertices.length; i++){
            if(this.vertices[i].equals(vertex)){
                return i;
            }
        }
        return -1;
    }
    
    public int getWeidght(T fromVertex, T toVertex){
        int row = findVertex(fromVertex);
        int column = findVertex(toVertex);
        if(row != -1 && column != -1){
            return this.edges[row][column];
        }
        else{
            return -1;
        }
    }
    
    public void addEdge(T fromVertex, int weight, T toVertex){
        int row = findVertex(fromVertex);
        int column = findVertex(toVertex);
        if(row != -1 && column != -1){
            this.edges[row][column] = weight;
            this.edges[column][row] = weight;
        }
        else{
            System.out.println("No se puede crear una arista entre vertices"
                    + "que no estan en el grafo");
        }
    }
    
    public void printGrafo(T vertex){
        for (int i=0; i<this.vertices.length; i++){
            System.out.println("Lista de Adyacencias: "+i);
            System.out.println("Vertices: ");
            for(int j=0; j<edges[i][0]; j++)
                System.out.println(edges[i][j]);
        }
    }
}
