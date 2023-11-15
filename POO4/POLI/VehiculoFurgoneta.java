package com.mycompany.POO.POO4.POLI;

public class VehiculoFurgoneta extends Vehiculo {
    private int carga;

    public VehiculoFurgoneta(int carga, String modelo, String marca, String matricula) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }
    public int getCarga() {
        return carga;
    }

    @Override
    public String mostrarDatos (){
        return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"\nCarga: "+carga;
    }
}