package example.DDD.usecase.centrodeprestamos;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import example.DDD.dominio.VOgeneralesYComprobaciones.TipoDeSolicitud;
import example.DDD.dominio.centrodeprestamos.command.CrearCentroDePrestamos;
import example.DDD.dominio.centrodeprestamos.event.CentroDePrestamosCreado;
import example.DDD.dominio.centrodeprestamos.valuesObject.CaracteristicasDelPrestamo;
import example.DDD.dominio.centrodeprestamos.valuesObject.SalirDeLaInstitucion;
import example.DDD.dominio.centrodeprestamos.valuesObject.TiempoDePrestamo;

import java.util.List;

public class CrearCentroDePrestamosUseCase extends UseCase<RequestCommand<CrearCentroDePrestamos>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearCentroDePrestamos> crearCentroDePrestamosRequestCommand) {
        emit().onResponse(new ResponseEvents(List.of(
              new CentroDePrestamosCreado("5", new CaracteristicasDelPrestamo(SalirDeLaInstitucion.SI, TiempoDePrestamo.SEMANA1),
                      TipoDeSolicitud.PRESTAMO)
        )));
    }
}