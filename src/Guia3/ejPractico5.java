/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ejPractico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
         int numM, num, suma;
         suma = 0; 
        System.out.println("Escriba un numero limite");
        numM = leer.nextInt();
        do {
            System.out.println("Ingrese numero");
            num = leer.nextInt();
            suma = suma + num;     
        } while (numM > suma);
        System.out.println("Llegaste al limete");      
        // TODO code application logic here    
    } 
}
