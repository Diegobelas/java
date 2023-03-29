/*
. Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.
 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ejPracticoExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // TODO code application logic here

        System.out.println("Ingrese una letra");
        String letra = leer.nextLine().toLowerCase();
        if ("a".equalsIgnoreCase(letra) || "e".equalsIgnoreCase(letra)
                || "i".equalsIgnoreCase(letra) || "o".equalsIgnoreCase(letra)
                || "u".equalsIgnoreCase(letra)){
            System.out.println("Su letra es una vocal");
        }else{
            System.out.println("no es vocal");    
                }
    }
}
