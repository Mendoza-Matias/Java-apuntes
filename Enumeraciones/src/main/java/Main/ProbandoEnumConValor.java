package Main;

import Clases.EnumConValores;


public class ProbandoEnumConValor {
    public static void main(String[] args) {
        
        //Cambia la forma de crear un objeto.
        EnumConValores enum1 = EnumConValores.valueOf("COCHE"); //Le decimos que busque el coche
        
        System.out.println("Nombre " + enum1.name());
        System.out.println("Indice " + enum1.ordinal());
        System.out.println("Velocidad " + enum1.getVelocidad());
    }
}
