package example.DDD.dominio.solicitante.events;

import co.com.sofka.domain.generic.DomainEvent;
import example.DDD.dominio.VOgeneralesYComprobaciones.DatosPersonales;

public class DatosPersonalesModificados extends DomainEvent {
    private final DatosPersonales datospersonales;

    public DatosPersonalesModificados(DatosPersonales datospersonales) {
        super("centrodeprestamos.solicitante.datospersonalesmodificados");
        this.datospersonales = datospersonales;
    }

    public DatosPersonales getDatospersonales() {
        return datospersonales;
    }
}
