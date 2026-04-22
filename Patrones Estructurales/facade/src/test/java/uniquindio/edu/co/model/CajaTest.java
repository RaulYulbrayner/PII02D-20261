package uniquindio.edu.co.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CajaTest {

    @Test
    public void verificarNombre(){
        Caja caja = new Caja("20/04/2026", 1500);
        assertEquals("20/05/2026", caja.getFecha());
    }

    @Test
    public void verificarValor(){
        Caja caja = new Caja("20/04/2026", 1500);
        assertTrue(caja.getValor() > 1499);
    }

    @Test
    public void verificarValorCostos(){
        Caja caja = new Caja("20/04/2026", 1500);
        assertFalse(caja.getValor() > 2499);
    }



}