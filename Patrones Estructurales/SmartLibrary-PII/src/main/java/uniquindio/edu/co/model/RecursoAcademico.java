package uniquindio.edu.co.model;

/**
 * Representa un recurso académico propio de SmartLibrary.
 * Esta clase puede representar libros digitales, artículos científicos,
 * audiolibros u otros recursos académicos administrados directamente por
 * la biblioteca.
 *
 * La clase aplica el patrón Builder mediante la clase interna
 * {@link Builder}, ya que un recurso académico puede tener muchos atributos,
 * algunos obligatorios y otros opcionales.
 */
public class RecursoAcademico implements RecursoBiblioteca {

    private String codigo;
    private String titulo;
    private String autor;
    private String editorial;
    private int anio;
    private String isbn;
    private String palabrasClave;
    private String formato;
    private double tamanoArchivo;
    private String licencia;
    private String descripcion;

    /**
     * Constructor privado que recibe un objeto Builder.
     * @param builder objeto constructor con los datos del recurso.
     */
    private RecursoAcademico(Builder builder) {
        this.codigo = builder.codigo;
        this.titulo = builder.titulo;
        this.autor = builder.autor;
        this.editorial = builder.editorial;
        this.anio = builder.anio;
        this.isbn = builder.isbn;
        this.palabrasClave = builder.palabrasClave;
        this.formato = builder.formato;
        this.tamanoArchivo = builder.tamanoArchivo;
        this.licencia = builder.licencia;
        this.descripcion = builder.descripcion;
    }

    /**
     * Clase interna que implementa el patrón Builder.
     * Permite construir objetos {@link RecursoAcademico} de forma flexible,
     * separando los datos obligatorios de los datos opcionales.
     */
    public static class Builder {

        private String codigo;
        private String titulo;
        private String autor;
        private String editorial;
        private int anio;
        private String isbn;
        private String palabrasClave;
        private String formato;
        private double tamanoArchivo;
        private String licencia;
        private String descripcion;

        /**
         * Crea un Builder con los datos obligatorios del recurso académico.
         * @param codigo código único del recurso.
         * @param titulo título del recurso.
         * @param autor autor principal del recurso.
         */
        public Builder(String codigo, String titulo, String autor) {
            this.codigo = codigo;
            this.titulo = titulo;
            this.autor = autor;
        }

        /**
         * Asigna la editorial del recurso.
         * @param editorial editorial del recurso.
         * @return instancia actual del Builder.
         */
        public Builder editorial(String editorial) {
            this.editorial = editorial;
            return this;
        }

        /**
         * Asigna el año de publicación del recurso.
         * @param anio año de publicación.
         * @return instancia actual del Builder.
         */
        public Builder anio(int anio) {
            this.anio = anio;
            return this;
        }

        /**
         * Asigna el ISBN del recurso.
         * @param isbn ISBN del recurso.
         * @return instancia actual del Builder.
         */
        public Builder isbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        /**
         * Asigna las palabras clave del recurso.
         * @param palabrasClave palabras clave asociadas al recurso.
         * @return instancia actual del Builder.
         */
        public Builder palabrasClave(String palabrasClave) {
            this.palabrasClave = palabrasClave;
            return this;
        }

        /**
         * Asigna el formato digital del recurso.
         * @param formato formato del recurso, por ejemplo PDF, EPUB o MP3.
         * @return instancia actual del Builder.
         */
        public Builder formato(String formato) {
            this.formato = formato;
            return this;
        }

        /**
         * Asigna el tamaño del archivo en megabytes.
         * @param tamanoArchivo tamaño del archivo en MB.
         * @return instancia actual del Builder.
         */
        public Builder tamanoArchivo(double tamanoArchivo) {
            this.tamanoArchivo = tamanoArchivo;
            return this;
        }

        /**
         * Asigna la licencia del recurso.
         * @param licencia tipo de licencia del recurso.
         * @return instancia actual del Builder.
         */
        public Builder licencia(String licencia) {
            this.licencia = licencia;
            return this;
        }

        /**
         * Asigna la descripción del recurso.
         * @param descripcion descripción general del recurso.
         * @return instancia actual del Builder.
         */
        public Builder descripcion(String descripcion) {
            this.descripcion = descripcion;
            return this;
        }

        /**
         * Construye el recurso académico final.
         * @return recurso académico construido.
         */
        public RecursoAcademico build() {
            return new RecursoAcademico(this);
        }
    }

    /**
     * Obtiene el código del recurso académico.
     * @return código del recurso.
     */
    @Override
    public String getCodigo() {
        return codigo;
    }

    /**
     * Obtiene el título del recurso académico.
     * @return título del recurso.
     */
    @Override
    public String getTitulo() {
        return titulo;
    }

    /**
     * Calcula el tamaño del recurso académico.
     * @return tamaño del archivo en MB.
     */
    @Override
    public double calcularTamano() {
        return tamanoArchivo;
    }

    /**
     * Muestra la información completa del recurso académico.
     */
    @Override
    public void mostrarInformacion() {
        System.out.println("Recurso académico");
        System.out.println("Código: " + codigo);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editorial: " + editorial);
        System.out.println("Año: " + anio);
        System.out.println("ISBN: " + isbn);
        System.out.println("Palabras clave: " + palabrasClave);
        System.out.println("Formato: " + formato);
        System.out.println("Tamaño: " + tamanoArchivo + " MB");
        System.out.println("Licencia: " + licencia);
        System.out.println("Descripción: " + descripcion);
    }

    /**
     * Visualiza el recurso académico.
     * @param usuario usuario que accede al recurso.
     */
    @Override
    public void visualizar(Usuario usuario) {
        System.out.println("Visualizando recurso: " + titulo);
    }

}
