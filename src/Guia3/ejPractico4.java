/*
. Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java.
 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ejPractico4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Escriba una frase que empiece con la letra A");
        String frase = leer.nextLine();
        
        if (frase.substring(0,1).equals("A")){
        System.out.println("Correcto");
    }else {
            System.out.println("Incorrecto");
            }
    }
    
}
