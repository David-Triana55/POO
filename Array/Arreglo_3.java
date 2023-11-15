package com.mycompany.grupo2.Array;

public class Arreglo_3 {
    
    public static void main (String[] args) {
        int edades[] =  {26, 73,84,52, 76, 72,37,67, 62,73};
        System.out.println(edades[0]);

        System.out.println(edades[edades.length-1]);
        edades[2] = 48;
        System.out.println (edades [2]);

        for (int i=0; i<edades.length; i++)
            System.out.print(edades[i]+" ");
            System.out.println();

            for (int edad:edades)
                System.out.print(edad+" ");
                System.out.println();
    }        
}