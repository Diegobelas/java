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
public class ejExtra3 {

    /**
     * . Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[9];
        rellenaVector(vector);
        escriVector(vector);
        
    }
  public static void rellenaVector(int[] vector){
  Random rand = new Random();
      for (int i = 0; i < vector.length; i++) {
          vector[i]= rand.nextInt(9);     
      } 
}
public static void escriVector(int[] vector){
    Random rand = new Random();
    for (int i = 0; i < vector.length; i++) {
        System.out.print(" " + vector[i]);   
    } 
    System.out.println(" ");
}
}

