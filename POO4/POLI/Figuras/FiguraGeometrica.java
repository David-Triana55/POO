package com.mycompany.grupo2.POO4.POLI.Figuras;

public class FiguraGeometrica {
    protected String perimetro;
    protected String area;
    protected String volumen;

    public FiguraGeometrica(String perimetro, String area, String volumen){
        this.perimetro = perimetro;
        this.area = area;
        this.volumen = volumen;
    }

    public String getArea() {
        return area;
    }

    public String getPerimetro() {
        return perimetro;
    }

    public String getVolumen() {
        return volumen;
    }

    public String mostrarDatos(){
        return "Perimetro: "+perimetro+" \nArea: "+area+"\nVolumen: "+volumen;
    }
}
