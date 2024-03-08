package com.java.tiposdedatos;

import javax.sql.rowset.spi.SyncFactory;

public class TiposDeDatos {

    /*Todos estos datos son primitivos de Java
    Inicializar variables
     */
    public static void main(String[] args) {

        /*byte : Sirve para almacenar valores entre -127 y 127 (Poco espacio en memoria)
        Declaracion:
         */
        byte edad = 20;
        System.out.println(edad);

        /*short : Sirve para almacenar valores entre -37,767 y 37,767 (Poco espacio en memoria)
          Declaracion:
         */
        short puntos = 500;
        System.out.println(puntos);

        /*int : Sirve para almacenar valores enteros con minimos entre
           -2,147,483,648 y el maximo 2,147,483,647 positivos y negativos
           Declaracion:
         */
        int precio = 2500;
        System.out.println(precio);

        /*long : Sirve para almacenar valores enteros entre -9,223,372,036,854,775,808
        9,223,372,036,854,775,807 cuando el int no lo puede almacenar
        Declaracion : Es necesario poner la letra L
         */
        long personajes = 200000L;
        System.out.println(personajes);

        /*char : Sirve para almacenar un caracter de tipo string o un numero (solo uno)
        Declaracion: Entre comillas simples y un solo caracter.
        Se puede representar con este el codigo ASCII
         */
        char letraM = 'M';
        char numeroNueve = '9';

        System.out.println(letraM);
        System.out.println(numeroNueve);

        /*Boolean : Sirve para almacenar de tipo Booleano representado por los datos
        Verdadero y Falso
        Declaracion: Mayormente se utiliza para comprobaciones en donde se requieren 
        valores de verdadero y falso.
         */
        boolean verdadero = true;
        boolean falso = false;

        System.out.println(verdadero);
        System.out.println(falso);

        /*float : Sirve para almacenar decimales , acepta entre 6 o 7 digitos decimales
        pero sin ocupar mucho espacio
        Declaracion: No olvidar la f al final
         */
        float peso = 60.52f;

        /*double : Sirve para almacenar mayor cantidad de decimales , entre 15 digitos.
        Mas preciso para calculos matematicos ya que si se requiere mas valores decimales , este sera
        de utilidad
        Declaracion:
         */
        double precioDos = 500.9999999999999;

        //----------------------------------------------
        /*Clase String (Object).
        Uso : almacenar texto (cadenas).
        Primer letra en mayuscula ya que es una clase.
         */
        String nombre = "Matias";

       
       
    }
}
