package uniquindio.edu.co.model;

/**
 * Adaptador que permite usar un recurso externo dentro de SmartLibrary.
 * Esta clase implementa el patrón Adapter. Su función es traducir la
 * estructura del recurso externo a la estructura esperada por el sistema,
 * representada por la interfaz {@link RecursoBiblioteca}.
 */
public class RecursoExternoAdapter implements RecursoBiblioteca{

    private RecursoProveedorExterno recursoExterno;

    /**
     * Crea un adaptador para un recurso externo.
     * @param recursoExterno recurso externo que será adaptado.
     */
    public RecursoExternoAdapter(RecursoProveedorExterno recursoExterno) {
        this.recursoExterno = recursoExterno;
    }

    /**
     * Obtiene el código del recurso externo adaptado.
     * @return código del recurso.
     */
    @Override
    public String getCodigo() {
        return recursoExterno.obtenerIdExterno();
    }

    /**
     * Obtiene el título del recurso externo adaptado.
     * @return título del recurso.
     */
    @Override
    public String getTitulo() {
        return recursoExterno.obtenerNombreRecurso();
    }

    /**
     * Calcula el tamaño del recurso externo adaptado.
     * @return tamaño del recurso en MB.
     */
    @Override
    public double calcularTamano() {
        return recursoExterno.obtenerPesoEnMB();
    }

    /**
     * Muestra la información del recurso externo usando el formato interno.
     */
    @Override
    public void mostrarInformacion() {
        System.out.println("Recurso externo adaptado");
        System.out.println("Código externo: " + recursoExterno.obtenerIdExterno());
        System.out.println("Título: " + recursoExterno.obtenerNombreRecurso());
        System.out.println("Creador: " + recursoExterno.obtenerCreador());
        System.out.println("Tamaño: " + recursoExterno.obtenerPesoEnMB() + " MB");
    }

    /**
     * Visualiza el recurso externo adaptado.
     * @param usuario usuario que accede al recurso.
     */
    @Override
    public void visualizar(Usuario usuario) {
        recursoExterno.abrirRecursoExterno();
    }

}
