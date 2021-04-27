package example.DDD.dominio.recursos.commands;


import co.com.sofka.domain.generic.Command;
import example.DDD.dominio.recursos.valuesObject.RecursosId;

import java.util.List;

public class CrearRecurso implements Command {

    private final RecursosId entityId;
    private final List<String> recursosDisponibles;
    private final String idCentroDePrestamos;

    public CrearRecurso(RecursosId entityId, List<String> recursosDisponibles, String idCentroDePrestamos){
        this.entityId = entityId;
        this.recursosDisponibles = recursosDisponibles;
        this.idCentroDePrestamos = idCentroDePrestamos;
    }

    public RecursosId getEntityId() {
        return entityId;
    }

    public List<String> getRecursosDisponibles() {
        return recursosDisponibles;
    }

    public String getIdCentroDePrestamos() {
        return idCentroDePrestamos;
    }
}