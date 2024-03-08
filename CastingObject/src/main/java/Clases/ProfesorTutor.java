
package Clases;

public class ProfesorTutor extends Profesor{
    //Atributos
    private int codTutor;
    //Constructores
    public ProfesorTutor() {
    }
    
     public ProfesorTutor(String dni,String titulo,int codTutor) {
         super(dni,titulo);
         this.codTutor = codTutor;
    }
    
    
    public ProfesorTutor(int codTutor) {
        this.codTutor = codTutor;
    }
    
    
    //Metodos

    public int getCodTutor() {
        return codTutor;
    }

    public void setCodTutor(int codTutor) {
        this.codTutor = codTutor;
    }

    

    
}
