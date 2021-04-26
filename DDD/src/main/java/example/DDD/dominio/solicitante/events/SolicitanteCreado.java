package example.DDD.dominio.solicitante.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.ValueObject;

import java.util.List;

public class SolicitanteCreado extends DomainEvent {
    private final ValueObject datosPersonales;
    private final ValueObject sancion;

    public SolicitanteCreado(ValueObject datosPersonales, ValueObject sancion) {
        super("CentroDePrestamos.solicitante.solicitantecreado");
        this.datosPersonales = datosPersonales;
        this.sancion = sancion;
    }

    public ValueObject getDatosPersonales() {
        return datosPersonales;
    }

    public ValueObject getSancion() {
        return sancion;
    }
}
