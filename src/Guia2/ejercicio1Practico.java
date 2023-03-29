/*
 1.Escribir un programa que pida dos números enteros por
teclado y calcule la suma de los dos. El programa deberá 
después mostrar el resultado de la suma
 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ejercicio1Practico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int  suma;
        Scanner leer = new Scanner(System.in);
        
        System.out.println(" Ingrese primer numero ");
        int num1 = leer.nextInt();
        System.out.println(" Ingrese segundo numero ");
        int num2 = leer.nextInt();
        suma= num1+num2;
        System.out.println(" la suma de los numero es " + suma );
        
     
    }
    
}
