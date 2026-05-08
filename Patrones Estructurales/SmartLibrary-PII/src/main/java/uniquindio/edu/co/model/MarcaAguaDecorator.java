package uniquindio.edu.co.model;

/**
 * Decorador concreto que agrega una marca de agua institucional al recurso.
 */
public class MarcaAguaDecorator extends RecursoDecorator  {

    /**
     * Crea un decorador de marca de agua.
     * @param recurso recurso al que se agregará la marca de agua.
     */
    public MarcaAguaDecorator(RecursoBiblioteca recurso) {
        super(recurso);
    }

    /**
     * Visualiza el recurso y luego agrega la marca de agua institucional.
     * @param usuario usuario que accede al recurso.
     */
    @Override
    public void visualizar(Usuario usuario) {
        recurso.visualizar(usuario);
        agregarMarcaAgua();
    }

    /**
     * Simula la aplicación de una marca de agua institucional.
     */
    private void agregarMarcaAgua() {
        System.out.println("Se agregó marca de agua institucional.");
    }

}
