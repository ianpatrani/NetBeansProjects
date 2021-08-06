package test;

import domain.*;
import static domain.TipoEscritura.CLASICO;

public class TestConversionObjetos {

    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        System.out.println("empleado = " + empleado);
        
        
        
    }
}
