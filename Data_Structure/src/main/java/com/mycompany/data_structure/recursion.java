
package com.mycompany.data_structure;

/**
 *
 * @author jose
 */
public class recursion {
    
    static int arr[]={12, 24, 5, 7, 9};
    
    public static int factorial(int n) {
        if (n==0){
            return 1;
        } else {
            return n*factorial (n-1);
        }
    }
    
    //Metodo que logra buscar un valor x en el array
    
    
    public static int buscarElemento(int arr[], int i, int n, int f){
        if(f<1){
            return -1;
        }
        if(arr[i]==n){
            return n; //n= retorna el valor, i= retorna la posicion 
        }
        if(arr[f]==n){
            return n;
        }
        else{
            return buscarElemento(arr, 1+i, n, f-1);
        }
    }
    
}
