/*
. Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”
 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ejPractico2 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        while (true) {
            String NombrePersona = Nombre();
            int EdadPersona = Edad();
            if (EdadPersona<18){
                System.out.println("La persona es menor de edad.");
            }else{
                System.out.println("La persona es mayor de edad.");
            }
            System.out.println("¿Desea ingresar otro dato? Si/No");
            String respuesta = leer.nextLine();
            if (respuesta.equalsIgnoreCase("No")){
                break;
            } 
        }
        
    }
    
    public static String Nombre(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona: ");
        String nombre = leer.nextLine();
        return nombre;
    }
    
    public static int Edad(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la edad de la persona:");
        int edad = leer.nextInt();
        return edad;
    }
    
}