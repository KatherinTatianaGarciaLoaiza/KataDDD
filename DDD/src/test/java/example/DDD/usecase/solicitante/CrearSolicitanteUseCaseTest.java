package example.DDD.usecase.solicitante;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import example.DDD.dominio.VOgeneralesYComprobaciones.DatosPersonales;
import example.DDD.dominio.VOgeneralesYComprobaciones.TipoDeSolicitud;
import example.DDD.dominio.solicitante.commands.CrearSolicitante;
import example.DDD.dominio.solicitante.events.SolicitanteCreado;
import example.DDD.dominio.solicitante.valuesObject.EstadoSancion;
import example.DDD.dominio.solicitante.valuesObject.Sancion;
import example.DDD.dominio.solicitante.valuesObject.SolicitanteId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


class CrearSolicitanteUseCaseTest {

    @Test
    void crearSolicitante(){
        var solicitanteId = new SolicitanteId();
        var datosPersonales = new DatosPersonales(123L, "hola", "correito", 4778905L);
        var sancion = new Sancion("por que si", "una semana", EstadoSancion.INACTIVA);
        var command = new CrearSolicitante(solicitanteId, datosPersonales, sancion, TipoDeSolicitud.PRESTAMO);


        var useCase = new CrearSolicitanteUseCase();

        List<DomainEvent> events = UseCaseHandler.getInstance().
                syncExecutor(useCase, new RequestCommand<>(command)).
                orElseThrow().
                getDomainEvents();

        SolicitanteCreado event = (SolicitanteCreado) events.get(0);

        Assertions.assertEquals(123L, event.getDatosPersonales().value().Documento());
        Assertions.assertEquals("hola", event.getDatosPersonales().value().Nombre());
        Assertions.assertEquals("correito", event.getDatosPersonales().value().Correo());
        Assertions.assertEquals(4778905L, event.getDatosPersonales().value().Telefono());
        Assertions.assertEquals("por que si", event.getSancion().value().motivo());
        Assertions.assertEquals("una semana", event.getSancion().value().TiempoPenalizacion());
        Assertions.assertEquals(EstadoSancion.INACTIVA, event.getSancion().value().EstadoSancion());
        Assertions.assertEquals(TipoDeSolicitud.PRESTAMO, event.getTipoDeSolicitud());
    }
}