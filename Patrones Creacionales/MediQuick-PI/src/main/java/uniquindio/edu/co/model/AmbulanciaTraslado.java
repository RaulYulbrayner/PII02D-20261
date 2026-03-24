package uniquindio.edu.co.model;

/**
 * Clase que representa una ambulancia de traslado.
 * Se utiliza para transportar pacientes entre
 * centros médicos o hacia hospitales.
 */
public class AmbulanciaTraslado extends Ambulancia {

    /**
     * Constructor de la ambulancia de traslado.
     * @param codigo código identificador
     * @param placa placa del vehículo
     * @param velocidadPromedioKmH velocidad promedio
     * @param nivelEnergia nivel de energía disponible
     * @param estado estado actual de la ambulancia
     */
    public AmbulanciaTraslado(String codigo, String placa, double velocidadPromedioKmH, double nivelEnergia, EstadoAmbulancia estado) {
        super(codigo, placa, TipoAmbulancia.TRASLADO, 3, velocidadPromedioKmH, nivelEnergia, estado);
    }

}