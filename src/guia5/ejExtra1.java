/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ejExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[5];
        int suma =0;
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese valores para vector");
            vector[i]=leer.nextInt();
            suma += vector[i];
        }
        
        System.out.println(" La suma de los numeros entre si es: " + suma);
    
    
    }
    
}
