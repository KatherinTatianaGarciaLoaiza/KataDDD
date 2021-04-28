package example.DDD.dominio.solicitante;

import co.com.sofka.domain.generic.EventChange;
import example.DDD.dominio.VOgeneralesYComprobaciones.TipoDeSolicitud;
import example.DDD.dominio.solicitante.events.DatosPersonalesModificados;
import example.DDD.dominio.solicitante.events.SancionAsignada;
import example.DDD.dominio.solicitante.events.SolicitanteCreado;
import example.DDD.dominio.VOgeneralesYComprobaciones.DatosPersonales;
import example.DDD.dominio.solicitante.valuesObject.Sancion;

public class SolicitanteChange extends EventChange {
    public SolicitanteChange(Solicitante solicitante) {
        apply((SolicitanteCreado event) -> {
            solicitante.datosPersonales = (DatosPersonales) event.getDatosPersonales();
            solicitante.sancion = (Sancion) event.getSancion();
            solicitante.tipoDeSolicitud = (TipoDeSolicitud) event.getTipoDeSolicitud();
        });

        apply((DatosPersonalesModificados event) -> {
            solicitante.datosPersonales = event.getDatospersonales();/*new DatosPersonales(event.getDatospersonales().value().Documento(), event.getDatospersonales().value().Nombre(),
                    event.getDatospersonales().value().Correo(), event.getDatospersonales().value().Telefono());*/
        });

        apply((SancionAsignada event) -> {
            solicitante.sancion = event.getSancion(); /*new Sancion(event.getSancion().value().motivo(), event.getSancion().value().TiempoPenalizacion());*/
        });
    }
}
