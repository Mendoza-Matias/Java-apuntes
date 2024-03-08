
package Main;

public class Main {
    public static void main(String[] args) {
        
        //--Autoboxing
        Character chWrapped = 'a';
        /*
        en uno de tipo Character 
        Boxing
        Tiene metodo asociados
        Convertimos un primitivo a un objeto de manera automatica*/
        System.out.println(chWrapped.getClass());
        
        
        /*Autoboxing
        Convierte un objeto en un dato primitivo
        */
        
        char ch = chWrapped;
        System.out.println(ch);
        
        
        //---Boxing
        /*Convertimos un valor primitivo a un objeto por medio del value
        of
        Si quisiera obtener el valor deberia hacer un UnBoxing*/
        int numeroPrimitivo = 10;
        Integer numeroInteger = Integer.valueOf(numeroPrimitivo);
        System.out.println(numeroInteger.getClass());
        
        int numeroPrimitivoDos = numeroInteger.intValue(); //Con inValue obetenemos el valor
    }
}
