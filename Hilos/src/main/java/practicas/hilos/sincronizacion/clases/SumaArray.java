package practicas.hilos.sincronizacion.clases;

public class SumaArray {

    private int suma;

    //Suma array esta sincronizado.
    synchronized int sumaArray(int[] arr) {
        int suma = 0;

        
        /*Tiene un for que recorre la matriz y realiza la suma de sus valores */
        for (int i = 0; i < arr.length; i++) {
            suma += arr[i]; //Realizamos la suma (realiza primero la suma y luego la asigna)
            System.out.println("Total acumulado " + Thread.currentThread().getName() + "es " + suma);

            try {
                /*Lo paramos para intercalar los valores*/
                Thread.sleep(10); //Permitir el cambio de tarea
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        return suma;
    }
}
