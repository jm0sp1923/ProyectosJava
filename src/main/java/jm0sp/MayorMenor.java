package jm0sp;

import java.util.Scanner;

public class MayorMenor {
    
Scanner sc = new Scanner(System.in);    
int arreglo[];
int n;
    MayorMenor(){
        menu();
    }

    public static void main(String args[]){
        new MayorMenor();   
    }

    void menu(){
        int opc = 0;
        do{
            System.out.println("1. Llenar arreglo");
            System.out.println("2. Numero mayor");
            System.out.println("3. Numero menor");
            System.out.println("4. Salir");

            opc = Integer.parseInt(sc.nextLine());

            switch(opc){
                case 1:{
                    llenarArreglo();
                    break;
                }
                
                case 2:{
                    mayor();
                    break;
                }
                
                case 3:{
                    menor();
                    break;
                }

                case 4:{
                    System.out.println("Chau");
                    break;
                }
            }

        }while(opc > 0 && opc < 4);
    }

    void llenarArreglo(){
        System.out.println("Digite el tamano de el arreglo");
        n = Integer.parseInt(sc.nextLine());   
        arreglo = new int[n];
        for(int i = 0; i<n;i++){
        System.out.println("Ingrese un numero en la posicion: "+(i+1));
        int j = Integer.parseInt(sc.nextLine());
        arreglo[i] = j;
        }
    }

    void mayor(){
        int numero = arreglo[0];
        for(int i = 0; i<n;i++){
            if(arreglo[i]>numero){
                numero = arreglo[i];
            }
        }

        System.out.println("El numero mayor de el arreglo es: "+numero);
    }

    void menor(){
        int numero = arreglo[0];
        for(int i = 0; i<n;i++){
            if(arreglo[i]<numero){
                numero = arreglo[i];
            }
        }

        System.out.println("El numero menor de el arreglo es: "+numero);
    }
}
