package com.mycompany.POO.POO3;

public class parcial2 {
    String tipo;
    int id;
    int pasajeros;
    int valor;


    public parcial2(int id) {
        this.id = id;
    }


    public void vehiculo(String tipo) {
        System.out.println("tipo: " + tipo +"\nid: " + id + "\npasajeros: 400 \nvalor: $200\n" );
    }
    public void vehiculo() {
        System.out.println("tipo: transmilenio \nid: " + id + "\npasajeros: 100 \nvalor: $3\n" );
    } public void vehiculo(int pasajeros) {
        System.out.println("tipo: bus \nid: " + id + "\npasajeros:" + pasajeros + "\nvalor: $2\n" );
    } public void vehiculo(double valor) {
        System.out.println("tipo: taxi \n d: " + id + "\npasajeros: 4  \n" + " valor: $"+  valor );
    }

    public static void main(String[] args) {
        parcial2 vehicle = new parcial2(1032677756);
        vehicle.vehiculo("avion");
        vehicle.vehiculo();
        vehicle.vehiculo(100);
        vehicle.vehiculo(2.5);

    }
}
