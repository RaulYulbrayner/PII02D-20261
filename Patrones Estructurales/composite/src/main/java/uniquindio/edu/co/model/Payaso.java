package uniquindio.edu.co.model;

public class Payaso implements ActoCirco {

    private String nombre;

    public Payaso(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void presentarActo(String estructura) {
        System.out.println(estructura + " |-- " + nombre + " contando chistes .... :)   :(");
    }

}
