package com.mycompany.POO.EXERCISE;
import java.util.Scanner;

public class for3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int multiplosDeTres = 0;
        int multiplosDeCinco = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un número entero: ");
            int numero = teclado.nextInt();
            
            if (numero % 3 == 0) {
                multiplosDeTres++;
            }
            
            if (numero % 5 == 0) {
                multiplosDeCinco++;
            }
        }
        
        System.out.println("Cantidad de números múltiplos de 3: " + multiplosDeTres);
        System.out.println("Cantidad de números múltiplos de 5: " + multiplosDeCinco);
        
        
    }
    
}
