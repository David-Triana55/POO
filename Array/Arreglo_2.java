package com.mycompany.grupo2.Array;

public class Arreglo_2 {
    

public static void main (String[] args) {
        final int TAMANO = 26;
        char listaletras[] = new char[TAMANO];
        char letra = 'A';

        for (int i=0; i<TAMANO; i++) {
            listaletras[i] = letra;
            letra++;
        }
        for (int i=0; i<TAMANO; i++) {
            System. out.print(listaletras[i] +" ");
        }
    }
}