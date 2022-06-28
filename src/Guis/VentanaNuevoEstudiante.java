package Guis;

import dominio.verificarrut;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaNuevoEstudiante {


    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        JFrame a = new JFrame();
        a.setSize(500, 500);
        a.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        a.setLayout(null);
        Ventana(a);
        a.setVisible(true);
    }

    private static void Ventana(JFrame ventana) {
        JButton boton = new JButton("Agregar");
        boton.setBounds(120, 300, 250, 50);
        boton.setLayout(null);

        JLabel nombre = new JLabel("Nombre:");
        nombre.setBounds(45, 70, 100, 100);
        nombre.setLayout(null);

        JLabel email = new JLabel("Email:");
        email.setBounds(45, 120, 100, 100);
        email.setLayout(null);

        JTextArea EmailIngresado = new JTextArea();
        EmailIngresado.setBounds(110,149,200,40);
        EmailIngresado.setBackground(Color.white);
        EmailIngresado.setLayout(null);

        JTextArea nombreingresado = new JTextArea();
        nombreingresado.setBounds(110,100,200,40);
        nombreingresado.setBackground(Color.white);
        nombreingresado.setLayout(null);

        JLabel rut = new JLabel("Rut:");
        rut.setBounds(45, 170, 100, 100);
        rut.setLayout(null);

        JTextArea rutingresado = new JTextArea("Rut sin digito");
        rutingresado.setBounds(110,199,170,40);
        rutingresado.setBackground(Color.white);
        rutingresado.setLayout(null);

        JTextArea rutDIGITO = new JTextArea("Digito Verificador");
        rutDIGITO.setBounds(300,199,95,40);
        rutDIGITO.setBackground(Color.white);
        rutDIGITO.setLayout(null);


        boton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                verificaciones(nombreingresado.getText(),EmailIngresado.getText(),rutingresado.getText(),rutDIGITO.getText());}
        });
        ventana.add(rut);
        ventana.add(rutDIGITO);
        ventana.add(rutingresado);
        ventana.add(EmailIngresado);
        ventana.add(boton);
        ventana.add(nombre);
        ventana.add(nombreingresado);
        ventana.add(email);

    }

    private static void verificaciones(String nombre, String email, String rut,String digito) {
        try {
            boolean a = dominio.verificarrut.guionK(Integer.parseInt(rut)).equals(digito);
            if (a==true){

            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Digito no Valido");
        }
    }
}

/*
* Tengo que hacer una app con codigo y ventana

Ventana:

en la ventana tengo que hacer un  JComboBox  y hacer que la lista que se vea sean puros rut (verificados)
hacer que el jCombox haga que aparezcan los datos del alumno en la misma ventana
Ventana tiene que tener un Jbutton "Nuevo Estudiante" que habra otra ventana emergente y que permita agregar datos (Validado rut, y no dejando espacios vacios, @ufromail.cl, ver si estan repetidos)


Codigo:
verificar rut
hacer un texto llamado ICC264.TXT Que tenga los rut
en un texto agregar datos previamente ingresados (rut, nombre completo, email)
}
* */