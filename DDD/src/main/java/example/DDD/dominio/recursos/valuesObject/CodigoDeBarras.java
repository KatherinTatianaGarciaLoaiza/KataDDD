package example.DDD.dominio.recursos.valuesObject;

import co.com.sofka.domain.generic.ValueObject;
import example.DDD.dominio.VOgeneralesYComprobaciones.Comprobaciones;

import java.util.Objects;

public class CodigoDeBarras implements ValueObject<String>{

    private final String codigoDeBarras;

    public CodigoDeBarras(String codigoDeBarras) {
        Comprobaciones.ComprobacionString(codigoDeBarras);
        this.codigoDeBarras = Objects.requireNonNull(codigoDeBarras);
    }

    public String value() {
        return codigoDeBarras;
    }
}

