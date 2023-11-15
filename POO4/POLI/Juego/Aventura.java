package com.mycompany.grupo2.POO4.POLI.Juego;

public class Aventura extends Juego {

    private String lugar;
    private String personaje;

    public Aventura(String desarrollador, String nombre, int año ,String lugar, String personaje){
        super(desarrollador, nombre, año);
        this.lugar = lugar;
        this.personaje = personaje;
    }

    public String getLugar() {
        return lugar;
    }

    public String getPersonaje() {
        return personaje;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("lugar de Aventura: " + lugar);
        System.out.println("personaje: " + personaje);
    }
    
}
