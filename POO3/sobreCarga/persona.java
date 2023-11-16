package com.mycompany.poo.POO3.sobreCarga;

public class persona {
    int age;
    String name;
    String cedula;


    public persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public persona (String name) {
        this.name = name;
    }

    
    public void correr(String cedula){
        System.out.println("soy " + name+ " tengo " + age + " mi doocumento es " + cedula);    
    }


    public void correr(int km){
        System.out.println("soy " + name + " y estoy en un maraton , voy a correr " + km  + " km");
    }

    public void correr(double peso) {
        System.out.println("soy " + name + " y el peso " + peso);
    }

    public void name() {
        System.out.println("el nombre: " + name);
    }
    public static void main(String[] args) {
        persona persona = new persona("david", 18);
        persona.correr("1032677736");

        persona persona1 = new persona("david");
        persona1.correr(10);

        persona persona2 = new persona("david");
        persona2.correr(60.1);

    }

    
    
}
