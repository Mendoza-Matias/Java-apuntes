package com.java.ejercicios;

import javax.swing.JOptionPane;

public class Ej3 {

    public static void main(String[] args) {

        /*Realiza un programa que pida un numero por teclado y nos indique si es par o impar*/
        
        int numeroIngresado;

        numeroIngresado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero", "Ingresa un numero", 1));

        if (numeroIngresado % 2 == 0) {

            JOptionPane.showInternalMessageDialog(null, "El numero ingresado es par","Resultado",3);
            
        } else {
             JOptionPane.showInternalMessageDialog(null, "El numero ingresado es impar","Resultado",2);
        }
    }
}
