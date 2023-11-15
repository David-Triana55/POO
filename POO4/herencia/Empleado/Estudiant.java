package com.mycompany.POO.POO4.herencia.Empleado;

import com.mycompany.grupo2.POO4.herencia.Estudiante.Persona;

public class Estudiant extends Persona{
        private int codeEstudent;
        private float finalNote;

        public Estudiant(String name, String lastName, int age, int codeEstudent, float finalNote){
            super(name, lastName, age);
            this.codeEstudent = codeEstudent;
            this.finalNote = finalNote;
        }

        public void mostrarDatos (){
            System.out.println("Nombre: "+getName() +"\nApellido: "+getLastName()+"\nEdad: "+getAge() + "\nCodigo Estudiante: " +codeEstudent+"\nNota Final: "+finalNote);
        }

    }
    