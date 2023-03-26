package jm0sp;

import java.util.Scanner;

public class Promedios{
  
    Scanner sc = new Scanner(System.in);    
    int n;
    int numeros[];       
    
    Promedios(){
        menu();
    }
    
    public static void main(String[] args) {
      new  Promedios();
    }
    
    void menu(){
    int opc = 0;
    do{
        System.out.println("1. Captura de numeros");
        System.out.println("2. Promedio posiciones pares");
        System.out.println("3. Promedio posiciones impares");
        System.out.println("4. Promedio numeros pares");
        System.out.println("5. Promedio numeros impares");
        System.out.println("6. salir");
        System.out.println("Digite una opcion: ");
        opc = Integer.parseInt(sc.nextLine());
        
           switch (opc){

            case 1:{
                arreglo();
                break;
            }
            case 2:{
                promedioPosNumerosPares();
                break;
            }

            case 3:{
                promedioPosNumerosImpares();
                break;
            }
            case 4:{
                numerosPares();
                break;
            }
            case 5:{
                numerosImpares();
                break;
            }
            

            default: {

                System.out.println("Opcion incorrecta");

            }

      }
        
     }while(opc >0 && opc <6);
   }       
    
    void arreglo() {
   
        System.out.println("Digite el tamano de el arreglo");
        n = Integer.parseInt(sc.nextLine());
        numeros = new int[n];
        
     for(int i = 0; i <n;i++ ){
        System.out.println("Digite el numero en la posicion: "+i);
        int a = Integer.parseInt(sc.nextLine());
        numeros[i] =  a;
     }
      
    } 
     
    void promedioPosNumerosPares(){
        
       int contador = 0;  
        for(int i = 0; i<n;i++){
            if(i % 2 == 0){
                contador++;
            }
        } 
       
        int posPares[] = new int[contador];  
       
        int j = 0;
         for(int i = 0; i<n;i++){
          if(i % 2 == 0){
               posPares[j] = numeros[i];
             j++;
          }
        }   
        
         double promedio = 0;
         int suma = 0;   
        for(int i = 0; i<contador;i++){      
            suma+=posPares[i];
        }
        promedio = suma/contador;
        System.out.println();
        System.out.println("El promedio de las posiciones pares es: "+promedio);
    }
     
    void  promedioPosNumerosImpares(){  
       int contador = 0;  
        for(int i = 0; i<n;i++){
            if(i % 2 != 0){
                contador++;
            }
        } 
       
        int posImpares[] = new int[contador];  
       
        int j = 0;
         for(int i = 0; i<n;i++){
          if(i % 2 != 0){
               posImpares[j] = numeros[i];
             j++;
          }
        }   
        
         double promedio = 0;
         int suma = 0;   
        for(int i = 0; i<contador;i++){      
            suma+=posImpares[i];
        }
        promedio = suma/contador;
        System.out.println();
        System.out.println("El promedio de las posiciones impares es: "+promedio);
    }
     
    void numerosPares(){
        int contador = 0;  
        for(int i = 0; i<n;i++){
            if(numeros[i] % 2 == 0){
                contador++;
            }
        } 
       
        int numerosPares[] = new int[contador];  
       
        int j = 0;
         for(int i = 0; i<n;i++){
          if(numeros[i] % 2 == 0){
               numerosPares[j] = numeros[i];
             j++;
          }
        }   
        
         double promedio = 0;
         int suma = 0;   
        for(int i = 0; i<contador;i++){      
            suma+=numerosPares[i];
        }
        promedio = suma/contador;
        System.out.println();
        System.out.println("El promedio de los pares es: "+promedio);
        
    }
     
    void numerosImpares(){
        int contador = 0;  
        for(int i = 0; i<n;i++){
            if(numeros[i] % 2 != 0){
                contador++;
            }
        } 
       
        int posImpares[] = new int[contador];  
       
        int j = 0;
         for(int i = 0; i<n;i++){
          if(numeros[i] % 2 != 0){
               posImpares[j] = numeros[i];
             j++;
          }
        }   
        
         double promedio = 0;
         int suma = 0;   
        for(int i = 0; i<contador;i++){      
            suma+=posImpares[i];
        }
        promedio = suma/contador;
        System.out.println();
        System.out.println("El promedio de los pares es: "+promedio);
        
    }
}

