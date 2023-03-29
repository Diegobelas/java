/*
Ejercicio 9
Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.
 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ejercicio9Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // TODO code application logic here
        int suma=0, num, i;

       
        for (i = 1; i <= 20; i++) {
             System.out.println(" Ingrese numero " + i);
                 num = leer.nextInt();
            if (num == 0) { 
                System.out.println("Se capturo el numero cero");
                break;
            }  
              if ( num <0 ){
                continue;  
            }
              suma += num;
            
            }
            System.out.println("La suma de los numeros es " + suma);
        }
   
    
}
