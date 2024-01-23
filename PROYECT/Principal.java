package com.mycompany.poo.PROYECT;

import com.mycompany.poo.PROYECT.Pantalla;
public class Principal {
    
    
    double salarioMensual;
    double horasExtras;
    double auxTransporte;
    double totalDevengado;
    double pension;
    double salud;
    double otros;
    double totalDeducidos;
    double totalPagar;
    double sueldoBasico;
    
    public void fun_salarioMensual(double sueldoBasico, double diasLaborados){
        salarioMensual = (sueldoBasico/30) * diasLaborados;
        this.sueldoBasico = sueldoBasico;
    }
    
    public void fun_horasExtras(double sueldoBasico, double horas ){

        double hora =(sueldoBasico / 30) / 8;
        horasExtras = (hora * 0.25) + hora;
        horasExtras = horasExtras * horas;
    }
    
    public void fun_auxTransporte(){
        if(salarioMensual > 2606000){
            auxTransporte = 0;
            
        } else {
            auxTransporte = 149000;
        }
    }
    
    public void fun_TotalDevengado(){
        totalDevengado = salarioMensual + horasExtras + auxTransporte; 
    }
    
    public void fun_pension(){
        pension = sueldoBasico  * 0.04;  
    }
    
    public void fun_salud(){
        salud = sueldoBasico * 0.04;
    }
    
    public void fun_otros(){
        otros = sueldoBasico * 0.01;
    }
    
    public void fun_totalDeducidos(){
        totalDeducidos = salud + pension+ otros;
    }
    
    public void fun_totalPagar(){
        totalPagar = totalDevengado - totalDeducidos;
    }
    public static void main (String[] args){   
        Pantalla aplicacion = new Pantalla();
        aplicacion.setVisible(true); // la pantalla que acabo de crear hazla visible
        aplicacion.setLocationRelativeTo(null);
    }
}
