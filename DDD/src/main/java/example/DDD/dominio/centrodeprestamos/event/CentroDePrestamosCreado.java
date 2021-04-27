package example.DDD.dominio.centrodeprestamos.event;

import co.com.sofka.domain.generic.DomainEvent;
import example.DDD.dominio.VOgeneralesYComprobaciones.Comprobaciones;
import example.DDD.dominio.VOgeneralesYComprobaciones.TipoDeSolicitud;
import example.DDD.dominio.centrodeprestamos.valuesObject.CaracteristicasDelPrestamo;

public class CentroDePrestamosCreado extends DomainEvent {
    private final String idSolicitante;
    private final CaracteristicasDelPrestamo caracteristicasDelPrestamo;
    private final TipoDeSolicitud tipoDeSolicitud;

    public CentroDePrestamosCreado(String idSolicitante, CaracteristicasDelPrestamo caracteristicasDelPrestamo, TipoDeSolicitud tipoDeSolicitud) {
        super("centrodeprestamos.agregados.centrodeprestamos.centrodeprestamsocreado");
        this.idSolicitante = idSolicitante;
        this.caracteristicasDelPrestamo = caracteristicasDelPrestamo;
        this.tipoDeSolicitud = tipoDeSolicitud;
    }

    public String getIdSolicitante() {
        return idSolicitante;
    }

    public CaracteristicasDelPrestamo getCaracteristicasDelPrestamo() {
        return caracteristicasDelPrestamo;
    }

    public TipoDeSolicitud getTipoDeSolicitud() {
        return tipoDeSolicitud;
    }
}
