package uniquindio.edu.co;

import uniquindio.edu.co.model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        INotificable notificacionGlobal = Notificacion.getInstance();
        Evento evento = new Evento(notificacionGlobal);
        Examen examen = new Examen(notificacionGlobal);
        Nota nota = new Nota(notificacionGlobal);

        evento.notificarEvento("Grado", "fiesta", "20/02/2026");
        examen.notificarExamen("PG2", "20/02/2026");
        nota.notificarNota("Raul Yulbraynner", 2.9);


    }
}