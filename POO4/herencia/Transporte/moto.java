package com.mycompany.grupo2.POO4.herencia.Transporte;

class moto extends Transporte {
    public moto(String marca,String modelo, int cilindraje, String color){
        super( marca,modelo,cilindraje,color);  
    }

    public void mostrarDatos(){
        System.out.println("Marca: "+getMarca() +"\nColor: "+getColor()+ "\nModelo: " +getModelo()+"\nCilindraje: "+getCilindraje());
    }

    
}