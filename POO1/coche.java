package com.mycompany.grupo2.POO1;

public class coche {
    String color;
    String marca; 
    int km;
    String clasificacion;


    public coche(String color, String marca) {
        this.color = color;
        this.marca = marca;
    }
    
        public static void main (String[]args){

        //! carro1
        System.out.println("------carro1------");
        coche coche1 = new coche("rojo", "ford");
        // coche1.color ="rojo";
        // coche1.marca = "ford";
        coche1.km = 120;
        System.out.println("el color del carro es: "+ coche1.color);
        // System.out.println("el marca del carro es: "+ coche1.marca);
        // System.out.println("el kilometraje del carro es: "+ coche1.km);
    

        //! carro2

        // System.out.println("------carro2------");
        // coche coche2 = new coche();
        // coche2.color ="blanco";
        // coche2.marca = "Audi";
        // coche2.km = 200;
        // System.out.println("el color del carro es: "+ coche2.color);
        // System.out.println("el marca del carro es: "+ coche2.marca);
        // System.out.println("el kilometraje del carro es: "+ coche2.km);
    
        
        // //! carro3

        // System.out.println("-----carro3------");
        // coche coche3 = new coche();
        // coche3.color ="negro";
        // coche3.marca = "nissan";
        // coche3.km = 120;
        // System.out.println("el color del carro es: "+ coche3.color);
        // System.out.println("el marca del carro es: "+ coche3.marca);
        // System.out.println("el kilometraje del carro es: "+ coche3.km);
        // System.out.println("clasificatoria deportivos");
        

    }
}
