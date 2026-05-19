/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;
import javax.swing.* ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Pablo
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        //1- Crear el frame principal
        JFrame ventanaPrincipal = new JFrame();
        ventanaPrincipal.setSize(500, 500);
        
        //2- Instanciar JMenuBar y setearlo
        JMenuBar barraMenu = new JMenuBar();
        ventanaPrincipal.setJMenuBar(barraMenu);
        
        //3- Creacion del JMenu llamado "Archivo"
        JMenu Archivo = new JMenu("Archivo");
        barraMenu.add(Archivo);
        
        //4- Añadir dos opciones instanciando JMenuItem en Archivo
        JMenuItem itemLimpiar = new JMenuItem("Limpiar Texto");
        JMenuItem itemSalir = new JMenuItem("Salir");
        Archivo.add(itemLimpiar);
        Archivo.add(itemSalir);
        
        /*5- Añadir en el centro de la ventana un JTextArea
         para editar multiples lineas de texto
        */
        JTextArea editorTexto = new JTextArea();
        //el scrollPane nos permite scrollear si es muy largo el texto
        JScrollPane scrollPane = new JScrollPane(editorTexto);
       
        ventanaPrincipal.add(scrollPane);
        /*6- Asociacion de un ActionListener asi interectuamos con los items*/
        itemLimpiar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                editorTexto.setText("");
            }
        });
        
        itemSalir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        ventanaPrincipal.setVisible(true);
        System.out.println("Frame creado perfectamente");
    }
}
