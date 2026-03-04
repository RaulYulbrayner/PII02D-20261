package uniquindio.edu.co.model;

public class CarroFactory extends VehiculoFactory {

    //Atributos
    private String marca;
    private String modelo;
    private String placa;

    public CarroFactory(String marca, String modelo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }

    @Override
    public Vehiculo crearVehiculo() {
        return new Carro(marca, modelo, placa);
    }
}
