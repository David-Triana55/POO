package com.mycompany.poo.POO2;

import javax.swing.JOptionPane;

public class Triangulo {
    double lado1;
    double lado2;
    double lado3;
    
    public Triangulo() {
        lado1  = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer lado del triangunlo"));
        lado2  = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo lado del  triangunlo"));
        lado3  = Double.parseDouble(JOptionPane.showInputDialog("Digite el el tercer lado del triangunlo"));

    }

    public boolean esIsosceles() {
        return (lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3);
    }

    public boolean esEquilatero() {
        return (lado1 == lado2) && (lado1 == lado3);
    }

    public boolean esEscaleno() {
        return !esIsosceles() && !esEquilatero();
    }

    public static void main(String[] args) {
        Triangulo tri1 = new Triangulo(); 

        System.out.println("tri1 es equilátero: " + tri1.esEquilatero());
        System.out.println("tri1 es isósceles: " + tri1.esIsosceles());
        System.out.println("tri1 es escaleno: " + tri1.esEscaleno());
    }
}
