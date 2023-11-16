package com.mycompany.poo.POO2;

import javax.swing.JOptionPane;

public class cuadrado {
    int lado, perimetro, area;

    public void leerDatos () {
        lado  = Integer.parseInt(JOptionPane.showInputDialog("Digite el lado del cuadrado"));
    }


    public void cuadradoL() {
        perimetro = lado * 4;
        area = lado * lado;
    }

    public void mostrarResultado () {
        System.out.println("el area del cuadrado: " + area);
        System.out.println("el perimetro del cuadrado: " + perimetro);

    }


    public static void main(String[] args) {
        
        cuadrado cuadrado1 = new cuadrado();
        cuadrado1.leerDatos();
        cuadrado1.cuadradoL();
        cuadrado1.mostrarResultado();
    }



    
}
