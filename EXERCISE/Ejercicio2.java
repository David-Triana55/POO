package com.mycompany.poo.EXERCISE;
import java.util.Scanner;

public class Ejercicio2
{
    public static void main (String args[])
    // suma por consola
    {
        Scanner ent = new Scanner (System.in);
        int num1, num2, suma;
        
        System.out.println("Ingrese numero 1");
        num1 = ent.nextInt ();
        System.out.println ("Ingrese numero 2");
        num2  = ent.nextInt ();
        suma = num1 + num2;
        System.out.println("la suma del valor es"+ "  "+ suma);        
    }
}


