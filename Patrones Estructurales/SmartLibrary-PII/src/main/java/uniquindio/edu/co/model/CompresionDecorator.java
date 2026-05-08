package uniquindio.edu.co.model;

/**
 * Decorador concreto que comprime un recurso antes de entregarlo.
 */
public class CompresionDecorator extends RecursoDecorator{

    /**
     * Crea un decorador de compresión.
     * @param recurso recurso que será comprimido.
     */
    public CompresionDecorator(RecursoBiblioteca recurso) {
        super(recurso);
    }

    /**
     * Calcula el tamaño del recurso después de aplicar compresión.
     * @return tamaño comprimido del recurso.
     */
    @Override
    public double calcularTamano() {
        return recurso.calcularTamano() * 0.70;
    }

    /**
     * Visualiza el recurso y luego aplica compresión.
     * @param usuario usuario que accede al recurso.
     */
    @Override
    public void visualizar(Usuario usuario) {
        recurso.visualizar(usuario);
        comprimir();
    }

    /**
     * Simula el proceso de compresión del recurso.
     */
    private void comprimir() {
        System.out.println("El recurso fue comprimido para optimizar la descarga.");
    }

}
