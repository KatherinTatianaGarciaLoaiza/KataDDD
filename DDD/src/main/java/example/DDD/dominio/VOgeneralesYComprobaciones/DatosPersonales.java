package example.DDD.dominio.VOgeneralesYComprobaciones;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DatosPersonales implements ValueObject<DatosPersonales.Value> {
    private final Long Documento;
    private final String Nombre;
    private final String Correo;
    private final Long Telefono;

    public DatosPersonales(Long documento, String nombre, String correo, Long telefono) {
        Comprobaciones.ComprobacionString(nombre);
        Comprobaciones.ComprobacionString(correo);
        this.Documento = Objects.requireNonNull(documento);
        this.Nombre = Objects.requireNonNull(nombre);
        this.Correo = Objects.requireNonNull(correo);
        this.Telefono = Objects.requireNonNull(telefono);
    }

    @Override
    public DatosPersonales.Value value() {
        return new DatosPersonales.Value() {
            @Override
            public Long Documento() {
                return Documento;
            }

            @Override
            public String Nombre() {
                return Nombre;
            }

            @Override
            public String Correo() {
                return Correo;
            }

            @Override
            public Long Telefono() {
                return Telefono;
            }
        };
    }

    public interface Value {
        Long Documento();

        String Nombre();

        String Correo();

        Long Telefono();
    }
}
