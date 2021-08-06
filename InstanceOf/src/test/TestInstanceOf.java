package test;

import domain.*;

public class TestInstanceOf {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
        // determinarTipo(empleado);
        empleado = new Gerente("Karla", 10000, "contabilidad");
        determinarTipo(empleado);
    }

    public static void determinarTipo(Empleado empleado) {
        if (empleado instanceof Gerente) {
            System.out.println("Tipo gerente");
           // ((Gerente) empleado).getDepartamento();
           Gerente gerente = (Gerente)empleado;
            System.out.println("gerente = " + gerente.getDepartamento());
        }
        if (empleado instanceof Empleado) {
            System.out.println("Tipo empleado");
        }
        if (empleado instanceof Object) {
            System.out.println("tipo objecto");
        }
    }

}
