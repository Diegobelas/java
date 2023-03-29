/*
 Ejercicio 8
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0
y 10 la nota se pedirá de nuevo hasta que la nota sea correcta
 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ejercicio8Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // TODO code application logic here

        System.out.println("Ingrese una nota del 1 al 10");
        int nota = leer.nextInt();

        while (nota > 0 || nota < 10) {

            if (nota < 0 || nota > 10) {
                System.out.println("Ingrese nota correcta");
                nota = leer.nextInt();
                 continue;
            }
         System.out.println("Su nota es " + nota);
         break;
        }
        

    }

}
