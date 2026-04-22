package uniquindio.edu.co.model;

public class Malabares implements ActoCirco {

    private String nombre;

    public Malabares(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void presentarActo(String estructura) {
        System.out.println(estructura + " |-- " + nombre + " malabares en hilo .... :)   :(");
    }
}
