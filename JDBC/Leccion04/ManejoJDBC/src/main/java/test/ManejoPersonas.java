package test;

import datos.*;
import domain.Persona;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejoPersonas {

    public static void main(String[] args) {

        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            PersonaJDBC personaJdbc = new PersonaJDBC(conexion);

            Persona cambioPersona = new Persona();
            cambioPersona.setIdPersona(2);
            cambioPersona.setNombre("Karla Ivonne");
            cambioPersona.setApellido("Gomez");
            cambioPersona.setEmail("kgomez@mail.com");
            cambioPersona.setTelefono("1122334455");
            personaJdbc.actualizar(cambioPersona);

            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("Diego");
            nuevaPersona.setApellido("Maradona");
            nuevaPersona.setEmail("diego@mail.com");
            nuevaPersona.setTelefono("1122334455");
            personaJdbc.insertar(nuevaPersona);

            conexion.commit();
            System.out.println("SE HA HECHO COMMIT DE LA TRANSACCION");
        } catch (SQLException ex) {
            try {
                ex.printStackTrace(System.out);
                System.out.println("ENTRAMOS AL ROLLBACK");
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }

    }
}
