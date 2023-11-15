package com.mycompany.POO.POO4.POLI.Figuras;


public class Triangulo extends FiguraGeometrica {
    private String tipos;
    private String otro;

    public Triangulo(String perimetro, String area, String volumen,String tipos, String otro) {
        super(perimetro, area, volumen);
        this.tipos = tipos;
        this.otro = otro;
    }

    public String getOtro() {
        return otro;
    }

    public String getTipos() {
        return tipos;
    }
    @Override
    public String mostrarDatos (){
        return "Perimetro: "+perimetro+"\nArea: "+area+"\nVolumen: "+volumen+"\nTipos: "+tipos+"\nOtro: "+otro;
    }
    
}
