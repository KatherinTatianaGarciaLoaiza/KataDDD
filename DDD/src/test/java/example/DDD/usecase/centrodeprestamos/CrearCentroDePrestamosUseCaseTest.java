package example.DDD.usecase.centrodeprestamos;


import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import example.DDD.dominio.VOgeneralesYComprobaciones.TipoDeSolicitud;
import example.DDD.dominio.centrodeprestamos.command.CrearCentroDePrestamos;
import example.DDD.dominio.centrodeprestamos.event.CentroDePrestamosCreado;
import example.DDD.dominio.centrodeprestamos.valuesObject.CaracteristicasDelPrestamo;
import example.DDD.dominio.centrodeprestamos.valuesObject.CentroDePrestamosId;
import example.DDD.dominio.centrodeprestamos.valuesObject.SalirDeLaInstitucion;
import example.DDD.dominio.centrodeprestamos.valuesObject.TiempoDePrestamo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class CrearCentroDePrestamosUseCaseTest {

    @Test
    void crearCentroDePrestamos(){
        var centroDePrestamosId = new CentroDePrestamosId();
        var idSolicitante = "5";
        var caracteristicasDelPrestamo = new CaracteristicasDelPrestamo(SalirDeLaInstitucion.SI, TiempoDePrestamo.SEMANA1);
        var command = new CrearCentroDePrestamos(centroDePrestamosId, idSolicitante, caracteristicasDelPrestamo, TipoDeSolicitud.PRESTAMO);


        var useCase = new CrearCentroDePrestamosUseCase();

        List<DomainEvent> events = UseCaseHandler.getInstance().
                syncExecutor(useCase, new RequestCommand<>(command)).
                orElseThrow().
                getDomainEvents();


        CentroDePrestamosCreado event = (CentroDePrestamosCreado)  events.get(0);

        Assertions.assertEquals("5", event.getIdSolicitante());
        Assertions.assertEquals(SalirDeLaInstitucion.SI, event.getCaracteristicasDelPrestamo().value().puedeSalirDeLaInstitucion());
        Assertions.assertEquals(TiempoDePrestamo.SEMANA1, event.getCaracteristicasDelPrestamo().value().tiempoDePrestamo());
        Assertions.assertEquals(TipoDeSolicitud.PRESTAMO, event.getTipoDeSolicitud());
    }
}