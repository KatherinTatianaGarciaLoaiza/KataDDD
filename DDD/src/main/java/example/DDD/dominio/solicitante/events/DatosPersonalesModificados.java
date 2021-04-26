package example.DDD.dominio.solicitante.events;

import co.com.sofka.domain.generic.DomainEvent;
import example.DDD.dominio.VOgeneralesYComprobaciones.DatosPersonales;
import example.DDD.dominio.solicitante.valuesObject.SolicitanteId;

public class DatosPersonalesModificados extends DomainEvent {
    private final SolicitanteId entityId;
    private final DatosPersonales datospersonales;

    public DatosPersonalesModificados(SolicitanteId entityId, DatosPersonales datospersonales) {
        super("centrodeprestamos.solicitante.datospersonalesmodificados");
        this.entityId = entityId;
        this.datospersonales = datospersonales;
    }

    public SolicitanteId getEntityId() {
        return entityId;
    }

    public DatosPersonales getDatospersonales() {
        return datospersonales;
    }
}
