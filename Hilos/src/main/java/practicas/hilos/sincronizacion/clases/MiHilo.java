
package practicas.hilos.sincronizacion.clases;


public class MiHilo implements Runnable{

    public Thread hilo;
    
    public static SumaArray sumaArray;
    private int [] matriz;
    private int resultado;
    
    static{
        sumaArray = new SumaArray();
    }
    
    //Constructor

    public MiHilo(String hilo, int [] matriz) { //Guardamos en hilo el nombre del hilo
        this.hilo = new Thread("Hilito"); 
        this.matriz = matriz;
    }
    
    //Metodo que crear he inicializa un hilo
    
    public static MiHilo crearEInicia(String nombre , int [] nums){
        /*Recursividad*/
        MiHilo miHilo = new MiHilo(nombre, nums);
        
        
        miHilo.hilo.start();
        return miHilo;
    }
    
    
    @Override
    public void run() {
        System.out.println(hilo.getName() + "Esta iniciando");
        resultado = sumaArray.sumaArray(matriz);
        System.out.println("Suma para : " + hilo.getName() + "es" + resultado);
        System.out.println(hilo.getName() + "terminado");
    }
    
}
