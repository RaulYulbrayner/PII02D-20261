package uniquindio.edu.co.model;

public class ProxyStreaming implements ServicioStreaming {

    private ServicioStreamingReal servicioStreamingReal;
    private String usuario;
    private boolean suscripcion;

    public ProxyStreaming(String usuario, boolean suscripcion) {
        this.usuario = usuario;
        this.suscripcion = suscripcion;
    }

    @Override
    public String reproducir(String pelicula) {
        String respuesta;
        if(!suscripcion){
            respuesta = "Acceso denegado para: " + usuario + " estado suscripción: " + suscripcion + " Debe tener una suscripción activa :(";
        }else{
            if(servicioStreamingReal == null){
                servicioStreamingReal = new ServicioStreamingReal();
            }
            respuesta = "Verificando el usuario: " + usuario + " para que disfrute nuestro contenido " + servicioStreamingReal.reproducir(pelicula);
        }
        return respuesta;
    }
}