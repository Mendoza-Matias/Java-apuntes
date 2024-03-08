
package Clases;

public class ProfesorInterno extends Profesor{
    //Atributos
    private int codInterno;
    //Constructores

    public ProfesorInterno(int codInterno) {
        this.codInterno = codInterno;
    }
    
    
     public ProfesorInterno(int codInterno, String titulo, String dni) {
        super(titulo, dni);
        this.codInterno = codInterno;
    }
    //Metodos

    public int getCodInterno() {
        return codInterno;
    }

    public void setCodInterno(int codInterno) {
        this.codInterno = codInterno;
    }

    @Override
    public String getDni() {
        return dni;
    }

    @Override
    public void setDni(String dni) {
        this.dni = dni;
    }
     
   
}
