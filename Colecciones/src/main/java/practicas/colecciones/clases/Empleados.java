
package practicas.colecciones.clases;

import java.util.Objects;


public class Empleados implements Comparable<Empleados>{

    //Atributos
    private String nombre;
    private int edad;
    
    public Empleados(){
    
    }
    
    public Empleados(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Implementamos el metodo compareTo para comparar objetos
    @Override
    public int compareTo(Empleados empleado) {
        /*Si la edad es la misma comparamos los nombres
        Con el this.edad comparamos la edad de la de un objeto con la edad de otro
        objeto que es pasado por parametro
        Osea el valor que tiene nuestro objeto inicial almacenado en 
        la variable con el del otro objeto*/
        if(this.edad == empleado.edad){ //Recibe un empleado
            /*This apunta a la variable de la clase*/
            return this.nombre.compareTo(empleado.nombre);
            /*Si las edades son iguales se compara el nombre para ver si 
            son iguales*/
        }else{
            /*Compare to se utiliza para ordenar los elementos 
            en un treeSet , si devuelve un numero negativo es menor
            Si devuelve un positivo es mayor*/
            return Integer.compare(this.edad, empleado.edad);
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleados other = (Empleados) obj;
        if (this.edad != other.edad) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        return "Empleados{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
    
}
