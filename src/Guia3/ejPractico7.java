/*
Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().

 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ejPractico7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int correctas = 0, incorrectas = 0;
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ingrese una palabra de 5 caracteres");
            System.out.println("Cuando desee terminar de enviar las cadenas, digite &&&&&");
            String palabra = leer.nextLine();
            if ("&&&&&".equals(palabra)) {
                break;
            }
            if (palabra.length() == 5 && palabra.charAt(0) == 'X' && palabra.charAt(4) == 'O') {
                System.out.println("Secuencia correcta");
                correctas++;
            } else {
                System.out.println("Incorrectas");
                incorrectas++;
            }
            // TODO code application logic here
        } while (true);
        System.out.println("Informe");
        System.out.println("Correctas:" + (correctas));
        System.out.println("Incorrectas:" + (incorrectas));
    }
}
