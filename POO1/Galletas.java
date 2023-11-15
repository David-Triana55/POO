package com.mycompany.grupo2.POO1;

public class Galletas {
    String sabor;
    String forma;
    String color; 
    String atributos;

    public static void main(String[] args) {

        System.out.println("------Galleta 1--------");
        Galletas galleta1 = new Galletas();
        galleta1.sabor = "sabor de frutos rojos con chispas de chocolate";
        galleta1.atributos = "grande, rica, suave";
        galleta1.forma = "redonda";
        galleta1.color = "cafe";

        System.out.println("el sabor de la galleta es: " + galleta1.sabor);
        System.out.println("los atributos de la galleta es: " + galleta1.atributos);
        System.out.println("la forma de la galleta es: " + galleta1.forma);
        System.out.println("el color de la galleta es: " + galleta1.color);

        // !________________________________________________________________

        System.out.println("------Galleta 2--------");

        Galletas galleta2 = new Galletas();
        galleta2.sabor = "sabor de vainilla";
        galleta2.atributos = "grande, rica, suave";
        galleta2.forma = "cuadradrada";
        galleta2.color = "blanca";

        System.out.println("el sabor de la galleta es: " + galleta2.sabor);
        System.out.println("los atributos de la galleta es: " + galleta2.atributos);
        System.out.println("la forma de la galleta es: " + galleta2.forma);
        System.out.println("el color de la galleta es: " + galleta2.color);


        // !________________________________________________________________

        System.out.println("------Galleta 3--------");


        Galletas galleta3 = new Galletas();
        galleta3.sabor = "sabor de cereza";
        galleta3.atributos = "grande, rica, suave";
        galleta3.forma = "triangular";
        galleta3.color = "roja";

        System.out.println("el sabor de la galleta es: " + galleta3.sabor);
        System.out.println("los atributos de la galleta es: " + galleta3.atributos);
        System.out.println("la forma de la galleta es: " + galleta3.forma);
        System.out.println("el color de la galleta es: " + galleta3.color);

        // !________________________________________________________________

        System.out.println("------Galleta 4--------");


        Galletas galleta4 = new Galletas();
        galleta4.sabor = "sabor de mora";
        galleta4.atributos = "grande, rica, suave";
        galleta4.forma = "rectangular";
        galleta4.color = "morada";

        System.out.println("el sabor de la galleta es: " + galleta4.sabor);
        System.out.println("los atributos de la galleta es: " + galleta4.atributos);
        System.out.println("la forma de la galleta es: " + galleta4.forma);
        System.out.println("el color de la galleta es: " + galleta4.color);


    }
}
