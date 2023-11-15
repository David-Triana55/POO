package com.mycompany.POO.POO4.herencia.Transporte;

public class Barco extends Transporte{
    public Barco(String marca, String modelo, int cilindraje, String color) {
        super( marca, modelo, cilindraje, color);
    }
    
    public void mostrarDatos(){
        System.out.println("Marca: "+getMarca() +"\nColor: "+getColor()+ "\nModelo: " +getModelo()+"\nCilindraje: "+getCilindraje());
    }
}
