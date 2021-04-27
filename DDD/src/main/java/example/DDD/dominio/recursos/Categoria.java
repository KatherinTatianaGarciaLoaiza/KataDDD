package example.DDD.dominio.recursos;

import co.com.sofka.domain.generic.Entity;
import example.DDD.dominio.centrodeprestamos.valuesObject.SalirDeLaInstitucion;
import example.DDD.dominio.centrodeprestamos.valuesObject.TipoDeRecurso;
import example.DDD.dominio.recursos.valuesObject.CodigoDeBarras;
import example.DDD.dominio.recursos.valuesObject.Disponibilidad;
import example.DDD.dominio.recursos.valuesObject.TiempoDePrestamo;
import example.DDD.dominio.recursos.valuesObject.CategoriaId;

public class Categoria extends Entity<CategoriaId> {

    protected CodigoDeBarras codigoDeBarras;
    protected Disponibilidad disponibilidad;
    protected TipoDeRecurso tipoDeRecurso;


    public Categoria(CategoriaId entityId, CodigoDeBarras codigoDeBarras, TipoDeRecurso tipoDeRecurso) {
        super(entityId);
        this.codigoDeBarras = codigoDeBarras;
        this.tipoDeRecurso = tipoDeRecurso;
        this.disponibilidad = Disponibilidad.DISPONIBLE;
    }

    private Categoria(CategoriaId entityId){super(entityId);}


   /* public CodigoDeBarras getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public Disponibilidad getDisponibilidad() {
        return disponibilidad;
    }

    public TipoDeRecurso getTipoDeRecurso() {
        return tipoDeRecurso;
    }

    public TiempoDePrestamo getTiempoDePrestamo() {
        return tiempoDePrestamo;
    }

    public SalirDeLaInstitucion getSalirDeLaInstitucion() {
        return salirDeLaInstitucion;
    }*/
}
