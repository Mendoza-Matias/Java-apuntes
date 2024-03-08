
package Clases;


public abstract class Persona {
    
    //Atributos
    protected String dni;
    //Constructores
    public Persona(){
    
    }
    
    public Persona(String dni){
        this.dni = dni;
    }
    //Metodos

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    public abstract void saludar(); //No tiene cuerpo , solo definicion por ser abstracta
}
