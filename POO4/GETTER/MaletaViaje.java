package com.mycompany.poo.POO4.GETTER;

public class MaletaViaje {
    private String marca;
    private String description;
    private float precio;
    private String color;

    public MaletaViaje(){
        this.marca = "Totto";
        this.description = "grande";
        this.color = "negr0";
        this.precio = 5.00f;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        MaletaViaje maleta = new MaletaViaje();
        maleta.setMarca("Adidas");
        maleta.setColor("beige");
        maleta.setDescription("comoda");
        maleta.setPrecio(30.0f);

        System.out.println("la Marca de la maleta " + maleta.getMarca());
        System.out.println("El color de la maleta " + maleta.getColor());
        System.out.println("la descripcion de la maleta " + maleta.getDescription());
        System.out.println("El precio de la maleta " + maleta.getPrecio());




    }

}
