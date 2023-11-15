package com.mycompany.grupo2.POO4.POLI.Figuras;

public class Cuadrado extends FiguraGeometrica {
    private String lados;
    private String otro;

    public Cuadrado(String perimetro, String area, String volumen,String lados, String otro) {
        super(perimetro, area, volumen);
        this.lados = lados;
        this.otro = otro;
    }

    public String getOtro() {
        return otro;
    }

    public String getLados() {
        return lados;
    }

    @Override
    public String mostrarDatos (){
        return "Perimetro: "+perimetro+"\nArea: "+area+"\nVolumen: "+volumen+"\nLados: "+lados+"\nOtro: "+otro;
    }
    
}
