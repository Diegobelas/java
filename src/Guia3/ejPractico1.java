/*
 Crear un programa que dado un número determine si es par o impar.
 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ejPractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        // TODO code application logic here
        System.out.println("Ingrese numero");
        num = leer.nextInt();
        if (num % 2 == 0) {
            System.out.println("Su numero es par");
        }else 
            System.out.println("Su numero es impar");
    }
        
    }

