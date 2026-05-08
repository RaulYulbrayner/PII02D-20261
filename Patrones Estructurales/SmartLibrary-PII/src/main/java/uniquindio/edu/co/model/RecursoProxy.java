package uniquindio.edu.co.model;

/**
 * Proxy para controlar el acceso a un recurso.
 * Esta clase implementa el patrón Proxy. Antes de permitir la visualización
 * del recurso real, verifica si el usuario tiene los permisos necesarios.
 */
public class RecursoProxy implements RecursoBiblioteca {

    private RecursoBiblioteca recursoReal;
    private boolean requierePermiso;

    /**
     * Crea un proxy para un recurso de la biblioteca.
     * @param recursoReal recurso real que será protegido.
     * @param requierePermiso indica si el recurso requiere permiso especial.
     */
    public RecursoProxy(RecursoBiblioteca recursoReal, boolean requierePermiso) {
        this.recursoReal = recursoReal;
        this.requierePermiso = requierePermiso;
    }

    /**
     * Obtiene el código del recurso protegido.
     * @return código del recurso.
     */
    @Override
    public String getCodigo() {
        return recursoReal.getCodigo();
    }

    /**
     * Obtiene el título del recurso protegido.
     * @return título del recurso.
     */
    @Override
    public String getTitulo() {
        return recursoReal.getTitulo();
    }

    /**
     * Calcula el tamaño del recurso protegido.
     * @return tamaño del recurso en MB.
     */
    @Override
    public double calcularTamano() {
        return recursoReal.calcularTamano();
    }

    /**
     * Muestra la información del recurso protegido.
     */
    @Override
    public void mostrarInformacion() {
        recursoReal.mostrarInformacion();
    }

    /**
     * CII: Determinar si un usuario puede acceder o descargar un recurso según su tipo,
     * disponibilidad del recurso y licencia asociada.
     * @param usuario usuario que intenta acceder al recurso.
     */
    @Override
    public void visualizar(Usuario usuario) {
        if (!requierePermiso) {
            recursoReal.visualizar(usuario);
        } else if (usuario.tienePermisoDescarga()) {
            System.out.println("Acceso autorizado para: " + usuario.getNombre());
            recursoReal.visualizar(usuario);
        } else {
            System.out.println("Acceso denegado para: " + usuario.getNombre());
            System.out.println("El recurso '" + recursoReal.getTitulo() + "' requiere permisos especiales.");
        }
    }

}
