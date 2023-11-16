package com.mycompany.poo.POO4.POLI.Juego;

public class Musical extends Juego {

    private String cancion;
    private String instrumento;

    public Musical(String desarrollador, String nombre, int año ,String cancion, String instrumento){
        super(desarrollador, nombre, año);
        this.cancion = cancion;
        this.instrumento = instrumento;
    }

    public String getCancion() {
        return cancion;
    }

    public String getInstrumento() {
        return instrumento;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("cancion: " + cancion);
        System.out.println("instrumento: " + instrumento);
    }
    
}
