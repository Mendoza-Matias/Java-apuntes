
package Clases;


public class Profesor extends Persona {

   
    
    //Atributos
    private String titulo;
    //Constructores

    public Profesor() {
    }
    
    public Profesor(String dni) {
        super(dni);
    }
    
     public Profesor(String titulo,String dni) {
        super(dni);
        this.titulo = titulo;
    }
    
    //Metodos

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
     
     @Override
    public void saludar() {
         System.out.println("Profesor : saludos");
    }
}
