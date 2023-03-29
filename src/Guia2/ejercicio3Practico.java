/*
 3.	Escribir un programa que pida una frase y la muestre toda 
en mayúsculas y después toda en minúsculas. 
 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ejercicio3Practico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escriba una Frase");
        String frase = leer.nextLine();
        
        System.out.println("Su frase en mayuscula es " + frase.toUpperCase());
        System.out.println("Su frase en minusculas es " + frase.toLowerCase());
        
    }
    
}
