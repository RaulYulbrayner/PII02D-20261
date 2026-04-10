package uniquindio.edu.co;

import uniquindio.edu.co.model.ProxyStreaming;
import uniquindio.edu.co.model.ServicioStreaming;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        ServicioStreaming usuario1 = new ProxyStreaming("Raúl", true);
        ServicioStreaming usuario2 = new ProxyStreaming("Linda", false);

        System.out.println("------- Usuario1 -------");
        System.out.println(usuario1.reproducir("Batman el caballero de la noche"));

        System.out.println("------- Usuario2 -------");
        System.out.println(usuario2.reproducir("Barbi"));

    }

}