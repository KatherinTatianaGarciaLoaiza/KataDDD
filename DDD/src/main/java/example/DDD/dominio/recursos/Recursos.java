package example.DDD.dominio.recursos;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import example.DDD.dominio.recursos.event.CategoriaCreada;
import example.DDD.dominio.recursos.event.RecursoCreado;
import example.DDD.dominio.recursos.valuesObject.CategoriaId;
import example.DDD.dominio.recursos.valuesObject.CodigoDeBarras;
import example.DDD.dominio.recursos.valuesObject.RecursosId;
import example.DDD.dominio.recursos.valuesObject.TiempoDePrestamo;
import example.DDD.dominio.centrodeprestamos.valuesObject.SalirDeLaInstitucion;
import example.DDD.dominio.centrodeprestamos.valuesObject.TipoDeRecurso;

import java.util.List;
import java.util.Map;


public class Recursos extends AggregateEvent<RecursosId> {

    protected Map<CategoriaId, Categoria> categorias;
    //protected Categoria categoria;
    protected List<String> recursosDisponibles;
    protected String idCentroDePrestamos;

    public Recursos(RecursosId entityId, List<String> recursosDisponibles, String idCentroDePrestamos) {
        super(entityId);
        appendChange(new RecursoCreado(recursosDisponibles, idCentroDePrestamos)).apply();
    }

    private Recursos(RecursosId entityId){
        super(entityId);
        subscribe(new RecursoChange(this));
    }

    public static Recursos from(RecursosId entityId, List<DomainEvent> events){
        Recursos recursos = new Recursos(entityId);
        events.forEach(recursos::applyEvent);
        return recursos;
    }

    public void crearCategoria(CategoriaId categoriaId, CodigoDeBarras codigoDeBarras, TipoDeRecurso tipoDeRecurso,
                               TiempoDePrestamo tiempoDePrestamo, SalirDeLaInstitucion salirDeLaInstitucion) {
        appendChange(new CategoriaCreada(categoriaId, codigoDeBarras, tipoDeRecurso, tiempoDePrestamo, salirDeLaInstitucion)).apply();
    }
}
