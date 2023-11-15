package com.mycompany.POO.POO4.POLI.Animal;

public class Principal {
    public static void main(String[] args) {
        Animal misAnimales[] = new Animal[4];

        misAnimales [0] = new Animal("Lobo","negro","grande","Zona fria");
        misAnimales [1] = new Delfin("Delphinus capensis","Rapido","Delphinus capensis","Negro con Blanco","grande","lugares Frios ");
        misAnimales [2] = new Gato("El gato doméstico","Veloz","Felis silvestris catus","Negro","Pequeño","Selva");
        misAnimales [3] = new Gusano("Oruga","Patas pequeñas","Lepidoptera","Verde","Muy pequeño","bosques, praderas");

        for (int i = 0; i <= 3 ; i++) {
            System.out.println(misAnimales[i].mostrarDatos());
            System.out.println("");
        }
    }
}
