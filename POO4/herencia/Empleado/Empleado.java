package com.mycompany.poo.POO4.herencia.Empleado;

public class Empleado {
    private String name;
    private String lastName;
    private int identityCard;

    public Empleado(String name, String lastName, int identityCard){
        this.name = name;
        this.lastName = lastName;
        this.identityCard = identityCard;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getIdentityCard() {
        return identityCard;
    }
    
}
