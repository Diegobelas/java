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
public class ejExtra4 {

    /**
     * . Los profesores del curso de programación de Egg necesitan llevar un
registro de las notas adquiridas por sus 10 alumnos para luego obtener
una cantidad de aprobados y desaprobados. Durante el período de
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el
arreglo. Al final del programa los profesores necesitan obtener por
pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
notas del curso.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Random rand = new Random();
        
        int[] nota1 = new int[10];
        int[] nota2 = new int[10];
        int[] nota3 = new int[10];
        int[] nota4 = new int[10];
        String[] nombre = new String[10];
        double[] suma = new double[10];
        int aprobado = 0;
        int desaprobado = 0;
        
        for (int i = 0; i < nota1.length; i++) {
            System.out.println("Intruduzca nombre del alumno ");
            nombre[i] = leer.nextLine();
            nota1[i] = rand.nextInt();
            nota2[i] = rand.nextInt();
            nota3[i] = rand.nextInt();
            nota4[i] = rand.nextInt();
            
            suma[i]= (nota1[i]*0.10) + (nota2[i]*0.15) + (nota3[i]*0.25)+ (nota4[i]*0.50);
            if (suma[i] > 7) {
                System.out.println(nombre[i] + " Aprobo, su nota es: " + suma[i]);
                aprobado++;
                
            }else{
                System.out.println(nombre[i]+ " Desaprobo, su nota es: " + suma[i]);
                desaprobado--;
            }
        }
        System.out.println("La cantidad de aprobados es " + aprobado + " la cantidad que no aprobo es: " + desaprobado);
    }  
}
