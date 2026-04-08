package uniquindio.edu.co;

import uniquindio.edu.co.model.EscudoMagico;
import uniquindio.edu.co.model.EspadaMagica;
import uniquindio.edu.co.model.Guerrero;
import uniquindio.edu.co.model.Personaje;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Personaje personaje1 = new Guerrero();
        System.out.println(personaje1.descripcion() + " - porder: " + personaje1.poder() + " - vida: " + personaje1.vida());

        Personaje personaje2 = new EspadaMagica(personaje1);
        System.out.println(personaje2.descripcion() + " - porder: " + personaje2.poder() + " - vida: " + personaje2.vida());

        Personaje personaje3 = new EscudoMagico(new EspadaMagica(personaje1));
        System.out.println(personaje3.descripcion() + " - porder: " + personaje3.poder() + " - vida: " + personaje3.vida());

    }


}