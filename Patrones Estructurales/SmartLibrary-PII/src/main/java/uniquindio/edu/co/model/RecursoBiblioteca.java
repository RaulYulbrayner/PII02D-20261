package uniquindio.edu.co.model;

/**
 * Interfaz principal del sistema SmartLibrary.
 * Esta interfaz representa el contrato común para todos los elementos
 * que pueden formar parte de la biblioteca digital, ya sean recursos simples
 * como libros, artículos o audiolibros, o estructuras compuestas como
 * colecciones y subcolecciones.
 *
 * Esta interfaz permite aplicar el patrón Composite, ya que tanto los
 * recursos individuales como las colecciones se tratan de manera uniforme.
 */
public interface RecursoBiblioteca {

    /**
     * Obtiene el código único del recurso o colección.
     * @return código del recurso.
     */
    public String getCodigo();

    /**
     * Obtiene el título del recurso o colección.
     * @return título del recurso.
     */
    public String getTitulo();

    /**
     * Calcula el tamaño del recurso o de una colección completa.
     * @return tamaño en megabytes.
     */
    public double calcularTamano();

    /**
     * Muestra la información general del recurso o colección.
     */
    public void mostrarInformacion();

    /**
     * Permite visualizar el recurso o colección según el usuario recibido.
     * @param usuario usuario que intenta acceder al recurso.
     */
    public void visualizar(Usuario usuario);

}
