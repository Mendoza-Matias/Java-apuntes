
package practicas.colecciones.set;

import java.util.Iterator;
import java.util.TreeSet;
import practicas.colecciones.clases.Empleados;

public class SegundaColeccionSet2 {
    public static void main(String[] args) {
        //Declaramos un TreeSet
        
        TreeSet<Empleados> empleado = new TreeSet<>();
        /*Comparator sirve para ordenamiento del TreeSet*/
        
        Empleados empleadoUno = new Empleados ("Matias",16);
        Empleados empleadoDos = new Empleados ("Juan",52);
        Empleados empleadoTres = new Empleados ("Roberto",20);
    
        empleado.add(empleadoUno);
        empleado.add(empleadoDos);
        empleado.add(empleadoTres);
        
        //Mostrar esto por pantalla / Con forEach o iterator
        
        //Obtenemos un iterador para el TreeSet
        Iterator<Empleados> iterador = empleado.iterator();
        
        
        System.out.println("Devolviendo los datos con un iterador");
        /*Mientras pueda pasar al siguiente da true y sino puede
        da false y sale*/
        while (iterador.hasNext()) {
            Empleados empleadoIterado = iterador.next(); //Pasa al siguiente empleado
            /*Nos devuelve el de cada posicion*/
            System.out.println(empleadoIterado.getNombre() + " " + empleadoIterado.getEdad());
        }
        
        //Mostramos el primer y ultimo empleado
        
        Empleados primerEmpleado = empleado.first();
        
        Empleados ultimoEmpleado = empleado.last();
        
        System.out.println("Primer empleado: " + primerEmpleado);
        System.out.println("Ultimo empleado: " + ultimoEmpleado);
        
        //Mostramos los empleados menores de 22
        
       TreeSet<Empleados> empleadosMenoresDe22 = (TreeSet<Empleados>) empleado.headSet(empleadoDos);
        
        for (Empleados empleados : empleadosMenoresDe22) {
            System.out.println("Empleados menores de 22: " + empleados.toString());
        }
         System.out.println("------------------");
         TreeSet<Empleados> empleadosMayoresDe18 = (TreeSet<Empleados>) empleado.tailSet(empleadoDos);
        
        for (Empleados empleados : empleadosMayoresDe18) {
            System.out.println("Empleados mayores de 18: " + empleados.toString());
        }
    }
}
