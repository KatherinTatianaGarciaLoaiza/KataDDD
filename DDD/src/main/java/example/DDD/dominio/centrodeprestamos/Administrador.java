package example.DDD.dominio.centrodeprestamos;

import co.com.sofka.domain.generic.Entity;
import example.DDD.dominio.VOgeneralesYComprobaciones.DatosPersonales;
import example.DDD.dominio.centrodeprestamos.valuesObject.AdministradorId;

public class Administrador extends Entity<AdministradorId> {

    protected DatosPersonales datosPersonales;

    public Administrador(AdministradorId entityId, DatosPersonales datosPersonales) {
        super(entityId);
        this.datosPersonales = datosPersonales;
    }

    private Administrador(AdministradorId entityId){super(entityId);}

    /*public static Administrador from(AdministradorId entityId, DatosPersonales datosPersonales){
        var Administrador = new Administrador(entityId);
        Administrador.datosPersonales = datosPersonales;
        return Administrador;
    }*/

    /*public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }*/
}
