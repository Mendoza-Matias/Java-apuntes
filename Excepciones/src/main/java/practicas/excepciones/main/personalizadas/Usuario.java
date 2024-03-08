
package practicas.excepciones.main.personalizadas;


public class Usuario {
    private String emailRegistrado;

    
    public Usuario(){
    }
    
    public Usuario(String emailRegistrado) {
        this.emailRegistrado = "matias@gmail.com";
    }
    
    /*Si el metodo lanza una excepcion verificada debemos declarar
    esa excepcion en la firma del metodo
    Osea decir que error se debe lanzar en el caso de que ocurra el error.*/
    public void validarEmail(String email) throws EmailNotUniqueException{
    
        if(emailRegistrado.equals(email)){
        
            throw new EmailNotUniqueException(email);
        }
    }
}
