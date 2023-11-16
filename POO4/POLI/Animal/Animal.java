package com.mycompany.poo.POO4.POLI.Animal;

public class Animal {
    protected String raza;
    protected String color;
    protected String tamaño;
    protected String habitad;

    public Animal(String raza, String color, String tamaño, String habitad){
        this.raza = raza;
        this.color = color;
        this.tamaño = tamaño;
        this.habitad = habitad;
    }

    public String getColor() {
        return color;
    }

    public String getHabitad() {
        return habitad;
    }

    public String getRaza() {
        return raza;
    }
    public String getTamaño() {
        return tamaño;
    } 

    public String mostrarDatos () {
        return "Raza: "+raza+" \nColor: "+color+"\nTamaño: "+tamaño+ "\nHabitad: "+habitad;
    }
}