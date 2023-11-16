package com.mycompany.poo.EXERCISE;
import java.util.Scanner;

public class while3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, multiplosDeTres, multiplosDeCinco, numero;
        n = 0; multiplosDeCinco = 0; multiplosDeTres = 0;

        while (n < 5) {
            System.out.print("ingrese un numero entero: ");

            numero = teclado.nextInt();

            if (numero % 3 == 0) {
                multiplosDeTres++;
            }
            
            if (numero % 5 == 0) {
                multiplosDeCinco++;
            }
            n++;
        }
        System.out.println("Cantidad de números múltiplos de 3: "+ multiplosDeTres);
        System.out.println("Cantidad de números múltiplos de 5: " + multiplosDeCinco);
    
    }    
}
