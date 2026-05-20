/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Pablo
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        /*1-Ventana Principal con sus componentes*/
        JFrame window = new JFrame();
        window.setSize(300,300);
        JPanel windowPanel = new JPanel();
        JLabel optionLabel = new JLabel("Opciones seleccionadas: Ninguna");
        JButton preferenceButton = new JButton("Configurar Preferencias");
        
        //4- Interaccion para abrir dialogo
        preferenceButton.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e) {
                // instancio la ventana secundaria. 
                // Le pasamos la ventana principal como "dueña" y la etiqueta para que pueda modificarla.
                dialogWindow dialogo = new dialogWindow(window, optionLabel);
                dialogo.setVisible(true); // abre la ventana modal
            }
    });
        window.add(windowPanel);
        windowPanel.add(optionLabel);
        windowPanel.add(preferenceButton);
        window.setVisible(true);
        System.out.println("Ventana instanciada!!");
    }
}
/*2-Ventana secundaria con sus componentes*/
        class dialogWindow extends JDialog{
            public dialogWindow(JFrame window, JLabel updateLabel){
                super(window, "Preferencias del Sistema", true);
                setSize(200,200);
                
                JPanel dialogPanel = new JPanel();
                
                //3- Añadido de checkboxes y boton
                JCheckBox chkDarkMode = new JCheckBox("Modo Oscuro");
                JCheckBox chkNotifications = new JCheckBox("Notificaciones");
                JCheckBox chkAutoSave = new JCheckBox("Autoguardado");
                JButton btnAccept = new JButton("Aceptar");
                
                dialogPanel.add(chkDarkMode);
                dialogPanel.add(chkNotifications);
                dialogPanel.add(chkAutoSave);
                dialogPanel.add(btnAccept);
                
                add(dialogPanel);
                //5- Interaccion 2, procesar las opciones
                btnAccept.addActionListener(new ActionListener(){
                @Override
                //comprueba que la accion fue efectuada
                public void actionPerformed(ActionEvent e){
                    
                    /*Condicionales que chequean si se seleccionan los checkboxes*/
                    if(chkDarkMode.isSelected()){
                        System.out.println("Se selecciono el check");
                    }
                    if(chkNotifications.isSelected()){
                        System.out.println("Se selecciono el check");
                    }
                    if(chkAutoSave.isSelected()){
                        System.out.println("Se selecciono el check");
                    }
                    
                    dispose();
                }
                });
            }
        };