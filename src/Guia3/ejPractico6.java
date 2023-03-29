/*
  Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.

 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ejPractico6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, num1, opcion;
        char confirmacion;
        boolean salir = true;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros");
        num = leer.nextInt();
        num1 = leer.nextInt();
        OUTER:
        do {
            System.out.println("MENU:");
            System.out.println("1- SUMAR");
            System.out.println("2- RESTAR");
            System.out.println("3- MULTIPLICAR");
            System.out.println("4- DIVIDIR");
            System.out.println("5-SALIR");
            System.out.println("Elija una opcion");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La suma de sus numero es: " + (num + num1));
                    break;
                case 2:
                    System.out.println("La resta de sus numero es: " + (num - num1));
                    break;
                case 3:
                    System.out.println("La multiplicacion de sus numeros es: " + (num * num1));
                    break;
                case 4:
                    System.out.println("La division de sus numeros es: " + (num / num1));
                    break;
                case 5:
                    System.out.println("Seguro que desea salir del programa?");
                    confirmacion = leer.next().charAt(0);
                    switch (confirmacion) {
                        case 'S':
                        case 's':
                            System.out.println("Saliendo del programa...");
                        break OUTER;
                        case 'n':
                        case 'N':
                            break;
                        default:
                            System.out.println("Opcion invalida, volviendo al menu pricipal");
                            break;
                    }
                // TODO code application logic here
            }
        } while (salir);
    }
}
