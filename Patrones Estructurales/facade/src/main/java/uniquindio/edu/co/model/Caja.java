package uniquindio.edu.co.model;

public class Caja {

    public String generarCuenta(String cliente, double costo){
        String resultado = "Caja: preparando la cuenta para el cliente: " + cliente + " por valor de: $" + costo;
        return resultado;
    }

}
