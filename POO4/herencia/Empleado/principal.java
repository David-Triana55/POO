package com.mycompany.poo.POO4.herencia.Empleado;

import com.mycompany.poo.POO4.herencia.Estudiante.Estudiante;

public class principal {
    public static void main(String[] args) {
        Docente fisica = new Docente("juan","perez",1638292,2000f, "fisico\n");
        fisica.mostrarDatos();
        Estudiante juan = new Estudiante("david", "triana", 10436379);
        juan.mostrarDatos();
    }
}
