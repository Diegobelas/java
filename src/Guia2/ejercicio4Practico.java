/*
 4.	Dada una cantidad de grados centígrados se debe mostrar su equivalente
en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ejercicio4Practico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int convercion;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de Grados Centigrados");
        int grados = leer.nextInt();
        convercion= 32 + (9 * grados / 5);
        System.out.println("Su numero en grados Fahrenheit es " + convercion );
        // TODO code application logic here
    }
    
}
