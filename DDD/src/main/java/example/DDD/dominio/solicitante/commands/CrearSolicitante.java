package example.DDD.dominio.solicitante.commands;

import co.com.sofka.domain.generic.Command;
import example.DDD.dominio.VOgeneralesYComprobaciones.DatosPersonales;
import example.DDD.dominio.VOgeneralesYComprobaciones.TipoDeSolicitud;
import example.DDD.dominio.solicitante.valuesObject.Sancion;
import example.DDD.dominio.solicitante.valuesObject.SolicitanteId;

public class CrearSolicitante implements Command {

    private final SolicitanteId solicitanteId;
    private final DatosPersonales datosPersonales;
    private final Sancion sancion;
    private final TipoDeSolicitud tipoDeSolicitud;

    public CrearSolicitante(SolicitanteId solicitanteId, DatosPersonales datosPersonales, Sancion sancion, TipoDeSolicitud tipoDeSolicitud){
        this.solicitanteId = solicitanteId;
        this.datosPersonales = datosPersonales;
        this.sancion = sancion;
        this.tipoDeSolicitud = tipoDeSolicitud;
    }

    public SolicitanteId getSolicitanteId() {
        return solicitanteId;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }

    public Sancion getSancion() {
        return sancion;
    }

    public TipoDeSolicitud getTipoDeSolicitud() {
        return tipoDeSolicitud;
    }
}
