package uniquindio.edu.co;

import uniquindio.edu.co.model.IPago;
import uniquindio.edu.co.model.PasarelaPagoAdapter;
import uniquindio.edu.co.model.PasarelaPagoExterno;
import uniquindio.edu.co.model.TiendaOnline;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        TiendaOnline tiendaOnline = new TiendaOnline();
        PasarelaPagoExterno pasarelaPagoExterno = new PasarelaPagoExterno();
        IPago pagoAdaptado = new PasarelaPagoAdapter(pasarelaPagoExterno);
        tiendaOnline.recaudar(pagoAdaptado, 15000);
    }

}