package uniquindio.edu.co.model;

public class EspadaMagica extends DecoradorPersonaje {

    public EspadaMagica(Personaje personaje) {
        super(personaje);
    }

    @Override
    public String descripcion() {
        return personaje.descripcion() + " espada magica super oscura de matar ... ";
    }

    @Override
    public int poder() {
        return personaje.poder() + 150;
    }

    @Override
    public int vida() {
        return personaje.vida() - 5;
    }
}
