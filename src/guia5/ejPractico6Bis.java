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
public class ejPractico6Bis {

    /**
     * @param args the command line arguments Un cuadrado mágico 3 x 3 es una
     * matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas,
     * sus columnas y sus diagonales son idénticas. Crear un programa que
     * permita introducir un cuadrado por teclado y determine si este cuadrado
     * es mágico o no. El programa deberá comprobar que los números introducidos
     * son correctos, es decir, están entre el 1 y el 9.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese los valores de la matriz magica ");
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = leer.nextInt();
                if (matriz[i][j] >= 10 || matriz[i][j] <= 0) {
                    System.out.println("Ingrese un valor del 1 al 9");
                    j--;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println(" ");
        }
        int diagonal1 = 0;
        int diagonal2 = 0;
        int sumaFila = 0;
        int sumaColumna = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
                if(i == j) {
                    diagonal1 += matriz[i][j];
                }
                if(i == 2 - j) {
                    diagonal2 += matriz[i][j];
                }
               
            }
                     if(sumaFila != sumaColumna) {
                    System.out.println("No es un cuadrado Magico");
                    
                }
        }

        if(diagonal1 != diagonal2) {
            System.out.println("No es un cuadrado Magico");
             
        } else {
            System.out.println("Es un cuadrado magico");
        }
    }
}  
    

   
   
