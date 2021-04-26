package example.DDD.dominio.centrodeprestamos;

import co.com.sofka.domain.generic.Entity;
import example.DDD.dominio.centrodeprestamos.valuesObject.EstadoDelRecurso;
import example.DDD.dominio.centrodeprestamos.valuesObject.TipoDeRecurso;
import example.DDD.dominio.centrodeprestamos.valuesObject.TipoDeSolicitud;
import example.DDD.dominio.centrodeprestamos.valuesObject.PrestamoId;

public class Prestamo extends Entity<PrestamoId> {

    protected EstadoDelRecurso estadoDelRecurso;
    protected TipoDeRecurso tipoDeRecurso;
    protected TipoDeSolicitud tipoDeSolicitud;


    public Prestamo(PrestamoId entityId, TipoDeRecurso tipoDeRecurso, TipoDeSolicitud tipoDeSolicitud) {
        super(entityId);
        this.tipoDeSolicitud = tipoDeSolicitud;
        this.estadoDelRecurso = EstadoDelRecurso.BUENO;
        this.tipoDeRecurso = tipoDeRecurso;
    }

    private Prestamo(PrestamoId entityId){super(entityId);}

    /*public EstadoDelRecurso getEstadoDelRecurso() {
        return estadoDelRecurso;
    }

    public TipoDeRecurso getTipoDeRecurso() {
        return tipoDeRecurso;
    }

    public TipoDeSolicitud getTipoDeSolicitud() {
        return tipoDeSolicitud;
    }*/
}
