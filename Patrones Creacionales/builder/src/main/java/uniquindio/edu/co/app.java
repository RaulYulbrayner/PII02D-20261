package uniquindio.edu.co;

import uniquindio.edu.co.model.Estudiante;
import uniquindio.edu.co.model.EstudianteBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class app {


    public static void main(String[] args) {

        //Sobrecarga de constructores
        Estudiante estudiante = new Estudiante("Raul", "Rivera", "22/01/2005", "12345T", "M", "A+", 172, 71);
        Estudiante estudiante1 = new Estudiante("Juliana", "Rojas", "22/11/2005", "WAS123", "A-");

        //Patrón builder
        EstudianteBuilder estudiante2 = new EstudianteBuilder.Builder()
                .nombre("Camila")
                .rh("A+")
                .apellido("Zapata")
                .build();

        System.out.println(estudiante2);

        estudiante2.setFechaNacimiento("31/12/2008");

        System.out.println(estudiante);
        System.out.println(estudiante1);
        System.out.println(estudiante2);
    }


}