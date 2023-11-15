package com.mycompany.grupo2;

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

        JLabel tag = new JLabel("programa 1");
        tag.setFont(new Font("Helvetica",Font.BOLD, 30));
        tag.setForeground(Color.WHITE);

        Button miBoton = new Button("click");
        miBoton.setBounds(new Rectangle(10,12,15,81));
        miBoton.setBackground(Color.BLUE);
        miBoton.setSize(200, 200);
        panel.add(tag);

    }
    

    public static void main(String[] args) {
        window ventana = new window();
        ventana.setVisible(true);
    }
}
