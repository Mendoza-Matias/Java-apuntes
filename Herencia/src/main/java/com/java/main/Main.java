
package com.java.main;

import com.java.vehiculos.Vehiculo;
import com.java.vehiculos.automovil.Automovil;
import com.java.vehiculos.automovil.AutomovilTodoTerreno;
import com.java.vehiculos.automovil.coche.moto.Moto;


public class Main {
    public static void main(String[] args) {
        //Creando unos objetos de mis clases
        
        
        Vehiculo primerVehiculo = new Vehiculo();
        
        primerVehiculo.setMarca("Peugeot");
        primerVehiculo.setMatricula("GKX824");
        
        System.out.println("Vehiculo : Marca : " + primerVehiculo.getMarca() + " Matricula: " + primerVehiculo.getMatricula());
        
        //--------Clases hijas ----------
        
        Automovil automovil = new Automovil();
        automovil.setMarca("Ford");
        automovil.setMatricula("GGH921");
        automovil.setModelo("Eco sport");
        automovil.toString();
        
        //-------Clase hija ----------------
        
        AutomovilTodoTerreno todoTerreno = new AutomovilTodoTerreno();
        todoTerreno.usar4x4(); //Tiene los mismos atributos y metodos de la clase padre.
        
        
        //----------------
        Vehiculo vehiculoDos = new Vehiculo();
        Automovil automovilDos = new Automovil();
        
//        vehiculoDos.mostrarVelocidadMaxima();
//        automovilDos.mostrarVelocidadMaxima();

          vehiculoDos.holaDesdeLaClasePadre();
          automovilDos.holaDesdeLaClaseHija();
          
          
          //-----------Creando vehiculos con metodos sobreescrito
          
          Automovil autoMovilTres = new Automovil("A6","Audi","HGH808");
          autoMovilTres.mostrarDetalles();
          
          //--------SOBRE ESCRITURA DE METODOS
          
//          Vehiculo vehiculo1 = new Vehiculo();
//          Automovil automovil1 = new Automovil();
//          Moto moto1 = new Moto();
          
       
          
          //JAVA ES CAPAZ DE DIFERENCIAR LA VARIABLE Y A QUE CLASE PERTENECE
          
          
//          vehiculo1.saludos();
//          automovil1.saludos();
//          moto1.saludos();
       
    }
}
