/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Scanner;

/**
 *Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.

 * @author Diego
 */
public class ejPractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Ingrese un numero");
        int num1= leer.nextInt();
        int vector[]= new int[num1];
        for (int i = 0; i < vector.length; i++) {
            vector[i]= i;
        }
        for (int i = vector.length-1; i >= 0; i--) {
            System.out.println(" [ " + vector[i] + " ] ");
        }
    } 
}
