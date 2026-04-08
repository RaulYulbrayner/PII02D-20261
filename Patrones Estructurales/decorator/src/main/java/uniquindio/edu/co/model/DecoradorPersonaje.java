package uniquindio.edu.co.model;

public abstract class DecoradorPersonaje implements Personaje {

    protected Personaje personaje;

    public DecoradorPersonaje(Personaje personaje){
        this.personaje = personaje;
    }

}
