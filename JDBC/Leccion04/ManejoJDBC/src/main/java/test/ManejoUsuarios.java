package test;

import datos.UsuarioJDBC;
import domain.Usuario;
import java.util.List;

public class ManejoUsuarios {
    public static void main(String[] args) {
        UsuarioJDBC usuarioJdbc = new UsuarioJDBC();
        
        //Ejecutando el listado de usuarios
        List<Usuario> usuarios = usuarioJdbc.seleccionar();
        for(Usuario usuario: usuarios){
            System.out.println("Usuario:" + usuario);
        }
        
        //Insertamos un nuevo usuario
//        Usuario usuario = new Usuario("carlos.juarez", "123");
//        usuarioJdbc.insertar(usuario);

        //Modificamos un usuario existente
        Usuario usuario = new Usuario(3, "carlos.juarez","456");
        usuarioJdbc.actualizar(usuario);

//        usuarioJdbc.eliminar(new Usuario(3));
    }
}
