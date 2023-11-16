package com.mycompany.POO;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.*;


public class window extends JFrame{
    public window() {
        this.setSize(600,500);
        setTitle("Barra de titulo");

        componentes();
    }

    private void componentes() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        this.getContentPane().add(panel);

        JLabel titulo = new JLabel("Universidad Uniagustiniana");
        titulo.setFont(new Font("Helvetica",Font.BOLD, 30));
        titulo.setForeground(Color.WHITE);

        JLabel carrera = new JLabel("Tecnolgia de desarrollo de software");
        carrera.setFont(new Font("Helvetica",Font.BOLD, 30));
        carrera.setForeground(Color.WHITE);


        
        JLabel nombre = new JLabel("\nDavid felipe triana");
        nombre.setFont(new Font("Helvetica",Font.BOLD, 18));
        nombre.setForeground(Color.WHITE);


        Button miBoton = new Button("click");
        miBoton.setBounds(new Rectangle(10,12,15,81));
        miBoton.setBackground(Color.BLUE);
        miBoton.setSize(200, 200);
        panel.add(titulo);
        panel.add(carrera);
        panel.add(nombre);

    }
    

    public static void main(String[] args) {
        window ventana = new window();
        ventana.setVisible(true);
    }
}
