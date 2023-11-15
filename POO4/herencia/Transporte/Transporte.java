package com.mycompany.grupo2.POO4.herencia.Transporte;

public class Transporte {
    private String marca;
    private String modelo;
    private int cilindraje;
    private String color;

    public Transporte(String marca, String modelo, int cilindraje, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }
    public int getCilindraje() {
        return cilindraje;
    }
}
