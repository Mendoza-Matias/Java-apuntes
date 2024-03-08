package BusquedaMatrices;

public class BusquedaSecuencial {

    public static void main(String[] args) {

        int[] numeros = {20, 30, 40, 50, 1, 12, 32, 53, 21};

        System.out.println("Matriz");
        System.out.println(" ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println("");
        System.out.println("Resultado");
        
        System.out.println(busquedaSecuencial(numeros, 20));
    }

    public static int busquedaSecuencial(int[] matriz , int buscar) {
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i] == buscar) {
                return i;
            }
        }
       return -1;
    }
}
