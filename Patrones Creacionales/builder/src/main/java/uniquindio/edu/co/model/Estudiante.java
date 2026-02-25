package uniquindio.edu.co.model;

public class Estudiante {

    private String nombre;
    private String apellido;
    private String grado;
    private String fechaNacimiento;
    private String cedula;
    private String genero;
    private String rh;
    private int altura;
    private int peso;

    public Estudiante(String nombre, String apellido, String grado, String fechaNacimiento, String cedula, String genero, String rh, int altura, int peso) {
        this.nombre = nombre;
        assert nombre != null;
        this.apellido = apellido;
        this.grado = grado;
        this.fechaNacimiento = fechaNacimiento;
        this.cedula = cedula;
        this.genero = genero;
        this.rh = rh;
        this.altura = altura;
        this.peso = peso;
    }

    public Estudiante(String nombre, String apellido, String fechaNacimiento, String cedula, String genero, String rh, int altura, int peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.cedula = cedula;
        this.genero = genero;
        this.rh = rh;
        this.altura = altura;
        this.peso = peso;
    }

    public Estudiante(String nombre, String apellido, String fechaNacimiento, String cedula, String rh) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.cedula = cedula;
        this.rh = rh;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", grado='" + grado + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", cedula='" + cedula + '\'' +
                ", genero='" + genero + '\'' +
                ", rh='" + rh + '\'' +
                ", altura=" + altura +
                ", peso='" + peso + '\'' +
                '}';
    }
}
