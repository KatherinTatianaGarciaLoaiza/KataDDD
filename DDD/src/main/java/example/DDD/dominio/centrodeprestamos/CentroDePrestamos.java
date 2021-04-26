package example.DDD.dominio.centrodeprestamos;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import example.DDD.dominio.centrodeprestamos.event.AdministradorCreado;
import example.DDD.dominio.centrodeprestamos.event.CentroDePrestamosCreado;
import example.DDD.dominio.centrodeprestamos.event.PrestamoCreado;
import example.DDD.dominio.centrodeprestamos.valuesObject.*;
import example.DDD.dominio.VOgeneralesYComprobaciones.DatosPersonales;

import java.util.List;
import java.util.Map;

public class CentroDePrestamos extends AggregateEvent<CentroDePrestamosId> {

    protected Map<PrestamoId, Prestamo> prestamos;
    protected Map<AdministradorId, Administrador> administradores;
    //protected Administrador administrador;
    protected TipoDeSolicitud tipoDeSolicitud;
    protected CaracteristicasDelPrestamo caracteristicasDelPrestamo;
    //protected Prestamo prestamo;
    protected String idSolicitante;

    private CentroDePrestamos(CentroDePrestamosId entityId){
        super(entityId);
        subscribe(new CentroDePrestamosChange(this));
    }

    public CentroDePrestamos(CentroDePrestamosId entityId, String idSolicitante, CaracteristicasDelPrestamo caracteristicasDelPrestamo, TipoDeSolicitud tipoDeSolicitud) {
        super(entityId);
        appendChange(new CentroDePrestamosCreado(idSolicitante, caracteristicasDelPrestamo, tipoDeSolicitud)).apply();
    }

    public static CentroDePrestamos from(CentroDePrestamosId entityId, List<DomainEvent> events){
        CentroDePrestamos centroDePrestamos = new CentroDePrestamos(entityId);
        events.forEach(centroDePrestamos::applyEvent);
        return centroDePrestamos;
    }

    public void administrador(AdministradorId entityId, DatosPersonales datosPersonales){
        appendChange(new AdministradorCreado(entityId, datosPersonales)).apply();
    }

    public void prestamo(PrestamoId entityId, TipoDeRecurso tipoDeRecurso, TipoDeSolicitud tipoDeSolicitud){
       appendChange(new PrestamoCreado(entityId, tipoDeRecurso, tipoDeSolicitud)).apply();
    }
}
