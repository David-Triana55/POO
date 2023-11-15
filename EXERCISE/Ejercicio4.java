package com.mycompany.grupo2.EXERCISE;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) 
    //iva un producto
    {
        Scanner ent = new Scanner (System.in);

        float pruducto;
        float iva;
        float resultado;

        System.out.println("Ingrese el valor del producto");
        pruducto = ent.nextInt();

        iva = (pruducto * 19) / 100;
        resultado = iva + pruducto;

        System.out.println("su valor del producto es  $" + resultado );        
    }
}
