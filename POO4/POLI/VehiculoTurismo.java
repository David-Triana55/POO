package com.mycompany.grupo2.POO4.POLI;

public class VehiculoTurismo extends Vehiculo {
    private int puertas;

    public VehiculoTurismo(int puertas, String modelo, String marca, String matricula) {
        super(matricula, marca, modelo);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    @Override
    public String mostrarDatos (){
        return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"\nNumero de Puertas: "+puertas;
    }

    
}
