package example.DDD.dominio.solicitante;

import co.com.sofka.domain.generic.EventChange;
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
        });

        apply((DatosPersonalesModificados event) -> {
            if (solicitante.datosPersonales.equals(event.getDatospersonales())){
                throw new IllegalArgumentException("Los datos personales no fueron modificados");
            }
            solicitante.datosPersonales = event.getDatospersonales();
        });

        apply((SancionAsignada event) -> {
            solicitante.sancion = event.getSancion();
        });
    }
}
