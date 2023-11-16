package com.mycompany.poo.POO2;

import javax.swing.JOptionPane;

public class iva  {
    double iva;
    double valorArticulo;
    double cantidadArticulos;
    double totalSinDescuento;
    double totalConIva;
    double totalEfectivo;
    double totalDebito;
    double totalCredito;


    public void Articulo() {
        valorArticulo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del artículo: "));
        iva = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el porcentaje de IVA: "));
        cantidadArticulos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de artículos: "));
    }

    public void calcularTotalSinDescuento() {
        totalSinDescuento =  valorArticulo * cantidadArticulos;
        System.out.println("El total sin descuento es: " + totalSinDescuento);

    }

    public void calcularTotalConIVA() {
        totalConIva =  totalSinDescuento * (1 + (iva / 100));
        System.out.println("El total con iva: " + totalConIva);
    }

    public void calcularTotalEfectivo() {
        totalEfectivo = totalConIva * 0.85; // 15% de descuento
        System.out.println("El 15% es: " + totalEfectivo);
    }

    public void calcularTotalDebito() {
        totalDebito =  totalConIva * 0.90; // 10% de descuento
        System.out.println("El 10% es: " + totalDebito);

    }

    public void calcularTotalCredito() {
        totalCredito =  totalConIva * 0.95; // 5% de descuento
        System.out.println("El 5% es: " + totalCredito);

    }


    public static void main(String[] args) {

        iva compra = new iva();
        compra.Articulo();
        compra.calcularTotalSinDescuento();
        compra.calcularTotalConIVA();
        compra.calcularTotalCredito();
        compra.calcularTotalDebito();
        compra.calcularTotalEfectivo();
    }
}
