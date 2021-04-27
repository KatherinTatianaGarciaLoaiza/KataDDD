package example.DDD.dominio.centrodeprestamos.event;

import co.com.sofka.domain.generic.DomainEvent;
import example.DDD.dominio.VOgeneralesYComprobaciones.Fecha;
import example.DDD.dominio.centrodeprestamos.valuesObject.*;
import example.DDD.dominio.recursos.valuesObject.TiempoDePrestamo;

public class PrestamoCreado extends DomainEvent {
    private final PrestamoId prestamoId;
    private final EstadoDelRecurso estadoDelRecurso;
    private final TipoDeRecurso tipoDeRecurso;
    private final Fecha fecha;
    private final TiempoDePrestamo tiempoDePrestamo;
    private final SalirDeLaInstitucion salirDeLaInstitucion;

    public PrestamoCreado(PrestamoId prestamoId, EstadoDelRecurso estadoDelRecurso, TipoDeRecurso tipoDeRecurso, Fecha fecha, TiempoDePrestamo tiempoDePrestamo, SalirDeLaInstitucion salirDeLaInstitucion) {
        super("centrodeprestamos.agregados.centrodeprestamos");
        this.prestamoId = prestamoId;
        this.estadoDelRecurso = estadoDelRecurso;
        this.tipoDeRecurso = tipoDeRecurso;
        this.fecha = fecha;
        this.tiempoDePrestamo = tiempoDePrestamo;
        this.salirDeLaInstitucion = salirDeLaInstitucion;
    }

    public PrestamoId getPrestamoId() {
        return prestamoId;
    }

    public TipoDeRecurso getTipoDeRecurso() {
        return tipoDeRecurso;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public EstadoDelRecurso getEstadoDelRecurso() {
        return estadoDelRecurso;
    }

    public TiempoDePrestamo getTiempoDePrestamo() {
        return tiempoDePrestamo;
    }

    public SalirDeLaInstitucion getSalirDeLaInstitucion() {
        return salirDeLaInstitucion;
    }
}
