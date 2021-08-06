package Accesodatos;

public interface IAccesoDatos {

    int MAX_REGISTRO = 10;

    public abstract void insertar();

    public abstract void listar();

    public abstract void actualizar();

    public abstract void eliminar();

}
