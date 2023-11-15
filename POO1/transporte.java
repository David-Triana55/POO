package com.mycompany.POO.POO1;

public class transporte {
    String tipo;  
    String marca;
    String modelo;
    int capacidad;

    public static void main(String[] args) {

        // ! _____________________________________________________
        System.out.println("------Medio de Transporte 1--------");
        transporte transporte1 = new transporte();
        transporte1.tipo = "Automóvil";
        transporte1.marca = "Toyota";
        transporte1.modelo = "Camry";
        transporte1.capacidad = 5;

        System.out.println("Tipo de transporte: " + transporte1.tipo);
        System.out.println("Marca: " + transporte1.marca);
        System.out.println("Modelo: " + transporte1.modelo);
        System.out.println("Capacidad: " + transporte1.capacidad + " personas");

        // ! _____________________________________________________


        System.out.println("------Medio de Transporte 2--------");
        transporte transporte2= new transporte();
        transporte2.tipo = "Cicla";
        transporte2.marca = "bmx";
        transporte2.modelo = "montaña";
        transporte2.capacidad = 1;

        System.out.println("Tipo de transporte: " + transporte2.tipo);
        System.out.println("Marca: " + transporte2.marca);
        System.out.println("Modelo: " + transporte2.modelo);
        System.out.println("Capacidad: " + transporte2.capacidad + " persona");

        // ! _____________________________________________________


        System.out.println("------Medio de Transporte 3--------");
        transporte transporte3 = new transporte();
        transporte3.tipo = "bus";
        transporte3.marca = "Mercedez benz";
        transporte3.modelo = "2018";
        transporte3.capacidad = 50;

        System.out.println("Tipo de transporte: " + transporte3.tipo);
        System.out.println("Marca: " + transporte3.marca);
        System.out.println("Modelo: " + transporte3.modelo);
        System.out.println("Capacidad: " + transporte3.capacidad + " personas");

        // ! _____________________________________________________


        System.out.println("------Medio de Transporte 4--------");
        transporte transporte4 = new transporte();
        transporte4.tipo = "caminioneta";
        transporte4.marca = "Toyota";
        transporte4.modelo = "2022";
        transporte4.capacidad = 8;

        System.out.println("Tipo de transporte: " + transporte4.tipo);
        System.out.println("Marca: " + transporte4.marca);
        System.out.println("Modelo: " + transporte4.modelo);
        System.out.println("Capacidad: " + transporte4.capacidad + " personas");

        // ! _____________________________________________________


        System.out.println("------Medio de Transporte 5--------");
        transporte transporte5 = new transporte();
        transporte5.tipo = "Avión";
        transporte5.marca = "avianca";
        transporte5.modelo = "boin447";
        transporte5.capacidad = 300;

        System.out.println("Tipo de transporte: " + transporte5.tipo);
        System.out.println("Marca: " + transporte5.marca);
        System.out.println("Modelo: " + transporte5.modelo);
        System.out.println("Capacidad: " + transporte5.capacidad + " personas");

    }
}
