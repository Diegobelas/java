/*
Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.

 */
package Guia3;

import java.util.Scanner;



/**
 *
 * @author Diego
 */
public class ejercicio6Guia {
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
    
        // TODO code application logic here
         
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingrese dos numeros enteros");
        int num = leer.nextInt();
        int num1 = leer.nextInt();
        
        if (num >25 || num1 > 25){
        System.out.println("Alguno de los numeros es mayor a 25");    
        }else {
            System.out.println("Alguno de los numeros no es mayor a 25");
        }
    }
}
    
        
    
