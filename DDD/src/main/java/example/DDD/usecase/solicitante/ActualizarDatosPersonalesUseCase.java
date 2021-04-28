package example.DDD.usecase.solicitante;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import example.DDD.dominio.solicitante.Solicitante;

public class ActualizarDatosPersonalesUseCase extends UseCase<RequestCommand<ActualizarDatosPersonales>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ActualizarDatosPersonales> actualizarDatosPersonalesRequestCommand) {
        var command = actualizarDatosPersonalesRequestCommand.getCommand();
        var solicitante = Solicitante.from(command.getSolicitanteId(), retrieveEvents());
        try{
        solicitante.modificarDatosPersonales(command.getDatosPersonales());
        emit().onResponse(new ResponseEvents(solicitante.getUncommittedChanges()));
    }catch(RuntimeException e){
        emit().onError(new BusinessException(solicitante.identity().value(), e.getMessage()));
    }
    }
}


