package practicas.excepciones.main.personalizadas;

public class ExcepcionesPersonalizadas {

    public static void main(String[] args) {

        Usuario usuario = new Usuario();

        try {
            usuario.validarEmail("matias@gmail.com");
        } catch (EmailNotUniqueException e) {
            System.out.println(e.getMessage());
        }
    }

}
