package com.mycompany.poo.POO1;

public class leon {
    String nombre;
    String especie;
    int edad;
    String habitat;

    public static void main(String[] args) {
        System.out.println("------León 1--------");
        leon leon1 = new leon();
        leon1.nombre = "Simba";
        leon1.especie = "León africano";
        leon1.edad = 5;
        leon1.habitat = "Sabana";

        System.out.println("Nombre del león: " + leon1.nombre);
        System.out.println("Especie del león: " + leon1.especie);
        System.out.println("Edad del león: " + leon1.edad + " años");
        System.out.println("Habitat del león: " + leon1.habitat);

    }
}
