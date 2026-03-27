package uniquindio.edu.co.model;

public class PasarelaPagoAdapter implements IPago {

    private PasarelaPagoExterno pasarelaPagoExterno;

    public PasarelaPagoAdapter(PasarelaPagoExterno pasarelaPagoExterno){
        this.pasarelaPagoExterno = pasarelaPagoExterno;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("-- Adaptando el solicitud de pago --");
        pasarelaPagoExterno.metodoPago(monto);
    }
    
}
