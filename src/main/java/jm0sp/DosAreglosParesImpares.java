package jm0sp;

import java.util.Scanner;

public class DosAreglosParesImpares{
   
    Scanner sc = new Scanner(System.in);
    int n;
    int arreglo[];

    DosAreglosParesImpares(){
        limpiarConsola();
        menu();
    }
    public static void main(String[] args) {
        new DosAreglosParesImpares();     
    }

    void menu(){
        int opc = 0;
        do{
            System.out.println("1. Llenar arreglo");
            System.out.println("2. Numeros pares");
            System.out.println("3. numeros impares");
            System.out.println("4. Salir");
            opc = Integer.parseInt(sc.nextLine());

            switch(opc){
                case 1:{
                    llenarArreglo();
                    break;
                }

                case 2:{
                    numerosPares();
                    break;
                }

                case 3:{
                    break;
                }

                case 4:{
                    break;
                }

            }

        }while(opc > 0 && opc < 4);
    }
    void llenarArreglo(){   
        limpiarConsola();
        System.out.println("Digite el tamaño de el arreglo: ");
        n = Integer.parseInt(sc.nextLine());
        arreglo = new int[n];

        for(int i = 0;i<n;i++){
            System.out.println("Ingrese el numero en la posicion: "+(i+1));
            int j = Integer.parseInt(sc.nextLine());
            arreglo[i] = j;
        }

        limpiarConsola();
        System.out.println("Datos de el arreglo: ");
        for(int i = 0;i<n;i++){
            
            System.out.print(" ["+arreglo[i]+"] ");
           
        }
        System.out.println();
        System.out.println("Presione enter para continuar...");
        sc.nextLine();
        limpiarConsola();
        
           

    }

    void numerosPares(){

        int contador = 0;  
        for(int i = 0; i<n;i++){
            if(arreglo[i] % 2 == 0){
                contador++;
            }
        } 
       
        int numerosPares[] = new int[contador];  
       
        int j = 0;
         for(int i = 0; i<n;i++){
          if(arreglo[i] % 2 == 0){
               numerosPares[j] = arreglo[i];
             j++;
          }
        }
        limpiarConsola();
        System.out.println("Los numeros pares son: ");
        for(int i = 0;i<contador;i++){
            
            System.out.print(" ["+numerosPares[i]+"] ");
        }
        System.out.println();
        System.out.println("Presione enter para continuar...");
        sc.nextLine();
        limpiarConsola();
    }




    public static void limpiarConsola() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        }  

}