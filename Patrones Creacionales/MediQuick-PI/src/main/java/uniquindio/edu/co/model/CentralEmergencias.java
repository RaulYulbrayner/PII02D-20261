package uniquindio.edu.co.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa la central de emergencias.
 * Implementa el patrón Singleton.
 */
public final class CentralEmergencias  {

    private static CentralEmergencias instancia;

    private List<Ambulancia> ambulancias = new ArrayList<>();
    private List<Paramedico> paramedicos = new ArrayList<>();
    private List<ServicioEmergencia> servicios = new ArrayList<>();

    private CentralEmergencias(){}

    /**
     * Obtiene la instancia única de la central.
     */
    public static CentralEmergencias getInstancia(){
        if(instancia == null){
            instancia = new CentralEmergencias();
        }
        return instancia;
    }

    /**
     * Metodo que permite agregar ambulancias en la central de emergencias.
     * @param ambulancia
     */
    public void agregarAmbulancia(Ambulancia ambulancia){
        ambulancias.add(ambulancia);
    }

    /**
     * Metodo que permite agregar paramedicos en la central de emergencias.
     * @param paramedico
     */
    public void agregarParamedico(Paramedico paramedico){
        paramedicos.add(paramedico);
    }

    /**
     * Metodo que permite agregar servicios en la central de emergencias.
     * @param servicio
     */
    public void agregarServicio(ServicioEmergencia servicio){
        servicios.add(servicio);
    }

}
