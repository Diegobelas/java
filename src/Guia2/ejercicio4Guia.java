/*
Ejercicio 4
Define una variable que aloje tu nombre y otra que guarde tu edad. Imprime ambas variables por pantalla.
Recomendamos que hagan el siguiente experimento: tipear en minúsculas la palabra sout y apenas terminamos de escribirla tocar el botón tab o mejor dicho tabular.
Esto nos va a generar un System.out.println() para poder escribir lo que queramos.

 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ejercicio4Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        String nombre = "Diego";
        int edad = 31;
        System.out.println(" Su nombre es " + nombre);
        System.out.println(" su edad es " + edad + " años ");
    }
    
}
