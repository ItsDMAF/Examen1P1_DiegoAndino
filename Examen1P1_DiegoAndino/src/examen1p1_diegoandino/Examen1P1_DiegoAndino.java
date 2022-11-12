package examen1p1_diegoandino;

import java.util.Scanner;
import java.util.Random;

public class Examen1P1_DiegoAndino {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        //Diego Miguel Andino Fiallos - 12241176

        int opcion;

        do {
            System.out.println("-----------MENU-----------");
            System.out.println("1 <- Divisores primos");
            System.out.println("2 <- Contorno de Pirámide");
            System.out.println("3 <- Vecinos");
            System.out.println("4 <- EXTRA PASCAL TRIANGLE");
            System.out.println("Ingrese su opcion: ");
            opcion = leer.nextInt();
//------------------------------------------------------------------------------
            switch (opcion) {
                case 1:

      System.out.println("Ingrese un numero:");
      int num = leer.nextInt();
                    System.out.println("Divisores Primos son: ");
      primo(num);
                    System.out.println("");
      
                    
                    break;
//------------------------------------------------------------------------------
                case 2:
                    System.out.print("Ingrese el numero de N: ");
                    int n = leer.nextInt();
                    contorno(n);
                    
  
                    break;
//------------------------------------------------------------------------------
                case 3:
                    Random aleatorio = new Random();
                    int r = 0 + aleatorio.nextInt(2);
                    System.out.println(r);
                    
                    System.out.print(" :viene de: " + vecino(r));
                    
                    System.out.println("");
                    
                    break;
//TRIANGULO DE PASCAL-----------------------------------------------------------
                /*case 4:
                    System.out.println("Ingrese el tamaño:");
                    int tamaño = leer.nextInt();
                    
                    for (int i = 0; i < tamaño; i++) {
                        for (int j = 1; j < tamaño - i; j++) {
                            System.out.print(" ");
                            
                        }
                        int numer = 1;
                        for (int k = 0; k <= i; k++) {
                            System.out.print(numer + " ");
                            numer = numer * (i-k)/(k+1);
                            
                        }
                        System.out.println();
                    }
                    break;*/
            }//Fin de switch

        } while (opcion != 4);
    }//Fin de main

    public static void primo(int num){
        for (int i = 1; i <= num; i++) {
                        if(num % i == 0)
                            System.out.print(i +" ");  
                    }
        
    }// Fin de metodo 1
    public static void contorno(int n){
        int residuo;
        residuo = n % 2;
         if (residuo == 0){
                        System.out.println("El numero no puede ser par, ingrese un numero impar");
                    }
                    else{ 
                        for (int i = 0; i < n-(n/2); i++) {
                        for (int j = 0; j < n; j++) {
                   
                           if( i == (n/2)-1 || i + j == (n/2)|| j - i  == (n/2) ) {
                               System.out.print("+");
                           }
                           else
                           if(i + j < (n/2) || i == (n/2) || j -i > (n/2) ){
                               System.out.print("*");
                           }
                           else{
                               System.out.print(" ");
                           }
                        }
                        System.out.println("");
                    }
                    }
  
        
    }//Fin de metodo 2
    public static String vecino(int r){
        System.out.println("Ingrese una cadena: ");
                    String cadena = leer.next();
                    
        int cont = 0;
                    for (int i = 0; i < cadena.length(); i++) {
                        char cadena1 = cadena.charAt(i);
                        if ((int) cadena1 > 65 && (int) cadena1 < 91 || (int) cadena1 > 96 && (int) cadena1 < 123) {
                        cont++; 
                        }
        
                    }
                    if(cont == cadena.length()){
                        if(r == 0){
                            for (int i = 0; i < cadena.length(); i++) {
                        char cadena1 = cadena.charAt(i);
                        int cad =(int)cadena1;
                        int cad2 = cad - 1;
                        char cadena2 = (char)cad2;
                                System.out.print(cadena2);

                        }
                        }
                        if(r == 1){
                            for (int i = 0; i < cadena.length(); i++) {
                        char cadena1 = cadena.charAt(i);
                        int cad =(int)cadena1;
                        int cad2 = cad + 1;
                        char cadena2 = (char)cad2;
                                System.out.print(cadena2);
      
                        
                        }
                        }
                    
                    }
                    return cadena;
    }//Fin de metodo 3
}//Fin de class
