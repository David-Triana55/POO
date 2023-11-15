package com.mycompany.POO.POO3;


public class Persona {
    int edad;
    long code;
    String name, adress, carrear;


    public Persona(int edad, String name, String adress, String carrear, long code) {
        this.edad = edad;
        this.name = name;
        this.adress = adress;
        this.carrear = carrear;
        this.code = code;
    }

    public void setEdad() {
        System.out.println(" nombre:" + name);
        System.out.println("la edad suya es:"+ edad);
        System.out.println("su dirección es"+ adress);
        System.out.println("la carrra que usted esudia es: " + carrear);
        System.out.println("ustad esta identificado con " + code);
    }


    public static void main(String[] args) {
        Persona persona1 = new Persona(18,"david","calle 10 # 86-90","desarrolo software", 222023103);
        persona1.setEdad();
    }
    
}
