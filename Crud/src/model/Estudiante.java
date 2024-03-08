
package model;


public class Estudiante {
    //Atributos
    private int id;
    private String nombre;
    private String apellido;
    private int notaUno;
    private int notaDos;
    private int notaTres;
    private int promedio;
    
    
    
    public Estudiante() {
    }
    
    public Estudiante(String nombre, String apellido, int notaUno, int notaDos, int notaTres){
        this.nombre = nombre;
        this.apellido = apellido;
        this.notaUno = notaUno;
        this.notaDos = notaDos;
        this.notaTres = notaTres;
        this.promedio = calcularPromedio(notaUno, notaDos, notaTres);
    }
    
    
    
    public Estudiante(int id,String nombre, String apellido, int notaUno, int notaDos, int notaTres,int promedio) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.notaUno = notaUno;
        this.notaDos = notaDos;
        this.notaTres = notaTres;
        this.promedio = promedio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNotaUno() {
        return notaUno;
    }

    public int getNotaDos() {
        return notaDos;
    }

    public int getNotaTres() {
        return notaTres;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNotaUno(int notaUno) {
        this.notaUno = notaUno;
    }

    public void setNotaDos(int notaDos) {
        this.notaDos = notaDos;
    }

    public void setNotaTres(int notaTres) {
        this.notaTres = notaTres;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    public int calcularPromedio(int notaUno , int notaDos , int notaTres){
        int sumarNotas = notaUno + notaDos + notaTres;
        int promedio = sumarNotas / 3;
        return promedio;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", notaUno=" + notaUno + ", notaDos=" + notaDos + ", notaTres=" + notaTres + ", promedio=" + promedio + '}';
    }
    

        
    
    
}
