package com.mycompany.grupo2.POO4.herencia.Transporte;

public class Principal {
    public static void main(String[] args) {
        Automovil carro = new Automovil("audi","Q5",400,"rojo");
        carro.mostrarDatos();
        System.out.println("\n");
        Barco lancha = new Barco("lamborghini", "i600",300,"blanca");
        lancha.mostrarDatos();
        System.out.println("\n");
        moto r15 = new moto("kawasaki", "150", 150, " rojo");
        r15.mostrarDatos();
    }
    
}
