/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;
import javax.swing.* ; //libreria principal de GUIs
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author PC
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        //EJ1. Crea una ventana principal instanciando un JFrame y asígnale un tamaño usando setSize().
        //instanciacion de frame
        JFrame ventana = new JFrame();
        ventana.setSize(800,800);
        
        //EJ2. Crea un contenedor intermedio JPanel y añádelo a la ventana principal
        JPanel panel = new JPanel();
        ventana.add(panel);
        
        
        /*EJ3. Dentro del panel, añade una JLabel con el texto "Introduce tu nombre:" y un JTextField de una sola línea
        configurado con un ancho de, por ejemplo, 20 columnas*/
        JLabel label_ventana = new JLabel("Introduce tu nombre:");
        JTextField campoTexto = new JTextField(20);
        
        
        /*EJ4. Añade un JButton con el texto "Saludar". Añade otra JLabel vacía en la parte inferior del panel que servirá
        para mostrar el resultado*/
        JButton boton_saludo = new JButton("Saludar");
        JLabel label_boton = new JLabel();
        
        
        panel.add(label_ventana);
        panel.add(campoTexto);
        panel.add(boton_saludo);
        panel.add(label_boton);
       
        
        // EJ5- Añadimos un Listener
        // Aquí le decimos al botón qué hacer cuando le hagan clic
        boton_saludo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Capturamos lo que el usuario escribió
                String nombreIngresado = campoTexto.getText();
                // Modificamos la etiqueta de resultado
                label_boton.setText("¡Hola, " + nombreIngresado + "!");
            }
        });
        
         ventana.setVisible(true);
        System.out.println("Hello World!");
    }
}
