package com.mycompany.POO.Array;
import java.util.Scanner;

public class Arreglo_4 {
    
    public static void main (String[] args) {

        Scanner lector = new Scanner(System.in);

        int lista[] = new int [20];

        int i,lim;

        System.out.println("ingrese limite del arreglo");
        lim = lector.nextInt();

        for (i = 0; i < lim ; i++) {
            System.out.println("X["+ (i+1)+"]= ");
            lista[i] = lector.nextInt();
        }
            for (i = 0; i < lim; i++) {
                System.out.print(lista[i]+", ");
            }
        }
    }