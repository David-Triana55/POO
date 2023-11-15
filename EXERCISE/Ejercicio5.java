package com.mycompany.POO.EXERCISE;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args)
    // iva 2 producto
    {
        Scanner ent = new Scanner (System.in);

        double producto;
        double producto2;
        double iva;
        double resultado;

        System.out.println("Ingrese el valor del primer producto  ");
        producto = ent.nextInt();

        System.out.println("Ingrese el valor del segundo producto  ");
        producto2 = ent.nextInt();


        iva =  ((producto + producto2) *19) / 100;
        resultado = iva + producto + producto2;

        System.out.println("su valor del producto es  $" + resultado );        
    }
}
