package com.mycompany.poo.EXERCISE;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) 
    // salario
    {
        Scanner teclado = new Scanner (System.in);

        int salario;
        double auxilioTransporte = 117.172;
        double resultado;

        System.out.println("Ingrese su salario");
        salario = teclado.nextInt();

        if(salario > 3.634000 ) {
            System.out.println("no necesitas auxilio de transporte, tu saliario es de:" + salario);
        }
        else{
            resultado = salario + auxilioTransporte;
            System.out.println("tu salario es de:" + resultado);
        }
    }

    
    
}
