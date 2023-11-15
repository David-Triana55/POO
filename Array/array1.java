package com.mycompany.POO.Array;

public class array1 {

    // funcion fuera del void main principal

    static void nombre(String nombre) {
        System.out.println("su nombre es  " + nombre );

    }  

    public static void main(String[] args) {


        // ! array 

        int perras[] = new int[10]; // se crea una array con 10 posiciones
        perras[0] = 40;
        perras[1] = 40;
        perras[2] = 40;
        perras[3] = 40;
        perras[4] = 40;
        perras[5] = 40;
        perras[6] = 40;
        perras[7] = 40;
        
        perras[8] = 40;
        perras[9] = 40;

        for (int i = 0; i < perras.length; i++) {
            System.out.println(perras[i]);
        }

        // se ingresan valor por cada indice del array

        int arreglo[] = new int [5];
        arreglo[0] = 21 ;
        arreglo[1] = arreglo[0] + 90;
        arreglo[2] = 10 * arreglo[1];
        arreglo[4] = 10;

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }

        int listaNumeros[] = {1,2,3,4,5};
            for (int i=0; i < listaNumeros.length; i++) {
            System.out.print (listaNumeros [i]);
            System.out.print ("...");
            System.out.println (listaNumeros[1]+1);
            }

        nombre("sofia");


        int nombre [] = {30,40,20};
        String alumno [] = { "pedro ", "juan", "david"};
        int pepe[] = new int [2];
        pepe[0] = 21;

        // ! objetos

        // UML {

            // ? nombre clase => gato
            // ? atributos => alto, ancho, color
            // ?métodos => comer, dormir
            // ? eventos => 
            // El automóvil tiene atributos, como el peso y el color, y métodos, como conducir y frenar.
            // todo Por lo tanto, una clase es una plantilla para objetos, y un objeto es una instancia de una clase.
            // Cuando se crean los objetos individuales, heredan todos los variables y métodos de la clase.
            // Aprenderá mucho más sobre clases y objetos en el próximo capítulo.
        // }


    }
    
}
