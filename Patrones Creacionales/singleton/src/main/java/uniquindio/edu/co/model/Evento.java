package uniquindio.edu.co.model;

public class Evento {

    /**
     * Dependencia de INotificable
     */
    private final INotificable notificador;

    /**
     * Metodo constructor de la clase Evento
     * @param notificador
     */
    public Evento(INotificable notificador) {
        this.notificador = notificador;
    }

    /**
     * Metodo que permite enviar eventos
     * @param titulo del evento
     * @param descripcion del evento
     * @param fecha del evento
     */
    public void notificarEvento(String titulo, String descripcion, String fecha){
        notificador.notificar("El evento "+ titulo + " se realizara el dia " + fecha + " y " + descripcion);
    }
}
