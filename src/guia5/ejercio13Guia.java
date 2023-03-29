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
public class ejercio13Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de compañeros");
        int num1 = leer.nextInt();
        String equipo[]= new String [num1];
        
        leer.nextLine();
        for (int i = 0 ; i < equipo.length ; i++){
            equipo[i]= leer.nextLine();
        }
        // TODO code application logic here
        for (int i = 0; i < equipo.length ; i++) {
             System.out.println("Los miembros del equipos son: " + equipo[i]);
        }
    }  
}
