
package com.mycompany.grupo2.Calculadora;

import com.mycompany.grupo2.Calculadora.Pantalla;

public class Principal {
    
    public double sumaResult;
    public double restResult;
    public double divResult;
    public double mulResult;

    
    public void suma(double num1, double num2){
        sumaResult= num1 + num2;
    }

    public void resta(double num1, double num2){
        restResult= num1 - num2;
    }

    public void div(double num1, double num2){
        divResult = num1 / num2;
    }

    public void multiplicacion(double num1, double num2){
        mulResult = num1 * num2;
    }
    
    public static void main (String[] args){   
        Pantalla panta = new Pantalla();
        panta.setVisible(true); // la pantalla que acabo de crear hazla visible
        panta.setLocationRelativeTo(null);
    }
    
}
