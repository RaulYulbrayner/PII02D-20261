package uniquindio.edu.co.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una colección de recursos académicos.
 * Esta clase implementa el patrón Composite, ya que puede contener tanto
 * recursos individuales como otras colecciones. Esto permite construir
 * estructuras jerárquicas como colecciones generales, colecciones temáticas
 * y subcolecciones.
 */
public class ColeccionRecursos implements RecursoBiblioteca{

    private String codigo;
    private String titulo;
    private List<RecursoBiblioteca> recursos;

    /**
     * Crea una colección de recursos.
     * @param codigo código de la colección.
     * @param titulo título de la colección.
     */
    public ColeccionRecursos(String codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.recursos = new ArrayList<>();
    }

    /**
     * Agrega un recurso o subcolección a la colección actual.
     * @param recurso recurso que se desea agregar.
     */
    public void agregarRecurso(RecursoBiblioteca recurso) {
        recursos.add(recurso);
    }

    /**
     * Elimina un recurso o subcolección de la colección actual.
     * @param recurso recurso que se desea eliminar.
     */
    public void eliminarRecurso(RecursoBiblioteca recurso) {
        recursos.remove(recurso);
    }

    /**
     * Obtiene el código de la colección.
     * @return código de la colección.
     */
    @Override
    public String getCodigo() {
        return codigo;
    }

    /**
     * Obtiene el título de la colección.
     * @return título de la colección.
     */
    @Override
    public String getTitulo() {
        return titulo;
    }

    /**
     * CI: Calcular el tamaño total de una colección, teniendo en cuenta tanto
     * recursos individuales como subcolecciones.
     * @return tamaño total de la colección en MB.
     */
    @Override
    public double calcularTamano() {
        double total = 0;
        for (RecursoBiblioteca recurso : recursos) {
            total += recurso.calcularTamano();
        }
        return total;
    }

    /**
     * Muestra la información general de la colección.
     */
    @Override
    public void mostrarInformacion() {
        System.out.println("Colección: " + titulo);
        System.out.println("Código: " + codigo);
        System.out.println("Tamaño total: " + calcularTamano() + " MB");
        System.out.println("Contenido:");

        for (RecursoBiblioteca recurso : recursos) {
            System.out.println("- " + recurso.getTitulo());
        }
    }

    /**
     * Visualiza todos los recursos contenidos en la colección.
     * @param usuario usuario que intenta acceder a la colección.
     */
    @Override
    public void visualizar(Usuario usuario) {
        System.out.println("Visualizando colección: " + titulo);
        for (RecursoBiblioteca recurso : recursos) {
            recurso.visualizar(usuario);
        }
    }

}
