package com.mycompany.poo.POO4.POLI.Figuras;

public class Principal {
    public static void main(String[] args) {
        FiguraGeometrica misFiguras[] = new FiguraGeometrica[5];

        misFiguras [0] = new FiguraGeometrica("2L + 2W","L x W","L x W x H");
        misFiguras [1] = new Circulo("El valor del radio del círculo es 5 unidades.","Circunferencia: 31.42 unidades (aproximadamente).","Diámetro del círculo: 10 unidades."," 5 unidades.","360");
        misFiguras [2] = new Cuadrado("El cuadrado tiene 4 lados de igual longitud","Centro del cuadrado: Coordenadas (5, 5)","40 unidades.","100 unidades cuadradas.","10 unidades x 10 unidades.");
        misFiguras [3] = new Rectangulo("Cuatro esquinas, coordenadas (0,0), (6,0), (0,12), (6,12).","Rectángulo azul con lados opuestos de igual longitud y ángulos rectos.","36 unidades","72 unidades cuadradas","Los rectángulos son formas bidimensionales y no tienen volumen.");
        misFiguras [4] = new Triangulo("Triángulo escaleno con un ángulo agudo, un ángulo obtuso y un ángulo recto.","Triángulo amarillo sin lados ni ángulos congruentes definidos.","21 unidades","21 unidades cuadradas","Los triángulos son formas bidimensionales y no tienen volumen.");


        for (int i = 0; i < misFiguras.length; i++) {
            System.out.println(misFiguras[i].mostrarDatos());
            System.out.println("");
            
        }
    }
}
