package uniquindio.edu.co;

import uniquindio.edu.co.model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        VehiculoFactory factoryMoto = new MotoFactory("BMW", "12345", 10000);
        Vehiculo moto = factoryMoto.crearVehiculo();
        moto.conducir();

        VehiculoFactory factoryCarro = new CarroFactory("MAZDA", "2026", "BBB123");
        Vehiculo carro = factoryCarro.crearVehiculo();
        carro.conducir();

    }

}