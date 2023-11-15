package com.mycompany.grupo2.POO4.GETTER;

public class Producto {
    private int code;
    private String description;
    private float price;
    public Producto(){
        this.code = 001000;
        this.description = "pequeño";
        this.price = 1.2f;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Producto producto = new Producto();
        producto.setCode(103920);
        // producto.setDescription("grande");
        producto.setPrice(12.5f);

        System.out.println("el codigo del producto " + producto.getCode());
        System.out.println("la descripcion del producto " + producto.getDescription());
        System.out.println("el precio del producto " + producto.getPrice());
    }
}
