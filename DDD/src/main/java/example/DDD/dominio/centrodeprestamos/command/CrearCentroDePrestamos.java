package example.DDD.dominio.centrodeprestamos.command;

import co.com.sofka.domain.generic.Command;
import example.DDD.dominio.VOgeneralesYComprobaciones.TipoDeSolicitud;
import example.DDD.dominio.centrodeprestamos.valuesObject.CaracteristicasDelPrestamo;
import example.DDD.dominio.centrodeprestamos.valuesObject.CentroDePrestamosId;

public class CrearCentroDePrestamos implements Command {

    private final CentroDePrestamosId entityId;
    private final String idSolicitante;
    private final CaracteristicasDelPrestamo caracteristicasDelPrestamo;
    private final TipoDeSolicitud tipoDeSolicitud;

    public CrearCentroDePrestamos(CentroDePrestamosId entityId, String idSolicitante, CaracteristicasDelPrestamo caracteristicasDelPrestamo, TipoDeSolicitud tipoDeSolicitud){
        this.entityId = entityId;
        this.idSolicitante = idSolicitante;
        this.caracteristicasDelPrestamo = caracteristicasDelPrestamo;
        this.tipoDeSolicitud = tipoDeSolicitud;
    }

    public CentroDePrestamosId getEntityId() {
        return entityId;
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
