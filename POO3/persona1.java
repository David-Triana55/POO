package com.mycompany.grupo2.POO3;
import java.util.Random;


public class persona1 {
    String name;
    char gener;
    String DNI;
    int age, peso; 
    double altura;

    int suPeso = -1;
    int pesoIdeal = 0;
    int sobrePeso = 1;

    boolean verificacionEdad;

    
    public persona1() { 
        this.name = "david";
        this.age = 18;
        this.peso = 61;
        this.altura = 1.71;
        this.gener = 'H';
        this.DNI = "1032677756";
    }

    public persona1(String name, char gener, int age) {
        this.name = name;
        this.age = age;
        this.peso = 61;
        this.altura = 1.71;
        this.gener = gener;
        this.DNI = generateDni();
    }

    public persona1(String name, int age, int peso, double altura, char gener, String DNI) {
        this.name = name;
        this.age = age;
        this.peso = peso;
        this.altura = altura;
        this.gener = gener;
        this.DNI = DNI;
    }

    public int calcularImc() {
        double imc = peso / Math.pow(altura, 2);

        if (imc < 20) {
            return suPeso;
        } else if (imc >= 20 && imc <= 25) {
            return pesoIdeal;
        } else {
            return sobrePeso;
        }
    }

    public boolean esMayorDeEdad() {
        return age >= 18;
    }

    public char comprobarSexo(char gener){
        return (gener == 'H' || gener == 'M')? gener: 'H';
    }

    public void String() {
        System.out.println("name : " + name);
        System.out.println("mayor de edad: " +  esMayorDeEdad());
        System.out.println("Imc: " +  calcularImc());
        System.out.println("peso: " +  peso);
        System.out.println("sexo: " +  comprobarSexo(gener));
        System.out.println("altura: "  + DNI);
        System.out.println("     ");
    }
    

    public String generateDni() {
        
        Random rand = new Random();
        int numero = rand.nextInt(90000000) + 10000000;

        // Calcular la letra correspondiente al número generado
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = numero % 23;

        return Integer.toString(numero) + letras.charAt(resto);
    }

    public static void main(String[] args) {
        persona1 persona1 = new persona1();
        persona1  persona2 = new persona1("Maria",'M',20);
        persona1 persona3 = new persona1("juan",20, 200,1.70,'H',"79777729");
        
        // persona1.String();
        // persona2.String();
        persona3.String();
    }
}

