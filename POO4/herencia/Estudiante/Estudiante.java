package com.mycompany.grupo2.POO4.herencia.Estudiante;

import com.mycompany.grupo2.POO4.herencia.Empleado.Empleado;

public class Estudiante extends Empleado {
    public Estudiante(String name, String lastName, int identityCard){
        super(name, lastName, identityCard);
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+getName() +"\nApellido: "+getLastName()+ "\nCedula: " +getIdentityCard());
    }
}
