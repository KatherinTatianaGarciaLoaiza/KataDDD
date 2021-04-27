package example.DDD.dominio.recursos.event;

import co.com.sofka.domain.generic.DomainEvent;
import example.DDD.dominio.recursos.valuesObject.CategoriaId;
import example.DDD.dominio.centrodeprestamos.valuesObject.TiempoDePrestamo;
import example.DDD.dominio.centrodeprestamos.valuesObject.SalirDeLaInstitucion;
import example.DDD.dominio.centrodeprestamos.valuesObject.TipoDeRecurso;
import example.DDD.dominio.recursos.valuesObject.CodigoDeBarras;

public class CategoriaCreada extends DomainEvent {
    private final CategoriaId categoriaId;
    private final CodigoDeBarras codigoDeBarras;
    private final TipoDeRecurso tipoDeRecurso;
    private final TiempoDePrestamo tiempoDePrestamo;
    private final SalirDeLaInstitucion salirDeLaInstitucion;

    public CategoriaCreada(CategoriaId categoriaId, CodigoDeBarras codigoDeBarras, TipoDeRecurso tipoDeRecurso,
                           TiempoDePrestamo tiempoDePrestamo, SalirDeLaInstitucion salirDeLaInstitucion) {
        super("centrodeprestamos.agregados.recursos.categoriacreada");
        this.categoriaId = categoriaId;
        this.codigoDeBarras = codigoDeBarras;
        this.tipoDeRecurso = tipoDeRecurso;
        this.tiempoDePrestamo = tiempoDePrestamo;
        this.salirDeLaInstitucion = salirDeLaInstitucion;
    }

    public CategoriaId getCategoriaId() {
        return categoriaId;
    }

    public CodigoDeBarras getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public TipoDeRecurso getTipoDeRecurso() {
        return tipoDeRecurso;
    }

    public TiempoDePrestamo getTiempoDePrestamo() {
        return tiempoDePrestamo;
    }

    public SalirDeLaInstitucion getSalirDeLaInstitucion() {
        return salirDeLaInstitucion;
    }
}
