package example.DDD.dominio.recursos;

import co.com.sofka.domain.generic.EventChange;
import example.DDD.dominio.recursos.event.CategoriaCreada;
import example.DDD.dominio.recursos.event.RecursoCreado;

public class RecursoChange extends EventChange {
    public RecursoChange(Recursos recursos) {
        apply((RecursoCreado event) -> {
            recursos.recursosDisponibles = event.getRecursosDisponibles();
            recursos.idCentroDePrestamos = event.getIdCentroDePrestamos();
        });

        apply((CategoriaCreada event) -> {
            var id = event.getCategoriaId();
            recursos.categorias.put(id,  new Categoria(id, event.getCodigoDeBarras(), event.getTipoDeRecurso(),
                    event.getTiempoDePrestamo(), event.getSalirDeLaInstitucion()));
        });
    }
}
