package com.mycompany.poo.EXERCISE;

import java.util.Scanner;

public class while2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int i=1, contador;
        System.out.print ("Digite cuantos numeros quiere en pantalla: ");
        contador = entrada.nextInt();
        while (i <= contador) {
            System.out.println (i);
            i++;
        }
    }
}
