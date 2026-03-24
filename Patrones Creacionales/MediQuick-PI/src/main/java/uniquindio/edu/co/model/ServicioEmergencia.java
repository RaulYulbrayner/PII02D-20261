package uniquindio.edu.co.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un servicio de emergencia.
 * Implementa:
 * - Builder (clase interna)
 * - Prototype (clone)
 */
public class ServicioEmergencia implements Cloneable {

    private String codigo;
    private String fechaHoraInicio;
    private double distanciaEstimadoKm;
    private double duracionEstimado;
    private EstadoServicio estado;
    private TipoEmergencia tipoEmergencia;

    private Ambulancia ambulancia;
    private Paramedico paramedico;

    private List<InsumoMedico> insumos = new ArrayList<>();


    public ServicioEmergencia(Builder builder) {
        this.codigo = builder.codigo;
        this.fechaHoraInicio = builder.fechaHoraInicio;
        this.distanciaEstimadoKm = builder.distanciaEstimadoKm;
        this.duracionEstimado = builder.duracionEstimado;
        this.estado = builder.estado;
        this.tipoEmergencia = builder.tipoEmergencia;
        this.ambulancia = builder.ambulancia;
        this.paramedico = builder.paramedico;
        this.insumos = builder.insumos;
    }

    /**
     * Calcula el tiempo estimado de desplazamiento.
     */
    public double calcularTiempoDesplazamiento(){
        double tiempo = 0;
        if(ambulancia != null){
            tiempo = distanciaEstimadoKm / ambulancia.velocidadPromedioKmH;
        }
        return tiempo;
    }

    /**
     * Verifica si el servicio puede iniciarse.
     */
    public boolean puedeIniciarse(){
        boolean resultado = false;
        if(ambulancia != null && paramedico != null){
            resultado = true;
        }
        return resultado;
    }

    /**
     * Agrega un insumo al servicio.
     */
    public void agregarInsumo(InsumoMedico insumo){
        insumos.add(insumo);
    }

    /**
     * Calcula el peso total de insumos.
     */
    public double pesoTotalInsumos(){
        double total = 0;
        for(InsumoMedico i : insumos){
            total = total + i.getPeso();
        }
        return total;
    }

    /**
     * Clona un servicio existente.
     */
    @Override
    public ServicioEmergencia clone() throws CloneNotSupportedException {
        return (ServicioEmergencia) super.clone();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(String fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public double getDistanciaEstimadoKm() {
        return distanciaEstimadoKm;
    }

    public void setDistanciaEstimadoKm(double distanciaEstimadoKm) {
        this.distanciaEstimadoKm = distanciaEstimadoKm;
    }

    public double getDuracionEstimado() {
        return duracionEstimado;
    }

    public void setDuracionEstimado(double duracionEstimado) {
        this.duracionEstimado = duracionEstimado;
    }

    public EstadoServicio getEstado() {
        return estado;
    }

    public void setEstado(EstadoServicio estado) {
        this.estado = estado;
    }

    public TipoEmergencia getTipoEmergencia() {
        return tipoEmergencia;
    }

    public void setTipoEmergencia(TipoEmergencia tipoEmergencia) {
        this.tipoEmergencia = tipoEmergencia;
    }

    public Ambulancia getAmbulancia() {
        return ambulancia;
    }

    public void setAmbulancia(Ambulancia ambulancia) {
        this.ambulancia = ambulancia;
    }

    public Paramedico getParamedico() {
        return paramedico;
    }

    public void setParamedico(Paramedico paramedico) {
        this.paramedico = paramedico;
    }

    public List<InsumoMedico> getInsumos() {
        return insumos;
    }

    public void setInsumos(List<InsumoMedico> insumos) {
        this.insumos = insumos;
    }

    @Override
    public String toString() {
        return "ServicioEmergencia{" +
                "codigo='" + codigo + '\'' +
                ", fechaHoraInicio='" + fechaHoraInicio + '\'' +
                ", distanciaEstimadoKm=" + distanciaEstimadoKm +
                ", duracionEstimado=" + duracionEstimado +
                ", estado=" + estado +
                ", tipoEmergencia=" + tipoEmergencia +
                ", ambulancia=" + ambulancia +
                ", paramedico=" + paramedico +
                ", insumos=" + insumos +
                '}';
    }

    /**
     * Clase interna que implementa el patrón Builder.
     */
    public static class Builder {

        private String codigo;
        private String fechaHoraInicio;
        private double distanciaEstimadoKm;
        private double duracionEstimado;
        private EstadoServicio estado;
        private TipoEmergencia tipoEmergencia;

        private Ambulancia ambulancia;
        private Paramedico paramedico;

        private List<InsumoMedico> insumos = new ArrayList<>();

        public Builder codigo(String codigo){
            this.codigo = codigo;
            return this;
        }

        public Builder fecha(String fecha){
            this.fechaHoraInicio = fecha;
            return this;
        }

        public Builder distancia(double distancia){
            this.distanciaEstimadoKm = distancia;
            return this;
        }

        public Builder duracion(double duracion){
            this.duracionEstimado = duracion;
            return this;
        }

        public Builder agregarInsumo(InsumoMedico insumo){
            this.insumos.add(insumo);
            return this;
        }

        public Builder ambulancia(Ambulancia ambulancia){
            this.ambulancia = ambulancia;
            return this;
        }

        public Builder paramedico(Paramedico paramedico){
            this.paramedico = paramedico;
            return this;
        }

        public Builder tipoEmergencia(TipoEmergencia tipo){
            this.tipoEmergencia = tipo;
            return this;
        }

        public ServicioEmergencia build(){
            return new ServicioEmergencia(this);
        }
    }

}