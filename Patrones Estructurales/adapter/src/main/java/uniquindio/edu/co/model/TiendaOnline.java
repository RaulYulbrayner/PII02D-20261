package uniquindio.edu.co.model;

public class TiendaOnline {

    public void recaudar(IPago pago, double valor){
        System.out.println("------- Iniciando recaudo --------");
        pago.procesarPago(valor);
        System.out.println("------- Fin recaudo --------");
    }

}
