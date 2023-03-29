/*
. Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano.

 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ejPracticoExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // TODO code application logic here
        
        int num;
        
        do {
            System.out.println("Ingrese un numero entre 1 y 10");
            num = leer.nextInt();
        }while (num < 1 || num > 10);
        String[] unidadesRomanas = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        System.out.println("El número " + num + " en romano es: " + unidadesRomanas[num]);
    }
        
    }
    

