package uniquindio.edu.co;

import uniquindio.edu.co.model.Estudiante;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Estudiante estudiante1 = new Estudiante("Raul", 123, "+57310");
        Estudiante estudiante2 = new Estudiante("Yulbraynner", 455, "+57311");
        Estudiante clon = estudiante1.clone();

        System.out.println(estudiante1.toString());
        System.out.println(estudiante2.toString());
        System.out.println(clon.toString());

        System.out.println("-------------");
        clon.setNombre("Kevin");
        System.out.println(clon.toString());

    }

}