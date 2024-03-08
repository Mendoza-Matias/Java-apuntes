
package com.java.bucles;

public class BreakYContinue {
    public static void main(String[] args) {
        
        
        /*Continue : ejemplo de funcionamiento .
        Pasa directo a la siguiente iteracion
        Break : corta la iteracion y no sigue
        
        Estas se utilizan dentro de condicionales*/
        
        System.out.println("--------Break---------"); 
        
        for(int dia = 1; dia <=7 ; dia ++){
            System.out.println("dias" +"" + dia);
            
            if(dia == 5){
                System.out.println("Corta");
                break;
            }
        }
        
        System.out.println("--------Continue---------");
        
        for(int mes = 1 ; mes <=12 ; mes++){
            System.out.println("Mes" + mes);
            
            if(mes == 10){
                continue;
            }
            
            System.out.println("Salta" + mes);
        }
    }
}
