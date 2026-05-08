package uniquindio.edu.co.model;

/**
 * Decorador concreto que agrega protección adicional al recurso.
 */
public class ProteccionDecorator extends RecursoDecorator{

    /**
     * Crea un decorador de protección adicional.
     * @param recurso recurso que será protegido.
     */
    public ProteccionDecorator(RecursoBiblioteca recurso) {
        super(recurso);
    }

    /**
     * Visualiza el recurso y luego aplica protección adicional.
     * @param usuario usuario que accede al recurso.
     */
    @Override
    public void visualizar(Usuario usuario) {
        recurso.visualizar(usuario);
        proteger();
    }

    /**
     * Simula la aplicación de protección adicional al recurso.
     */
    private void proteger() {
        System.out.println("Se agregó protección adicional al recurso.");
    }

}
