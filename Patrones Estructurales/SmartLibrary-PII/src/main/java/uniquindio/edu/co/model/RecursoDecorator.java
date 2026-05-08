package uniquindio.edu.co.model;

/**
 * Clase base para los decoradores de recursos.
 * Esta clase implementa el patrón Decorator. Permite agregar nuevas
 * responsabilidades a un recurso sin modificar su clase original.
 */
public abstract class RecursoDecorator implements RecursoBiblioteca {

    protected RecursoBiblioteca recurso;

    /**
     * Crea un decorador para un recurso.
     * @param recurso recurso que será decorado.
     */
    public RecursoDecorator(RecursoBiblioteca recurso) {
        this.recurso = recurso;
    }

    /**
     * Obtiene el código del recurso decorado.
     * @return código del recurso.
     */
    @Override
    public String getCodigo() {
        return recurso.getCodigo();
    }

    /**
     * Obtiene el título del recurso decorado.
     * @return título del recurso.
     */
    @Override
    public String getTitulo() {
        return recurso.getTitulo();
    }

    /**
     * Calcula el tamaño del recurso decorado.
     * @return tamaño del recurso.
     */
    @Override
    public double calcularTamano() {
        return recurso.calcularTamano();
    }

    /**
     * Muestra la información del recurso decorado.
     */
    @Override
    public void mostrarInformacion() {
        recurso.mostrarInformacion();
    }

    /**
     * Visualiza el recurso decorado.
     *
     * @param usuario usuario que accede al recurso.
     */
    @Override
    public void visualizar(Usuario usuario) {
        recurso.visualizar(usuario);
    }


}
