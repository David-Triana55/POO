package com.mycompany.grupo2.POO4.POLI.Juego;

public class Simulacion extends Juego {

    private String consola;
    private String realismo;

    public Simulacion(String desarrollador, String nombre, int año ,String consola, String realismo){
        super(desarrollador, nombre, año);
        this.consola = consola;
        this.realismo = realismo;
    }

    public String getConsola() {
        return consola;
    }

    public String getRealismo() {
        return realismo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Consola: " + consola);
        System.out.println("Realismo: " + realismo);
    }
    
}
