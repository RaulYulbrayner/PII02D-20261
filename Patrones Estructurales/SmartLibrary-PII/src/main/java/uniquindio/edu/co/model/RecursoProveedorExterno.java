package uniquindio.edu.co.model;

/**
 * Representa un recurso proveniente de un proveedor externo.
 * Esta clase simula un recurso que no pertenece originalmente al modelo
 * interno de SmartLibrary. Por esa razón, sus métodos tienen nombres y
 * estructura diferentes a los usados por la interfaz {@link RecursoBiblioteca}.
 */
public class RecursoProveedorExterno {

    private String idExterno;
    private String nombreRecurso;
    private String creador;
    private double pesoEnMB;

    /**
     * Crea un recurso externo.
     * @param idExterno identificador externo del recurso.
     * @param nombreRecurso nombre del recurso externo.
     * @param creador creador o proveedor del recurso.
     * @param pesoEnMB peso del recurso en MB.
     */
    public RecursoProveedorExterno(String idExterno, String nombreRecurso, String creador, double pesoEnMB) {
        this.idExterno = idExterno;
        this.nombreRecurso = nombreRecurso;
        this.creador = creador;
        this.pesoEnMB = pesoEnMB;
    }

    /**
     * Obtiene el identificador externo.
     * @return identificador externo.
     */
    public String obtenerIdExterno() {
        return idExterno;
    }

    /**
     * Obtiene el nombre del recurso externo.
     * @return nombre del recurso.
     */
    public String obtenerNombreRecurso() {
        return nombreRecurso;
    }

    /**
     * Obtiene el creador del recurso externo.
     * @return creador del recurso.
     */
    public String obtenerCreador() {
        return creador;
    }

    /**
     * Obtiene el peso del recurso externo.
     * @return peso en MB.
     */
    public double obtenerPesoEnMB() {
        return pesoEnMB;
    }

    /**
     * Abre el recurso externo.
     */
    public void abrirRecursoExterno() {
        System.out.println("Abriendo recurso externo: " + nombreRecurso);
    }

}
