package example.DDD.usecase.solicitante;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import example.DDD.dominio.VOgeneralesYComprobaciones.DatosPersonales;
import example.DDD.dominio.VOgeneralesYComprobaciones.TipoDeSolicitud;
import example.DDD.dominio.solicitante.events.DatosPersonalesModificados;
import example.DDD.dominio.solicitante.events.SolicitanteCreado;
import example.DDD.dominio.solicitante.valuesObject.EstadoSancion;
import example.DDD.dominio.solicitante.valuesObject.Sancion;
import example.DDD.dominio.solicitante.valuesObject.SolicitanteId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)

class ActualizarDatosPersonalesUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    void probarModificacionDatosP(){
        var solicitanteId = SolicitanteId.of("2302");
        var datosPersonales = new DatosPersonales(123L, "hola", "correito", 4778905L);
        var command = new ActualizarDatosPersonales(solicitanteId, datosPersonales);

        var useCase = new ActualizarDatosPersonalesUseCase();

        when(repository.getEventsBy(solicitanteId.value())).thenReturn(eventStored());
        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(solicitanteId.value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        var event = (DatosPersonalesModificados) events.get(0);
        Mockito.verify(repository).getEventsBy(solicitanteId.value()); //se verifica si se trae el repositorio
        Assertions.assertEquals(123L, event.getDatospersonales().value().Documento());
        Assertions.assertEquals("hola", event.getDatospersonales().value().Nombre());
        Assertions.assertEquals("correito", event.getDatospersonales().value().Correo());
        Assertions.assertEquals(4778905L, event.getDatospersonales().value().Telefono());
    }

    private List<DomainEvent> eventStored() {
        return List.of(new SolicitanteCreado(new DatosPersonales(321L, "nombre", "correo", 5098774L),
                new Sancion( "motivo", "tiempoPenalizacion", EstadoSancion.INACTIVA), TipoDeSolicitud.PRESTAMO));
    }

}