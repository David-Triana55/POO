package com.mycompany.POO.POO4.herencia.Empleado;


public class Docente extends Empleado {
    private String profesion;
    private float salario;

    public Docente(String name, String lastName,int identityCard, float salario, String profesion) {
        super(name, lastName, identityCard);
        this.profesion = profesion;
        this.salario = salario;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+getName() +"\nApellido: "+getLastName()+ "\nCedula: " +getIdentityCard()+"\nProfesion: "+profesion + "\nSalario: "+salario);
    }

}
