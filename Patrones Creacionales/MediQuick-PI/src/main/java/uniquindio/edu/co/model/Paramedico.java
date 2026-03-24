package uniquindio.edu.co.model;

/**
 * Representa un paramédico del sistema.
 */
public class Paramedico {

    private String identificacion;
    private String nombre;
    private String licenciaProfesional;
    private String nivelExperiencia;
    private int aniosServicio;

    /**
     * Constructor del paramedico.
     * @param identificacion del paramedico
     * @param nombre del paramedico
     * @param licenciaProfesional del paramedico
     * @param nivelExperiencia del paramedico
     * @param aniosServicio del paramedico
     */
    public Paramedico(String identificacion, String nombre, String licenciaProfesional, String nivelExperiencia, int aniosServicio) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.licenciaProfesional = licenciaProfesional;
        this.nivelExperiencia = nivelExperiencia;
        this.aniosServicio = aniosServicio;
    }

    /**
     * Verifica si el paramédico tiene servicio activo.
     */
    public boolean servicioActivo(){
        boolean activo = true;
        return activo;
    }

    /**
     * Verifica si el paramédico está disponible.
     */
    public boolean estaDisponible(){
        boolean disponible = true;
        return disponible;
    }

    @Override
    public String toString() {
        return "Paramedico{" +
                "identificacion='" + identificacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", licenciaProfesional='" + licenciaProfesional + '\'' +
                ", nivelExperiencia='" + nivelExperiencia + '\'' +
                ", aniosServicio=" + aniosServicio +
                '}';
    }
}
