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
public class ejPractico3 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de euros");
        double euros = sc.nextDouble();
        System.out.println("Introduce la divisa a convertir");
        String divisa = sc.next();
        convDiv(euros, divisa);
    }

    public static void convDiv(double euros, String divisa) {
        double result = 0;
        String msg = "";
        switch (divisa.toLowerCase()) {
            case "libras":
                result = euros * 0.86;
                msg = "libras";
                break;
            case "dolares":
                result = euros * 1.28611;
                msg = "dolares";
                break;
            case "yenes":
                result = euros * 129.852;
                msg = "yenes";
                break;
        }
        System.out.println("euros son equivalentes a " + result + " " + msg + ".");
    }
}