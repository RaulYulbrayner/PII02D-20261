package uniquindio.edu.co;

import uniquindio.edu.co.model.Mesero;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Mesero mesero = new Mesero();
        String resultado =  mesero.tomarPedido("Raúl",
                "Huevos al gusto",
                "Chocolate caliente",
                5000);
        System.out.println(resultado);
    }

}