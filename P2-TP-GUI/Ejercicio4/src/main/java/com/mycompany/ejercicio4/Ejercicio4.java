/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Pablo
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        //1- Configuracion del contenedor
        JFrame window = new JFrame("Sistema de Acceso");
        window.setSize(350,350);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//se cierra al cerrar desde la ventana
        window.setLocationRelativeTo(null);//centro la ventana
        
        JPanel panel = new JPanel();
        window.add(panel);
        
        //2- Campos para el usuario
        JLabel lblUser = new JLabel("Usuario:");
        JTextField txtUser = new JTextField("", 20);
        
        //3- Campos de Contraseña
        JLabel lblPassword = new JLabel("Contraseña:");
        JPasswordField txtPassword = new JPasswordField("", 20);
        
        //4- Personalizamos los puntos por otro simbolo
        txtPassword.setEchoChar('*');
        
        //5- Boton para enviar los datos
        JButton btnAccess = new JButton("Acceder");
        
        panel.add(lblUser);
        panel.add(txtUser);
        panel.add(lblPassword);
        panel.add(txtPassword);
        window.setVisible(true);
        System.out.println("Hello World!");
    }
}
