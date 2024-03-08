
package interfaces;

import model.Estudiante;
import java.util.List;


public interface Dao <E,K> {
    
    /*Metodos para manipular la información de la base 
    de datos*/
     void insertarEstudiante(E entity);
     void editarEstudiante(E entity);
     void eliminarEstudiante(K key);
     List <E> mostrarTodosEstudiantes();
    
}
