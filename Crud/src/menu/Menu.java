package menu;

import dao.DaoEstudianteImpl;
import java.util.Scanner;
import model.Estudiante;
import interfaces.Dao;

public class Menu {
    
    private Scanner sc = new Scanner(System.in);
    Dao dao = new DaoEstudianteImpl();
    
    public void iniciarMenu() {
        
        int opcion;
        char continuar;
        
        do {
            System.out.println("/--------Bienvenido---------/");
            
            System.out.print("Elige una opcion");
            System.out.print("\n[1] Mostrar todos los estudiante");
            System.out.print("\n[2] Crear un estudiante");
            System.out.print("\n[3] Editar un estudiante");
            System.out.print("\n[4] Eliminar un estudiante\n");
            opcion = sc.nextInt();
            
           
            
            switch (opcion) {
                
                case 1:
                    dao.mostrarTodosEstudiantes().forEach((estudiante) -> {
                        System.out.println(estudiante.toString());
                    });
                    break;
                case 2:
                    crearEstudiante();
                    ;
                    break;
                case 3:
                    editar();
                    break;
                case 4:
                    eliminar();
                    break;
                default:
                    System.out.println("Ingresa una opcion valida");
                    break;
            }
            
            System.out.println("¿Quieres continuar?"
                    + "[Si] ---> s"
                    + "[No] ---> n"
            );
            
            continuar = sc.next().charAt(0);
            
        } while (continuar == 's');
        System.out.println("Hasta luego...");
    }
    
    public void crearEstudiante() {
        Estudiante estudiante = new Estudiante();
        
        System.out.println("Ingresa el nombre");
        estudiante.setNombre(sc.next());
        
        System.out.println("Ingresa el apellido");
        estudiante.setApellido(sc.next());
        
        System.out.println("Ingresa la primer nota");
        estudiante.setNotaUno(sc.nextInt());
        
        System.out.println("Ingresa la segunda nota");
        estudiante.setNotaDos(sc.nextInt());
        
        System.out.println("Ingresa la tercer nota");
        estudiante.setNotaTres(sc.nextInt());
        
        System.out.println("/----Gracias----/");
        
        dao.insertarEstudiante(estudiante);
    }
    
    public void eliminar() {
        int id;
        System.out.println("Ingresa el id de un estudiante");
        id = sc.nextInt();
        dao.eliminarEstudiante(id);
    }
    
    public void editar() {
        
        Estudiante estudiante = new Estudiante();
        System.out.println("Ingresa el id del estudiante que quieres modificar");
        estudiante.setId(sc.nextInt());
        System.out.println("Ingresa el nombre nuevo");
        estudiante.setNombre(sc.next());
        System.out.println("Ingresa el nuevo apellido");
        estudiante.setApellido(sc.next());
        System.out.println("Ingresa la nota Uno");
        estudiante.setNotaUno(sc.nextInt());
        System.out.println("Ingresa la nota Dos");
        estudiante.setNotaDos(sc.nextInt());
        System.out.println("Ingresa la nota Tres");
        estudiante.setNotaTres(sc.nextInt());
        
        dao.editarEstudiante(estudiante);
    }
}
