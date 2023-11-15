package com.mycompany.grupo2.EXERCISE;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args)
    // mayor edad
    {

        Scanner teclado = new Scanner(System.in);
        int edad;

        System.out.println("Ingrese su edad");
        edad = teclado.nextInt();


        if (edad >= 18) {
            System.out.println("eres mayor de edad");
        } else {
            System.out.println("eres menor de edad");
        }


    }
    



}
