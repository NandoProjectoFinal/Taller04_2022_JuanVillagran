package Guis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventanaEstudiantes {

    public ventanaEstudiantes(){
        JFrame ventana = new JFrame();
        ventana.setLayout(null);
        iniciarcomponentes(ventana);
        ventana.setSize(500,500);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }

    private void iniciarcomponentes(JFrame ventana) {

        JButton boton = new JButton("Nuevo Estudiante");
        boton.setBounds(120, 300, 250, 50);
        boton.setLayout(null);

        JLabel nombre = new JLabel("Nombre:");
        nombre.setBounds(45, 70, 100, 100);
        nombre.setLayout(null);

        JLabel nombre1 = new JLabel();
        nombre1.setBounds(5,0,70,70);
        nombre1.setLayout(null);

        JPanel paneldenombre = new JPanel();
        paneldenombre.setBounds(110, 97, 200, 40);
        paneldenombre.setBackground(Color.white);
        paneldenombre.add(nombre1);
        paneldenombre.setLayout(null);

        JLabel email = new JLabel("Email:");
        email.setBounds(45, 120, 100, 100);

        email.setLayout(null);

        JLabel email1 = new JLabel();
        email1.setBounds(5,0,70,70);
        email1.setLayout(null);

        JPanel paneldeEmail = new JPanel();
        paneldeEmail.setBounds(110,147,200,40);
        paneldeEmail.setBackground(Color.white);
        paneldeEmail.add(email1);
        paneldeEmail.setLayout(null);


        JComboBox lista = new JComboBox<>();
        lista.addItem("Seleccionar Alguno");
        lista.addItem("A454");
        lista.addItem("Afdksf");
        lista.addItem("Verda");
        lista.addItem("Rojo");
        lista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nombre1.setText(lista.getSelectedItem().toString());
            }
        });
        lista.setBounds(25,5,100,25);
        lista.setLayout(null);

        boton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.setVisible(false);
            Guis.VentanaNuevoEstudiante.iniciar();
            }
        });

        ventana.add(lista);
        ventana.add(boton);
        ventana.add(nombre);
        ventana.add(paneldenombre);
        ventana.add(paneldeEmail);
        ventana.add(email);
    }

    public static void main(String[] args) {
        ventanaEstudiantes a = new ventanaEstudiantes();
    }
}