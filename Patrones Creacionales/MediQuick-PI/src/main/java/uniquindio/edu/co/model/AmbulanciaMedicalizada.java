package uniquindio.edu.co.model;

/**
 * Clase que representa una ambulancia medicalizada.
 * Este tipo de ambulancia cuenta con equipamiento
 * especializado para atención avanzada de emergencias.
 */
public class AmbulanciaMedicalizada extends Ambulancia {

    /**
     * Constructor de la ambulancia medicalizada.
     * @param codigo código identificador
     * @param placa placa del vehículo
     * @param velocidadPromedioKmH velocidad promedio
     * @param nivelEnergia nivel de energía disponible
     * @param estado estado actual de la ambulancia
     */
    public AmbulanciaMedicalizada(String codigo, String placa, double velocidadPromedioKmH, double nivelEnergia, EstadoAmbulancia estado) {
        super(codigo, placa, TipoAmbulancia.MEDICALIZADA, 2, velocidadPromedioKmH, nivelEnergia, estado);
    }

}
