package example.DDD.dominio.centrodeprestamos.valuesObject;

import co.com.sofka.domain.generic.Identity;

public class PrestamoId extends Identity {
    private PrestamoId(String uid) {
        super(uid);
    }

    public PrestamoId() {
    }

    public static PrestamoId of(String uid) {
        return new PrestamoId(uid);
    }
}
