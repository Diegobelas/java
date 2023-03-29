/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ejPractico4_2 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar un numero");
        int num1 = sc.nextInt();
        boolean resultado = retorno(num1);
        if (resultado) {
            System.out.println(num1 + " es un número primo");
        } else {
            System.out.println(num1 + " no es un número primo");
        }
    }

    public static boolean retorno(int num1) {
        boolean result;
        if (num1 <= 1) {
            return false;
        } else {
            for (int i = 2; i <= num1 / 2; i++) {
                if (num1 % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}