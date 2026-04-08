package uniquindio.edu.co.model;

public class Guerrero implements Personaje {

    @Override
    public String descripcion() {
        return "Guerrero noble";
    }

    @Override
    public int poder() {
        return 50;
    }

    @Override
    public int vida() {
        return 100;
    }

}
