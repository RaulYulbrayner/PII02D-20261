package uniquindio.edu.co.model;

/**
 * Clase encargada de crear ambulancias según el tipo solicitado.
 * Implementa el patrón de diseño Factory Method.
 */
public class AmbulanciaFactory {

    /**
     * Crea una ambulancia según el tipo especificado.
     * @param tipo tipo de ambulancia
     * @param codigo código de la ambulancia
     * @param placa placa del vehículo
     * @param velocidad velocidad promedio
     * @param energia nivel de energía disponible
     * @param estado estado actual
     * @return objeto Ambulancia creado
     */
    public static Ambulancia obtenerAmbulancia(TipoAmbulancia tipo, String codigo, String placa, double velocidad, double energia, EstadoAmbulancia estado){
        Ambulancia ambulancia = null;

        switch (tipo){
            case BASICA:
                ambulancia = new AmbulanciaBasica(
                        codigo,
                        placa,
                        velocidad,
                        energia,
                        estado);
                break;

            case MEDICALIZADA:
                ambulancia = new AmbulanciaMedicalizada(
                        codigo,
                        placa,
                        velocidad,
                        energia,
                        estado);
                break;

            case TRASLADO:
                ambulancia = new AmbulanciaTraslado(
                        codigo,
                        placa,
                        velocidad,
                        energia,
                        estado);
                break;
        }
        return ambulancia;
    }

}
