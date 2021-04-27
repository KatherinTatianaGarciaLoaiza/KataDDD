package example.DDD.dominio.centrodeprestamos.valuesObject;

import co.com.sofka.domain.generic.ValueObject;
import example.DDD.dominio.VOgeneralesYComprobaciones.Comprobaciones;

import java.util.Objects;

public class CaracteristicasDelPrestamo  implements ValueObject<CaracteristicasDelPrestamo.Value> {
    private final SalirDeLaInstitucion puedeSalirDeLaInstitucion;
    private final TiempoDePrestamo tiempoDePrestamo;

    public CaracteristicasDelPrestamo(SalirDeLaInstitucion puedeSalirDeLaInstitucion, TiempoDePrestamo tiempoDePrestamo) {
        this.puedeSalirDeLaInstitucion = Objects.requireNonNull(puedeSalirDeLaInstitucion);
        this.tiempoDePrestamo = Objects.requireNonNull(tiempoDePrestamo);
    }

    @Override
    public CaracteristicasDelPrestamo.Value value() {
        return new CaracteristicasDelPrestamo.Value() {
            @Override
            public SalirDeLaInstitucion puedeSalirDeLaInstitucion() {
                return puedeSalirDeLaInstitucion;
            }

            @Override
            public TiempoDePrestamo tiempoDePrestamo() {
                return tiempoDePrestamo;
            }
        };
    }

    public interface Value {
        SalirDeLaInstitucion puedeSalirDeLaInstitucion();

        TiempoDePrestamo tiempoDePrestamo();

    }
}
