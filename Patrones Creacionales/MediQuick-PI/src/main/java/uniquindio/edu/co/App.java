package uniquindio.edu.co;

import uniquindio.edu.co.model.*;

/**
 * Clase principal del sistema MediQuick.
 * Permite demostrar el funcionamiento de los diferentes
 * patrones de diseño implementados en el sistema:
 * - Singleton (Central de Emergencias)
 * - Factory Method (Creación de ambulancias)
 * - Builder (Construcción de servicios de emergencia)
 * - Prototype (Duplicación de servicios existentes)
 */
public class App {

    public static void main(String[] args) throws CloneNotSupportedException {

        //1. Uso del patrón Singleton
        CentralEmergencias central = CentralEmergencias.getInstancia();

        //2. Uso del patrón Factory Method
        Ambulancia ambulancia1 = AmbulanciaFactory.obtenerAmbulancia(
                TipoAmbulancia.BASICA,
                "AMB001",
                "ABC123",
                80,
                100,
                EstadoAmbulancia.DISPONIBLE
        );

        Ambulancia ambulancia2 = AmbulanciaFactory.obtenerAmbulancia(
                TipoAmbulancia.MEDICALIZADA,
                "AMB002",
                "XYZ789",
                90,
                120,
                EstadoAmbulancia.DISPONIBLE
        );

        System.out.println("------ AMBULANCIAS ------");
        System.out.println(ambulancia1);
        System.out.println(ambulancia2);

        //Crear paramédico
        Paramedico paramedico1 = new Paramedico(
                "PM01",
                "Carlos Ramírez",
                "B1",
                "Conductor profesional",
                5
        );

        System.out.println("\n------ PARAMEDICO ------");
        System.out.println(paramedico1);

        //Crear insumos médicos
        InsumoMedico insumo1 = new InsumoMedico(
                "INS01",
                "Botiquín de emergencia",
                5
        );

        InsumoMedico insumo2 = new InsumoMedico(
                "INS02",
                "Equipo de oxígeno",
                8
        );

        System.out.println("\n------ INSUMOS MEDICOS ------");
        System.out.println(insumo1);
        System.out.println(insumo2);

        //3. Uso del patrón Builder
        ServicioEmergencia servicio1 = new ServicioEmergencia.Builder()
                .codigo("SERV001")
                .fecha("2026-03-11")
                .distancia(12)
                .duracion(30)
                .ambulancia(ambulancia1)
                .paramedico(paramedico1)
                .agregarInsumo(insumo1)
                .agregarInsumo(insumo2)
                .build();

        //Registrar servicio en la central
        central.agregarServicio(servicio1);

        //Uso del patrón Prototype
        ServicioEmergencia servicio2 = servicio1.clone();

        servicio2.setCodigo("SERV002");

        central.agregarServicio(servicio2);

        System.out.println("\n------ SERVICIOS ------");
        System.out.println(servicio1);
        System.out.println(servicio2);

        System.out.println("\n------ CALCULOS DEL SERVICIO ------");
        //Punto C1
        System.out.println("¿La ambulancia puede atender el servicio? " + ambulancia1.puedeAtenderServicio(servicio1.pesoTotalInsumos()));
        //Punto C2
        System.out.println("Tiempo estimado de desplazamiento: " + servicio1.calcularTiempoDesplazamiento());
    }
}