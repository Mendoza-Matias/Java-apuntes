
package com.java.entradadedatos;

import javax.swing.JOptionPane;

public class Panel {
    public static void main(String[] args) {
        
        /*
        Con esta opcion generamos paneles en la vista del usuario para que este ingrese los datos 
        solicitador.
        No olvidar que todos los datos en este caso son de tipo texto
        Intreso de un String 
        */
        
        String variable;
        
        variable = JOptionPane.showInputDialog(null, "Introduce un nombre ", "Lector", 1);
        
        JOptionPane.showMessageDialog(null, variable, "Tu nombre",1); 
        /*Sirve para mostrar ventanas de mensaje sin opcion de ingreso de datos*/
        
        System.out.println(variable);
        
        /*Ingreso de un numero*/
        
        int edad;
        
        edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un edad ", "Lector nombre ", 1));
        JOptionPane.showMessageDialog(null, edad, "Tu edad",1); 
         
        System.out.println(edad);
    
        
        /*--------------------------------------------------------------
        Seleccion si , no o cancelar
        */
    
        JOptionPane.showConfirmDialog(null, "Elige una opcion", "Opcion", 1);
        
        /*----------------------------------------------
        Multiples opciones
        */
                                                                                                                                  //Por defecto
        JOptionPane.showOptionDialog(null, "Elige una opcion ", "Opciones ", 0, 1, null, new Object[]{"Opcion uno","Opcion dos"}, "Opcion Uno");
    }
}
