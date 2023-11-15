package com.mycompany.POO.EXERCISE;

public class for1 {
    public static void main (String[] args) {
        int i,j;
        for( i = 1, j = 10; i < 5; i++, j = j*(i/2)) {
            System.out.println("i:"+i+" - j:"+j);
        }
    }
}
