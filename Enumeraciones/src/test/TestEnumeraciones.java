package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {

    public static void main(String[] args) {
//        System.out.println("Dia 1 " + Dias.LUNES);
//        indicarDiaSemana(Dias.MARTES);
        System.out.println("Continentes numero 4: " + Continentes.AMERICA);
        System.out.println("Paises en el numero 4 continentes: " + Continentes.AMERICA.getPaises());
    }

    private static void indicarDiaSemana(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("Primer dia semana");
                break;
            case MARTES:
                System.out.println("Segundo dia semana");
                break;
        }
    }

}
