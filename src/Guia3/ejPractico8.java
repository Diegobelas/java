/*
8. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
* *
* *
* * * *

 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ejPractico8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del cuadrado");
        n = leer.nextInt();
        
        for (int i= 0; i < n; i++){
            for(int j=0 ; j < n; j++){
                if (i == 0 || i == n-1 || j == 0 || j == n-1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
            }   
        }
             System.out.println(""); 
    }
 }
}
    

