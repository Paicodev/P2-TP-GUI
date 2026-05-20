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

    private static final String contrasena = "unvime2026";
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
        panel.add(btnAccess);
        
        //6- Listener para el boton de acceso
        btnAccess.addActionListener(new ActionListener() {
            
        @Override
        public void actionPerformed(ActionEvent e){
        //7- logica para capturar y validar los datos
        char[] passwordArray = txtPassword.getPassword();
        
        String passwordIngresada = new String(passwordArray);
        
        //8- brindar la respuesta final cuando ingrese
        if(passwordIngresada.equals(contrasena)){
            //con JOptionPane creamos cuadros de dialogo rapidos
            JOptionPane.showMessageDialog(window,
                    "Bienvenido al sistema "+ txtUser.getText(),
                    "Acceso Concedido",
                    JOptionPane.INFORMATION_MESSAGE
            );
            
        } else {
            JOptionPane.showMessageDialog(window,
                    "Contraseña Incorrecta, intente nuevamente",
                    "Acceso Denegado",
                    JOptionPane.ERROR_MESSAGE);
        }
        }
        });
        
        window.setVisible(true);
    }
}
