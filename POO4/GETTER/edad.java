package com.mycompany.POO.POO4.GETTER;

public class edad {
    private int edad;
    private String nombre;
    private String carrera;    
    private long id; 
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public static void main(String[] args) {
        edad persona = new edad();
        persona.setEdad(10);
        persona.setNombre("david");
        persona.setId(1032677756);
        persona.setCarrera("Desarrollo de software");


        System.out.println("la edad es " + persona.getEdad());
        System.out.println("El nombre es " + persona.getNombre());
        System.out.println("la carrera es " + persona.getCarrera());
        System.out.println("El id es " + persona.getId());
    }
}
