package example.DDD.dominio.solicitante.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.ValueObject;
import example.DDD.dominio.VOgeneralesYComprobaciones.TipoDeSolicitud;

import java.util.List;

public class SolicitanteCreado extends DomainEvent {
    private final ValueObject datosPersonales;
    private final ValueObject sancion;
    private final TipoDeSolicitud tipoDeSolicitud;

    public SolicitanteCreado(ValueObject datosPersonales, ValueObject sancion, TipoDeSolicitud tipoDeSolicitud) {
        super("CentroDePrestamos.solicitante.solicitantecreado");
        this.datosPersonales = datosPersonales;
        this.sancion = sancion;
        this.tipoDeSolicitud = tipoDeSolicitud;
    }

    public ValueObject getDatosPersonales() {
        return datosPersonales;
    }

    public ValueObject getSancion() {
        return sancion;
    }

    public TipoDeSolicitud getTipoDeSolicitud() {
        return tipoDeSolicitud;
    }
}
