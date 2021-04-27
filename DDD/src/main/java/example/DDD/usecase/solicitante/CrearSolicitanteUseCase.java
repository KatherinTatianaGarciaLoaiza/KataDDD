package example.DDD.usecase.solicitante;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import example.DDD.dominio.VOgeneralesYComprobaciones.DatosPersonales;
import example.DDD.dominio.VOgeneralesYComprobaciones.TipoDeSolicitud;
import example.DDD.dominio.solicitante.commands.CrearSolicitante;
import example.DDD.dominio.solicitante.events.SolicitanteCreado;
import example.DDD.dominio.solicitante.valuesObject.EstadoSancion;
import example.DDD.dominio.solicitante.valuesObject.Sancion;

import java.util.List;

public class CrearSolicitanteUseCase extends UseCase<RequestCommand<CrearSolicitante>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearSolicitante> crearSolicitanteRequestCommand) {
        emit().onResponse(new ResponseEvents(List.of(
                new SolicitanteCreado(new DatosPersonales(123L, "hola", "correito", 4778905L),
                        new Sancion("por que si", "una semana", EstadoSancion.INACTIVA), TipoDeSolicitud.PRESTAMO)
        )));
    }
}
