package uniquindio.edu.co.model;

public class Nota {

    /**
     * Dependencia de INotificable
     */
    private final INotificable notificador;

    /**
     * Metodo constructor de la clase Nota
     * @param notificador
     */
    public Nota(INotificable notificador) {
        this.notificador = notificador;
    }

    /**
     * Metodo que permite enviar notificaciones de notas
     * @param nombreEstudiante del estudiante
     * @param nota del estudiante
     */
    public void notificarNota(String nombreEstudiante, double nota){
        notificador.notificar("El estudiante "+ nombreEstudiante + " saco " + nota);
    }

}
