package paquete1;

class Clase1 {

    private String atributoPrivado = "Valor atributo priv";

    private Clase1() {
        System.out.println("Constructor priv");
    }
    public Clase1 (String args){
        this();
        System.out.println("Constructor publico");
    }
    private void metodoPrivado() {
        System.out.println("Metodo priv");
    }
}
