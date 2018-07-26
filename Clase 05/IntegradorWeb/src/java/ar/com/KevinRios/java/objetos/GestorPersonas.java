package ar.com.KevinRios.java.objetos;

import java.sql.*;
import java.util.*;

public class GestorPersonas {

    public ArrayList<Persona> buscarPersonas(String textoBuscar) {
        ArrayList<Persona> personas = new ArrayList<>();

        String sql = "SELECT id_personas, nombre, apellido, notas, email, localidad, sueldo "
                + "FROM personas WHERE nombre like ? or apellido like ? ";
        Connection connection = null;
        String url = "jdbc:mysql://127.0.0.1:3306/proyecto_integrador";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, "root", "");
            // genero la query
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, "%" + textoBuscar + "%");
            statement.setString(2, "%" + textoBuscar + "%");
            ResultSet resultado = statement.executeQuery();
            System.out.println("ingresando ...");
            Persona persona = null;
            while (resultado.next()) {
                persona = new Persona();
                persona.setIdPersona(resultado.getInt("id_Personas"));
                persona.setNombre(resultado.getString("nombre"));
                persona.setApellido(resultado.getString("apellido"));
                persona.setEmail(resultado.getString("email"));
                persona.setLocalidad(resultado.getString("localidad"));
                persona.setNotas(resultado.getString("notas"));
                persona.setSueldo(resultado.getDouble("sueldo"));
                personas.add(persona);
            }

            System.out.println("Busqueda OK");
        } catch (Exception e) {
            System.out.println("Error al buscar de la persona");
            e.printStackTrace();
        } finally {
            try {

            } catch (Exception e) {
            }
        }

        return personas;
    }

    //metodo alta persona que recibe una persona
    public void altaPersona(Persona persona) {

        // preparo la conexion 
        // la inicializo vacia
        Connection connection = null;
        String url = "jdbc:mysql://127.0.0.1:3306/proyecto_integrador";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, "root", "");
            // genero la query
            String sql = "INSERT INTO personas"
                    + "(nombre, apellido, email, localidad, notas, sueldo) "
                    + "values (?,?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, persona.getNombre());
            statement.setString(2, persona.getApellido());
            statement.setString(3, persona.getEmail());
            statement.setString(4, persona.getLocalidad());
            statement.setString(5, persona.getNotas());
            statement.setDouble(6, persona.getSueldo());
            statement.execute();
            System.out.println("Alta OK");
        } catch (Exception e) {
            System.out.println("Error en el alta de la persona");
        } finally {
            try {

            } catch (Exception e) {
            }
        }

    } // end method alta persona

    public void bajaPersona(Persona persona) {
        
        Connection connection = null;
        String url = "jdbc:mysql://127.0.0.1:3306/proyecto_integrador";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, "root", "");
            // genero la query
            String sql = "DELETE FROM personas "
                    + " WHERE id_personas like ? ";
            PreparedStatement statement = connection.prepareStatement(sql);           
            statement.execute();
            System.out.println("Baja OK");
        } catch (Exception e) {
            System.out.println("Error en la baja");
        } finally {
            try {

            } catch (Exception e) {
            }
        }

    }

}
