package com.mycompany.POO.POO4.POLI.Animal;


public class Gusano extends Animal {
    private String taxonomia;
    private String otro;

    public Gusano(String raza, String color, String tamaño, String habitad,String taxonomia, String otro){
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
