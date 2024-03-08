
package practicas.excepciones.main.personalizadas;

/*Excepcion verificada.*/
public class EmailNotUniqueException extends Exception {

    /*Tambien podemos crear atributos para la clase.*/
    
    
    //CONSTRUCTOR.
    /*Podemos pasarle parametros y recibir los argumentos
    Por ejemplo el correo que presenta el error.*/
    public EmailNotUniqueException(String email) {
        /*Llado al constructor de la clase padre
        Exception y pasa un mensaje*/
        super("La direccion de correo electronico esta en uso" + email);
    }
    
    /*Podemos crear nuestro getMessage y sobre escribirlo.
    Pasandole el mensaje de error que queramos.*/
    
}
