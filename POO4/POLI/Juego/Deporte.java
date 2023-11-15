package com.mycompany.grupo2.POO4.POLI.Juego;

public class Deporte extends Juego {

    private String tipo;
    private String equipos;

    public Deporte(String desarrollador, String nombre, int año ,String tipo, String equipos){
        super(desarrollador, nombre, año);
        this.tipo = tipo;
        this.equipos = equipos;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEquipos() {
        return equipos;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de Deporte: " + tipo);
        System.out.println("Equipos: " + equipos);
    }
    
}
