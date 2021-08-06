package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

public class TestExcepciones {

    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = division(10, 0);
        } catch (OperacionExcepcion e) {
            System.out.println("OCURRIO UN ERROR DE TIPO DE OperacionExcepcion"
                    + "\n" + (e.getMessage()));
        } catch (Exception e) {
            System.out.println("OCURRIO UN ERROR"
                    + "");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("SE REVISÓ LA DIVISIÓN ENTRE CERO");
        }

        System.out.println("resultado = " + resultado);
    }
}
