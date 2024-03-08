
package practicas.genericos.clasestres;


public class Main {
    
    public static void main(String[] args) {
        
        //Creo una matriz de integer
        Integer[] numeros = {1,5,3};
        
        //Le digo que tiene de valor la matriz
        MiClase miClase = new MiClase(numeros);
        
        //Recotro la matriz y retorno true si devuelve verdadero , realiza una comprobacion
        if(miClase.contenido(2)){
            System.out.println("Dos si que esta dentro del array");
        }else if(miClase.contenido(5)){
            System.out.println("Cinco si que esta dentro del array");
        }else{
            System.out.println("No esta dentro del array");
        }
        
        
    }
    
    
}
