package uniquindio.edu.co.model;

public class Caja {

    private String fecha;
    private double valor;

    public Caja(String fecha, double valor) {
        this.fecha = fecha;
        this.valor = valor;
    }

    public String generarCuenta(String cliente, double costo){
        String resultado = "Caja: preparando la cuenta para el cliente: " + cliente + " por valor de: $" + costo;
        return resultado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Caja{" +
                "fecha='" + fecha + '\'' +
                ", valor=" + valor +
                '}';
    }
}
