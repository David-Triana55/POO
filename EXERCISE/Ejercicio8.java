package com.mycompany.grupo2.EXERCISE;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args)
    // nota definitiva
    {
        Scanner notaD = new Scanner (System.in);

        int nota;

        System.out.println("ingrese su nota definitiva");
        nota = notaD.nextInt();

        if (nota <= 50) {
            if(nota == 0 || nota <= 19) {
                System.out.println("aprobo");
            } else if(nota == 20 || nota <= 29) {
                System.out.println("insuficiente");
            } else if ( nota == 30 || nota <= 39) {
                System.out.println("sobresaliente");
            } else if (nota == 40 || nota <= 50) {
                System.out.println("Excelente");
            }
        }
        else {
                System.out.println("numero invalido");
            }
    }    
    
}
