
package practicas.clasesystem;


public class ClaseSystem {

    public static void main(String[] args) {
      
        //Nombre del usuario
        
        String nombreUsuario = System.getProperty("user.name");
        System.out.println(nombreUsuario);
        
        
        //Directorio principal del usuario
        
        String directorio = System.getProperty("user.home");
        System.out.println(directorio);
        
        
        //Java version
        
        String java = System.getProperty("java.version");
        System.out.println(java);
        
        //Ruta de instalacion de java
        
        String rutaInstalacionJava = System.getProperty("java.home");
        System.out.println(rutaInstalacionJava);
       
    }
}
