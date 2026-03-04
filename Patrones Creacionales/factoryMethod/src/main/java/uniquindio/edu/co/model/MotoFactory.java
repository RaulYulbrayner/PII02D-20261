package uniquindio.edu.co.model;

public class MotoFactory extends VehiculoFactory {

    //Atributos
    private String marca;
    private String numSerie;
    private int cilindraje;

    /**
     *
     * @param marca
     * @param numSerie
     * @param cilindraje
     */
    public MotoFactory(String marca, String numSerie, int cilindraje) {
        this.marca = marca;
        this.numSerie = numSerie;
        this.cilindraje = cilindraje;
    }

    @Override
    public Vehiculo crearVehiculo() {
        return new Moto(marca,numSerie, cilindraje);
    }
}
