package com.mycompany.poo.POO4.POLI.Animal;

public class Gato extends Animal {
    private String taxonomia;
    private String otro;

    public Gato(String raza, String color, String tamaño, String habitad,String taxonomia, String otro){
        super(raza, color, tamaño, habitad);
        this.taxonomia = taxonomia;
        this.otro = otro;
    }

    public String getTaxonomia() {
        return taxonomia;
    }

    public String getOtro() {
        return otro;
    }

    @Override
    public String mostrarDatos () {
        return "Raza: "+raza+" \nColor: "+color+"\nTamaño: "+tamaño+ "\nHabitad: "+habitad+ "\nTaxonomia: "+taxonomia+ "\nOtro: "+otro;
    }

}
