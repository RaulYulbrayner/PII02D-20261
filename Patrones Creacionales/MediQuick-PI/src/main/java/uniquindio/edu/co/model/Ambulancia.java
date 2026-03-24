package uniquindio.edu.co.model;

/**
 * Clase abstracta que representa una ambulancia.
 * Contiene los atributos comunes para todos los tipos
 * de ambulancias del sistema MediQuick.
 */
public abstract class Ambulancia {

    protected String codigo;
    protected String placa;
    protected TipoAmbulancia tipo;
    protected int capacidadPacientes;
    protected double velocidadPromedioKmH;
    protected double nivelEnergia;
    protected EstadoAmbulancia estado;

    /**
     * Constructor de la clase Ambulancia.
     * @param codigo de la ambulancia
     * @param placa de la ambulancia
     * @param tipo de la ambulancia
     * @param capacidadPacientes de la ambulancia
     * @param velocidadPromedioKmH de la ambulancia
     * @param nivelEnergia de la ambulancia
     * @param estado de la ambulancia
     */
    public Ambulancia(String codigo, String placa, TipoAmbulancia tipo, int capacidadPacientes, double velocidadPromedioKmH, double nivelEnergia, EstadoAmbulancia estado) {
        this.codigo = codigo;
        this.placa = placa;
        this.tipo = tipo;
        this.capacidadPacientes = capacidadPacientes;
        this.velocidadPromedioKmH = velocidadPromedioKmH;
        this.nivelEnergia = nivelEnergia;
        this.estado = estado;
    }

    /**
     * Verifica si la ambulancia puede atender el servicio.
     */
    public boolean puedeAtenderServicio(double pesoTotal){
        boolean resultado = false;
        if(estado == EstadoAmbulancia.DISPONIBLE
                && nivelEnergia > 0
                && pesoTotal <= capacidadPacientes){
            resultado = true;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Ambulancia{" +
                "codigo='" + codigo + '\'' +
                ", placa='" + placa + '\'' +
                ", tipo=" + tipo +
                ", capacidadPacientes=" + capacidadPacientes +
                ", velocidadPromedioKmH=" + velocidadPromedioKmH +
                ", nivelEnergia=" + nivelEnergia +
                ", estado=" + estado +
                '}';
    }
}
