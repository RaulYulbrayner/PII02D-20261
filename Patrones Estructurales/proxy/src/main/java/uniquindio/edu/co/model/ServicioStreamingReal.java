package uniquindio.edu.co.model;

public class ServicioStreamingReal implements ServicioStreaming {

    @Override
    public String reproducir(String pelicula) {
        return "Reproduciendo la pelicula: " + pelicula;
    }

}
