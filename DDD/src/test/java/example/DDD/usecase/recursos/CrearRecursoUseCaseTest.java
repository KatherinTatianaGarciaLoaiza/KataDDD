package example.DDD.usecase.recursos;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import example.DDD.dominio.recursos.commands.CrearRecurso;
import example.DDD.dominio.recursos.event.RecursoCreado;
import example.DDD.dominio.recursos.valuesObject.RecursosId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CrearRecursoUseCaseTest {

    @Test
    void crearRecursoUseCase(){
        var recursosid = new RecursosId();
        var recursosDisponibles = List.of("a", "b", "c");
        var idCentroDePrestamos = "4";
        var command = new CrearRecurso(recursosid, recursosDisponibles, idCentroDePrestamos);

        var useCase = new CrearRecursoUseCase();

        List<DomainEvent> events = UseCaseHandler.getInstance().
                syncExecutor(useCase, new RequestCommand<>(command)).
                orElseThrow().
                getDomainEvents();

        RecursoCreado event= (RecursoCreado)  events.get(0);

        Assertions.assertEquals(List.of("a", "b", "c"), event.getRecursosDisponibles());
        Assertions.assertEquals("4", event.getIdCentroDePrestamos());
    }

}