package com.mycompany.poo.POO4.POLI.Juego;

public class Principal {
    public static void main(String[] args) {
        Juego misJuegos[] = new Juego[5];

        misJuegos[0] = new Accion("Rockstar Games", "Grand Theft Auto V", 2013, "Completar misiones", "Crimen y corrupción en Los Santos");
        misJuegos[1] = new Deporte("EA Sports", "FIFA 23", 2022, "Fútbol", "Equipos de fútbol");
        misJuegos[2] = new Simulacion("Maxis", "The Sims 4", 2014, "PC", "Realismo en simulación de vida");
        misJuegos[3] = new Aventura("Naughty Dog", "Uncharted 4: A Thief's End", 2016, "Mundo antiguo y tesoros perdidos", "Nathan Drake");
        misJuegos[4] = new Musical("Harmonix", "Rock Band", 2007, "Canciones variadas", "Instrumentos musicales virtuales");

        for (int i = 0 ; i < misJuegos.length; i++) {
            misJuegos[i].mostrarDatos();
            System.out.println("");
        }    
    }
}
