package dao;

import model.Estudiante;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import interfaces.Dao;

public class DaoEstudianteImpl extends Conexion implements Dao<Estudiante, Integer> {

    @Override
    public void insertarEstudiante(Estudiante estudiante) {

        String sql = "insert into estudiantes (nombre,apellido,notaUno,notaDos,notaTres,promedio) values(?,?,?,?,?,?)";
        try {
            this.conectar();
            PreparedStatement ps = this.conexion.prepareStatement(sql); //accedo a la variable
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setInt(3, estudiante.getNotaUno());
            ps.setInt(4, estudiante.getNotaDos());
            ps.setInt(5, estudiante.getNotaTres());
            ps.setInt(6, estudiante.calcularPromedio(estudiante.getNotaUno(), estudiante.getNotaDos(), estudiante.getNotaTres()));

            int consulta = ps.executeUpdate();

            if (consulta > 0) {
                System.out.println("Insertado correctamente");
            } else {
                System.out.println("Error de inserción");
            }

        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Override
    public void editarEstudiante(Estudiante estudiante) {
        String sql = "update estudiantes set nombre=? , apellido=? , notaUno=? , notaDos=? , notaTres=? , promedio=? where id=?";
        try {
            this.conectar();
            PreparedStatement ps = this.conexion.prepareStatement(sql);

            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setInt(3, estudiante.getNotaUno());
            ps.setInt(4, estudiante.getNotaDos());
            ps.setInt(5, estudiante.getNotaTres());
            ps.setInt(6, estudiante.calcularPromedio(estudiante.getNotaUno(), estudiante.getNotaDos(), estudiante.getNotaTres()));
            ps.setInt(7, estudiante.getId());
         

            int consulta = ps.executeUpdate();

            if (consulta > 0) {
                System.out.println("Editado correctamente");
            } else {
                System.out.println("Edición no completada");
            }

        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Override
    public void eliminarEstudiante(Integer id) {
        String sql = "delete from estudiantes where id=?";

        try {
            this.conectar();
            
            PreparedStatement ps = this.conexion.prepareStatement(sql);
            ps.setInt(1, id);
           
            int consulta = ps.executeUpdate(); //Devuelve 0 o 1

            if (consulta > 0) {
                System.out.println("Eliminado correctamente");
            } else {
                System.out.println("No se pudo eliminar");
            }

        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Override
    public List<Estudiante> mostrarTodosEstudiantes() {

        String sql = "select * from estudiantes";

        List<Estudiante> lista = null;

        try {
            //Realizo la conexion 
            this.conectar();
            //Preparo la sentencia sql
            PreparedStatement ps = this.conexion.prepareStatement(sql);
            //Declaro un objeto de tipo ArrayList

            ResultSet datos = ps.executeQuery();
            //Obtenemos los datos

            lista = new ArrayList();

            //Recorro todos los datos
            while (datos.next()) {
                //Creo un objeto de tipo estudiante
                
                
                //Guardo la lista
                lista.add(new Estudiante
                        (
                        datos.getInt("id"),
                        datos.getString("nombre"),
                        datos.getString("apellido"),
                        datos.getInt("notaUno"),
                        datos.getInt("notaDos"),
                        datos.getInt("notaTres"),
                        datos.getInt("promedio")));
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception ex) {
                Logger.getLogger(DaoEstudianteImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return lista; //Retorno la lista
    }

}
