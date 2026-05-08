package uniquindio.edu.co;

import uniquindio.edu.co.model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Usuario estudiante = new Usuario("Laura Gómez", "Estudiante", false);
        Usuario docente = new Usuario("Carlos Rivera", "Docente", true);

        /*
         * Builder:
         * Construcción de recursos académicos con datos obligatorios y opcionales.
         */
        RecursoBiblioteca libroJava = new RecursoAcademico.Builder(
                "LIB-001",
                "Programación en Java",
                "Ana Torres")
                .editorial("SmartBooks")
                .anio(2024)
                .isbn("978-1234567890")
                .palabrasClave("Java, POO, programación")
                .formato("PDF")
                .tamanoArchivo(80)
                .licencia("Académica")
                .descripcion("Libro introductorio sobre programación orientada a objetos en Java.")
                .build();

        RecursoBiblioteca articuloIA = new RecursoAcademico.Builder(
                "ART-001",
                "Inteligencia Artificial en Educación",
                "Luis Ramírez")
                .editorial("Revista Ciencia Digital")
                .anio(2023)
                .palabrasClave("IA, educación, aprendizaje")
                .formato("PDF")
                .tamanoArchivo(25)
                .licencia("Creative Commons")
                .descripcion("Artículo científico sobre el uso de IA en procesos educativos.")
                .build();

        RecursoBiblioteca audiolibro = new RecursoAcademico.Builder(
                "AUD-001",
                "Fundamentos de Bases de Datos",
                "María López")
                .editorial("AudioAcademic")
                .anio(2022)
                .formato("MP3")
                .tamanoArchivo(150)
                .licencia("Restringida")
                .descripcion("Audiolibro sobre conceptos fundamentales de bases de datos.")
                .build();

        /*
         * Adapter:
         * Integración de un recurso externo al modelo propio de SmartLibrary.
         */
        RecursoProveedorExterno recursoExterno = new RecursoProveedorExterno(
                "EXT-900",
                "Machine Learning Fundamentals",
                "Global Academic Provider",
                60
        );

        RecursoBiblioteca recursoAdaptado = new RecursoExternoAdapter(recursoExterno);

        /*
         * Proxy:
         * Protección de un recurso restringido.
         */
        RecursoBiblioteca audiolibroProtegido = new RecursoProxy(audiolibro, true);

        /*
         * Decorator:
         * Adición de funcionalidades opcionales al recurso sin modificar su clase base.
         */
        RecursoBiblioteca libroDecorado = new MarcaAguaDecorator(libroJava);
        libroDecorado = new CompresionDecorator(libroDecorado);
        libroDecorado = new ProteccionDecorator(libroDecorado);

        /*
         * Composite:
         * Organización de recursos en colecciones y subcolecciones.
         */
        ColeccionRecursos coleccionProgramacion = new ColeccionRecursos(
                "COL-001",
                "Colección de Programación"
        );

        coleccionProgramacion.agregarRecurso(libroDecorado);
        coleccionProgramacion.agregarRecurso(articuloIA);

        ColeccionRecursos coleccionMultimedia = new ColeccionRecursos(
                "COL-002",
                "Colección Multimedia"
        );

        coleccionMultimedia.agregarRecurso(audiolibroProtegido);
        coleccionMultimedia.agregarRecurso(recursoAdaptado);

        ColeccionRecursos bibliotecaGeneral = new ColeccionRecursos(
                "COL-GEN",
                "Biblioteca General SmartLibrary"
        );

        bibliotecaGeneral.agregarRecurso(coleccionProgramacion);
        bibliotecaGeneral.agregarRecurso(coleccionMultimedia);

        /*
         * Demostración general del sistema.
         */
        System.out.println("===== INFORMACIÓN DE LA BIBLIOTECA =====");
        bibliotecaGeneral.mostrarInformacion();

        System.out.println("\n===== TAMAÑO TOTAL DE LA BIBLIOTECA =====");
        System.out.println("Tamaño total: " + bibliotecaGeneral.calcularTamano() + " MB");

        System.out.println("\n===== ACCESO COMO ESTUDIANTE =====");
        bibliotecaGeneral.visualizar(estudiante);

        System.out.println("\n===== ACCESO COMO DOCENTE =====");
        bibliotecaGeneral.visualizar(docente);

    }
}