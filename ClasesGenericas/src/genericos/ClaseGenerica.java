package genericos;

public class ClaseGenerica<T> {

    private T objeto;

    public ClaseGenerica(T objeto) {
        this.objeto = objeto;

    }

    public void obtenerTipo() {
        System.out.println("EL TIPO T ES : " + objeto.getClass().getSimpleName());
    }

}
