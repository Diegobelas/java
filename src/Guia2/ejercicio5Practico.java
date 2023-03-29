/*
 5.	Escribir un programa que lea un número entero por teclado y muestre por
pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().

 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ejercicio5Practico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // TODO code application logic here
        int multi, triple;
        double cuadrada;
        System.out.println("Ingrese un numero entero");
        int num = leer.nextInt();
        multi=num*2;
        triple=num*3;
        cuadrada=Math.sqrt(num);
        System.out.println("Su numero doble es "+ multi);
        System.out.println("Su numero triple es "+ triple);
        System.out.println("La raíz cuadrada de su numero es " + cuadrada);
        
        
    }
    
}

