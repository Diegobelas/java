/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Random;
import java.util.Scanner;

/**
 *Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).

 * @author Diego
 */
public class ejPractico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // TODO code application logic here
        Random rand = new Random();
                // TODO code application logic here

                
       int matriz[][] =new int[3][3];
       
         for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz.length ; j++) {
                matriz[i][j] = rand.nextInt(20) -10 ;
                System.out.print(" " + matriz[i][j] );
            }
            System.out.println(" "); 
        }
         
          System.out.println(" ");
          
        int matrizTrans[][] = new int[3][3];
        for (int i = 0; i< matriz.length ; i++) {
            for (int j = 0; j < matriz.length ; j++) {
               matrizTrans[i][j] = matriz[i][j] ;
                System.out.print(" " + matriz[j][i] );
            }
            System.out.println(" "); 
        }
        
        System.out.println(" ");
        
        int matrizAnt[][] = new int[3][3];
        for (int i = 0; i < matrizAnt.length; i++) {
            for (int j = 0; j < matrizAnt.length; j++) {
                matrizAnt[i][j] = -matrizTrans[i][j];
                System.out.print(" " + matrizAnt[i][j]);
            }
            System.out.println(" ");   
        }
    }
}
