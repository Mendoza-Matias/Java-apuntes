
package utils;

public class Utilidades {
  
    
    public void calcular(int... variable){
    
        int suma = 0;
        
        System.out.println("Numero de argumentos" + variable.length);
        //Variable es una matriz 
        //Al pasar los argumentos de este metodo estamos definiendo el largo de la matriz
        
        for(int i = 0; i < variable.length ; i++){
            System.out.println("Numero a sumar " + variable[i]);
            suma += variable[i];
        }
        System.out.println("El resultado de la suma " + suma);
    }
    
    //El parametro que es variable va ultimo
    public void calcularDos (int a , int b , int...c){
        
        int sumaDos = 0;
        
        System.out.println("Numero a sumarDos " + a + " " + b + " " + c);
        
        for(int i=0 ; i < c.length ; i++){
            System.out.println("Numeros del array " + c[i]);
            sumaDos += c[i];
        }
        sumaDos += a;
        sumaDos +=b;
        
        System.out.println("Resultado de suma Dos " + sumaDos);
    }
}
