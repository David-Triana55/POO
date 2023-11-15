package com.mycompany.POO.POO4.GETTER;

public class Computador {
    private String marca;
    private String procesador;
    private int RAM;
    private float discoDuro;
    private float precio;
    private int pantalla;

    public Computador() {
        this.marca = "Acer";
        this.procesador = "core I5";
        this.RAM = 12;
        this.discoDuro = 512f;
        this.precio = 100000f;
        this.pantalla = 1980;
    }

    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int rAM) {
        RAM = rAM;
    }

    public float getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(float discoDuro) {
        this.discoDuro = discoDuro;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getPantalla() {
        return pantalla;
    }

    public void setPantalla(int pantalla) {
        this.pantalla = pantalla;
    }

    public static void main(String[] args) {
        Computador portatil = new Computador();
        portatil.setMarca("HP");
        portatil.setProcesador("core I7");
        portatil.setRAM(16);
        portatil.setPrecio(12000f);
        portatil.setDiscoDuro(1f);
        portatil.setPantalla(720);


        System.out.println("La marca del portatil " + portatil.getMarca());
        System.out.println("el procesador del portatil " + portatil.getProcesador());
        System.out.println("la RAM del portatil " + portatil.getRAM() + " gb");
        System.out.println("el Precio del portatil " + portatil.getPrecio());
        System.out.println("el Disco duro del portatil " + portatil.getDiscoDuro() + " gb");
        System.out.println("La pantalla del portatil " + portatil.getPantalla() + " px");



    }
}
