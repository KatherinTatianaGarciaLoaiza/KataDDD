package example.DDD.dominio.centrodeprestamos.event;

import co.com.sofka.domain.generic.DomainEvent;
import example.DDD.dominio.VOgeneralesYComprobaciones.DatosPersonales;
import example.DDD.dominio.centrodeprestamos.valuesObject.AdministradorId;

public class AdministradorCreado extends DomainEvent {
    private final AdministradorId administradorId;
    private final DatosPersonales datosPersonales;

    public AdministradorCreado(AdministradorId administradorId, DatosPersonales datosPersonales) {
        super("centrodeprestamos.agregados.centrodeprestamos");
        this.administradorId = administradorId;
        this.datosPersonales = datosPersonales;
    }

    public AdministradorId getAdministradorId() {
        return administradorId;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
