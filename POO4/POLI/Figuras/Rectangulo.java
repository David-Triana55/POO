package com.mycompany.POO.POO4.POLI.Figuras;

public class Rectangulo extends FiguraGeometrica {
    private String vertices;
    private String otro;

    public Rectangulo(String perimetro, String area, String volumen,String vertices, String otro) {
        super(perimetro, area, volumen);
        this.vertices = vertices;
        this.otro = otro;
    }

    public String getOtro() {
        return otro;
    }

    public String getVertices() {
        return vertices;
    }

    @Override
    public String mostrarDatos (){
        return "Perimetro: "+perimetro+"\nArea: "+area+"\nVolumen: "+volumen+"\nVertices: "+vertices+"\nOtro: "+otro;
    }
    
}
