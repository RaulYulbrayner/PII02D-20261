package uniquindio.edu.co.model;

public class EscudoMagico extends DecoradorPersonaje {

    public EscudoMagico(Personaje personaje) {
        super(personaje);
    }

    @Override
    public String descripcion() {
        return personaje.descripcion() + " Escudo magico :) ";
    }

    @Override
    public int poder() {
        return personaje.poder() + 20;
    }

    @Override
    public int vida() {
        return personaje.vida() + 10;
    }
}
