package example.DDD.dominio.recursos.valuesObject;

import co.com.sofka.domain.generic.Identity;

public class RecursosId extends Identity {
    private RecursosId(String uid) {
        super(uid);
    }

    public RecursosId() {
    }

    public static RecursosId of(String uid) {
        return new RecursosId(uid);
    }
}
