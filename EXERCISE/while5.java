package com.mycompany.grupo2.EXERCISE;
import java.util.Scanner;

public class while5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero,n;
        n = 0;

        System.out.print("ingrese un valor  ");
        numero = teclado.nextInt();

        if(numero >= 1 && numero <= 10) {
            while (n <= 12) {
                System.out.println(numero + " "+ n + "  "+ (numero*n) );
                n++;
            }

        } else {
            System.out.println("Numeros inválidos");
        }
    }
    
}
