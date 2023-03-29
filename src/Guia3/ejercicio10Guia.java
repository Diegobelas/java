/*
Ejercicio 10
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor. Por
ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ejercicio10Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        // TODO code application logic here
       
        System.out.println("Ingrese 4 numeros del 1 al 20");
         for (int j = 0; j < 4; j++) {
            
            num = leer.nextInt();
            System.out.print(num + " ");
            for (int i=0; i < num; i++ ){
            System.out.print("*");   
         }
            System.out.println("");
    }
    }
    }
