package example.DDD.dominio.solicitante.valuesObject;

import co.com.sofka.domain.generic.ValueObject;
import example.DDD.dominio.VOgeneralesYComprobaciones.Comprobaciones;

import java.util.Objects;

public class Sancion implements ValueObject<Sancion.Value> {

    private final String motivo;
    private final String TiempoPenalizacion;

    public Sancion(String motivo, String tiempoPenalizacion) {
        Comprobaciones.ComprobacionString(motivo);
        Comprobaciones.ComprobacionString(tiempoPenalizacion);
        this.motivo = Objects.requireNonNull(motivo);
        this.TiempoPenalizacion = Objects.requireNonNull(tiempoPenalizacion);
    }

    @Override
    public Sancion.Value value() {
        return new Value() {
            @Override
            public String motivo() {
                return motivo;
            }

            @Override
            public String TiempoPenalizacion() {
                return TiempoPenalizacion;
            }
        };
    }

    public interface Value {
        String motivo();

        String TiempoPenalizacion();
    }
}
