package uniquindio.edu.co.model;
//Clase singleton
public final class Notificacion implements INotificable {

    private static Notificacion instance;

    /**
     * Metodo constructor de la clase Notificacion
     */
    private Notificacion() {}

    /**
     * Metodo que permite obtener la unica instancia de la clase notificacion
     * @return instancia
     */
    public static Notificacion getInstance() {
        if (instance == null) {
            instance = new Notificacion();
        }
        return instance;
    }

    /**
     * Metodo que permite notificar mensajes
     * @param mensaje
     */
    @Override
    public void notificar(String mensaje) {
        System.out.println("MENSAJERIA UQ: " + mensaje);
    }
}
