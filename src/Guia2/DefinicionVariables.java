/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class DefinicionVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
                
        System.out.println("ingrese una cadena");
        String cadena = leer.nextLine();
        
        System.out.println("ingrese un numero entero");
        int numEntero = leer.nextInt();
        
        System.out.println("Ingrese un numero real");
        double numReal = leer.nextDouble();
       
        System.out.println();
        boolean logico = 5<4;
       
        System.out.println("cadena" + cadena);
        System.out.println("numero entero" + numEntero);
        System.out.println("Numero Real" + numReal);
        System.out.println("numero booleano " + logico);
        
    }
    
}
