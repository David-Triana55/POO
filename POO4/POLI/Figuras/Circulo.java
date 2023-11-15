package com.mycompany.POO.POO4.POLI.Figuras;

public class Circulo extends FiguraGeometrica {
    private String radio;
    private String otro;

    public Circulo(String perimetro, String area, String volumen,String radio, String otro) {
        super(perimetro, area, volumen);
        this.radio = radio;
        this.otro = otro;
    }

    public String getOtro() {
        return otro;
    }

    public String getRadio() {
        return radio;
    }

    @Override
    public String mostrarDatos (){
        return "Perimetro: "+perimetro+"\nArea: "+area+"\nVolumen: "+volumen+"\nRadio: "+radio+"\nOtro: "+otro;
    }
    
}
