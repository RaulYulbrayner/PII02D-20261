package uniquindio.edu.co.model;

public class Examen {

    /**
     * Depedencia de notificacion examen
     */
    private final INotificable theINotificable;

    /**
     * Metodo constructor de la clase Examen
     * @param theINotificable
     */
    public Examen(INotificable theINotificable){
        this.theINotificable = theINotificable;
    }

    /**
     * Metodo que permite notificar un examen
     * @param materia del examen
     * @param fecha del examen
     */
    public void notificarExamen(String materia, String fecha){
        theINotificable.notificar("El examen del curso de "+ materia + " se realizara el dia " + fecha);
    }

}
