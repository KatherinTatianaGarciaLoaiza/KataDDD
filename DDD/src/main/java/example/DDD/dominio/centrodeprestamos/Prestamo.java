package example.DDD.dominio.centrodeprestamos;

import co.com.sofka.domain.generic.Entity;
import example.DDD.dominio.VOgeneralesYComprobaciones.Fecha;
import example.DDD.dominio.centrodeprestamos.valuesObject.EstadoDelRecurso;
import example.DDD.dominio.centrodeprestamos.valuesObject.SalirDeLaInstitucion;
import example.DDD.dominio.centrodeprestamos.valuesObject.TipoDeRecurso;
import example.DDD.dominio.centrodeprestamos.valuesObject.PrestamoId;
import example.DDD.dominio.recursos.valuesObject.TiempoDePrestamo;

public class Prestamo extends Entity<PrestamoId> {

    protected EstadoDelRecurso estadoDelRecurso;
    protected TipoDeRecurso tipoDeRecurso;
    protected Fecha fecha;
    protected TiempoDePrestamo tiempoDePrestamo;
    protected SalirDeLaInstitucion salirDeLaInstitucion;


    public Prestamo(PrestamoId entityId, EstadoDelRecurso estadoDelRecurso, TipoDeRecurso tipoDeRecurso, Fecha fecha, TiempoDePrestamo tiempoDePrestamo, SalirDeLaInstitucion salirDeLaInstitucion) {
        super(entityId);
        this.estadoDelRecurso = EstadoDelRecurso.BUENO;
        this.tipoDeRecurso = tipoDeRecurso;
        this.fecha = fecha;
        this.tiempoDePrestamo = tiempoDePrestamo;
        this.salirDeLaInstitucion = salirDeLaInstitucion;
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
