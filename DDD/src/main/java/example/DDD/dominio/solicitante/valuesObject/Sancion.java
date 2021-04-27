package example.DDD.dominio.solicitante.valuesObject;

import co.com.sofka.domain.generic.ValueObject;
import example.DDD.dominio.VOgeneralesYComprobaciones.Comprobaciones;

import java.util.Objects;

public class Sancion implements ValueObject<Sancion.Value> {

    private final String motivo;
    private final String TiempoPenalizacion;
    private final EstadoSancion estadoSancion;

    public Sancion(String motivo, String tiempoPenalizacion, EstadoSancion estadoSancion) {
        Comprobaciones.ComprobacionString(motivo);
        Comprobaciones.ComprobacionString(tiempoPenalizacion);
        this.motivo = Objects.requireNonNull(motivo);
        this.TiempoPenalizacion = Objects.requireNonNull(tiempoPenalizacion);
        this.estadoSancion = estadoSancion;
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

            @Override
            public EstadoSancion EstadoSancion() {
                return estadoSancion;
            }
        };
    }

    public interface Value {
        String motivo();

        String TiempoPenalizacion();

        EstadoSancion EstadoSancion();
    }
}
