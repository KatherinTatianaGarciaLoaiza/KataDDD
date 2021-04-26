package example.DDD.dominio.solicitante.events;

import co.com.sofka.domain.generic.DomainEvent;
import example.DDD.dominio.solicitante.valuesObject.Sancion;
import example.DDD.dominio.solicitante.valuesObject.SolicitanteId;

public class SancionAsignada extends DomainEvent {
    private final SolicitanteId entityId;
    private final Sancion sancion;

    public SancionAsignada(SolicitanteId entityId, Sancion sancion) {
        super("centrodeprestamos.solicitante.sancionasginada");
        this.entityId = entityId;
        this.sancion = sancion;
    }

    public SolicitanteId getEntityId() {
        return entityId;
    }

    public Sancion getSancion() {
        return sancion;
    }
}
