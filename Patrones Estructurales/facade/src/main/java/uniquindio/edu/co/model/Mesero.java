package uniquindio.edu.co.model;

public class Mesero {

    private Cocina cocina;
    private ServicioBebidas servicioBebidas;
    private Caja caja;

    public Mesero(){
        this.cocina = new Cocina();
        this.servicioBebidas = new ServicioBebidas();
        //this.caja = new Caja();
    }

    public String tomarPedido(String cliente, String plato, String bebida, double costo){
        String resultado;
        resultado = "Meseo: recibe el pedido del cliente: " + cliente + "\n";
        resultado += cocina.prepararComida(plato) + "\n";
        resultado += servicioBebidas.prepararBebida(bebida) + "\n";
        resultado += caja.generarCuenta(cliente,costo);
        return resultado;
    }

}
