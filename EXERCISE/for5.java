package com.mycompany.POO.EXERCISE;
import java.util.Scanner;

public class for5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int n,m;
        
        System.out.print("ingrese un valor");
        n = teclado.nextInt();

        if(n >= 1 && n <= 10){
            for (int i = 0; i <= 12; i++) {
                System.out.println(n + "  "+ i + "  "+ (i*n));
                
            }
        } else {
            System.out.println("valores invalidos");
        }

    }
}
