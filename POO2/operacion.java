package com.mycompany.grupo2.POO2;

import javax.swing.JOptionPane;

public class operacion {
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    double potencia;

    public void leerNumero(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));
    }

    public void sumar (){
        suma = numero1 +numero2;
    }

    public void restar () {
        resta = numero1 - numero2;
    }

    public void multiplicar (){
        multiplicacion = numero1 *numero2;
    }

    public void dividir () {
        division = numero1/numero2;
    }

    public void potencia() {
        potencia = Math.pow(numero1, numero2);
    }

    public void mostrarResultador (){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+ multiplicacion );
        System.out.println("La division es: "+division);
        System.out.println("La potencia: "+ potencia);
    }

}
