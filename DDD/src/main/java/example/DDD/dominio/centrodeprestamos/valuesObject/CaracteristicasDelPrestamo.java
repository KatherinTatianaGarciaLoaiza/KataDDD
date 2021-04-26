package example.DDD.dominio.centrodeprestamos.valuesObject;

import co.com.sofka.domain.generic.ValueObject;
import example.DDD.dominio.VOgeneralesYComprobaciones.Comprobaciones;

import java.util.Objects;

public class CaracteristicasDelPrestamo  implements ValueObject<CaracteristicasDelPrestamo.Value> {
    private final String puedeSalirDeLaInstitucion;
    private final String tiempoDePrestamo;

    public CaracteristicasDelPrestamo(String puedeSalirDeLaInstitucion, String tiempoDePrestamo) {
        Comprobaciones.ComprobacionString(puedeSalirDeLaInstitucion);
        Comprobaciones.ComprobacionString(tiempoDePrestamo);
        this.puedeSalirDeLaInstitucion = Objects.requireNonNull(puedeSalirDeLaInstitucion);
        this.tiempoDePrestamo = Objects.requireNonNull(tiempoDePrestamo);
    }

    @Override
    public CaracteristicasDelPrestamo.Value value() {
        return new CaracteristicasDelPrestamo.Value() {
            @Override
            public String puedeSalirDeLaInstitucion() {
                return puedeSalirDeLaInstitucion;
            }

            @Override
            public String tiempoDePrestamo() {
                return tiempoDePrestamo;
            }
        };
    }

    public interface Value {
        String puedeSalirDeLaInstitucion();

        String tiempoDePrestamo();

    }
}
