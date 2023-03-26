package jm0sp;

import java.util.Scanner;

public class Arreglofactorial{

    Scanner sc = new Scanner(System.in);
    int n; 
    int [] numeros;
    int [] arreglo;

     Arreglofactorial(){
        limpiarConsola();
        menu();      
     }
    
    public static void main(String args[]){
        new Arreglofactorial();
    }

    void menu(){
        
        int opc = 0;
        do{
            System.out.println("1. Llenar arreglo");
            System.out.println("2. Calcular factoriales");
            System.out.println("3. Salir");
            
            opc = Integer.parseInt(sc.nextLine());

            switch(opc){
                case 1:{
                    llenarArreglo();
                    break;
                }
                
                case 2:{
                    calcularFactoriales();
                    break;
                }

                case 3:{
                    System.out.println("chau");
                    break;
                }
            }
        }while(opc > 0 && opc < 3);

    }
     
    void llenarArreglo(){
       limpiarConsola();
        System.out.println("Ingrese el tamaño de el arreglo");
         n = Integer.parseInt(sc.nextLine());
         arreglo = new int[n];
            for(int i = 0; i<n;i++){
            System.out.println("Ingrese un numero en la posicion: "+(i+1));
            int j = Integer.parseInt(sc.nextLine());
            arreglo[i] = j;
            }
            limpiarConsola();
        }

        void calcularFactoriales(){
            limpiarConsola();
         numeros = new int[n];
        for (int i = 0; i < n; i++) {
            
            numeros[i] = factoriales(arreglo[i]);
        }

        System.out.println("los datos de el arreglo son: ");

        for (int i = 0; i < n; i++) {
            
            System.out.print(" ["+arreglo[i]+"] ");
        }
        
        System.out.println();

        System.out.println("los factoriales de los numeros son: ");

        for (int i = 0; i < n; i++) {
            
            System.out.print(" ["+numeros[i]+"] ");
        }
        System.out.println();
    }

    int factoriales(int n){

        int factorial = 1;
        for(int i = 2; i<=n;i++){
            factorial *= i;
        }

        return factorial;

    }
    
    
    public static void limpiarConsola() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
    }  



}
