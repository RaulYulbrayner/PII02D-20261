package uniquindio.edu.co.model;

import javax.swing.plaf.PanelUI;

public class Estudiante implements Cloneable {

   private String nombre;
   private int cedula;
   private String telefono;

    public Estudiante(String nombre, int cedula, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public Estudiante clone() throws CloneNotSupportedException {
        return (Estudiante) super.clone();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", cedula=" + cedula +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
