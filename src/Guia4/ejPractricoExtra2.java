/*
 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ejPractricoExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // TODO code application logic here
        int A= 10, B=20, C=30, D=40;
        int auxiliar;
        
        System.out.println(" A= " + A+ " B= "+ B+ " C= "+C+ " D= " +D);
        auxiliar=B;
        B=C;
        C=A;
        A=D;
        D=auxiliar;
        
        System.out.println(" A= " + A+ " B= "+ B+ " C= "+C+  " D= " +D);
    }
    
}
