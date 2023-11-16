package com.mycompany.poo.POO1;

public class poo {

    public void maxSpeed(int speed){
        System.out.println("the going so fast" + " "+ speed + "km/h");
    }

    public void brandCar(String brand) {
        System.out.println("the name of your car" + " "+ brand);
    }
    public static void main(String[] args) {
        poo myCar = new poo();
        myCar.maxSpeed(200);
        myCar.brandCar("volvo");
    }

    
    
}
