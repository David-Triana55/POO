package com.mycompany.POO.POO4.POLI.Juego;

public class Accion extends Juego {
    private String objetivo;
    private String historia;

    public Accion(String desarrollador, String nombre, int año,String objetivo, String historia){
        super(desarrollador, nombre, año);
        this.objetivo = objetivo;
        this.historia = historia;
    }
    public String getObjetivo() {
        return objetivo;
    }
    public String getHistoria() {
        return historia;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Objetivo: " + objetivo);
        System.out.println("Historia: " + historia);
    }    
}
