package uniquindio.edu.co.model;

/**
 * Clase que representa una ambulancia básica.
 * Este tipo de ambulancia se utiliza para atención
 * primaria y traslado simple de pacientes.
 */
public class AmbulanciaBasica extends Ambulancia {

    /**
     * Constructor de la ambulancia básica.
     * @param codigo código identificador
     * @param placa placa del vehículo
     * @param velocidadPromedioKmH velocidad promedio
     * @param nivelEnergia nivel de energía disponible
     * @param estado estado actual de la ambulancia
     */
    public AmbulanciaBasica(String codigo, String placa, double velocidadPromedioKmH, double nivelEnergia, EstadoAmbulancia estado) {
        super(codigo, placa, TipoAmbulancia.BASICA, 1, velocidadPromedioKmH, nivelEnergia, estado);
    }

}
