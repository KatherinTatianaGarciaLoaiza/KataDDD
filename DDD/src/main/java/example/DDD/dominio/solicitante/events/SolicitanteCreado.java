package example.DDD.dominio.solicitante.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.ValueObject;
import example.DDD.dominio.VOgeneralesYComprobaciones.DatosPersonales;
import example.DDD.dominio.VOgeneralesYComprobaciones.TipoDeSolicitud;
import example.DDD.dominio.solicitante.valuesObject.Sancion;

import java.util.List;

public class SolicitanteCreado extends DomainEvent {
    private final DatosPersonales datosPersonales;
    private final Sancion sancion;
    private final TipoDeSolicitud tipoDeSolicitud;

    public SolicitanteCreado(DatosPersonales datosPersonales, Sancion sancion, TipoDeSolicitud tipoDeSolicitud) {
        super("CentroDePrestamos.solicitante.solicitantecreado");
        this.datosPersonales = datosPersonales;
        this.sancion = sancion;
        this.tipoDeSolicitud = tipoDeSolicitud;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }

    public Sancion getSancion() {
        return sancion;
    }

    public TipoDeSolicitud getTipoDeSolicitud() {
        return tipoDeSolicitud;
    }
}
