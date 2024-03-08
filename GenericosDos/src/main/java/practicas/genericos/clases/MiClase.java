/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas.genericos.clases;

/**
 *
 * @author leona
 */

/*MiClase es de tipo generico*/
public class MiClase<T> {
    private T valor;

    /*Constructor generico*/
    public MiClase(T valor) {
        this.valor = valor;
    }
    
    /*Getter y setter genericos*/
    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
    
    
}
