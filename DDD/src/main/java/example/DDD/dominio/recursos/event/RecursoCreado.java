package example.DDD.dominio.recursos.event;

import java.util.List;

public class RecursoCreado extends co.com.sofka.domain.generic.DomainEvent {
    private final List<String> recursosDisponibles;
    private final String idCentroDePrestamos;

    public RecursoCreado(List<String> recursosDisponibles, String idCentroDePrestamos) {
        super("CentroDePrestamos.agregados.rescursos.recursocreado");
        this.recursosDisponibles = recursosDisponibles;
        this.idCentroDePrestamos = idCentroDePrestamos;
    }

    public List<String> getRecursosDisponibles() {
        return recursosDisponibles;
    }

    public String getIdCentroDePrestamos() {
        return idCentroDePrestamos;
    }
}
