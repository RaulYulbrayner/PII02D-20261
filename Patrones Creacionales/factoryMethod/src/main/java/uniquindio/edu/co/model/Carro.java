package uniquindio.edu.co.model;

import javax.swing.*;

public class Carro implements Vehiculo {

    //Atributos
    private String marca;
    private String modelo;
    private String placa;

    /**
     * Metodo constructor de la clase carro
     * @param marca del carro
     * @param modelo del carro
     * @param placa del carra
     */
    public Carro(String marca, String modelo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }

    @Override
    public void conducir() {
        JOptionPane.showMessageDialog(null, "El carro " + marca + " con placa " + placa + " se esta conduciendo........");
    }
}
