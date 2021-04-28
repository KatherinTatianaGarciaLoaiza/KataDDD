package example.DDD.dominio.solicitante.events;

import co.com.sofka.domain.generic.DomainEvent;
import example.DDD.dominio.solicitante.valuesObject.Sancion;
import example.DDD.dominio.solicitante.valuesObject.SolicitanteId;

public class SancionAsignada extends DomainEvent {
    private final Sancion sancion;

    public SancionAsignada(Sancion sancion) {
        super("centrodeprestamos.solicitante.sancionasginada");
        this.sancion = sancion;
    }

    public Sancion getSancion() {
        return sancion;
    }
}
