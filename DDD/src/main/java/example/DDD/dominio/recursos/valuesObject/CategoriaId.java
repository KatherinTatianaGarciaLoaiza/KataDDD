package example.DDD.dominio.recursos.valuesObject;

import co.com.sofka.domain.generic.Identity;

public class CategoriaId extends Identity {
    private CategoriaId(String uid) {
        super(uid);
    }

    public CategoriaId() {
    }

    public static CategoriaId of(String uid) {
        return new CategoriaId(uid);
    }
}
