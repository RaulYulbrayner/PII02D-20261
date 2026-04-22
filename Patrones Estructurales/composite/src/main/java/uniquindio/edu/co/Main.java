package uniquindio.edu.co;

import uniquindio.edu.co.model.Funcion;
import uniquindio.edu.co.model.Payaso;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Funcion funcion = new Funcion("Infantil");

        Funcion showPayasos = new Funcion("Show de payasos..");

        showPayasos.agregarActo(new Payaso("Chispitas"));
        showPayasos.agregarActo(new Payaso("Pulguitas"));

        funcion.agregarActo(showPayasos);

        funcion.presentarActo("");

    }
}