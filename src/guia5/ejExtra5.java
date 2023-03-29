/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ejExtra5 {

    /**
     * . Realizar un programa que llene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rand = new Random();
        
        int[][] matriz = new int[2][2];
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rand.nextInt(9);
                   suma += matriz[i][j];
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(""+ matriz[i][j]);
            }
            System.out.println(" ");
        }
        
       /* for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                suma += matriz[i][j];
            }
            
        }*/
        System.out.print("resultado de la suma es "+ suma);
        // TODO code application logic here
    }
    
}
