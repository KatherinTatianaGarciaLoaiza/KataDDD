package example.DDD.usecase.solicitante;


import co.com.sofka.domain.generic.Command;
import example.DDD.dominio.VOgeneralesYComprobaciones.DatosPersonales;
import example.DDD.dominio.solicitante.valuesObject.SolicitanteId;

public class ActualizarDatosPersonales implements Command {

    private final SolicitanteId solicitanteId;
    private final DatosPersonales datosPersonales;

    public ActualizarDatosPersonales (SolicitanteId solicitanteId, DatosPersonales datosPersonales){
        this.solicitanteId = solicitanteId;
        this.datosPersonales = datosPersonales;
    }

    public SolicitanteId getSolicitanteId() {
        return solicitanteId;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
