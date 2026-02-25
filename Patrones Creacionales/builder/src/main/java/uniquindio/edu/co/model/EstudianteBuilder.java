package uniquindio.edu.co.model;

public class EstudianteBuilder {

    private String nombre;
    private String apellido;
    private String grado;
    private String fechaNacimiento;
    private String cedula;
    private String genero;
    private String rh;
    private int altura;
    private int peso;

    public EstudianteBuilder(Builder builder) {
        this.nombre = builder.nombre;
        this.apellido = builder.apellido;
        this.grado = builder.grado;
        this.fechaNacimiento = builder.fechaNacimiento;
        this.cedula = builder.cedula;
        this.genero = builder.genero;
        this.rh = builder.rh;
        this.altura = builder.altura;
        this.peso = builder.peso;
    }

    //GET y Set


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "EstudianteBuilder{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", grado='" + grado + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", cedula='" + cedula + '\'' +
                ", genero='" + genero + '\'' +
                ", rh='" + rh + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }

    public static class Builder{
        private String nombre;
        private String apellido;
        private String grado;
        private String fechaNacimiento;
        private String cedula;
        private String genero;
        private String rh;
        private int altura;
        private int peso;

        public Builder nombre(String nombre){
            this.nombre = nombre;
            return this;
        }

        public Builder apellido(String apellido){
            this.apellido = apellido;
            return this;
        }

        public Builder grado(String grado){
            this.grado = grado;
            return this;
        }

        public Builder fechaNacimiento(String fechaNacimiento){
            this.fechaNacimiento = fechaNacimiento;
            return this;
        }

        public Builder cedula(String cedula){
            this.cedula = cedula;
            return this;
        }

        public Builder genero(String genero){
            this.genero = genero;
            return this;
        }

        public Builder rh(String rh){
            this.rh = rh;
            return this;
        }

        public Builder altura(int altura){
            this.altura = altura;
            return this;
        }

        public Builder peso(int peso){
            this.peso = peso;
            return this;
        }

        public EstudianteBuilder build(){
            return new EstudianteBuilder(this);
        }


    }







}