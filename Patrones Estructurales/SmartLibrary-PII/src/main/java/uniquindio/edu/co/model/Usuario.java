package uniquindio.edu.co.model;

/**
 * Representa un usuario del sistema SmartLibrary.
 * El usuario puede ser estudiante, docente u otro tipo de actor.
 * Además, se almacena si tiene permiso para descargar o visualizar
 * recursos restringidos.
 */
public class Usuario {

    private String nombre;
    private String rol;
    private boolean tienePermisoDescarga;

    /**
     * Metodo constructor de la clase usuario con nombre, rol y permiso de descarga.
     * @param nombre nombre del usuario.
     * @param rol rol del usuario dentro del sistema.
     * @param tienePermisoDescarga indica si el usuario tiene permiso para recursos restringidos.
     */
    public Usuario(String nombre, String rol, boolean tienePermisoDescarga) {
        this.nombre = nombre;
        this.rol = rol;
        this.tienePermisoDescarga = tienePermisoDescarga;
    }

    /**
     * Obtiene el nombre del usuario.
     * @return nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el rol del usuario.
     * @return rol del usuario.
     */
    public String getRol() {
        return rol;
    }

    /**
     * Indica si el usuario tiene permiso para descargar o visualizar
     * recursos restringidos.
     * @return true si tiene permiso, false en caso contrario.
     */
    public boolean tienePermisoDescarga() {
        return tienePermisoDescarga;
    }

}
