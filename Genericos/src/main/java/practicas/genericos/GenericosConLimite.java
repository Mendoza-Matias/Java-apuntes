package practicas.genericos;

import practicas.genericos.clases.Alumno;
import practicas.genericos.clases.EquipoDeportivo;

public class GenericosConLimite {

    /*Uso de metodos con limitaciones*/
    
    /*Limitamos la implementacion de la interfaz a un tipo de dato*/
    public static <T extends Comparable<T>> int comparar(T objetoUno, T objetoDos) {
        return objetoUno.compareTo(objetoDos);
    }

    public static void main(String[] args) {
        Alumno alumnoUno = new Alumno();
        Alumno alumnoDos = new Alumno();

        EquipoDeportivo equipoUno = new EquipoDeportivo();
        EquipoDeportivo equipoDos = new EquipoDeportivo();
        
        int resultadoAlumno = comparar(equipoUno, equipoDos);
        System.out.println(resultadoAlumno);
        int resultadoEquipo = comparar(equipoUno, equipoDos);
        
        /*Si mezclamos los valores entonces me tirara error en proceso
        de compilacion*/
    }
}
