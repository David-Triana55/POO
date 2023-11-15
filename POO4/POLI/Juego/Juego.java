package com.mycompany.grupo2.POO4.POLI.Juego;

public class Juego {
    protected String desarrollador;
    protected String nombre;
    protected int año;

    public Juego(String desarrollador, String nombre, int año){
        this.desarrollador = desarrollador;
        this.nombre = nombre;
        this.año = año;
    }

    public String getDesarrollador() {
        return desarrollador;
    }
    public String getNombre() {
        return nombre;
    }
    public int getAño() {
        return año;
    }

    public void mostrarDatos() {
        System.out.println("Desarrollador: " + desarrollador);
        System.out.println("Nombre: " + nombre);
        System.out.println("Año: " + año);
    }

}
