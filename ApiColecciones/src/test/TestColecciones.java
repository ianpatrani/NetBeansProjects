package test;

import java.util.*;

public class TestColecciones {

    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");

        //  imprimir(miLista);
        
        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");

      //  imprimir(miSet);
        
      Map miMapa= new HashMap();
        miMapa.put("VALOR1", "JUAN");
        miMapa.put("VALOR2", "KARLA");
        miMapa.put("VALOR3", "ROSARIO");
        
        String elemento = (String) miMapa.get("VALOR1");
        System.out.println("elemento = " + elemento);
                
       imprimir( miMapa.keySet());
              imprimir( miMapa.values());

    }

    public static void imprimir(Collection coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }

}
