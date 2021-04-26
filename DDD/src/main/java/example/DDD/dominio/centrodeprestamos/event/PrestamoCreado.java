package example.DDD.dominio.centrodeprestamos.event;

import co.com.sofka.domain.generic.DomainEvent;
import example.DDD.dominio.centrodeprestamos.valuesObject.TipoDeSolicitud;
import example.DDD.dominio.centrodeprestamos.valuesObject.TipoDeRecurso;
import example.DDD.dominio.centrodeprestamos.valuesObject.PrestamoId;

public class PrestamoCreado extends DomainEvent {
    private final PrestamoId prestamoId;
    private final TipoDeRecurso tipoDeRecurso;
    private final TipoDeSolicitud tipoDeSolicitud;

    public PrestamoCreado(PrestamoId prestamoId, TipoDeRecurso tipoDeRecurso, TipoDeSolicitud tipoDeSolicitud) {
        super("centrodeprestamos.agregados.centrodeprestamos");
        this.prestamoId = prestamoId;
        this.tipoDeRecurso = tipoDeRecurso;
        this.tipoDeSolicitud = tipoDeSolicitud;
    }

    public PrestamoId getPrestamoId() {
        return prestamoId;
    }

    public TipoDeRecurso getTipoDeRecurso() {
        return tipoDeRecurso;
    }

    public TipoDeSolicitud getTipoDeSolicitud() {
        return tipoDeSolicitud;
    }
}
