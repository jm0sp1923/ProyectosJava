
package jm0sp;

import java.util.Scanner;

public class FibonacciArray {
    
    Scanner sc = new Scanner(System.in);
    
    FibonacciArray(){
        fibonacci();
    }
    
    public static void main(String [] args){
    new FibonacciArray();    
    }
   
    
    void fibonacci(){
        System.out.println("Introduce el número de términos de la serie que quieres generar: ");
        int n = Integer.parseInt(sc.nextLine());
        int numerosFibonacci [] = new int [n];
        
        numerosFibonacci[0] = 0;
        numerosFibonacci[1] = 1;
        
        if(n < 2){
        System.out.println("El numero debe ser mayor a 2");
        return;
        }
           
           for (int i = 2; i < n; i++) {
            numerosFibonacci[i] = numerosFibonacci[i - 1] + numerosFibonacci[i - 2];
                        }
      
             for (int i = 0; i < n; i++) {
            System.out.print(numerosFibonacci[i] + " ");
                }
    }
}      