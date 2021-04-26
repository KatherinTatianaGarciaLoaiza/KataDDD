package example.DDD.dominio.centrodeprestamos.valuesObject;

import co.com.sofka.domain.generic.Identity;

public class AdministradorId extends Identity {
    private AdministradorId(String uid){
        super(uid);
    }

    public AdministradorId(){

    }

    public static AdministradorId of(String uid) {return new AdministradorId(uid);}
}
