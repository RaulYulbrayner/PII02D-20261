package uniquindio.edu.co.model;

import javax.swing.*;

public class Moto implements Vehiculo {

    //Atributos
    private String marca;
    private String numSerie;
    private int cilindraje;

    /**
     * Metodo constructor de la clase moto
     * @param marca de la moto
     * @param numSerie de la moto
     * @param cilindraje de la moto
     */
    public Moto(String marca, String numSerie, int cilindraje) {
        this.marca = marca;
        this.numSerie = numSerie;
        this.cilindraje = cilindraje;
    }

    @Override
    public void conducir() {
        JOptionPane.showMessageDialog(null, "La moto " + marca + " con serie " + numSerie + " se esta conduciendo........");
    }
}
