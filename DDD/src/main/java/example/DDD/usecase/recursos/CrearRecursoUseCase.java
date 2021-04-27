package example.DDD.usecase.recursos;


import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import example.DDD.dominio.recursos.commands.CrearRecurso;
import example.DDD.dominio.recursos.event.RecursoCreado;

import java.util.List;

public class CrearRecursoUseCase extends UseCase<RequestCommand<CrearRecurso>, ResponseEvents> {
    List<String> recursosDisponibles = List.of("a", "b", "c");
    @Override
    public void executeUseCase(RequestCommand<CrearRecurso> crearRecursoRequestCommand) {
        emit().onResponse(new ResponseEvents(List.of(
                new RecursoCreado( recursosDisponibles, "4")
        )));
    }
}
