package example.DDD.dominio.solicitante;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.ValueObject;
import example.DDD.dominio.solicitante.events.DatosPersonalesModificados;
import example.DDD.dominio.solicitante.events.SancionAsignada;
import example.DDD.dominio.solicitante.events.SolicitanteCreado;
import example.DDD.dominio.solicitante.valuesObject.Sancion;
import example.DDD.dominio.solicitante.valuesObject.SolicitanteId;
import example.DDD.dominio.VOgeneralesYComprobaciones.DatosPersonales;

import java.util.List;

public class Solicitante extends AggregateEvent<SolicitanteId> {

    protected DatosPersonales datosPersonales;
    protected Sancion sancion;

    public Solicitante(SolicitanteId entityId, ValueObject datosPersonales,ValueObject sancion) {
        super(entityId);
        appendChange(new SolicitanteCreado(datosPersonales, sancion)).apply();
    }

    private Solicitante(SolicitanteId entityId){
        super(entityId);
        subscribe(new SolicitanteChange(this));
    }

    public static Solicitante from(SolicitanteId entityId, List<DomainEvent> events){
        Solicitante solicitante = new Solicitante(entityId);
        events.forEach(solicitante::applyEvent);
        return solicitante;
    }

    public void ModificarDatosPersonales(Long documento, String nombre, String correo, Long telefono){
        DatosPersonales datospersonales = new DatosPersonales(documento, nombre, correo, telefono);
        appendChange(new DatosPersonalesModificados(this.entityId, datospersonales)).apply();
    }

    public void Asignarsancion(String motivo, String tiempoPenalizacion){
        Sancion sancion = new Sancion(motivo, tiempoPenalizacion);
        appendChange(new SancionAsignada(this.entityId, sancion)).apply();
    }
}
