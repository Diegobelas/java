/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa).

 */
package guia5;

import java.util.Random;
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
        Random rand = new Random();
        
        int matriz[][] = new int[4][4];
        
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz.length ; j++) {
                matriz[i][j] = rand.nextInt(9);
                System.out.print(" " + matriz[i][j] );
            }
            System.out.println(" "); 
        }
        
        System.out.println(" ");
        int matrizTrans[][] = new int[4][4];
        for (int i = 0; i< matriz.length ; i++) {
            for (int j = 0; j < matriz.length ; j++) {
               matrizTrans[i][j] = matriz[i][j] ;
                System.out.print(" " + matriz[j][i] );
            }
            System.out.println(" "); 
        }
       
        // TODO code application logic here
    }
    
}
