
package com.mycompany.data_structure;

import static com.mycompany.data_structure.Main.arr;

/**
 *
 * @author jose
 */
public class practica {
    
    //Problema1
    //division con el %, elevar num con una funcion o Math.pow
    public static int invertirNumero(int num, int pos){
        if(num>10){
            return num;
        }
        else {
            return num%10 * (int)Math.pow(10, pos) + invertirNumero(num/10, pos-1);
        }
    }
    
    //Problema2
    public static void Character(String palabra){
        
    }
    

    //Problema 3 mejorado xD
    public static int problema3(int arr[], int n){
        if(n==1){
            return arr[0];
        }
        else{
            return Math.max(arr[n-1], problema3(arr, n-1));
        }
        
    }
    
    
    //Problema4 mejorado xD
    public static int problema4(int arr[], int N){
        if (N <= 0){
            return 0;
        }
        else{
            return (problema4(arr, N - 1) + arr[N - 1]);
        }
    }
    
    //Problema6
    
    
    //Tarea Ejercicio 1
    static double p = 1, f = 1;
    static double e(int x, int n)
    {
        double r;
 
        // Termination condition
        if (n == 0)
            return 1;
 
        // Recursive call
        r = e(x, n - 1);
 
        // Update the power of x
        p = p * x;
 
        // Factorial
        f = f * n;
 
        return (r + p / f);
    }
    
    
    
}
