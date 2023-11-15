package com.mycompany.grupo2.EXERCISE;
import java.util.Scanner;

public class for2 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner (System.in);
    int aprobados, reprobados, f,nota;

    aprobados=0;
    reprobados=0;

        for (f=1; f <= 10 ;f++ ) {

            System.out.print ("Ingrese la nota:");
            nota = teclado.nextInt ();
            
            if (nota>=7) {
                aprobados = aprobados + 1;
            }else {
                reprobados = reprobados + 1;
            }
            
        }
        System.out.print ("Cantidad de aprobados:");
        System.out.println (aprobados);
        System.out.print ("Cantidad de reprobados:");
        System.out.print (reprobados);
    }
}