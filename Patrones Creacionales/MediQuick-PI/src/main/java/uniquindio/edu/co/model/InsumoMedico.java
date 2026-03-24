package uniquindio.edu.co.model;

/**
 * Clase que representa un insumo médico utilizado
 * durante la ejecución de un servicio de emergencia.
 */
public class InsumoMedico {

    private String codigo;
    private String descripcion;
    private double peso;

    /**
     * Constructor de la clase InsumoMedico.
     * @param codigo código del insumo
     * @param descripcion descripción del insumo
     * @param peso peso del insumo
     */
    public InsumoMedico(String codigo, String descripcion, double peso) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.peso = peso;
    }

    /**
     * Obtiene el peso del insumo.
     * @return peso del insumo
     */
    public double getPeso(){
        return peso;
    }

    @Override
    public String toString() {
        return "InsumoMedico{" +
                "codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", peso=" + peso +
                '}';
    }
}
