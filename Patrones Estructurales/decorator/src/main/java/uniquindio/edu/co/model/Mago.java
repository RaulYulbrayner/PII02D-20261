package uniquindio.edu.co.model;

public class Mago  implements Personaje{

    @Override
    public String descripcion() {
        return "Mago Oscuro";
    }

    @Override
    public int poder() {
        return 15;
    }

    @Override
    public int vida() {
        return 80;
    }

}
